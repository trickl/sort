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

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** @author tgee */
public class StandardPermutatorTest {

  private static final float tolerance = 1e-7f;

  private static Permutator permutator;

  public StandardPermutatorTest() {}

  @Before
  public void beforeTest() {
    permutator = new StandardPermutator();
  }

  @Test
  public void testSwapShortArray() {
    short[] S = new short[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.swap(S, 1, 2);
    Assert.assertArrayEquals(new short[] {0, 2, 1, 3, 4, 5, 6, 7}, S);
  }

  @Test
  public void testSwapCharArray() {
    char[] S = new char[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.swap(S, 1, 2);
    Assert.assertArrayEquals(new char[] {0, 2, 1, 3, 4, 5, 6, 7}, S);
  }

  @Test
  public void testSwapIntArray() {
    int[] S = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.swap(S, 1, 2);
    Assert.assertArrayEquals(new int[] {0, 2, 1, 3, 4, 5, 6, 7}, S);
  }

  @Test
  public void testSwapFloatArray() {
    float[] S = new float[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.swap(S, 1, 2);
    Assert.assertArrayEquals(new float[] {0, 2, 1, 3, 4, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testSwapDoubleArray() {
    double[] S = new double[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.swap(S, 1, 2);
    Assert.assertArrayEquals(new double[] {0, 2, 1, 3, 4, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testSwapObjectArray() {
    Integer[] S = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.swap(S, 1, 2);
    Assert.assertArrayEquals(new Integer[] {0, 2, 1, 3, 4, 5, 6, 7}, S);
  }

  @Test
  public void testCycle3ShortArray() {
    short[] S = new short[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3);
    Assert.assertArrayEquals(new short[] {0, 2, 3, 1, 4, 5, 6, 7}, S);
  }

  @Test
  public void testCycle3CharArray() {
    char[] S = new char[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3);
    Assert.assertArrayEquals(new char[] {0, 2, 3, 1, 4, 5, 6, 7}, S);
  }

  @Test
  public void testCycle3IntArray() {
    int[] S = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3);
    Assert.assertArrayEquals(new int[] {0, 2, 3, 1, 4, 5, 6, 7}, S);
  }

  @Test
  public void testCycle3FloatArray() {
    float[] S = new float[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3);
    Assert.assertArrayEquals(new float[] {0, 2, 3, 1, 4, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testCycle3DoubleArray() {
    double[] S = new double[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3);
    Assert.assertArrayEquals(new double[] {0, 2, 3, 1, 4, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testCycle3ObjectArray() {
    Integer[] S = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3);
    Assert.assertArrayEquals(new Integer[] {0, 2, 3, 1, 4, 5, 6, 7}, S);
  }

  @Test
  public void testCycle4ShortArray() {
    short[] S = new short[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4);
    Assert.assertArrayEquals(new short[] {0, 2, 3, 4, 1, 5, 6, 7}, S);
  }

  @Test
  public void testCycle4CharArray() {
    char[] S = new char[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4);
    Assert.assertArrayEquals(new char[] {0, 2, 3, 4, 1, 5, 6, 7}, S);
  }

  @Test
  public void testCycle4IntArray() {
    int[] S = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4);
    Assert.assertArrayEquals(new int[] {0, 2, 3, 4, 1, 5, 6, 7}, S);
  }

  @Test
  public void testCycle4FloatArray() {
    float[] S = new float[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4);
    Assert.assertArrayEquals(new float[] {0, 2, 3, 4, 1, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testCycle4DoubleArray() {
    double[] S = new double[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4);
    Assert.assertArrayEquals(new double[] {0, 2, 3, 4, 1, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testCycle4ObjectArray() {
    Integer[] S = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4);
    Assert.assertArrayEquals(new Integer[] {0, 2, 3, 4, 1, 5, 6, 7}, S);
  }

  @Test
  public void testCycle5ShortArray() {
    short[] S = new short[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4, 5);
    Assert.assertArrayEquals(new short[] {0, 2, 3, 4, 5, 1, 6, 7}, S);
  }

  @Test
  public void testCycle5CharArray() {
    char[] S = new char[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4, 5);
    Assert.assertArrayEquals(new char[] {0, 2, 3, 4, 5, 1, 6, 7}, S);
  }

  @Test
  public void testCycle5IntArray() {
    int[] S = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4, 5);
    Assert.assertArrayEquals(new int[] {0, 2, 3, 4, 5, 1, 6, 7}, S);
  }

  @Test
  public void testCycle5FloatArray() {
    float[] S = new float[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4, 5);
    Assert.assertArrayEquals(new float[] {0, 2, 3, 4, 5, 1, 6, 7}, S, tolerance);
  }

  @Test
  public void testCycle5DoubleArray() {
    double[] S = new double[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4, 5);
    Assert.assertArrayEquals(new double[] {0, 2, 3, 4, 5, 1, 6, 7}, S, tolerance);
  }

  @Test
  public void testCycle5ObjectArray() {
    Integer[] S = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.cycle(S, 1, 2, 3, 4, 5);
    Assert.assertArrayEquals(new Integer[] {0, 2, 3, 4, 5, 1, 6, 7}, S);
  }

  @Test
  public void testReverseShortArray() {
    short[] S = new short[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.reverse(S, 2, 5);
    Assert.assertArrayEquals(new short[] {0, 1, 4, 3, 2, 5, 6, 7}, S);
  }

  @Test
  public void testReverseCharArray() {
    char[] S = new char[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.reverse(S, 2, 5);
    Assert.assertArrayEquals(new char[] {0, 1, 4, 3, 2, 5, 6, 7}, S);
  }

  @Test
  public void testReverseIntArray() {
    int[] S = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.reverse(S, 2, 5);
    Assert.assertArrayEquals(new int[] {0, 1, 4, 3, 2, 5, 6, 7}, S);
  }

  @Test
  public void testReverseFloatArray() {
    float[] S = new float[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.reverse(S, 2, 5);
    Assert.assertArrayEquals(new float[] {0, 1, 4, 3, 2, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testReverseDoubleArray() {
    double[] S = new double[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.reverse(S, 2, 5);
    Assert.assertArrayEquals(new double[] {0, 1, 4, 3, 2, 5, 6, 7}, S, tolerance);
  }

  @Test
  public void testReverseObjectArray() {
    Integer[] S = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7};
    permutator.reverse(S, 2, 5);
    Assert.assertArrayEquals(new Integer[] {0, 1, 4, 3, 2, 5, 6, 7}, S);
  }
}
