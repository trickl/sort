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
package com.trickl.math;

/**
 * The IntArrayPermutator permutes the array given at construction not the one supplied during the
 * call.
 *
 * @author tgee
 * @version $Id: $Id
 */
public class IntArrayPermutator implements Permutator {

  private int[] array;

  /**
   * Create an IntArrayPermutator.
   *
   * @param array an array of int.
   */
  public IntArrayPermutator(int[] array) {
    this.array = array;
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public short[] swap(short[] S, int first, int second) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public char[] swap(char[] S, int first, int second) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public double[] swap(double[] S, int first, int second) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public float[] swap(float[] S, int first, int second) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public int[] swap(int[] S, int first, int second) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public <T> T[] swap(T[] S, int first, int second) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [1, 2, 3] -&gt; [2, 3, 1]
   */
  @Override
  public short[] cycle(short[] S, int first, int second, int third) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [1, 2, 3] -&gt; [2, 3, 1]
   */
  @Override
  public char[] cycle(char[] S, int first, int second, int third) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [1, 2, 3] -&gt; [2, 3, 1]
   */
  @Override
  public float[] cycle(float[] S, int first, int second, int third) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [1, 2, 3] -&gt; [2, 3, 1]
   */
  @Override
  public double[] cycle(double[] S, int first, int second, int third) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [1, 2, 3] -&gt; [2, 3, 1]
   */
  @Override
  public int[] cycle(int[] S, int first, int second, int third) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [1, 2, 3] -&gt; [2, 3, 1]
   */
  @Override
  public <T> T[] cycle(T[] S, int first, int second, int third) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [1, 2, 3, 4] -&gt; [2, 3, 4, 1]
   */
  @Override
  public short[] cycle(short[] S, int first, int second, int third, int fourth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [1, 2, 3, 4] -&gt; [2, 3, 4, 1]
   */
  @Override
  public char[] cycle(char[] S, int first, int second, int third, int fourth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [1, 2, 3, 4] -&gt; [2, 3, 4, 1]
   */
  @Override
  public float[] cycle(float[] S, int first, int second, int third, int fourth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [1, 2, 3, 4] -&gt; [2, 3, 4, 1]
   */
  @Override
  public double[] cycle(double[] S, int first, int second, int third, int fourth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [1, 2, 3, 4] -&gt; [2, 3, 4, 1]
   */
  @Override
  public int[] cycle(int[] S, int first, int second, int third, int fourth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [1, 2, 3, 4] -&gt; [2, 3, 4, 1]
   */
  @Override
  public <T> T[] cycle(T[] S, int first, int second, int third, int fourth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [1, 2, 3, 4, 5] -&gt; [2, 3, 4, 5, 1]
   */
  @Override
  public short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = array[fifth];
    array[fifth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [1, 2, 3, 4, 5] -&gt; [2, 3, 4, 5, 1]
   */
  @Override
  public char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = array[fifth];
    array[fifth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [1, 2, 3, 4, 5] -&gt; [2, 3, 4, 5, 1]
   */
  @Override
  public float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = array[fifth];
    array[fourth] = array[fifth];
    array[fifth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [1, 2, 3, 4, 5] -&gt; [2, 3, 4, 5, 1]
   */
  @Override
  public double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = array[fifth];
    array[fifth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [1, 2, 3, 4, 5] -&gt; [2, 3, 4, 5, 1]
   */
  @Override
  public int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = array[fifth];
    array[fifth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [1, 2, 3, 4, 5] -&gt; [2, 3, 4, 5, 1]
   */
  @Override
  public <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth) {
    int temp = array[first];
    array[first] = array[second];
    array[second] = array[third];
    array[third] = array[fourth];
    array[fourth] = array[fifth];
    array[fifth] = temp;
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public short[] reverse(short[] S, int start, int end) {
    for (int i = start, j = end - 1; i < j; ++i, --j) {
      swap(S, i, j);
    }
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public char[] reverse(char[] S, int start, int end) {
    for (int i = start, j = end - 1; i < j; ++i, --j) {
      swap(S, i, j);
    }
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public double[] reverse(double[] S, int start, int end) {
    for (int i = start, j = end - 1; i < j; ++i, --j) {
      swap(S, i, j);
    }
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public float[] reverse(float[] S, int start, int end) {
    for (int i = start, j = end - 1; i < j; ++i, --j) {
      swap(S, i, j);
    }
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public int[] reverse(int[] S, int start, int end) {
    for (int i = start, j = end - 1; i < j; ++i, --j) {
      swap(S, i, j);
    }
    return S;
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public <T> T[] reverse(T[] S, int start, int end) {
    for (int i = start, j = end - 1; i < j; ++i, --j) {
      swap(S, i, j);
    }
    return S;
  }
};
