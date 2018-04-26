import java.util.ArrayList;

/**
 * ExceptionallyGenericLists
 */
public class ExceptionallyGenericLists {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                myList.set(i, castedValue);
                System.out.println("Casted Value: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("ERROR ON INDEX " + i + "");
            }
        }
    }
}