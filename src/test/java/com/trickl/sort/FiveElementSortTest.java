/*
 * This file is part of the Trickl Open Source Libraries.
 *
 * Trickl Open Source Libraries - http://open.trickl.com/
 *
 * Copyright (C) 2011 Tim Gee.
 *
 * Trickl Open Source Libraries are free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Trickl Open Source Libraries are distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this project.  If not, see <http://www.gnu.org/licenses/>.
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
