package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * http://en.wikipedia.org/wiki/Insertion_sort
 *
 * @author tgee
 */
public class InsertionSort {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();
  private Permutator permutator = new StandardPermutator();

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public char[] sort(char[] arr, int start, int end) {
    for (int i = start + 1; i < end; i++) {
      for (int j = i; j > start && arr[j - 1] > arr[j]; j--) {
        permutator.swap(arr, j, j - 1);
      }
    }
    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public short[] sort(short[] arr, int start, int end) {
    for (int i = start + 1; i < end; i++) {
      for (int j = i; j > start && arr[j - 1] > arr[j]; j--) {
        permutator.swap(arr, j, j - 1);
      }
    }
    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public double[] sort(double[] arr, int start, int end) {
    for (int i = start + 1; i < end; i++) {
      for (int j = i; j > start && arr[j - 1] > arr[j]; j--) {
        permutator.swap(arr, j, j - 1);
      }
    }
    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public float[] sort(float[] arr, int start, int end) {
    for (int i = start + 1; i < end; i++) {
      for (int j = i; j > start && arr[j - 1] > arr[j]; j--) {
        permutator.swap(arr, j, j - 1);
      }
    }
    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public int[] sort(int[] arr, int start, int end) {
    for (int i = start + 1; i < end; i++) {
      for (int j = i; j > start && arr[j - 1] > arr[j]; j--) {
        permutator.swap(arr, j, j - 1);
      }
    }
    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public <T> T[] sort(T[] arr, int start, int end) {
    return sort(arr, start, end, null);
  }

  /**
   * Sort a range in the array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  public <T> T[] sort(T[] arr, int start, int end, Comparator<T> comparator) {
    if (comparator == null) {
      comparator = naturalOrderingComparator;
    }
    for (int i = start + 1; i < end; i++) {
      for (int j = i; j > start && comparator.compare(arr[j - 1], arr[j]) > 0; j--) {
        permutator.swap(arr, j, j - 1);
      }
    }
    return arr;
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
