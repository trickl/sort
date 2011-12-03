/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trickl.sort;

import com.trickl.sort.FourElementSort;
import com.trickl.math.Permutations;
import com.trickl.math.StandardPermutator;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tgee
 */
public class FourElementSortTest {

   private static final double tolerance = 1e-15;

   private static final int totalPermutations = 24;

   public FourElementSortTest() {
   }

   @Test
   public void testSortDoubleArray() {
      System.out.println("sortDoubleArray");
      FourElementSort sorter = new FourElementSort();
      double[] inputArray = new double[]{1, 2, 3, 4};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new double[]{1, 2, 3, 4}, tolerance);
      }
   }

   @Test
   public void testSortIntArray() {
      System.out.println("sortIntArray");
      FourElementSort sorter = new FourElementSort();
      int[] inputArray = new int[]{1, 2, 3, 4};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new int[]{1, 2, 3, 4});
      }
   }

   @Test
   public void testSortGenericTypeArrayNoComparator() {
      System.out.println("sortGenericTypeArrayNoComparator");
      FourElementSort sorter = new FourElementSort();
      Integer[] inputArray = new Integer[]{1, 2, 3, 4};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length, null);
         Assert.assertArrayEquals(inputArray, new Integer[]{1, 2, 3, 4});
      }
   }

   @Test
   public void testSortGenericTypeArrayWithComparator() {
      System.out.println("sortGenericTypeArrayWithComparator");
      FourElementSort sorter = new FourElementSort();
      Integer[] inputArray = new Integer[]{1, 2, 3, 4};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length, Collections.reverseOrder());
         Assert.assertArrayEquals(inputArray, new Integer[]{4, 3, 2, 1});
      }
   }
}
