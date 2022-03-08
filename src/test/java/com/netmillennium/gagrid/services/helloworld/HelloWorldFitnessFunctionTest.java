package com.netmillennium.gagrid.services.helloworld;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.netmillennium.gagrid.model.Gene;

public class HelloWorldFitnessFunctionTest {

	
	@Test
	public void testHelloWorldFitnessFunction()
	{
		List<Gene> genes = new ArrayList<Gene>(){{
			   add(new Gene(new Character('H')));
			   add(new Gene(new Character('E')));
			   add(new Gene(new Character('L')));
			   add(new Gene(new Character('L')));
			   add(new Gene(new Character('O')));
			   add(new Gene(new Character(' ')));
			   add(new Gene(new Character('W')));
			   add(new Gene(new Character('O')));
			   add(new Gene(new Character('R')));
			   add(new Gene(new Character('L')));
			   add(new Gene(new Character('D')));
			}};
		
		  HelloWorldFitnessFunction function = new HelloWorldFitnessFunction();
		
		  double fitness = function.evaluate(genes);
		  
		  Assertions.assertEquals(11.0, fitness);
	}
	
}
