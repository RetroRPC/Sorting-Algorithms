package me.retrorpc.algorithms.struct;

import lombok.Getter;
import me.retrorpc.algorithms.types.Algorithm;
import me.retrorpc.algorithms.types.impl.BubbleSortAlgorithm;
import me.retrorpc.algorithms.types.impl.InsertionAlgorithm;
import me.retrorpc.algorithms.types.impl.SelectionAlgorithm;

/**
 * JavaAlgorithms @ RetroRPC
 * Creation: 5/10/2023
 */

@Getter
public enum AlgorithmType {
    INSERTION(new InsertionAlgorithm()),
    BUBBLE_SORT(new BubbleSortAlgorithm()),
    SELECTION(new SelectionAlgorithm());

    private final Algorithm algorithm;

    AlgorithmType(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}
