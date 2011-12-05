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
 * http://en.wikipedia.org/wiki/Insertion_sort
 * @author tgee
 */
public class InsertionSort {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();
   private Permutator permutator = new StandardPermutator();

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public char[] sort(char[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public short[] sort(short[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public double[] sort(double[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public float[] sort(float[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public int[] sort(int[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   /**
    * Sort a range in the array
    * @param <T> The data type of the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public <T> T[] sort(T[] S, int start, int end) {
      return sort(S, start, end, null);
   }
   
   /**
    * Sort a range in the array
    * @param <T> The data type of the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   public <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator) {
      if (comparator == null) comparator = naturalOrderingComparator;
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && comparator.compare(S[j - 1], S[j]) > 0; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   /**
    * Get the permutator used by the partitioner
    * @return The permutator
    */
   public Permutator getPermutator() {
      return permutator;
   }

   /**
    * Set the permutator used by the partitioner
    * @param permutator The permutator to use
    */
   public void setPermutator(Permutator permutator) {
      this.permutator = permutator;
   }
}
