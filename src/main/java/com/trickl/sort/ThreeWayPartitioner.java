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

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * A partitioner that divides the data set into three partitions according to a pivot. A : a &lt;
 * pivot B : b = pivot C : c > pivot
 *
 * @author tgee
 */
public final class ThreeWayPartitioner {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();

  private GreaterOrEqualPartitioner greaterOrEqualPartitioner = new GreaterOrEqualPartitioner();

  private Permutator permutator = new StandardPermutator();

  /**
   * Partition the range of an array
   *
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(short[] S, int start, int end, short pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (S[j] == pivot) {
        permutator.swap(S, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array
   *
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(char[] S, int start, int end, char pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (S[j] == pivot) {
        permutator.swap(S, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array
   *
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(double[] S, int start, int end, double pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (S[j] == pivot) {
        permutator.swap(S, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array
   *
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(float[] S, int start, int end, float pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (S[j] == pivot) {
        permutator.swap(S, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array
   *
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(int[] S, int start, int end, int pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (S[j] == pivot) {
        permutator.swap(S, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array
   *
   * @param <T> The data type of the array
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public <T> int partition(T[] S, int start, int end, T pivot) {
    return partition(S, start, end, pivot, null);
  }

  /**
   * Partition the range of an array
   *
   * @param <T> The data type of the array
   * @param S The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @param comparator The comparator to use during partitioning
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public <T> int partition(T[] S, int start, int end, T pivot, Comparator<T> comparator) {
    int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot, comparator);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    if (comparator == null) comparator = naturalOrderingComparator;
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (comparator.compare(S[j], pivot) == 0) {
        permutator.swap(S, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Get the permutator used by the partitioner
   *
   * @return The permutator
   */
  public Permutator getPermutator() {
    return permutator;
  }

  /**
   * Set the permutator used by the partitioner
   *
   * @param permutator The permutator to use
   */
  public void setPermutator(Permutator permutator) {
    this.permutator = permutator;
    this.greaterOrEqualPartitioner.setPermutator(permutator);
  }
}
