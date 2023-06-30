import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];

        // Calculate the squares of each number
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares); // Sort the array of squares in non-decreasing order

        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.print("Sorted squares: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}