/*“Selection Sort is a simple comparison-based sorting algorithm. In each pass, we find the smallest element from the unsorted part of the array and place it at the beginning of that unsorted part.”*/
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*Case	Time
Best	O(n²)
Average	O(n²)
Worst	O(n²)*/