package me.retrorpc.algorithms.types.impl;

import me.retrorpc.algorithms.types.Algorithm;

/**
 * JavaAlgorithms @ RetroRPC
 * Creation: 5/12/2023
 */

public class InsertionAlgorithm extends Algorithm {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tempPos = array[i];


            while (i > 0 && array[i - 1] > tempPos) {
                array[i] = array[i - 1];
                i--;
            }

            array[i] = tempPos;
        }
        return array;

    }
}
