package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

public class FourElementSort implements Sorter {

   private static final NaturalOrderingComparator naturalOrderingComparator
           = new NaturalOrderingComparator();

   private Permutator permutator = new StandardPermutator();

   @Override
   public char[] sort(char[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;

      if (S[i0] > S[i1]) {
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         // This establishes the maximum into S[i3]
         permutator.swap(S, i1, i3);
      }
      if (S[i0] > S[i2]) {
         // This establishes the minimum into S[i0]
         permutator.swap(S, i0, i2);
      }
      if (S[i1] > S[i2]) {
         // This sorts the remaining two elements
         permutator.swap(S, i1, i2);
      }
      return S;
   }

   @Override
   public short[] sort(short[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;

      if (S[i0] > S[i1]) {
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         // This establishes the maximum into S[i3]
         permutator.swap(S, i1, i3);
      }
      if (S[i0] > S[i2]) {
         // This establishes the minimum into S[i0]
         permutator.swap(S, i0, i2);
      }
      if (S[i1] > S[i2]) {
         // This sorts the remaining two elements
         permutator.swap(S, i1, i2);
      }
      return S;
   }

   @Override
   public double[] sort(double[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;

      if (S[i0] > S[i1]) {
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         // This establishes the maximum into S[i3]
         permutator.swap(S, i1, i3);
      }
      if (S[i0] > S[i2]) {
         // This establishes the minimum into S[i0]
         permutator.swap(S, i0, i2);
      }
      if (S[i1] > S[i2]) {
         // This sorts the remaining two elements
         permutator.swap(S, i1, i2);
      }
      return S;
   }

   @Override
   public float[] sort(float[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;

      if (S[i0] > S[i1]) {
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         // This establishes the maximum into S[i3]
         permutator.swap(S, i1, i3);
      }
      if (S[i0] > S[i2]) {
         // This establishes the minimum into S[i0]
         permutator.swap(S, i0, i2);
      }
      if (S[i1] > S[i2]) {
         // This sorts the remaining two elements
         permutator.swap(S, i1, i2);
      }
      return S;
   }

   @Override
   public int[] sort(int[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;

      if (S[i0] > S[i1]) {
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         // This establishes the maximum into S[i3]
         permutator.swap(S, i1, i3);
      }
      if (S[i0] > S[i2]) {
         // This establishes the minimum into S[i0]
         permutator.swap(S, i0, i2);
      }
      if (S[i1] > S[i2]) {
         // This sorts the remaining two elements
         permutator.swap(S, i1, i2);
      }
      return S;
   }

   @Override
   public <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator) {
      if (comparator == null) comparator = naturalOrderingComparator;
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      
      if (comparator.compare(S[i0], S[i1]) > i0) {
         permutator.swap(S, i0, i1);
      }
      if (comparator.compare(S[i2], S[i3]) > i0) {
         permutator.swap(S, i2, i3);
      }
      if (comparator.compare(S[i1], S[i3]) > i0) {
         // This establishes the maximum into S[i3]
         permutator.swap(S, i1, i3);
      }
      if (comparator.compare(S[i0], S[i2]) > i0) {
         // This establishes the minimum into S[i0]
         permutator.swap(S, i0, i2);
      }
      if (comparator.compare(S[i1], S[i2]) > i0) {
         // This sorts the remaining two elements
         permutator.swap(S, i1, i2);
      }
      return S;
   }

   public Permutator getPermutator() {
      return permutator;
   }

   public void setPermutator(Permutator permutator) {
      this.permutator = permutator;
   }
}
