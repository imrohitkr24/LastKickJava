/*“Bubble Sort repeatedly compares adjacent elements and swaps them when they are in the wrong order. After each pass, the largest unsorted element reaches the end. It has O(n²) average and worst-case time complexity and O(1) auxiliary space. It is simple but generally not preferred for large datasets because of its quadratic time complexity.”*/
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//Time complexity: O(n²)
//Space complexity: O(1)