package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

public final class QuickSort implements Sorter {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();
   private ThreeWayPartitioner partitioner = new ThreeWayPartitioner();
   private InsertionSort insertionSort = new InsertionSort();
   private Permutator permutator = new StandardPermutator();

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

   public Permutator getPermutator() {
      return permutator;
   }

   public void setPermutator(Permutator permutator) {
      this.permutator = permutator;
      this.insertionSort.setPermutator(permutator);
      this.partitioner.setPermutator(permutator);
   }
}
