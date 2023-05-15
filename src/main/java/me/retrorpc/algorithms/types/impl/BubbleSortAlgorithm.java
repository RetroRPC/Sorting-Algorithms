package me.retrorpc.algorithms.types.impl;


import me.retrorpc.algorithms.types.Algorithm;

/**
 * JavaAlgorithms @ RetroRPC
 * Creation: 5/10/2023
 */

public class BubbleSortAlgorithm extends Algorithm {

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < n - 1; i++) {
                // Check if the current element is greater than the next element
                if (array[i] > array[i + 1]) {
                    // If true, swap the two elements
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Set sorted flag to false
                    isSorted = false;
                }
            }

            // Reduce the size of the inner loop by 1 since the largest element is already at the end
            n--;
        }

        return array;
    }
}
