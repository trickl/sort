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
 * The ChainPermutator allows you to chain Permutators together. A common application of this is to
 * get ensure permutations apply to more than one set of data.
 *
 * @author tgee
 * @version $Id: $Id
 */
public class ChainPermutator implements Permutator {

  private Permutator lhsPermutator = new StandardPermutator();

  private Permutator rhsPermutator = new StandardPermutator();

  /**
   * <p>Getter for the field <code>lhsPermutator</code>.</p>
   *
   * @return a {@link com.trickl.math.Permutator} object.
   */
  public Permutator getLhsPermutator() {
    return lhsPermutator;
  }

  /**
   * <p>Setter for the field <code>lhsPermutator</code>.</p>
   *
   * @param lhsPermutator a {@link com.trickl.math.Permutator} object.
   */
  public void setLhsPermutator(Permutator lhsPermutator) {
    this.lhsPermutator = lhsPermutator;
  }

  /**
   * <p>Getter for the field <code>rhsPermutator</code>.</p>
   *
   * @return a {@link com.trickl.math.Permutator} object.
   */
  public Permutator getRhsPermutator() {
    return rhsPermutator;
  }

  /**
   * <p>Setter for the field <code>rhsPermutator</code>.</p>
   * @param rhsPermutator a {@link com.trickl.math.Permutator} object.
   */
  public void setRhsPermutator(Permutator rhsPermutator) {
    this.rhsPermutator = rhsPermutator;
  }

  /**
   * Create a paired permutator.
   *
   * @param lhsPermutator a {@link com.trickl.math.Permutator} object.
   * @param rhsPermutator a {@link com.trickl.math.Permutator} object.
   */
  public ChainPermutator(Permutator lhsPermutator, Permutator rhsPermutator) {
    this.lhsPermutator = lhsPermutator;
    this.rhsPermutator = rhsPermutator;
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [ 1, 2, 3 ] -&gt; [ 2, 3, 1 ]
   */
  @Override
  public short[] cycle(short[] S, int first, int second, int third) {
    lhsPermutator.cycle(S, first, second, third);
    return rhsPermutator.cycle(S, first, second, third);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [ 1, 2, 3 ] -&gt; [ 2, 3, 1 ]
   */
  @Override
  public char[] cycle(char[] S, int first, int second, int third) {
    lhsPermutator.cycle(S, first, second, third);
    return rhsPermutator.cycle(S, first, second, third);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [ 1, 2, 3 ] -&gt; [ 2, 3, 1 ]
   */
  @Override
  public float[] cycle(float[] S, int first, int second, int third) {
    lhsPermutator.cycle(S, first, second, third);
    return rhsPermutator.cycle(S, first, second, third);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [ 1, 2, 3 ] -&gt; [ 2, 3, 1 ]
   */
  @Override
  public double[] cycle(double[] S, int first, int second, int third) {
    lhsPermutator.cycle(S, first, second, third);
    return rhsPermutator.cycle(S, first, second, third);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [ 1, 2, 3 ] -&gt; [ 2, 3, 1 ]
   */
  @Override
  public int[] cycle(int[] S, int first, int second, int third) {
    lhsPermutator.cycle(S, first, second, third);
    return rhsPermutator.cycle(S, first, second, third);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a three cycle permutation [ 1, 2, 3 ] -&gt; [ 2, 3, 1 ]
   */
  @Override
  public <T> T[] cycle(T[] S, int first, int second, int third) {
    lhsPermutator.cycle(S, first, second, third);
    return rhsPermutator.cycle(S, first, second, third);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [ 1, 2, 3, 4] -&gt; [ 2, 3, 4, 1]
   */
  @Override
  public short[] cycle(short[] S, int first, int second, int third, int fourth) {
    lhsPermutator.cycle(S, first, second, third, fourth);
    return rhsPermutator.cycle(S, first, second, third, fourth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [ 1, 2, 3, 4] -&gt; [ 2, 3, 4, 1]
   */
  @Override
  public char[] cycle(char[] S, int first, int second, int third, int fourth) {
    lhsPermutator.cycle(S, first, second, third, fourth);
    return rhsPermutator.cycle(S, first, second, third, fourth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [ 1, 2, 3, 4] -&gt; [ 2, 3, 4, 1]
   */
  @Override
  public float[] cycle(float[] S, int first, int second, int third, int fourth) {
    lhsPermutator.cycle(S, first, second, third, fourth);
    return rhsPermutator.cycle(S, first, second, third, fourth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [ 1, 2, 3, 4] -&gt; [ 2, 3, 4, 1]
   */
  @Override
  public double[] cycle(double[] S, int first, int second, int third, int fourth) {
    lhsPermutator.cycle(S, first, second, third, fourth);
    return rhsPermutator.cycle(S, first, second, third, fourth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [ 1, 2, 3, 4] -&gt; [ 2, 3, 4, 1]
   */
  @Override
  public int[] cycle(int[] S, int first, int second, int third, int fourth) {
    lhsPermutator.cycle(S, first, second, third, fourth);
    return rhsPermutator.cycle(S, first, second, third, fourth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a four cycle permutation [ 1, 2, 3, 4] -&gt; [ 2, 3, 4, 1]
   */
  @Override
  public <T> T[] cycle(T[] S, int first, int second, int third, int fourth) {
    lhsPermutator.cycle(S, first, second, third, fourth);
    return rhsPermutator.cycle(S, first, second, third, fourth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -&gt; [ 2, 3, 4, 5, 1]
   */
  @Override
  public short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth) {
    lhsPermutator.cycle(S, first, second, third, fourth, fifth);
    return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -&gt; [ 2, 3, 4, 5, 1]
   */
  @Override
  public char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth) {
    lhsPermutator.cycle(S, first, second, third, fourth, fifth);
    return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -&gt; [ 2, 3, 4, 5, 1]
   */
  @Override
  public float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth) {
    lhsPermutator.cycle(S, first, second, third, fourth, fifth);
    return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -&gt; [ 2, 3, 4, 5, 1]
   */
  @Override
  public double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth) {
    lhsPermutator.cycle(S, first, second, third, fourth, fifth);
    return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -&gt; [ 2, 3, 4, 5, 1]
   */
  @Override
  public int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth) {
    lhsPermutator.cycle(S, first, second, third, fourth, fifth);
    return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
  }

  /**
   * {@inheritDoc}
   *
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -&gt; [ 2, 3, 4, 5, 1]
   */
  @Override
  public <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth) {
    lhsPermutator.cycle(S, first, second, third, fourth, fifth);
    return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public short[] reverse(short[] S, int start, int end) {
    lhsPermutator.reverse(S, start, end);
    return rhsPermutator.reverse(S, start, end);
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public char[] reverse(char[] S, int start, int end) {
    lhsPermutator.reverse(S, start, end);
    return rhsPermutator.reverse(S, start, end);
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public double[] reverse(double[] S, int start, int end) {
    lhsPermutator.reverse(S, start, end);
    return rhsPermutator.reverse(S, start, end);
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public float[] reverse(float[] S, int start, int end) {
    lhsPermutator.reverse(S, start, end);
    return rhsPermutator.reverse(S, start, end);
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public int[] reverse(int[] S, int start, int end) {
    lhsPermutator.reverse(S, start, end);
    return rhsPermutator.reverse(S, start, end);
  }

  /**
   * {@inheritDoc}
   *
   * Reverse the elements in the array
   */
  @Override
  public <T> T[] reverse(T[] S, int start, int end) {
    lhsPermutator.reverse(S, start, end);
    return rhsPermutator.reverse(S, start, end);
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public short[] swap(short[] S, int first, int second) {
    lhsPermutator.swap(S, first, second);
    return rhsPermutator.swap(S, first, second);
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public char[] swap(char[] S, int first, int second) {
    lhsPermutator.swap(S, first, second);
    return rhsPermutator.swap(S, first, second);
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public double[] swap(double[] S, int first, int second) {
    lhsPermutator.swap(S, first, second);
    return rhsPermutator.swap(S, first, second);
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public float[] swap(float[] S, int first, int second) {
    lhsPermutator.swap(S, first, second);
    return rhsPermutator.swap(S, first, second);
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public int[] swap(int[] S, int first, int second) {
    lhsPermutator.swap(S, first, second);
    return rhsPermutator.swap(S, first, second);
  }

  /**
   * {@inheritDoc}
   *
   * Swap the elements in the array
   */
  @Override
  public <T> T[] swap(T[] S, int first, int second) {
    lhsPermutator.swap(S, first, second);
    return rhsPermutator.swap(S, first, second);
  }
}
