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

import java.util.Comparator;

/**
 * Defines a standard interface for many sorting algorithms.
 *
 * @author tgee
 */
public interface Sorter {
  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  short[] sort(short[] S, int start, int end);
  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  char[] sort(char[] S, int start, int end);
  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  double[] sort(double[] S, int start, int end);
  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  float[] sort(float[] S, int start, int end);
  /**
   * Sort a range in the array
   *
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  int[] sort(int[] S, int start, int end);
  /**
   * Sort a range in the array
   *
   * @param <T> The data type of the array
   * @param S The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator);
}
