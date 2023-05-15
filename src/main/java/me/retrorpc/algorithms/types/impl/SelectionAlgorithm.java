package me.retrorpc.algorithms.types.impl;


import me.retrorpc.algorithms.types.Algorithm;

/**
 * JavaAlgorithms @ RetroRPC
 * Creation: 5/15/2023
 */

public class SelectionAlgorithm extends Algorithm {

    @Override
    public int[] sort(int[] array) {

        int arrLength = array.length;

        // Traverse through the array
        for (int i = 0; i < arrLength - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum var in the unsorted part of the array
            for (int j = i + 1; j < arrLength; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum var with the current element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }
}
