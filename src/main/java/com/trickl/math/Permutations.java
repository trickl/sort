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

import com.trickl.sort.NaturalOrderingComparator;
import java.util.Comparator;

/**
 * Utility class for performing common permutations using a Permutator.
 * Including:
 * lexiographicPermute: 
 * See "A Discipline of Programming" by E. W. Dijkstra
 * A function that, given a list of elements and a function that returns a 
 * total ordering of those elements, produces the next lexicographic permutation
 * of the list; for instance, the permutations of the list (1 2 3 4) in
 * lexicographic order are 
 * (1 2 3 4) (2 1 3 4) (1 3 2 4) (3 1 2 4) (2 3 1 4) (3 2 1 4) (1 2 4 3)
 * (2 1 4 3) (1 4 2 3) (4 1 2 3) (2 4 1 3) (4 2 1 3) (1 3 4 2) (3 1 4 2) 
 * (1 4 3 2) (4 1 3 2) (3 4 1 2) (4 3 1 2) (2 3 4 1) (3 2 4 1) (2 4 3 1) 
 * (4 2 3 1) (3 4 2 1) (4 3 2 1). 
 * @author tgee
 */
public final class Permutations {

   private static final NaturalOrderingComparator naturalOrderingComparator
           = new NaturalOrderingComparator();

   private Permutations() {
   }
  
   /**
    * Lexiographic permutation.    
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @return The array
    */
   public static short[] lexiographicPermute(short[] S, Permutator permutator) {
      // Find the position where lexiographic order
      // is not true
      int i = S.length - 2;
      while (i >= 0 && S[i] >= S[i + 1]) {
         --i;
      }

      if (i < 0) {
         // The last permutation (reverse order)
         return permutator.reverse(S, 0, S.length);
      }

      // Find the largest element after S[i] but not larger than s[i]
      int j = S.length - 1;
      while (S[i] > S[j]) {
         --j;
      }

      permutator.swap(S, i, j);
      permutator.reverse(S, ++i, S.length);

      return S;
   }

   /**
    * Lexiographic permutation.
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @return The array
    */
   public static char[] lexiographicPermute(char[] S, Permutator permutator) {
      // Find the position where lexiographic order
      // is not true
      int i = S.length - 2;
      while (i >= 0 && S[i] >= S[i + 1]) {
         --i;
      }

      if (i < 0) {
         // The last permutation (reverse order)
         return permutator.reverse(S, 0, S.length);
      }

      // Find the largest element after S[i] but not larger than s[i]
      int j = S.length - 1;
      while (S[i] > S[j]) {
         --j;
      }

      permutator.swap(S, i, j);
      permutator.reverse(S, ++i, S.length);

      return S;
   }

   /**
    * Lexiographic permutation.
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @return The array
    */
   public static int[] lexiographicPermute(int[] S, Permutator permutator) {
      // Find the position where lexiographic order
      // is not true
      int i = S.length - 2;
      while (i >= 0 && S[i] >= S[i + 1]) {
         --i;
      }

      if (i < 0) {
         // The last permutation (reverse order)
         return permutator.reverse(S, 0, S.length);
      }

      // Find the largest element after S[i] but not larger than s[i]
      int j = S.length - 1;
      while (S[i] > S[j]) {
         --j;
      }

      permutator.swap(S, i, j);
      permutator.reverse(S, ++i, S.length);

      return S;
   }

   /**
    * Lexiographic permutation.
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @return The array
    */
   public static float[] lexiographicPermute(float[] S, Permutator permutator) {
      // Find the position where lexiographic order
      // is not true
      int i = S.length - 2;
      while (i >= 0 && S[i] >= S[i + 1]) {
         --i;
      }

      if (i < 0) {
         // The last permutation (reverse order)
         return permutator.reverse(S, 0, S.length);
      }

      // Find the largest element after S[i] but not larger than s[i]
      int j = S.length - 1;
      while (S[i] > S[j]) {
         --j;
      }

      permutator.swap(S, i, j);
      permutator.reverse(S, ++i, S.length);

      return S;
   }

   /**
    * Lexiographic permutation.
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @return The array
    */
   public static double[] lexiographicPermute(double[] S, Permutator permutator) {
      // Find the position where lexiographic order
      // is not true
      int i = S.length - 2;
      while (i >= 0 && S[i] >= S[i + 1]) {
         --i;
      }

      if (i < 0) {
         // The last permutation (reverse order)
         return permutator.reverse(S, 0, S.length);
      }

      // Find the largest element after S[i] but not larger than s[i]
      int j = S.length - 1;
      while (S[i] > S[j]) {
         --j;
      }

      permutator.swap(S, i, j);
      permutator.reverse(S, ++i, S.length);

      return S;
   }

   /**
    * Lexiographic permutation.
    * @param <T> The type of the array
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @param comparator The comparator to define the order of elements
    * @return The array
    */
   public static <T> T[] lexiographicPermute(T[] S, Permutator permutator, Comparator<T> comparator) {
      if (comparator == null) comparator = naturalOrderingComparator;
      // Find the position where lexiographic order
      // is not true
      int i = S.length - 2;
      while (i >= 0 && comparator.compare(S[i], S[i + 1]) >= 0) {
         --i;
      }

      if (i < 0) {
         // The last permutation (reverse order)
         return permutator.reverse(S, 0, S.length);
      }

      // Find the largest element after S[i] but not larger than s[i]
      int j = S.length - 1;
      while (comparator.compare(S[i], S[j]) > 0) {
         --j;
      }

      permutator.swap(S, i, j);
      permutator.reverse(S, ++i, S.length);

      return S;
   }

   /**
    * Lexiographic permutation.
    * @param <T> The type of the array
    * @param S The array
    * @param permutator The permutator to use for the permutation
    * @return The array
    */
   public static <T> T[] lexiographicPermute(T[] S, Permutator permutator)
   {
      return lexiographicPermute(S, permutator, null);
   }
}
