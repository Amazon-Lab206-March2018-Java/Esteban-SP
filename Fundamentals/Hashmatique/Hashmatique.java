import java.util.*;

/**
 * Hashmatique
 */
public class Hashmatique {

    public static void main(String[] args) {

        //create HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();

        // put the lyrics in tyhe hashmap
        trackList.put("Blah Blah",
                "The tail drops deep as does my head.\nI never push, 'cause to push is the therapist of led.\nBeyond the walls of keyboards, life is defined.\nI think of code when I'm in a Heredia state of mind.");
        trackList.put("Song 2",
                "What more could you ask for? The stunning tail?\nYou complain about dirty clothes.\nI gotta love it though - somebody still speaks for the scale.");
        trackList.put("Patitos", "I'm rappin' to the macbeth,\nAnd I'm gonna move your death.");
        trackList.put("terapeado",
                "When I was young my therapist had a trail.\nI waz kicked out without no mail.\nI never thought I'd see that email.\nAin't a soul alive that could take my therapist's scale.");

        System.out.println(trackList.get("Blah Blah"));

        // Get a set of the entries
        Set set = trackList.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }
}