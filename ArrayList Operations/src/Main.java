//Nabil Arrouss
//VUZDOW

import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Created an Arraylist type String
        ArrayList<String> myArrayList = new ArrayList<>();

        //Added few Strings to the arraylist
        myArrayList.add("Hey");
        myArrayList.add("Apple");
        myArrayList.add("Juice");

        //To print the elements inside the arraylist
        System.out.println(myArrayList);

        //To print the last/left element in the array by calling the method "printLeftElement" on the arraylist
        System.out.println(printLeftElement(myArrayList));

    }

    //Declared a method return type String,
    // this method will remove elements randomly from the arraylist and print the last/left element
    static String printLeftElement (ArrayList<String> list) {

        //Create an instance of Random to randomize the index number
        Random random = new Random();

        while (list.size() > 1) {
            int randIndex = random.nextInt(list.size());
            list.remove(randIndex);
        }
        return "The element left is: "+  list.get(0);
    }
}