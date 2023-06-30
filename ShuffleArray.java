public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;

        // Iterate from 0 to n (exclusive) to process x elements and y elements together
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i]; // Add xi to the result array
            result[index++] = nums[i + n]; // Add yi to the result array
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        System.out.print("Shuffled array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


