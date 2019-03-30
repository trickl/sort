package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * http://en.wikipedia.org/wiki/Quicksort.
 *
 * @author tgee
 * @version $Id: $Id
 */
public final class QuickSort implements Sorter {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();
  private final ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
  private final InsertionSort insertionSort = new InsertionSort();
  private Permutator permutator = new StandardPermutator();

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public char[] sort(char[] arr, int start, int end) {
    if (end > start) {
      if (end - start < 10) {
        return insertionSort.sort(arr, start, end);
      }

      int pivotIndex = medianOf3(arr, start, (end + start) >> 1, end - 1);
      char pivot = arr[pivotIndex];
      int pivotPoint = partitioner.partition(arr, start, end, pivot);

      // Recursively sort each partition
      sort(arr, start, pivotPoint);

      while (pivotPoint < end && arr[pivotPoint] == pivot) {
        ++pivotPoint;
      }

      sort(arr, pivotPoint, end);
    }

    return arr;
  }

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public short[] sort(short[] arr, int start, int end) {
    if (end > start) {
      if (end - start < 10) {
        return insertionSort.sort(arr, start, end);
      }

      int pivotIndex = medianOf3(arr, start, (end + start) >> 1, end - 1);
      short pivot = arr[pivotIndex];
      int pivotPoint = partitioner.partition(arr, start, end, pivot);

      // Recursively sort each partition
      sort(arr, start, pivotPoint);

      while (pivotPoint < end && arr[pivotPoint] == pivot) {
        ++pivotPoint;
      }

      sort(arr, pivotPoint, end);
    }

    return arr;
  }

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public double[] sort(double[] arr, int start, int end) {
    if (end > start) {
      if (end - start < 10) {
        return insertionSort.sort(arr, start, end);
      }

      int pivotIndex = medianOf3(arr, start, (end + start) >> 1, end - 1);
      double pivot = arr[pivotIndex];
      int pivotPoint = partitioner.partition(arr, start, end, pivot);

      // Recursively sort each partition
      sort(arr, start, pivotPoint);

      while (pivotPoint < end && arr[pivotPoint] == pivot) {
        ++pivotPoint;
      }

      sort(arr, pivotPoint, end);
    }

    return arr;
  }

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public float[] sort(float[] arr, int start, int end) {
    if (end > start) {
      if (end - start < 10) {
        return insertionSort.sort(arr, start, end);
      }

      int pivotIndex = medianOf3(arr, start, (end + start) >> 1, end - 1);
      float pivot = arr[pivotIndex];
      int pivotPoint = partitioner.partition(arr, start, end, pivot);

      // Recursively sort each partition
      sort(arr, start, pivotPoint);

      while (pivotPoint < end && arr[pivotPoint] == pivot) {
        ++pivotPoint;
      }

      sort(arr, pivotPoint, end);
    }

    return arr;
  }

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public int[] sort(int[] arr, int start, int end) {
    if (end > start) {
      if (end - start < 10) {
        return insertionSort.sort(arr, start, end);
      }

      int pivotIndex = medianOf3(arr, start, (end + start) >> 1, end - 1);
      int pivot = arr[pivotIndex];
      int pivotPoint = partitioner.partition(arr, start, end, pivot);

      // Recursively sort each partition
      sort(arr, start, pivotPoint);

      while (pivotPoint < end && arr[pivotPoint] == pivot) {
        ++pivotPoint;
      }

      sort(arr, pivotPoint, end);
    }

    return arr;
  }

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public <T> T[] sort(T[] arr, int start, int end, Comparator<T> comparator) {
    if (end > start) {
      if (comparator == null) {
        comparator = naturalOrderingComparator;
      }

      if (end - start < 10) {
        return insertionSort.sort(arr, start, end, comparator);
      }

      int pivotIndex = medianOf3(arr, start, (end + start) >> 1, end - 1, comparator);
      T pivot = arr[pivotIndex];
      int pivotPoint = partitioner.partition(arr, start, end, pivot, comparator);

      // Recursively sort each partition
      sort(arr, start, pivotPoint, comparator);

      while (pivotPoint < end && comparator.compare(arr[pivotPoint], pivot) == 0) {
        ++pivotPoint;
      }

      sort(arr, pivotPoint, end, comparator);
    }

    return arr;
  }

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  public <T> T[] sort(T[] arr, int start, int end) {
    return sort(arr, start, end, null);
  }

  private int medianOf3(short[] arr, int a, int b, int c) {
    return (arr[a] < arr[b]
        ? (arr[b] < arr[c] ? b : arr[a] < arr[c] ? c : a)
        : (arr[b] > arr[c] ? b : arr[a] > arr[c] ? c : a));
  }

  private int medianOf3(char[] arr, int a, int b, int c) {
    return (arr[a] < arr[b]
        ? (arr[b] < arr[c] ? b : arr[a] < arr[c] ? c : a)
        : (arr[b] > arr[c] ? b : arr[a] > arr[c] ? c : a));
  }

  private int medianOf3(double[] arr, int a, int b, int c) {
    return (arr[a] < arr[b]
        ? (arr[b] < arr[c] ? b : arr[a] < arr[c] ? c : a)
        : (arr[b] > arr[c] ? b : arr[a] > arr[c] ? c : a));
  }

  private int medianOf3(float[] arr, int a, int b, int c) {
    return (arr[a] < arr[b]
        ? (arr[b] < arr[c] ? b : arr[a] < arr[c] ? c : a)
        : (arr[b] > arr[c] ? b : arr[a] > arr[c] ? c : a));
  }

  private int medianOf3(int[] arr, int a, int b, int c) {
    return (arr[a] < arr[b]
        ? (arr[b] < arr[c] ? b : arr[a] < arr[c] ? c : a)
        : (arr[b] > arr[c] ? b : arr[a] > arr[c] ? c : a));
  }

  private <T> int medianOf3(T[] arr, int a, int b, int c, Comparator<T> comparator) {
    return (comparator.compare(arr[a], arr[b]) < 0
        ? (comparator.compare(arr[b], arr[c]) < 0 ? b :
            comparator.compare(arr[a], arr[c]) < 0 ? c : a)
        : (comparator.compare(arr[b], arr[c]) > 0 ? b :
            comparator.compare(arr[a], arr[c]) > 0 ? c : a));
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
    this.insertionSort.setPermutator(permutator);
    this.partitioner.setPermutator(permutator);
  }
}
