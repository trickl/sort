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
package com.trickl.selection;

import static org.junit.Assert.*;

import java.util.Collections;
import org.junit.Test;

public class MedianOfMediansTest {

  private static final float tolerance = 1e-15f;

  public MedianOfMediansTest() {}

  @Test
  public void testSelectFromSmallIntegerList() {
    System.out.println("selectFromSmallIntegerList");
    int[] S = {5, 7, 8, 2, 9, 0, 3, 4, 1, 6};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(5, selection.select(S, null, 0, S.length, 0));
    assertEquals(6, selection.select(S, null, 0, S.length, 3));
    assertEquals(9, selection.select(S, null, 0, S.length, 6));
    assertEquals(4, selection.select(S, null, 0, S.length, 9));
  }

  @Test
  public void testSelectFromSmallIntegerListNotModuloFive() {
    System.out.println("selectFromSmallIntegerListNotModuloFive");
    int[] S = {5, 7, 8, 2, 9, 0, 3, 4, 1, 6, 10, 11, -1, -2};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(13, selection.select(S, null, 0, S.length, 0));
    assertEquals(8, selection.select(S, null, 0, S.length, 3));
    assertEquals(7, selection.select(S, null, 0, S.length, 6));
    assertEquals(1, selection.select(S, null, 0, S.length, 9));
  }

  @Test
  public void testSelectFromSmallGenericListNoComparator() {
    System.out.println("selectFromSmallIntegerListReverseOrder");
    Integer[] S = {5, 7, 8, 2, 9, 0, 3, 4, 1, 6};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(5, (int) selection.select(S, null, 0, S.length, 0, null));
    assertEquals(6, (int) selection.select(S, null, 0, S.length, 3, null));
    assertEquals(9, (int) selection.select(S, null, 0, S.length, 6, null));
    assertEquals(4, (int) selection.select(S, null, 0, S.length, 9, null));
  }

  @Test
  public void testSelectFromSmallGenericListUsingComparator() {
    System.out.println("selectFromSmallIntegerListReverseOrder");
    Integer[] S = {5, 7, 8, 2, 9, 0, 3, 4, 1, 6};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(4, selection.select(S, null, 0, S.length, 0, Collections.reverseOrder()));
    assertEquals(9, selection.select(S, null, 0, S.length, 3, Collections.reverseOrder()));
    assertEquals(6, selection.select(S, null, 0, S.length, 6, Collections.reverseOrder()));
    assertEquals(5, selection.select(S, null, 0, S.length, 9, Collections.reverseOrder()));
  }

  @Test
  public void testSelectFromSmallIntegerListWithFreq() {
    System.out.println("selectFromSmallIntegerListWithFreq");
    int[] S = {5, 7, 8, 9, 0, 3, 6};
    int[] freq = {1, 1, 1, 1, 3, 2, 1};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(4, selection.select(S, freq, 0, S.length, 0));
    assertEquals(4, selection.select(S, freq, 0, S.length, 1));
    assertEquals(4, selection.select(S, freq, 0, S.length, 2));
    assertEquals(5, selection.select(S, freq, 0, S.length, 3));
    assertEquals(5, selection.select(S, freq, 0, S.length, 4));
    assertEquals(0, selection.select(S, freq, 0, S.length, 5));
    assertEquals(6, selection.select(S, freq, 0, S.length, 6));
    assertEquals(3, selection.select(S, freq, 0, S.length, 9));
  }

  @Test
  public void testSelectFromSmallCharListWithFreq() {
    System.out.println("selectFromSmallCharListWithFreq");
    char[] S = {5, 7, 8, 9, 0, 3, 6};
    int[] freq = {1, 1, 1, 1, 3, 2, 1};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(4, selection.select(S, freq, 0, S.length, 0));
    assertEquals(4, selection.select(S, freq, 0, S.length, 1));
    assertEquals(4, selection.select(S, freq, 0, S.length, 2));
    assertEquals(5, selection.select(S, freq, 0, S.length, 3));
    assertEquals(5, selection.select(S, freq, 0, S.length, 4));
    assertEquals(0, selection.select(S, freq, 0, S.length, 5));
    assertEquals(6, selection.select(S, freq, 0, S.length, 6));
    assertEquals(3, selection.select(S, freq, 0, S.length, 9));
  }

  @Test
  public void testSelectFromSmallFloatListWithFreq() {
    System.out.println("selectFromSmallFloatListWithFreq");
    float[] S = {5, 7, 8, 9, 0, 3, 6};
    int[] freq = {1, 1, 1, 1, 3, 2, 1};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(4, selection.select(S, freq, 0, S.length, 0), tolerance);
    assertEquals(4, selection.select(S, freq, 0, S.length, 1), tolerance);
    assertEquals(4, selection.select(S, freq, 0, S.length, 2), tolerance);
    assertEquals(5, selection.select(S, freq, 0, S.length, 3), tolerance);
    assertEquals(5, selection.select(S, freq, 0, S.length, 4), tolerance);
    assertEquals(0, selection.select(S, freq, 0, S.length, 5), tolerance);
    assertEquals(6, selection.select(S, freq, 0, S.length, 6), tolerance);
    assertEquals(3, selection.select(S, freq, 0, S.length, 9), tolerance);
  }

  @Test
  public void testSelectFromSmallDoubleListWithFreq() {
    System.out.println("selectFromSmallDoubleListWithFreq");
    double[] S = {5, 7, 8, 9, 0, 3, 6};
    int[] freq = {1, 1, 1, 1, 3, 2, 1};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(4, selection.select(S, freq, 0, S.length, 0), tolerance);
    assertEquals(4, selection.select(S, freq, 0, S.length, 1), tolerance);
    assertEquals(4, selection.select(S, freq, 0, S.length, 2), tolerance);
    assertEquals(5, selection.select(S, freq, 0, S.length, 3), tolerance);
    assertEquals(5, selection.select(S, freq, 0, S.length, 4), tolerance);
    assertEquals(0, selection.select(S, freq, 0, S.length, 5), tolerance);
    assertEquals(6, selection.select(S, freq, 0, S.length, 6), tolerance);
    assertEquals(3, selection.select(S, freq, 0, S.length, 9), tolerance);
  }

  @Test
  public void testSelectFromSmallGenericListWithFreq() {
    System.out.println("selectFromSmallGenericListWithFreq");
    Integer[] S = {5, 7, 8, 9, 0, 3, 6};
    int[] freq = {1, 1, 1, 1, 3, 2, 1};
    MedianOfMedians selection = new MedianOfMedians();
    assertEquals(4, (int) selection.select(S, freq, 0, S.length, 0, null));
    assertEquals(4, (int) selection.select(S, freq, 0, S.length, 1, null));
    assertEquals(4, (int) selection.select(S, freq, 0, S.length, 2, null));
    assertEquals(5, (int) selection.select(S, freq, 0, S.length, 3, null));
    assertEquals(5, (int) selection.select(S, freq, 0, S.length, 4, null));
    assertEquals(0, (int) selection.select(S, freq, 0, S.length, 5, null));
    assertEquals(6, (int) selection.select(S, freq, 0, S.length, 6, null));
    assertEquals(3, (int) selection.select(S, freq, 0, S.length, 9, null));
  }
}
