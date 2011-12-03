package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

public class InsertionSort {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();
   private Permutator permutator = new StandardPermutator();

   public char[] sort(char[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   public short[] sort(short[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   public double[] sort(double[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   public float[] sort(float[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   public int[] sort(int[] S, int start, int end) {
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && S[j - 1] > S[j]; j--) {
            permutator.swap(S, j, j - 1);
         }
      }
      return S;
   }

   public <T> T[] sort(T[] S, int start, int end) {
      return sort(S, start, end, null);
   }
   
   public <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator) {
      if (comparator == null) comparator = naturalOrderingComparator;
      for (int i = start + 1; i < end; i++) {
         for (int j = i; j > start && comparator.compare(S[j - 1], S[j]) > 0; j--) {
            permutator.swap(S, j, j - 1);
         }
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
