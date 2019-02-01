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

public class ThreeWayPartitionerTest {

  @Test
  public void testShortPartition() {
    System.out.println("shortPartition");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    short[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    short pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);

    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    while (pivotPosition < end && S[pivotPosition] == pivot) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] > pivot);
    }
  }

  @Test
  public void testCharPartition() {
    System.out.println("charPartition");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    char[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    char pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    while (pivotPosition < end && S[pivotPosition] == pivot) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] > pivot);
    }
  }

  @Test
  public void testDoublePartition() {
    System.out.println("doublePartition");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    double[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    double pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    while (pivotPosition < end && S[pivotPosition] == pivot) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] > pivot);
    }
  }

  @Test
  public void testFloatPartition() {
    System.out.println("floatPartition");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    float[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    float pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    while (pivotPosition < end && S[pivotPosition] == pivot) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] > pivot);
    }
  }

  @Test
  public void testIntPartition() {
    System.out.println("intPartition");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    int[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    int pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    while (pivotPosition < end && S[pivotPosition] == pivot) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] > pivot);
    }
  }

  @Test
  public void testObjectPartitionNoComparator() {
    System.out.println("objectPartitionNoComparator");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    Integer[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    Integer pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot);
    assertEquals(5, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] < pivot);
    }
    while (pivotPosition < end && S[pivotPosition].equals(pivot)) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] > pivot);
    }
  }

  @Test
  public void testObjectPartitionWithComparator() {
    System.out.println("objectPartitionWithComparator");
    ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
    Integer[] S = {5, 2, 3, 1, 9, 0, 4, 4, 4, 8, 7, 6};
    Integer pivot = 4;
    int start = 2;
    int end = 9;
    int pivotPosition = partitioner.partition(S, start, end, pivot, Collections.reverseOrder());
    assertEquals(3, pivotPosition);
    for (int i = start; i < pivotPosition; ++i) {
      assertTrue(S[i] > pivot);
    }
    while (pivotPosition < end && S[pivotPosition].equals(pivot)) {
      pivotPosition++;
    }
    for (int i = pivotPosition; i < end; ++i) {
      assertTrue(S[i] < pivot);
    }
  }
}
