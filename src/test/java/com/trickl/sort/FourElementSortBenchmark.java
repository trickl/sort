package com.trickl.sort;

import com.trickl.math.Permutations;
import com.trickl.math.StandardPermutator;

import com.google.caliper.BeforeExperiment;
import com.google.caliper.Benchmark;
import java.util.Arrays;

public class FourElementSortBenchmark {

  private static final float tolerance = 1e-15f;

  private static final int totalPermutations = 24;
  
  private static final int totalRepetitions = 10000;

  public static class Char {
    private char[][] permutations;
    
    private FourElementSort sorter; 
      
    @BeforeExperiment
    public void setUp() {      
      sorter = new FourElementSort();
      
      permutations = new char[totalPermutations][4];
      char[] inputArray = new char[] {1, 2, 3, 4};
      
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
        System.arraycopy(inputArray, 0, permutations[permutation], 0, 4);
        for (int i = 0; i < permutation; ++i) {
          Permutations.lexiographicPermute(inputArray, new StandardPermutator());
        }       
      }
      
    }
    
    @Benchmark
    public void timeFourElementSort() {   
      for (int repetition = 0; repetition < totalRepetitions; ++repetition) {
        for (int permutation = 0; permutation < totalPermutations; ++permutation) {        
          sorter.sort(permutations[permutation], 0, 4);        
        }
      }
    }
    
    @Benchmark
    public void timeArraySort() {   
      for (int repetition = 0; repetition < totalRepetitions; ++repetition) {
        for (int permutation = 0; permutation < totalPermutations; ++permutation) {  
          Arrays.sort(permutations[permutation], 0, 4); 
        }
      }
    }
  }
}
