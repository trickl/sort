package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * A partitioner that divides the data set into two sets according to a pivot.
 * A : a &lt; pivot B : * b &gt;= pivot
 * Note: values equal to the pivot are not guaranteed to be contiguous.
 *
 * @author tgee
 * @version $Id: $Id
 */
public final class GreaterOrEqualPartitioner {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();

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
    int i = start;
    int j = end - 1;
    while (true) {
      while (i < end && arr[i] < pivot) {
        ++i;
      }

      while (j > start && arr[j] >= pivot) {
        --j;
      }

      if (i >= j) {
        break;
      } else {
        permutator.swap(arr, i, j);
      }
    }

    return i;
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
    int i = start;
    int j = end - 1;
    while (true) {
      while (i < end && arr[i] < pivot) {
        ++i;
      }

      while (j > start && arr[j] >= pivot) {
        --j;
      }

      if (i >= j) {
        break;
      } else {
        permutator.swap(arr, i, j);
      }
    }

    return i;
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
    int i = start;
    int j = end - 1;
    while (true) {
      while (i < end && arr[i] < pivot) {
        ++i;
      }

      while (j > start && arr[j] >= pivot) {
        --j;
      }

      if (i >= j) {
        break;
      } else {
        permutator.swap(arr, i, j);
      }
    }

    return i;
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
    int i = start;
    int j = end - 1;
    while (true) {
      while (i < end && arr[i] < pivot) {
        ++i;
      }

      while (j > start && arr[j] >= pivot) {
        --j;
      }

      if (i >= j) {
        break;
      } else {
        permutator.swap(arr, i, j);
      }
    }

    return i;
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
    int i = start;
    int j = end - 1;
    while (true) {
      while (i < end && arr[i] < pivot) {
        ++i;
      }

      while (j > start && arr[j] >= pivot) {
        --j;
      }

      if (i >= j) {
        break;
      } else {
        permutator.swap(arr, i, j);
      }
    }

    return i;
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
    if (comparator == null) {
      comparator = naturalOrderingComparator;
    }

    int i = start;
    int j = end - 1;
    while (true) {
      while (i < end && comparator.compare(arr[i], pivot) < 0) {
        ++i;
      }

      while (j > start && comparator.compare(arr[j], pivot) >= 0) {
        --j;
      }

      if (i >= j) {
        break;
      } else {
        permutator.swap(arr, i, j);
      }
    }

    return i;
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
  }
}
