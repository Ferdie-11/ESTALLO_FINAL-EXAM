import java.util.Stack;

public class StackrFun {
    public static void main(String[] args) throws Exception {
    
        Stack<String> creatureStack = new Stack<>();
        String[] cNames = {"Dragon", "Griffin", "Unicorn", "Phoenix", "Centaur"}; //String for stack creatures
        int[] powerLevel = {95, 88, 78, 92, 85}; // Array of power levels corresponding to the creatures

        // Sort the power levels using Bubble Sort and Selection Sort
        int[] bubbleSorted = bubbleSort(powerLevel.clone());
        int[] selectionSorted = selectionSort(powerLevel.clone());

        // Print the sorted power levels
        System.out.println("Bubble Sort:Descending by Power Levels:");
        printArray(bubbleSorted);
        System.out.println("Selection Sort:Ascending by Power Levels:");
        printArray(selectionSorted);

         // Push each creature name onto the stack
         for (int i = 0; i < cNames.length; i++) {
            creatureStack.push(cNames[i]);
            
        }
        //Pop each Creature Name
        while (!creatureStack.isEmpty()) {
           System.out.println("Popped: " + creatureStack.pop());
        }

    }

    // Bubble Sort algorithm to sort the array in descending order
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Selection Sort algorithm to sort the array in ascending order
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int i, j, temp, maxIdx;
        for (i = 0; i < n - 1; i++) {
            maxIdx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
