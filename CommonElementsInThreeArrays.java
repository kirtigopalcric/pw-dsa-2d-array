import java.util.ArrayList;
import java.util.List;

public class CommonElementsInThreeArrays {
    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        // Convert the List to an array
        int[] commonElements = new int[result.size()];
        for (int idx = 0; idx < result.size(); idx++) {
            commonElements[idx] = result.get(idx);
        }

        return commonElements;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        int[] commonElements = findCommonElements(arr1, arr2, arr3);

        System.out.print("Common elements: ");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
}

