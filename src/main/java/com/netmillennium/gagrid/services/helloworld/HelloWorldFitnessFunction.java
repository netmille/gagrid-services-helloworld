package com.netmillennium.gagrid.services.helloworld;

import java.util.List;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteLogger;

import com.netmillennium.gagrid.model.Gene;
import com.netmillennium.gagrid.parameter.IFitnessFunction;

/**
 * This example demonstrates how to create a IFitnessFunction
 *
 * Your IFitness function will vary depending on your particular use case.
 * 
 * For this fitness function, we simply want to calculate the value of
 * 
 * an individual solution relative to other solutions.
 * 
 * 
 * To do this, we simply increase fitness score by '1' for each character
 * 
 * that is correct position.
 * 
 * For our solution, our genetic algorithm will continue until
 * 
 * we achieve a fitness score of '11', as 'HELLO WORLD' contains '11' characters.
 * 
 */

public class HelloWorldFitnessFunction implements IFitnessFunction {

    private String targetString = "HELLO WORLD";

  
    @Override
    public double evaluate(List<Gene> genes) {

        double matches = 0;

        for (int i = 0; i < genes.size(); i++) {
            if (((Character) (genes.get(i).getVal())).equals(targetString.charAt(i))) {
                matches = matches + 1;
            }
        }
 
        return matches;
    }
}
