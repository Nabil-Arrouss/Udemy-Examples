import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> myArrayList = new ArrayList<>();

        // Add elements to the ArrayList
        myArrayList.add("Hey");
        myArrayList.add("Apple");
        myArrayList.add("Juice");

        // Print the elements of the ArrayList
        System.out.println(myArrayList);

        // Print the last/left element in the ArrayList after removing elements randomly
        System.out.println(printLeftElement(myArrayList));

    }

    // Method to remove elements randomly and print the left element
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
