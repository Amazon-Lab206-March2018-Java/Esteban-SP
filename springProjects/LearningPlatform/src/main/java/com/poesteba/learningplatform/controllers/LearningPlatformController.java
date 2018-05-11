package com.poesteba.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LearningPlatformController {

		@RequestMapping("/")
		public String home() {
			return "home.jsp";
		}
		
		@RequestMapping(value="m/{chapter}/0483/{assignmentNumber}")
		public String assignment(@PathVariable("chapter") String discard, @PathVariable("assignmentNumber") String assignmentNumber, Model m) {
			switch(assignmentNumber) {
				case "0345":{  // Coding Forms
					m.addAttribute("assignmentText","The Goal for this assignment is to test your ability for Coding Forms");
					break;
				}
				case "2342":{  // Fortran to Binary
					m.addAttribute("assignmentText","The Goal for this assignment is to test your ability to migrate from Fortran to Binary");
					break;
				}
			}
			return "assignment.jsp";
		}
		@RequestMapping(value="m/{chapter}/0553/{lessonNumber}")
		public String lesson(@PathVariable("chapter") String discard, @PathVariable("lessonNumber") String lessonNumber, Model m) {
			switch(lessonNumber) {
				case "0733":{  // Setting up your servers
					m.addAttribute("lessonText","Setting up your servers Placeholder");
					break;
				}
				case "0342":{  // Punch Cards
					m.addAttribute("lessonText","Punch Cards Placeholder");
					break;
				}
				case "0348":{  // Advanced Fortran Intro
					m.addAttribute("lessonText","Advanced Fortran Intro Placeholder");
					break;
				}
			}
			return "lesson.jsp";
		}
}

