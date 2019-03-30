package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * A partitioner that divides the data set into three partitions according to a pivot.
 * A : a &lt; * pivot B : b = pivot C : c &gt; pivot
 *
 * @author tgee
 * @version $Id: $Id
 */
public final class ThreeWayPartitioner {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();

  private GreaterOrEqualPartitioner greaterOrEqualPartitioner = new GreaterOrEqualPartitioner();

  private Permutator permutator = new StandardPermutator();

  /**
   * Partition the range of an array.
   *
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(short[] arr, int start, int end, short pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(arr, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (arr[j] == pivot) {
        permutator.swap(arr, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array.
   *
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(char[] arr, int start, int end, char pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(arr, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (arr[j] == pivot) {
        permutator.swap(arr, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array.
   *
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(double[] arr, int start, int end, double pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(arr, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (arr[j] == pivot) {
        permutator.swap(arr, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array.
   *
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(float[] arr, int start, int end, float pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(arr, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (arr[j] == pivot) {
        permutator.swap(arr, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array.
   *
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public int partition(int[] arr, int start, int end, int pivot) {
    int pivotPoint = greaterOrEqualPartitioner.partition(arr, start, end, pivot);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (arr[j] == pivot) {
        permutator.swap(arr, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Partition the range of an array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public <T> int partition(T[] arr, int start, int end, T pivot) {
    return partition(arr, start, end, pivot, null);
  }

  /**
   * Partition the range of an array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The first element in the range to partition
   * @param end The last element in the range to partition
   * @param pivot The pivot value
   * @param comparator The comparator to use during partitioning
   * @return The position of the first element greater or equal to the pivot after partitioning
   */
  public <T> int partition(T[] arr, int start, int end, T pivot, Comparator<T> comparator) {
    int pivotPoint = greaterOrEqualPartitioner.partition(arr, start, end, pivot, comparator);

    // Everything right of the pivotPoint is greater or equal
    // Now moved the equal elements to the pivot point
    if (comparator == null) {
      comparator = naturalOrderingComparator;
    }
    for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
      if (comparator.compare(arr[j], pivot) == 0) {
        permutator.swap(arr, i, j);
        i++;
      }
    }

    return pivotPoint;
  }

  /**
   * Get the permutator used by the partitioner.
   *
   * @return The permutator
   */
  public Permutator getPermutator() {
    return permutator;
  }

  /**
   * Set the permutator used by the partitioner.
   *
   * @param permutator The permutator to use
   */
  public void setPermutator(Permutator permutator) {
    this.permutator = permutator;
    this.greaterOrEqualPartitioner.setPermutator(permutator);
  }
}
