package com.trickl.sort;

import com.trickl.math.Permutations;
import com.trickl.math.StandardPermutator;

import com.google.caliper.BeforeExperiment;
import com.google.caliper.Benchmark;
import java.util.Arrays;

public class FiveElementSortBenchmark {

  private static final float tolerance = 1e-15f;

  private static final int totalPermutations = 120;
  
  private static final int totalRepetitions = 100;

  public static class Char {
    private char[][] permutations;
    
    private FiveElementSort sorter; 
      
    @BeforeExperiment
    public void setUp() {      
      sorter = new FiveElementSort();
      
      permutations = new char[totalPermutations][5];
      char[] inputArray = new char[] {1, 2, 3, 4, 5};
      
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
        System.arraycopy(inputArray, 0, permutations[permutation], 0, 5);
        for (int i = 0; i < permutation; ++i) {
          Permutations.lexiographicPermute(inputArray, new StandardPermutator());
        }       
      }
      
    }
    
    @Benchmark
    public void timeFiveElementSort() {   
      for (int repetition = 0; repetition < totalRepetitions; ++repetition) {
        for (int permutation = 0; permutation < totalPermutations; ++permutation) {        
          sorter.sort(permutations[permutation], 0, 5);        
        }
      }
    }
    
    @Benchmark
    public void timeArraySort() {   
      for (int repetition = 0; repetition < totalRepetitions; ++repetition) {
        for (int permutation = 0; permutation < totalPermutations; ++permutation) {  
          Arrays.sort(permutations[permutation], 0, 5); 
        }
      }
    }
  }
}
