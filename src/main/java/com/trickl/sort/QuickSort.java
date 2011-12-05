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
 * http://en.wikipedia.org/wiki/Quicksort
 * @author tgee
 */
public final class QuickSort implements Sorter {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();
   private ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
   private InsertionSort insertionSort = new InsertionSort();
   private Permutator permutator = new StandardPermutator();

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end The index of the last element in the range to sort
    * @return The array
    */
   @Override
   public char[] sort(char[] S, int start, int end) {
      if (end > start) {
         if (end - start < 10) {
            return insertionSort.sort(S, start, end);
         }

         int pivotIndex = medianOf3(S, start, (end + start) >> 1, end - 1);
         char pivot = S[pivotIndex];
         int pivotPoint = partitioner.partition(S, start, end, pivot);

         // Recursively sort each partition
         sort(S, start, pivotPoint);

         while (pivotPoint < end && S[pivotPoint] == pivot) {
            ++pivotPoint;
         }

         sort(S, pivotPoint, end);
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
   @Override
   public short[] sort(short[] S, int start, int end) {
      if (end > start) {
         if (end - start < 10) {
            return insertionSort.sort(S, start, end);
         }

         int pivotIndex = medianOf3(S, start, (end + start) >> 1, end - 1);
         short pivot = S[pivotIndex];
         int pivotPoint = partitioner.partition(S, start, end, pivot);

         // Recursively sort each partition
         sort(S, start, pivotPoint);

         while (pivotPoint < end && S[pivotPoint] == pivot) {
            ++pivotPoint;
         }

         sort(S, pivotPoint, end);
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
   @Override
   public double[] sort(double[] S, int start, int end) {
      if (end > start) {
         if (end - start < 10) {
            return insertionSort.sort(S, start, end);
         }

         int pivotIndex = medianOf3(S, start, (end + start) >> 1, end - 1);
         double pivot = S[pivotIndex];
         int pivotPoint = partitioner.partition(S, start, end, pivot);

         // Recursively sort each partition
         sort(S, start, pivotPoint);

         while (pivotPoint < end && S[pivotPoint] == pivot) {
            ++pivotPoint;
         }

         sort(S, pivotPoint, end);
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
   @Override
   public float[] sort(float[] S, int start, int end) {
      if (end > start) {
         if (end - start < 10) {
            return insertionSort.sort(S, start, end);
         }

         int pivotIndex = medianOf3(S, start, (end + start) >> 1, end - 1);
         float pivot = S[pivotIndex];
         int pivotPoint = partitioner.partition(S, start, end, pivot);

         // Recursively sort each partition
         sort(S, start, pivotPoint);

         while (pivotPoint < end && S[pivotPoint] == pivot) {
            ++pivotPoint;
         }

         sort(S, pivotPoint, end);
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
   @Override
   public int[] sort(int[] S, int start, int end) {
      if (end > start) {
         if (end - start < 10) {
            return insertionSort.sort(S, start, end);
         }

         int pivotIndex = medianOf3(S, start, (end + start) >> 1, end - 1);
         int pivot = S[pivotIndex];
         int pivotPoint = partitioner.partition(S, start, end, pivot);

         // Recursively sort each partition
         sort(S, start, pivotPoint);

         while (pivotPoint < end && S[pivotPoint] == pivot) {
            ++pivotPoint;
         }

         sort(S, pivotPoint, end);
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
   @Override
   public <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator) {      
      if (end > start) {
         if (comparator == null) comparator = naturalOrderingComparator;

         if (end - start < 10) {
            return insertionSort.sort(S, start, end, comparator);
         }

         int pivotIndex = medianOf3(S, start, (end + start) >> 1, end - 1, comparator);
         T pivot = S[pivotIndex];
         int pivotPoint = partitioner.partition(S, start, end, pivot, comparator);

         // Recursively sort each partition
         sort(S, start, pivotPoint, comparator);

         while (pivotPoint < end && comparator.compare(S[pivotPoint], pivot) == 0) {
            ++pivotPoint;
         }
         
         sort(S, pivotPoint, end, comparator);
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
   
   private int medianOf3(short[] S, int a, int b, int c) {
      return (S[a] < S[b]
              ? (S[b] < S[c] ? b : S[a] < S[c] ? c : a)
              : (S[b] > S[c] ? b : S[a] > S[c] ? c : a));
   }
   
   private int medianOf3(char[] S, int a, int b, int c) {
      return (S[a] < S[b]
              ? (S[b] < S[c] ? b : S[a] < S[c] ? c : a)
              : (S[b] > S[c] ? b : S[a] > S[c] ? c : a));
   }
   
   private int medianOf3(double[] S, int a, int b, int c) {
      return (S[a] < S[b]
              ? (S[b] < S[c] ? b : S[a] < S[c] ? c : a)
              : (S[b] > S[c] ? b : S[a] > S[c] ? c : a));
   }

   private int medianOf3(float[] S, int a, int b, int c) {
      return (S[a] < S[b]
              ? (S[b] < S[c] ? b : S[a] < S[c] ? c : a)
              : (S[b] > S[c] ? b : S[a] > S[c] ? c : a));
   }

   private int medianOf3(int[] S, int a, int b, int c) {
      return (S[a] < S[b]
              ? (S[b] < S[c] ? b : S[a] < S[c] ? c : a)
              : (S[b] > S[c] ? b : S[a] > S[c] ? c : a));
   }

   private <T> int medianOf3(T[] S, int a, int b, int c, Comparator<T> comparator) {
      return (comparator.compare(S[a], S[b]) < 0
              ? (comparator.compare(S[b], S[c]) < 0 ? b
              : comparator.compare(S[a], S[c]) < 0 ? c : a)
              : (comparator.compare(S[b], S[c]) > 0 ? b
              : comparator.compare(S[a], S[c]) > 0 ? c : a));
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
      this.insertionSort.setPermutator(permutator);
      this.partitioner.setPermutator(permutator);
   }
}
