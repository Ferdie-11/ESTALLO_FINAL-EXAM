import java.util.Stack;

public class StackrFun {
    public static void main(String[] args) {
        Stack<String> creatureStack = new Stack<>();

        // Fixed input data for creatures and their power levels
        String[] cNames = {"Dragon", "Griffin", "Unicorn", "Phoenix", "Centaur"};
        int[] powerLevel = {95, 88, 78, 92, 85};
        
        System.out.println("\nESTALLO FINAL EXAM");
        // Display original data
        System.out.println("\nOriginal Data:");
        printData(cNames, powerLevel);

        // Sort power levels in descending order using Bubble Sort and display
        int[] bubbleSortedPower = bubbleSort(powerLevel.clone());
        System.out.println("\nBubble Sort (Descending Order of Power Levels):");
        printData(cNames, bubbleSortedPower);

        // Sort power levels in ascending order using Selection Sort and display
        int[] selectionSortedPower = selectionSort(powerLevel.clone());
        System.out.println("\nSelection Sort (Ascending Order of Power Levels):");
        printData(cNames, selectionSortedPower);

        // Use bubble sorted data to push creatures onto a stack
     
        for (int i = 0; i < cNames.length; i++) {
            creatureStack.push(cNames[i] + " has a power level of " + bubbleSortedPower[i]);
        }

        // Pop and display each creature's details from the stack
        System.out.println("\nPopped Creatures (Descending Order of Power Levels):");
        while (!creatureStack.isEmpty()) {
            System.out.println(creatureStack.pop());
        }
    }

    // Bubble Sort algorithm to sort the array in descending order
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
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
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Method to print the elements of an array with their corresponding names
    public static void printData(String[] names, int[] powerLevels) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " has a power level of " + powerLevels[i]);
        }
    }
}
