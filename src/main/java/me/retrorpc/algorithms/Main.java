package me.retrorpc.algorithms;

import me.retrorpc.algorithms.struct.AlgorithmType;

import java.util.Random;

/**
 * JavaAlgorithms @ RetroRPC
 * Creation: 5/10/2023
 */

public class Main {


    public static void main(String[] args) {


        Random random = new Random();
        int[] array = new int[100];

        System.out.println("VALUES:");

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(400);
            System.out.println(array[i]);
        }

        System.out.println();
        System.out.println("SORTED:");
        AlgorithmType.SELECTION.getAlgorithm().sort(array);

        for (int i : array) {
            System.out.println(i);
        }


    }

}
