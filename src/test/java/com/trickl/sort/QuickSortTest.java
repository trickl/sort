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

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

  public QuickSortTest() {}

  @Test
  public void testSortDoubleArray() {
    System.out.println("sortDoubleArray");
    double[] sortable = {4, 5, 3, 2, 1, 6, 7, 0, 9, 8};
    QuickSort sorter = new QuickSort();
    sorter.sort(sortable, 0, sortable.length);
    Assert.assertArrayEquals(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, sortable, 1e-7);
  }

  @Test
  public void testSortGenericArray() {
    System.out.println("sortGenericArray");
    Integer[] sortable = new Integer[] {4, 5, 3, 2, 1, 6, 7, 0, 9, 8};
    QuickSort sorter = new QuickSort();
    sorter.sort(sortable, 0, sortable.length);
    Assert.assertArrayEquals(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, sortable);
  }
}
