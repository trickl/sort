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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** @author tgee */
public class PermutationsTest {

  private static final float tolerance = 1e-7f;

  private static Permutator permutator;

  public PermutationsTest() {}

  @Before
  public void beforeTest() {
    permutator = new StandardPermutator();
  }

  @Test
  public void testPermutationShortArray() {
    short[] S = new short[] {0, 1, 2};
    Assert.assertArrayEquals(
        new short[] {0, 2, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new short[] {1, 0, 2}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new short[] {1, 2, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new short[] {2, 0, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new short[] {2, 1, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new short[] {0, 1, 2}, Permutations.lexiographicPermute(S, permutator));
  }

  @Test
  public void testPermutationCharArray() {
    char[] S = new char[] {0, 1, 2};
    Assert.assertArrayEquals(new char[] {0, 2, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new char[] {1, 0, 2}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new char[] {1, 2, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new char[] {2, 0, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new char[] {2, 1, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new char[] {0, 1, 2}, Permutations.lexiographicPermute(S, permutator));
  }

  @Test
  public void testPermutationDoubleArray() {
    double[] S = new double[] {0, 1, 2};
    Assert.assertArrayEquals(
        new double[] {0, 2, 1}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new double[] {1, 0, 2}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new double[] {1, 2, 0}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new double[] {2, 0, 1}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new double[] {2, 1, 0}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new double[] {0, 1, 2}, Permutations.lexiographicPermute(S, permutator), tolerance);
  }

  @Test
  public void testPermutationFloatArray() {
    float[] S = new float[] {0, 1, 2};
    Assert.assertArrayEquals(
        new float[] {0, 2, 1}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new float[] {1, 0, 2}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new float[] {1, 2, 0}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new float[] {2, 0, 1}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new float[] {2, 1, 0}, Permutations.lexiographicPermute(S, permutator), tolerance);
    Assert.assertArrayEquals(
        new float[] {0, 1, 2}, Permutations.lexiographicPermute(S, permutator), tolerance);
  }

  @Test
  public void testPermutationIntArray() {
    int[] S = new int[] {0, 1, 2};
    Assert.assertArrayEquals(new int[] {0, 2, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new int[] {1, 0, 2}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new int[] {1, 2, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new int[] {2, 0, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new int[] {2, 1, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(new int[] {0, 1, 2}, Permutations.lexiographicPermute(S, permutator));
  }

  @Test
  public void testPermutationObjectArray() {
    Integer[] S = new Integer[] {0, 1, 2};
    Assert.assertArrayEquals(
        new Integer[] {0, 2, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new Integer[] {1, 0, 2}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new Integer[] {1, 2, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new Integer[] {2, 0, 1}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new Integer[] {2, 1, 0}, Permutations.lexiographicPermute(S, permutator));
    Assert.assertArrayEquals(
        new Integer[] {0, 1, 2}, Permutations.lexiographicPermute(S, permutator));
  }
}
