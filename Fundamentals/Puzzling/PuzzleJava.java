import java.util.*;
import java.io.*;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        System.out.println(puzzle.createIntArrayAndReturnValuesOver10());
        System.out.println("*************************************");
        System.out.println(puzzle.createStrArrayAndReturnArrayValuesOver5Characters());
        System.out.println("*************************************");
        puzzle.alphabetLastFirstVowel();
        System.out.println("*************************************");
        System.out.println(puzzle.createRandomArr55To100AndReturnArray());
        System.out.println("*************************************");
        System.out.println(puzzle.createRandomArr55To100SortItShowNumbersAndDisplayMaxAndMin());
        System.out.println("*************************************");
        System.out.println(puzzle.createRandom5CharString());
        System.out.println("*************************************");
        System.out.println(puzzle.createArrOf10Random5CharStrings());
        System.out.println("*************************************");
    }

    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public ArrayList<Integer> createIntArrayAndReturnValuesOver10() {
        int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArr;
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
    public ArrayList<String> createStrArrayAndReturnArrayValuesOver5Characters() {
        String[] arr = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        ArrayList<String> newArr = new ArrayList<String>();
        Collections.shuffle(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }

    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
    public void alphabetLastFirstVowel() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        Collections.shuffle(alphabet);
        System.out.println("shuffled array \n" + alphabet);
        Character first = alphabet.get(0);
        Character last = alphabet.get(25);
        System.out.println("last letter of the array: " + last);
        if ("aeiou".indexOf(first) == -1) {
            System.out.println("first letter of the array: " + first);
        } else {
            System.out.println("first letter of the array is the vowel: " + first);
        }
    }

    // Generate and return an array with 10 random numbers between 55-100.
    public ArrayList<Integer> createRandomArr55To100AndReturnArray() {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            newArray.add(new Random().nextInt((100 - 55) + 1) + 55);
        }
        return newArray;
    }

    // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public ArrayList<Integer> createRandomArr55To100SortItShowNumbersAndDisplayMaxAndMin() {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            newArray.add(new Random().nextInt((100 - 55) + 1) + 55);
        }
        System.out.println("unsorted Array\n" + newArray);
        Collections.sort(newArray);
        int min = newArray.get(0);
        int max = newArray.get(0);
        for (int i = 0; i < newArray.size(); i++) {
            if (newArray.get(i) < min) {
                min = newArray.get(i);
            }
            if (newArray.get(i) > max) {
                max = newArray.get(i);
            }
        }
        System.out.println("Min Value is: " + min);
        System.out.println("Max Value is: " + max);
        return newArray;
    }

    // Create a random string that is 5 characters long.
    public String createRandom5CharString() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char c = '1'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        StringBuilder sb = new StringBuilder(5); // empty string builder with capacity of 5
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char c = alphabet.get(random.nextInt(alphabet.size()));
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }

    // Generate an array with 10 random strings that are each 5 characters long
    public ArrayList<String> createArrOf10Random5CharStrings() {
        ArrayList<String> newArStrings = new ArrayList<String>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char c = '1'; c <= 'z'; c++) { // 1-9 symbols A-Z a-z
            alphabet.add(c);
        }
        for (int u = 0; u < 10; u++) {
            StringBuilder sb = new StringBuilder(5); // empty string builder with capacity of 5
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                char c = alphabet.get(random.nextInt(alphabet.size()));
                sb.append(c);
            }
            newArStrings.add(sb.toString());
        }
        return newArStrings;
    }
}