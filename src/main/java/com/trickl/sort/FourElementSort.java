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
 * An optimal four element sort that only uses 5 comparisons
 *
 * @author tgee
 */
public class FourElementSort implements Sorter {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();

  private Permutator permutator = new StandardPermutator();

  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 3 is always the last element in the range.
   * @return The array
   */
  @Override
  public char[] sort(char[] S, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (S[i0] > S[i1]) {
      permutator.swap(S, i0, i1);
    }
    if (S[i2] > S[i3]) {
      permutator.swap(S, i2, i3);
    }
    if (S[i1] > S[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(S, i1, i3);
    }
    if (S[i0] > S[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(S, i0, i2);
    }
    if (S[i1] > S[i2]) {
      // This sorts the remaining two elements
      permutator.swap(S, i1, i2);
    }
    return S;
  }

  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 3 is always the last element in the range.
   * @return The array
   */
  @Override
  public short[] sort(short[] S, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (S[i0] > S[i1]) {
      permutator.swap(S, i0, i1);
    }
    if (S[i2] > S[i3]) {
      permutator.swap(S, i2, i3);
    }
    if (S[i1] > S[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(S, i1, i3);
    }
    if (S[i0] > S[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(S, i0, i2);
    }
    if (S[i1] > S[i2]) {
      // This sorts the remaining two elements
      permutator.swap(S, i1, i2);
    }
    return S;
  }

  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 3 is always the last element in the range.
   * @return The array
   */
  @Override
  public double[] sort(double[] S, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (S[i0] > S[i1]) {
      permutator.swap(S, i0, i1);
    }
    if (S[i2] > S[i3]) {
      permutator.swap(S, i2, i3);
    }
    if (S[i1] > S[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(S, i1, i3);
    }
    if (S[i0] > S[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(S, i0, i2);
    }
    if (S[i1] > S[i2]) {
      // This sorts the remaining two elements
      permutator.swap(S, i1, i2);
    }
    return S;
  }

  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 3 is always the last element in the range.
   * @return The array
   */
  @Override
  public float[] sort(float[] S, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (S[i0] > S[i1]) {
      permutator.swap(S, i0, i1);
    }
    if (S[i2] > S[i3]) {
      permutator.swap(S, i2, i3);
    }
    if (S[i1] > S[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(S, i1, i3);
    }
    if (S[i0] > S[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(S, i0, i2);
    }
    if (S[i1] > S[i2]) {
      // This sorts the remaining two elements
      permutator.swap(S, i1, i2);
    }
    return S;
  }

  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 3 is always the last element in the range.
   * @return The array
   */
  @Override
  public int[] sort(int[] S, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (S[i0] > S[i1]) {
      permutator.swap(S, i0, i1);
    }
    if (S[i2] > S[i3]) {
      permutator.swap(S, i2, i3);
    }
    if (S[i1] > S[i3]) {
      // This establishes the maximum into S[i3]
      permutator.swap(S, i1, i3);
    }
    if (S[i0] > S[i2]) {
      // This establishes the minimum into S[i0]
      permutator.swap(S, i0, i2);
    }
    if (S[i1] > S[i2]) {
      // This sorts the remaining two elements
      permutator.swap(S, i1, i2);
    }
    return S;
  }

  /**
   * Sort a range in the array
   *
   * @param <T> The data type of the array
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 3 is always the last element in the range.
   * @return The array
   */
  @Override
  public <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator) {
    if (comparator == null) comparator = naturalOrderingComparator;
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;

    if (comparator.compare(S[i0], S[i1]) > i0) {
      permutator.swap(S, i0, i1);
    }
    if (comparator.compare(S[i2], S[i3]) > i0) {
      permutator.swap(S, i2, i3);
    }
    if (comparator.compare(S[i1], S[i3]) > i0) {
      // This establishes the maximum into S[i3]
      permutator.swap(S, i1, i3);
    }
    if (comparator.compare(S[i0], S[i2]) > i0) {
      // This establishes the minimum into S[i0]
      permutator.swap(S, i0, i2);
    }
    if (comparator.compare(S[i1], S[i2]) > i0) {
      // This sorts the remaining two elements
      permutator.swap(S, i1, i2);
    }
    return S;
  }

  /**
   * Get the underlying permutator
   *
   * @return The permutator
   */
  public Permutator getPermutator() {
    return permutator;
  }

  /**
   * Set the underlying permutator
   *
   * @param permutator
   */
  public void setPermutator(Permutator permutator) {
    this.permutator = permutator;
  }
}
