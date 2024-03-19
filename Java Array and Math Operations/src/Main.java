
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Array operations
        String[] alphabet = {"a","b","c","d"};
        int[] numbers = {1,2,6,3,48,4};

        System.out.println(Arrays.toString(alphabet));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println( "The number of elements in 'numbers' array: " + numbers.length);

        int[] nums = new int[4];
        nums[0] = 100;
        System.out.println(Arrays.toString(nums));

        int[][] nums2 = {{1,2,3},{4,5,6,6,7}};
        nums2[1][3] = 10;
        System.out.println(nums2[1][3]);

        // Math operations
        System.out.println(Math.max(123, 12));
        System.out.println(Math.random());
        System.out.println(Math.random() * 8); // range between 0 and 8 excluding 8.
        System.out.println((int) (Math.random() * 11)); // a whole number between 0 and 10.
        System.out.println((int)(Math.random() * 56)); // generate a number between 0 and 55.

        // Check if a number is even or odd
        int a = 25;
        System.out.println((a == 0) || (a % 2 == 0));
    }
}
