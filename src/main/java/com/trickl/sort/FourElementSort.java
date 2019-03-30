package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * An optimal four element sort that only uses 5 comparisons.
 *
 * @author tgee
 * @version $Id: $Id
 */
public class FourElementSort implements Sorter {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();

  private Permutator permutator = new StandardPermutator();

  /**
   * {@inheritDoc}
   *
   * Sort a range in the array.
   */
  @Override
  public char[] sort(char[] arr, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (arr[i0] > arr[i1]) {
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(arr, i1, i3);
    }
    if (arr[i0] > arr[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(arr, i0, i2);
    }
    if (arr[i1] > arr[i2]) {
      // This sorts the remaining two elements
      permutator.swap(arr, i1, i2);
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
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (arr[i0] > arr[i1]) {
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(arr, i1, i3);
    }
    if (arr[i0] > arr[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(arr, i0, i2);
    }
    if (arr[i1] > arr[i2]) {
      // This sorts the remaining two elements
      permutator.swap(arr, i1, i2);
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
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (arr[i0] > arr[i1]) {
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(arr, i1, i3);
    }
    if (arr[i0] > arr[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(arr, i0, i2);
    }
    if (arr[i1] > arr[i2]) {
      // This sorts the remaining two elements
      permutator.swap(arr, i1, i2);
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
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (arr[i0] > arr[i1]) {
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(arr, i1, i3);
    }
    if (arr[i0] > arr[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(arr, i0, i2);
    }
    if (arr[i1] > arr[i2]) {
      // This sorts the remaining two elements
      permutator.swap(arr, i1, i2);
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
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (arr[i0] > arr[i1]) {
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(arr, i1, i3);
    }
    if (arr[i0] > arr[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(arr, i0, i2);
    }
    if (arr[i1] > arr[i2]) {
      // This sorts the remaining two elements
      permutator.swap(arr, i1, i2);
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
    if (comparator == null) {
      comparator = naturalOrderingComparator;
    }
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (comparator.compare(arr[i0], arr[i1]) > i0) {
      permutator.swap(arr, i0, i1);
    }
    if (comparator.compare(arr[i2], arr[i3]) > i0) {
      permutator.swap(arr, i2, i3);
    }
    if (comparator.compare(arr[i1], arr[i3]) > i0) {
      // This establishes the maximum into S[i3]
      permutator.swap(arr, i1, i3);
    }
    if (comparator.compare(arr[i0], arr[i2]) > i0) {
      // This establishes the minimum into S[i0]
      permutator.swap(arr, i0, i2);
    }
    if (comparator.compare(arr[i1], arr[i2]) > i0) {
      // This sorts the remaining two elements
      permutator.swap(arr, i1, i2);
    }
    return arr;
  }

  /**
   * Get the underlying permutator.
   *
   * @return The permutator
   */
  public Permutator getPermutator() {
    return permutator;
  }

  /**
   * Set the underlying permutator.
   *
   * @param permutator The permutator
   */
  public void setPermutator(Permutator permutator) {
    this.permutator = permutator;
  }
}
