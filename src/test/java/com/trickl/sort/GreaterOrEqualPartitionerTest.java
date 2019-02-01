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

import static org.junit.Assert.*;

import java.util.Collections;
import org.junit.Test;

public class GreaterOrEqualPartitionerTest {

  @Test
  public void testShortPartition() {
    System.out.println("shortPartition");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    short[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    short pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] >= pivot);
    }
  }

  @Test
  public void testCharPartition() {
    System.out.println("charPartition");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    char[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    char pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] >= pivot);
    }
  }

  @Test
  public void testDoublePartition() {
    System.out.println("doublePartition");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    double[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    double pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] >= pivot);
    }
  }

  @Test
  public void testFloatPartition() {
    System.out.println("floatPartition");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    float[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    float pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] >= pivot);
    }
  }

  @Test
  public void testIntPartition() {
    System.out.println("intPartition");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    int[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    int pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] >= pivot);
    }
  }

  @Test
  public void testObjectPartitionNoComparator() {
    System.out.println("objectPartitionNoComparator");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    Integer[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    Integer pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] >= pivot);
    }
  }

  @Test
  public void testObjectPartitionWithComparator() {
    System.out.println("objectPartitionWithComparator");
    GreaterOrEqualPartitioner partitioner = new GreaterOrEqualPartitioner();
    Integer[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    Integer pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot, Collections.reverseOrder());
    assertEquals(3, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] > pivot);
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] <= pivot);
    }
  }
}
