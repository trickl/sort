package com.trickl.selection;

import com.trickl.math.PairedPermutator;
import com.trickl.math.Permutator;
import com.trickl.sort.FiveElementSort;
import com.trickl.sort.QuickSort;
import com.trickl.sort.ThreeWayPartitioner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Recursive selection algorithm, theoretical O(n) worst complexity.
 * Detailed in "Foundations of algorithms using Java pseudocode"
 * By R E. Neapolitan, K Naimipour
 * @author tgee
 */
public class MedianOfMedians implements SelectionAlgorithm {

   private static final QuickSort sorter = new QuickSort();
   private static final FiveElementSort fiveElementIndexPairedSorter = new FiveElementSort();
   private static final QuickSort indexPairedSorter = new QuickSort();     
   private static final ThreeWayPartitioner indexPairedPartitioner = new ThreeWayPartitioner();

   @Override
   public int select(char[] S, int[] freq, int start, int end, int k) {
      // Non-destructive selection
      char[] copyS = Arrays.copyOf(S, S.length);
      int[] index = new int[S.length];
      for (int i = 0; i < S.length; ++i) {
         index[i] = i;
      }
      pairIndex(index);
      return index[select(copyS, freq, index, start, end, k)];
   }
   
   protected int select(char[] S, int[] freq, int[] index, int start, int end, int k) {

      if (end == (start + 1)) {
         return start;
      } else {
         int pivotPoint = partitionByMedian(S, freq, index, start, end);
         int kMin = freq == null ? pivotPoint : accumulate(freq, index, 0, pivotPoint);
         int kMax = kMin;
         char pivotValue = S[pivotPoint];
         for (int j = pivotPoint; j < end && S[j] == pivotValue; ++j) {
            kMax += (freq == null ? 1 : freq[index[pivotPoint]]);
         }

         if (k < kMin) {
            return select(S, freq, index, start, pivotPoint, k);
         } else if (k >= kMax) {
            return select(S, freq, index, pivotPoint + 1, end, k);
         } else {
            return pivotPoint;
         }
      }
   }

   @Override
   public int select(short[] S, int[] freq, int start, int end, int k) {
      // Non-destructive selection
      short[] copyS = Arrays.copyOf(S, S.length);
      int[] index = new int[S.length];
      for (int i = 0; i < S.length; ++i) {
         index[i] = i;
      }
      pairIndex(index);
      return index[select(copyS, freq, index, start, end, k)];
   }

   protected int select(short[] S, int[] freq, int[] index, int start, int end, int k) {

      if (end == (start + 1)) {
         return start;
      } else {
         int pivotPoint = partitionByMedian(S, freq, index, start, end);
         int kMin = freq == null ? pivotPoint : accumulate(freq, index, 0, pivotPoint);
         int kMax = kMin;
         short pivotValue = S[pivotPoint];
         for (int j = pivotPoint; j < end && S[j] == pivotValue; ++j) {
            kMax += (freq == null ? 1 : freq[index[pivotPoint]]);
         }

         if (k < kMin) {
            return select(S, freq, index, start, pivotPoint, k);
         } else if (k >= kMax) {
            return select(S, freq, index, pivotPoint + 1, end, k);
         } else {
            return pivotPoint;
         }
      }
   }

   @Override
   public int select(double[] S, int[] freq, int start, int end, int k) {
      // Non-destructive selection
      double[] copyS = Arrays.copyOf(S, S.length);
      int[] index = new int[S.length];
      for (int i = 0; i < S.length; ++i) {
         index[i] = i;
      }
      pairIndex(index);
      return index[select(copyS, freq, index, start, end, k)];
   }

   protected int select(double[] S, int[] freq, int[] index, int start, int end, int k) {

      if (end == (start + 1)) {
         return start;
      } else {
         int pivotPoint = partitionByMedian(S, freq, index, start, end);
         int kMin = freq == null ? pivotPoint : accumulate(freq, index, 0, pivotPoint);
         int kMax = kMin;
         double pivotValue = S[pivotPoint];
         for (int j = pivotPoint; j < end && S[j] == pivotValue; ++j) {
            kMax += (freq == null ? 1 : freq[index[pivotPoint]]);
         }

         if (k < kMin) {
            return select(S, freq, index, start, pivotPoint, k);
         } else if (k >= kMax) {
            return select(S, freq, index, pivotPoint + 1, end, k);
         } else {
            return pivotPoint;
         }
      }
   }

  @Override
   public int select(float[] S, int[] freq, int start, int end, int k) {
      // Non-destructive selection
      float[] copyS = Arrays.copyOf(S, S.length);
      int[] index = new int[S.length];
      for (int i = 0; i < S.length; ++i) {
         index[i] = i;
      }
      pairIndex(index);
      return index[select(copyS, freq, index, start, end, k)];
   }

   protected int select(float[] S, int[] freq, int[] index, int start, int end, int k) {

      if (end == (start + 1)) {
         return start;
      } else {
         int pivotPoint = partitionByMedian(S, freq, index, start, end);
         int kMin = freq == null ? pivotPoint : accumulate(freq, index, 0, pivotPoint);
         int kMax = kMin;
         float pivotValue = S[pivotPoint];
         for (int j = pivotPoint; j < end && S[j] == pivotValue; ++j) {
            kMax += (freq == null ? 1 : freq[index[pivotPoint]]);
         }

         if (k < kMin) {
            return select(S, freq, index, start, pivotPoint, k);
         } else if (k >= kMax) {
            return select(S, freq, index, pivotPoint + 1, end, k);
         } else {
            return pivotPoint;
         }
      }
   }

   @Override
   public int select(int[] S, int[] freq, int start, int end, int k) {
      // Non-destructive selection
      int[] copyS = Arrays.copyOf(S, S.length);
      int[] index = new int[S.length];
      for (int i = 0; i < S.length; ++i) {
         index[i] = i;
      }
      pairIndex(index);
      return index[select(copyS, freq, index, start, end, k)];
   }

   protected int select(int[] S, int[] freq, int[] index, int start, int end, int k) {

      if (end == (start + 1)) {
         return start;
      } else {
         int pivotPoint = partitionByMedian(S, freq, index, start, end);
         int kMin = freq == null ? pivotPoint : accumulate(freq, index, 0, pivotPoint);
         int kMax = kMin;
         int pivotValue = S[pivotPoint];
         for (int j = pivotPoint; j < end && S[j] == pivotValue; ++j) {
            kMax += (freq == null ? 1 : freq[index[pivotPoint]]);
         }

         if (k < kMin) {
            return select(S, freq, index, start, pivotPoint, k);
         } else if (k >= kMax) {
            return select(S, freq, index, pivotPoint + 1, end, k);
         } else {
            return pivotPoint;
         }
      }
   }

   @Override
   public <T> int select(T[] S, int[] freq, int start, int end, int k, Comparator<T> comparator) {
      // Non-destructive selection
      T[] copyS = Arrays.copyOf(S, S.length);
      int[] index = new int[S.length];
      for (int i = 0; i < S.length; ++i) {
         index[i] = i;
      }
      pairIndex(index);
      return index[select(copyS, freq, index, start, end, k, comparator)];
   }

   protected <T> int select(T[] S, int[] freq, int[] index, int start, int end, int k, Comparator<T> comparator) {

      if (end == (start + 1)) {
         return start;
      } else {
         int pivotPoint = partitionByMedian(S, freq, index, start, end, comparator);
         int kMin = freq == null ? pivotPoint : accumulate(freq, index, 0, pivotPoint);
         int kMax = kMin;
         T pivotValue = S[pivotPoint];
         for (int j = pivotPoint; j < end && S[j] == pivotValue; ++j) {
            kMax += (freq == null ? 1 : freq[index[pivotPoint]]);
         }

         if (k < kMin) {
            return select(S, freq, index, start, pivotPoint, k, comparator);
         } else if (k >= kMax) {
            return select(S, freq, index, pivotPoint + 1, end, k, comparator);
         } else {
            return pivotPoint;
         }
      }
   }

   protected int partitionByMedian(char[] S, int[] freq, int[] indices, int low, int high) {
      final int arraysize = high - low;
      char[] subList = new char[(arraysize + 4) / 5];
      int[] subListFreq = null;
      if (freq != null) {
         subListFreq = new int[(arraysize + 4) / 5];
      }

      // Break the list into sublists of length 5
      for (int i = 0; i < subList.length; ++i) {
         int first = low + 5 * i;
         int last = Math.min(low + 5 * (i + 1), high);
         if (last - first == 5) {
            fiveElementIndexPairedSorter.sort(S, first, last);
         } else {
            indexPairedSorter.sort(S, first, last);
         }

         int medianPosition = (last + first) >> 1;
         if (freq != null) {
            medianPosition = medianPosition(freq, indices, first, last);
            subListFreq[i] = freq[indices[medianPosition]];
         }
         subList[i] = S[medianPosition];
      }

      // Approximate the medoid      
      sorter.sort(subList, 0, subList.length);
      int subListMedianPosition = subListFreq == null ? subList.length >> 1
              : medianPosition(subListFreq, 0, subListFreq.length);
      char medianOfMedians = subList[subListMedianPosition];

      // Partition S based on the median of medians      
      return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
   }

   protected int partitionByMedian(short[] S, int[] freq, int[] indices, int low, int high) {
      final int arraysize = high - low;
      short[] subList = new short[(arraysize + 4) / 5];
      int[] subListFreq = null;
      if (freq != null) {
         subListFreq = new int[(arraysize + 4) / 5];
      }

      // Break the list into sublists of length 5
      for (int i = 0; i < subList.length; ++i) {
         int first = low + 5 * i;
         int last = Math.min(low + 5 * (i + 1), high);
         if (last - first == 5) {
            fiveElementIndexPairedSorter.sort(S, first, last);
         } else {
            indexPairedSorter.sort(S, first, last);
         }

         int medianPosition = (last + first) >> 1;
         if (freq != null) {
            medianPosition = medianPosition(freq, indices, first, last);
            subListFreq[i] = freq[indices[medianPosition]];
         }
         subList[i] = S[medianPosition];
      }

      // Approximate the medoid
      sorter.sort(subList, 0, subList.length);
      int subListMedianPosition = subListFreq == null ? subList.length >> 1
              : medianPosition(subListFreq, 0, subListFreq.length);
      short medianOfMedians = subList[subListMedianPosition];

      // Partition S based on the median of medians
      return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
   }

   protected int partitionByMedian(float[] S, int[] freq, int[] indices, int low, int high) {
      final int arraysize = high - low;
      float[] subList = new float[(arraysize + 4) / 5];
      int[] subListFreq = null;
      if (freq != null) {
         subListFreq = new int[(arraysize + 4) / 5];
      }

      // Break the list into sublists of length 5
      for (int i = 0; i < subList.length; ++i) {
         int first = low + 5 * i;
         int last = Math.min(low + 5 * (i + 1), high);
         if (last - first == 5) {
            fiveElementIndexPairedSorter.sort(S, first, last);
         } else {
            indexPairedSorter.sort(S, first, last);
         }

         int medianPosition = (last + first) >> 1;
         if (freq != null) {
            medianPosition = medianPosition(freq, indices, first, last);
            subListFreq[i] = freq[indices[medianPosition]];
         }
         subList[i] = S[medianPosition];
      }

      // Approximate the medoid
      sorter.sort(subList, 0, subList.length);
      int subListMedianPosition = subListFreq == null ? subList.length >> 1
              : medianPosition(subListFreq, 0, subListFreq.length);
      float medianOfMedians = subList[subListMedianPosition];

      // Partition S based on the median of medians
      return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
   }

   protected int partitionByMedian(double[] S, int[] freq, int[] indices, int low, int high) {
      final int arraysize = high - low;
      double[] subList = new double[(arraysize + 4) / 5];
      int[] subListFreq = null;
      if (freq != null) {
         subListFreq = new int[(arraysize + 4) / 5];
      }

      // Break the list into sublists of length 5
      for (int i = 0; i < subList.length; ++i) {
         int first = low + 5 * i;
         int last = Math.min(low + 5 * (i + 1), high);
         if (last - first == 5) {
            fiveElementIndexPairedSorter.sort(S, first, last);
         } else {
            indexPairedSorter.sort(S, first, last);
         }

         int medianPosition = (last + first) >> 1;
         if (freq != null) {
            medianPosition = medianPosition(freq, indices, first, last);
            subListFreq[i] = freq[indices[medianPosition]];
         }
         subList[i] = S[medianPosition];
      }

      // Approximate the medoid
      sorter.sort(subList, 0, subList.length);
      int subListMedianPosition = subListFreq == null ? subList.length >> 1
              : medianPosition(subListFreq, 0, subListFreq.length);
      double medianOfMedians = subList[subListMedianPosition];

      // Partition S based on the median of medians
      return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
   }

   protected int partitionByMedian(int[] S, int[] freq, int[] indices, int low, int high) {
      final int arraysize = high - low;
      int[] subList = new int[(arraysize + 4) / 5];
      int[] subListFreq = null;
      if (freq != null) {
         subListFreq = new int[(arraysize + 4) / 5];
      }

      // Break the list into sublists of length 5
      for (int i = 0; i < subList.length; ++i) {
         int first = low + 5 * i;
         int last = Math.min(low + 5 * (i + 1), high);
         if (last - first == 5) {
            fiveElementIndexPairedSorter.sort(S, first, last);
         } else {
            indexPairedSorter.sort(S, first, last);
         }

         int medianPosition = (last + first) >> 1;
         if (freq != null) {
            medianPosition = medianPosition(freq, indices, first, last);
            subListFreq[i] = freq[indices[medianPosition]];
         }
         subList[i] = S[medianPosition];
      }

      // Approximate the medoid
      sorter.sort(subList, 0, subList.length);
      int subListMedianPosition = subListFreq == null ? subList.length >> 1
              : medianPosition(subListFreq, 0, subListFreq.length);
      int medianOfMedians = subList[subListMedianPosition];

      // Partition S based on the median of medians
      return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
   }

   protected <T> int partitionByMedian(T[] S, int[] freq, int[] indices, int low, int high, Comparator<T> comparator) {
      final int arraysize = high - low;
      T[] subList = (T[]) Array.newInstance(S[0].getClass(), (arraysize + 4) / 5);
      int[] subListFreq = null;
      if (freq != null) {
         subListFreq = new int[(arraysize + 4) / 5];
      }

      // Break the list into sublists of length 5
      for (int i = 0; i < subList.length; ++i) {
         int first = low + 5 * i;
         int last = Math.min(low + 5 * (i + 1), high);
         if (last - first == 5) {
            fiveElementIndexPairedSorter.sort(S, first, last, comparator);
         } else {
            indexPairedSorter.sort(S, first, last, comparator);
         }

         int medianPosition = (last + first) >> 1;
         if (freq != null) {
            medianPosition = medianPosition(freq, indices, first, last);
            subListFreq[i] = freq[indices[medianPosition]];
         }
         subList[i] = S[medianPosition];
      }

      // Approximate the medoid
      sorter.sort(subList, 0, subList.length);
      int subListMedianPosition = subListFreq == null ? subList.length >> 1 : medianPosition(subListFreq, 0, subListFreq.length);
      T medianOfMedians = subList[subListMedianPosition];

      // Partition S based on the median of medians
      return indexPairedPartitioner.partition(S, low, high, medianOfMedians, comparator);
   }

   protected int medianPosition(int[] freq, int first, int last) {
      int freqSum = accumulate(freq, first, last);
      int pos = 0;
      int mid = freqSum >> 1;
      int i = first;
      for (; i < last && pos <= mid; ++i) {
         pos += freq[i];
      }
      return i - 1;
   }

   protected int accumulate(int[] freq, int first, int last) {
      int freqSum = 0;
      for (int i = first; i < last; ++i) {
         freqSum += freq[i];
      }
      return freqSum;
   }
   
   protected int medianPosition(int[] freq, int[] indices, int first, int last) {
      int freqSum = accumulate(freq, indices, first, last);
      int pos = 0;
      int mid = freqSum >> 1;
      int i = first;
      for (; i < last && pos <= mid; ++i) {
         pos += freq[indices[i]];
      }
      return i - 1;
   }

   protected int accumulate(int[] freq, int[] indices, int first, int last) {
      int freqSum = 0;
      for (int i = first; i < last; ++i) {
         freqSum += freq[indices[i]];
      }
      return freqSum;
   }

   private void pairIndex(int[] index) {
      Permutator pairedPermutator = new PairedPermutator(index);
      fiveElementIndexPairedSorter.setPermutator(pairedPermutator);
      indexPairedSorter.setPermutator(pairedPermutator);
      indexPairedPartitioner.setPermutator(pairedPermutator);
   }
}
