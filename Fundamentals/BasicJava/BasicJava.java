import java.util.ArrayList;
import java.util.Arrays;
/**
 * BasicJava
 */
public class BasicJava {
    public static void main(String[] args) {
        BasicJava basic1 = new BasicJava();
        basic1.print1To255();
        basic1.printOdds1To255();
        basic1.printSum0To255();
        double[] arr = {1,2,3,4,5,6,7,8,9,10};
        double[] arr2 = {5,-3,3,0,5,1,7,-6,0,3};
        double[] arrD = {5.6,-3.2,3,0.8,5,1,7.9,-6,0,3};
        basic1.printArrayValues(arr);
        basic1.findMax(arr2);
        basic1.getAverage(arr);
        basic1.getAverage(arr2);
        basic1.arrayOddNumbers1To255();
        basic1.greaterThan(arrD, 0);
        basic1.squareValues(arr);
        basic1.printArrayValues(arr);
        basic1.zeroOutNegatives(arr2);
        basic1.zeroOutNegatives(arrD);
        basic1.maxMinAverage(arr);
        basic1.maxMinAverage(arrD);
        basic1.printArrayValues(arr);
        basic1.shitfValues(arr);
        basic1.printArrayValues(arr);
    }
    public void print1To255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }
    public void printOdds1To255() {
        for (int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
    }
    public void printSum0To255() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum+=i;
            System.out.println("New number: "+i+" Sum: "+sum);
        }
    }
    public void printArrayValues(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: "+i+" Value: "+arr[i]);
        }
    }
    public void findMax(double[] arr) {
        double maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Max Value: "+maxValue);
    }
    public void getAverage(double[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        System.out.println("Average Value: "+average/arr.length);
        
    }
    public void arrayOddNumbers1To255() {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i = 1; i <= 255; i+=2) {
            arr.add(i);
        }
        System.out.println(arr);
    }
    public void greaterThan(double[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count+=1;
            }
        }
        System.out.println("There are "+count+" values greater than "+y);
    }
    public void squareValues(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void zeroOutNegatives(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void maxMinAverage(double[] arr) {
        double min = arr[0];
        double max  = arr[0];
        double average = 0;
        ArrayList<Double> result= new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
            average+= arr[i];
        }
        result.add(max);
        result.add(min);
        result.add(average/arr.length);
        System.out.println(result);
    }
    public void shitfValues(double[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = 0;
    }
}