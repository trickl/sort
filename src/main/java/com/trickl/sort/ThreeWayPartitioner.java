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

/*
 * The output condition is that everything less than the pivot index is less
 * than the pivot. Everything right (including the pivot point) is equal or
 * greater than than pivot.
 * Note: values equal to the pivot are not guaranteed to be contiguous.
 */
public final class ThreeWayPartitioner {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();

   private GreaterOrEqualPartitioner greaterOrEqualPartitioner = new GreaterOrEqualPartitioner();

   private Permutator permutator = new StandardPermutator();

   public int partition(short[] S, int start, int end, short pivot) {
      int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

      // Everything right of the pivotPoint is greater or equal
      // Now moved the equal elements to the pivot point
      for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
         if (S[j] == pivot) {
            permutator.swap(S, i, j);
            i++;
         }
      }

      return pivotPoint;
   }

   public int partition(char[] S, int start, int end, char pivot) {
      int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

      // Everything right of the pivotPoint is greater or equal
      // Now moved the equal elements to the pivot point
      for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
         if (S[j] == pivot) {
            permutator.swap(S, i, j);
            i++;
         }
      }

      return pivotPoint;
   }

   public int partition(double[] S, int start, int end, double pivot) {
      int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

      // Everything right of the pivotPoint is greater or equal
      // Now moved the equal elements to the pivot point
      for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
         if (S[j] == pivot) {
            permutator.swap(S, i, j);
            i++;
         }
      }

      return pivotPoint;
   }

   public int partition(float[] S, int start, int end, float pivot) {
      int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

      // Everything right of the pivotPoint is greater or equal
      // Now moved the equal elements to the pivot point
      for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
         if (S[j] == pivot) {
            permutator.swap(S, i, j);
            i++;
         }
      }

      return pivotPoint;
   }

   public int partition(int[] S, int start, int end, int pivot) {
      int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot);

      // Everything right of the pivotPoint is greater or equal
      // Now moved the equal elements to the pivot point
      for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
         if (S[j] == pivot) {
            permutator.swap(S, i, j);
            i++;
         }
      }

      return pivotPoint;
   }

   public <T> int partition(T[] S, int start, int end, T pivot) {
      return partition(S, start, end, pivot, null);
   }

   public <T> int partition(T[] S, int start, int end, T pivot, Comparator<T> comparator) {
      int pivotPoint = greaterOrEqualPartitioner.partition(S, start, end, pivot, comparator);

      // Everything right of the pivotPoint is greater or equal
      // Now moved the equal elements to the pivot point
      if (comparator == null) comparator = naturalOrderingComparator;
      for (int j = pivotPoint + 1, i = pivotPoint; j < end; ++j) {
         if (comparator.compare(S[j], pivot) == 0) {
            permutator.swap(S, i, j);
            i++;
         }
      }     

      return pivotPoint;
   }

   public Permutator getPermutator() {
      return permutator;
   }

   public void setPermutator(Permutator permutator) {
      this.permutator = permutator;
      this.greaterOrEqualPartitioner.setPermutator(permutator);
   }
}
