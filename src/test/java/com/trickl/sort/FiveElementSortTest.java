/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trickl.sort;

import com.trickl.sort.FiveElementSort;
import com.trickl.math.Permutations;
import com.trickl.math.StandardPermutator;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tgee
 */
public class FiveElementSortTest {

   private static final float tolerance = 1e-15f;

   private static final int totalPermutations = 120;

   public FiveElementSortTest() {
   }

   @Test
   public void testSortCharArray() {
      System.out.println("sortCharArray");
      FiveElementSort sorter = new FiveElementSort();
      char[] inputArray = new char[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new char[]{1, 2, 3, 4, 5});
      }
   }

   @Test
   public void testSortShortArray() {
      System.out.println("sortShortArray");
      FiveElementSort sorter = new FiveElementSort();
      short[] inputArray = new short[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new short[]{1, 2, 3, 4, 5});
      }
   }

   @Test
   public void testSortFloatArray() {
      System.out.println("sortFloatArray");
      FiveElementSort sorter = new FiveElementSort();
      float[] inputArray = new float[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new float[]{1, 2, 3, 4, 5}, tolerance);
      }
   }

   @Test
   public void testSortDoubleArray() {
      System.out.println("sortDoubleArray");
      FiveElementSort sorter = new FiveElementSort();
      double[] inputArray = new double[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new double[]{1, 2, 3, 4, 5}, tolerance);
      }
   }

   @Test
   public void testSortIntArray() {
      System.out.println("sortIntArray");
      FiveElementSort sorter = new FiveElementSort();
      int[] inputArray = new int[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length);
         Assert.assertArrayEquals(inputArray, new int[]{1, 2, 3, 4, 5});
      }
   }

   @Test
   public void testSortGenericTypeArrayNoComparator() {
      System.out.println("sortGenericTypeArrayNoComparator");
      FiveElementSort sorter = new FiveElementSort();
      Integer[] inputArray = new Integer[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray,  0, inputArray.length, null);
         Assert.assertArrayEquals(inputArray, new Integer[]{1, 2, 3, 4, 5});
      }
   }

   @Test
   public void testSortGenericTypeArrayWithComparator() {
      System.out.println("sortGenericTypeArrayWithComparator");
      FiveElementSort sorter = new FiveElementSort();
      Integer[] inputArray = new Integer[]{1, 2, 3, 4, 5};
      for (int permutation = 0; permutation < totalPermutations; ++permutation) {
         for (int i = 0; i < permutation; ++i) {
            Permutations.permutation(inputArray, new StandardPermutator());
         }
         sorter.sort(inputArray, 0, inputArray.length, Collections.reverseOrder());
         Assert.assertArrayEquals(inputArray, new Integer[]{5, 4, 3, 2, 1});
      }
   }
}
