package com.poesteba.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	@RequestMapping("/")
	public String index(Model m, HttpSession sesh) {
		if (sesh.getAttribute("your_gold")==null) {
			sesh.setAttribute("your_gold", (Integer)0);
		}
		return "redirect:/gold";
	}
	@RequestMapping("/gold")
	public String money_maker(Model m, HttpSession sesh) {
		if (sesh.getAttribute("your_gold")==null) {
			sesh.setAttribute("your_gold", (Integer)0);
		}else if((Integer)sesh.getAttribute("your_gold")<(Integer)(-50)){
			return "redirect:/jail";
		}
		if (sesh.getAttribute("results")==null) {
			sesh.setAttribute("results", new ArrayList<Triplet<String,String,Date>>());
		}
		return "home.jsp";
	}
	@RequestMapping(value="/process_money", method=RequestMethod.POST)
	@SuppressWarnings("unchecked")
	public String process(Model m, HttpSession sesh,@RequestParam("building") Integer building){
		if (sesh.getAttribute("results")==null) {
			ArrayList<Triplet<String,String,Date>> results = new ArrayList<Triplet<String,String,Date>>();
			sesh.setAttribute("results", results);
		}
		Random rand = new Random(); 
		switch (building){
			case 1:{  //Farm (earns 10-20 golds)  
				ArrayList<Triplet<String,String,Date>> results = (ArrayList<Triplet<String,String,Date>>) sesh.getAttribute("results");
				Date timestamp = new Date();
				Integer amount = rand.nextInt((20 - 10) + 1) + 10; 
				sesh.setAttribute("your_gold", (((Integer) sesh.getAttribute("your_gold"))+amount));
				results.add(0, Triplet.with("win","You stole "+amount+" golds from the Farm!",timestamp));
				sesh.setAttribute("results", results);
				break;
			}
			case 2:{  //Cave (earns 5-10 golds)
				ArrayList<Triplet<String,String,Date>> results = (ArrayList<Triplet<String,String,Date>>) sesh.getAttribute("results");
				Date timestamp = new Date();
				Integer amount = rand.nextInt((10 - 5) + 1) + 5; 
				sesh.setAttribute("your_gold", (((Integer) sesh.getAttribute("your_gold"))+amount));
				results.add(0, Triplet.with("win","You stole "+amount+" golds from the Cave!",timestamp));
				sesh.setAttribute("results", results);
				break;
			}
			case 3:{  //House (earns 2-5 golds)
				ArrayList<Triplet<String,String,Date>> results = (ArrayList<Triplet<String,String,Date>>) sesh.getAttribute("results");
				Date timestamp = new Date();
				Integer amount = rand.nextInt((5 - 2) + 1) + 2; 
				sesh.setAttribute("your_gold", (((Integer) sesh.getAttribute("your_gold"))+amount));
				results.add(0, Triplet.with("win","You stole "+amount+" golds from the House!",timestamp));
				sesh.setAttribute("results", results);
				break;
			}
			case 4:{ //Casino (earns/takes 0-50 golds)
				ArrayList<Triplet<String,String,Date>> results = (ArrayList<Triplet<String,String,Date>>) sesh.getAttribute("results");
				Date timestamp = new Date();
				Integer amount = rand.nextInt((50) + 1); 
				if(rand.nextInt(2) !=0){
					sesh.setAttribute("your_gold", (((Integer) sesh.getAttribute("your_gold"))+amount));
					results.add(0, Triplet.with("win","Entered a casino and won "+amount+" golds! Awesome luck!",timestamp));
					sesh.setAttribute("results", results);					
				}else {
					sesh.setAttribute("your_gold", (((Integer) sesh.getAttribute("your_gold"))-amount));
					results.add(0, Triplet.with("lost","Entered a casino and lost "+amount+" golds... Ouch...",timestamp));
					sesh.setAttribute("results", results);	
				}
				break;
			}
			case 5:{ //Spa (uses 5-20 golds)
				ArrayList<Triplet<String,String,Date>> results = (ArrayList<Triplet<String,String,Date>>) sesh.getAttribute("results");
				Date timestamp = new Date();
				Integer amount = rand.nextInt((20 - 5) + 1) + 5; 
				sesh.setAttribute("your_gold", (((Integer) sesh.getAttribute("your_gold"))-amount));
				results.add(0, Triplet.with("lost","Entered a Spa and spent "+amount+" golds in a full massage",timestamp));
				sesh.setAttribute("results", results);
				break;
			}		
		}
		return "redirect:/gold";
	}
	@RequestMapping("/jail")
	public String jail(Model m, HttpSession sesh) {
		return "jail.jsp";
	}
	@RequestMapping("/reset")
	public String reset(Model m, HttpSession sesh) {
		sesh.setAttribute("your_gold", (Integer)0);
		ArrayList<Triplet<String,String,Date>> results = new ArrayList<Triplet<String,String,Date>>();
		sesh.setAttribute("results", results);
		return "redirect:/gold";
	}
}
