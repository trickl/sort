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

import com.trickl.math.Permutations;
import com.trickl.math.StandardPermutator;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

/** @author tgee */
public class FourElementSortTest {

  private static final double tolerance = 1e-15;

  private static final int totalPermutations = 24;

  public FourElementSortTest() {}

  @Test
  public void testSortDoubleArray() {
    System.out.println("sortDoubleArray");
    FourElementSort sorter = new FourElementSort();
    double[] inputArray = new double[] {1, 2, 3, 4};
    for (int permutation = 0; permutation < totalPermutations; ++permutation) {
      for (int i = 0; i < permutation; ++i) {
        Permutations.lexiographicPermute(inputArray, new StandardPermutator());
      }
      sorter.sort(inputArray, 0, inputArray.length);
      Assert.assertArrayEquals(inputArray, new double[] {1, 2, 3, 4}, tolerance);
    }
  }

  @Test
  public void testSortIntArray() {
    System.out.println("sortIntArray");
    FourElementSort sorter = new FourElementSort();
    int[] inputArray = new int[] {1, 2, 3, 4};
    for (int permutation = 0; permutation < totalPermutations; ++permutation) {
      for (int i = 0; i < permutation; ++i) {
        Permutations.lexiographicPermute(inputArray, new StandardPermutator());
      }
      sorter.sort(inputArray, 0, inputArray.length);
      Assert.assertArrayEquals(inputArray, new int[] {1, 2, 3, 4});
    }
  }

  @Test
  public void testSortGenericTypeArrayNoComparator() {
    System.out.println("sortGenericTypeArrayNoComparator");
    FourElementSort sorter = new FourElementSort();
    Integer[] inputArray = new Integer[] {1, 2, 3, 4};
    for (int permutation = 0; permutation < totalPermutations; ++permutation) {
      for (int i = 0; i < permutation; ++i) {
        Permutations.lexiographicPermute(inputArray, new StandardPermutator());
      }
      sorter.sort(inputArray, 0, inputArray.length, null);
      Assert.assertArrayEquals(inputArray, new Integer[] {1, 2, 3, 4});
    }
  }

  @Test
  public void testSortGenericTypeArrayWithComparator() {
    System.out.println("sortGenericTypeArrayWithComparator");
    FourElementSort sorter = new FourElementSort();
    Integer[] inputArray = new Integer[] {1, 2, 3, 4};
    for (int permutation = 0; permutation < totalPermutations; ++permutation) {
      for (int i = 0; i < permutation; ++i) {
        Permutations.lexiographicPermute(inputArray, new StandardPermutator());
      }
      sorter.sort(inputArray, 0, inputArray.length, Collections.reverseOrder());
      Assert.assertArrayEquals(inputArray, new Integer[] {4, 3, 2, 1});
    }
  }
}
