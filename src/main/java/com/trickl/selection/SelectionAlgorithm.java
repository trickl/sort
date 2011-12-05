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

import java.util.Comparator;

/**
 * http://en.wikipedia.org/wiki/Selection_algorithm
 * @author tgee
 */
public interface SelectionAlgorithm {
   /**
    * Select the kth element in the range of an array
    * @param S The array
    * @param freq The frequency of elements in the array, if null freq(element) = 1
    * @param start The first element in the range
    * @param end The last element in the range
    * @param k
    * @return The index of the kth element
    */
   int select(char[] S, int[] freq, int start, int end, int k);
   /**
    * Select the kth element in the range of an array
    * @param S The array
    * @param freq The frequency of elements in the array, if null freq(element) = 1
    * @param start The first element in the range
    * @param end The last element in the range
    * @param k
    * @return The index of the kth element
    */
   int select(short[] S, int[] freq, int start, int end, int k);
   /**
    * Select the kth element in the range of an array
    * @param S The array
    * @param freq The frequency of elements in the array, if null freq(element) = 1
    * @param start The first element in the range
    * @param end The last element in the range
    * @param k
    * @return The index of the kth element
    */
   int select(double[] S, int[] freq, int start, int end, int k);
   /**
    * Select the kth element in the range of an array
    * @param S The array
    * @param freq The frequency of elements in the array, if null freq(element) = 1
    * @param start The first element in the range
    * @param end The last element in the range
    * @param k
    * @return The index of the kth element
    */
   int select(float[] S, int[] freq, int start, int end, int k);
   /**
    * Select the kth element in the range of an array
    * @param S The array
    * @param freq The frequency of elements in the array, if null freq(element) = 1
    * @param start The first element in the range
    * @param end The last element in the range
    * @param k
    * @return The index of the kth element
    */
   int select(int[] S, int[] freq, int start, int end, int k);
   /**
    * Select the kth element in the range of an array
    * @param S The array
    * @param freq The frequency of elements in the array, if null freq(element) = 1
    * @param start The first element in the range
    * @param end The last element in the range
    * @param k
    * @return The index of the kth element
    */
   <T> int select(T[] S, int[] freq, int start, int end, int k, Comparator<T> comparator);
}
