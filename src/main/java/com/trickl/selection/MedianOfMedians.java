package com.trickl.selection;

import com.trickl.math.ChainPermutator;
import com.trickl.math.IntArrayPermutator;
import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import com.trickl.sort.FiveElementSort;
import com.trickl.sort.QuickSort;
import com.trickl.sort.ThreeWayPartitioner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Recursive selection algorithm, theoretical O(n) worst complexity.
 * Detailed in "Foundations of * algorithms using Java pseudocode"
 * By R E. Neapolitan, K Naimipour Also see:
 * http://en.wikipedia.org/wiki/Selection_algorithm#Linear_general_selection_algorithm_-_Median_of_Medians_algorithm
 *
 * @author tgee
 */
public class MedianOfMedians implements SelectionAlgorithm {

  private static final QuickSort sorter = new QuickSort();
  private static final FiveElementSort fiveElementIndexPairedSorter = new FiveElementSort();
  private static final QuickSort indexPairedSorter = new QuickSort();
  private static final ThreeWayPartitioner indexPairedPartitioner = new ThreeWayPartitioner();

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
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

  /**
   * Select the kth element in the range of an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param index An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  protected <T> int select(
      T[] S, int[] freq, int[] index, int start, int end, int k, Comparator<T> comparator) {

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

  /**
   * Partition a range according to the median element in the range
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param indices An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data* @param low
   * @param low The first element in the range
   * @param high The last element in the range
   * @return The index of the kth element
   */
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
    int subListMedianPosition =
        subListFreq == null
            ? subList.length >> 1
            : medianPosition(subListFreq, 0, subListFreq.length);
    char medianOfMedians = subList[subListMedianPosition];

    // Partition S based on the median of medians
    return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
  }

  /**
   * Partition a range according to the median element in the range
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param indices An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data* @param low
   * @param low The first element in the range
   * @param high The last element in the range
   * @return The index of the kth element
   */
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
    int subListMedianPosition =
        subListFreq == null
            ? subList.length >> 1
            : medianPosition(subListFreq, 0, subListFreq.length);
    short medianOfMedians = subList[subListMedianPosition];

    // Partition S based on the median of medians
    return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
  }

  /**
   * Partition a range according to the median element in the range
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param indices An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data* @param low
   * @param low The first element in the range
   * @param high The last element in the range
   * @return The index of the kth element
   */
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
    int subListMedianPosition =
        subListFreq == null
            ? subList.length >> 1
            : medianPosition(subListFreq, 0, subListFreq.length);
    float medianOfMedians = subList[subListMedianPosition];

    // Partition S based on the median of medians
    return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
  }

  /**
   * Partition a range according to the median element in the range
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param indices An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data* @param low
   * @param low The first element in the range
   * @param high The last element in the range
   * @return The index of the kth element
   */
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
    int subListMedianPosition =
        subListFreq == null
            ? subList.length >> 1
            : medianPosition(subListFreq, 0, subListFreq.length);
    double medianOfMedians = subList[subListMedianPosition];

    // Partition S based on the median of medians
    return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
  }

  /**
   * Partition a range according to the median element in the range
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param indices An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data* @param low
   * @param low The first element in the range
   * @param high The last element in the range
   * @return The index of the kth element
   */
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
    int subListMedianPosition =
        subListFreq == null
            ? subList.length >> 1
            : medianPosition(subListFreq, 0, subListFreq.length);
    int medianOfMedians = subList[subListMedianPosition];

    // Partition S based on the median of medians
    return indexPairedPartitioner.partition(S, low, high, medianOfMedians);
  }

  /**
   * Partition a range according to the median element in the range
   *
   * @param S The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param indices An array holding the original indices (1 to (size - 1)) which is rearranged with
   *     the partitioned data* @param low
   * @param low The first element in the range
   * @param high The last element in the range
   * @return The index of the kth element
   */
  protected <T> int partitionByMedian(
      T[] S, int[] freq, int[] indices, int low, int high, Comparator<T> comparator) {
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
    int subListMedianPosition =
        subListFreq == null
            ? subList.length >> 1
            : medianPosition(subListFreq, 0, subListFreq.length);
    T medianOfMedians = subList[subListMedianPosition];

    // Partition S based on the median of medians
    return indexPairedPartitioner.partition(S, low, high, medianOfMedians, comparator);
  }

  private int medianPosition(int[] freq, int first, int last) {
    int freqSum = accumulate(freq, first, last);
    int pos = 0;
    int mid = freqSum >> 1;
    int i = first;
    for (; i < last && pos <= mid; ++i) {
      pos += freq[i];
    }
    return i - 1;
  }

  private int accumulate(int[] freq, int first, int last) {
    int freqSum = 0;
    for (int i = first; i < last; ++i) {
      freqSum += freq[i];
    }
    return freqSum;
  }

  private int medianPosition(int[] freq, int[] indices, int first, int last) {
    int freqSum = accumulate(freq, indices, first, last);
    int pos = 0;
    int mid = freqSum >> 1;
    int i = first;
    for (; i < last && pos <= mid; ++i) {
      pos += freq[indices[i]];
    }
    return i - 1;
  }

  private int accumulate(int[] freq, int[] indices, int first, int last) {
    int freqSum = 0;
    for (int i = first; i < last; ++i) {
      freqSum += freq[indices[i]];
    }
    return freqSum;
  }

  private void pairIndex(int[] index) {
    Permutator chainPermutator =
        new ChainPermutator(new IntArrayPermutator(index), new StandardPermutator());
    fiveElementIndexPairedSorter.setPermutator(chainPermutator);
    indexPairedSorter.setPermutator(chainPermutator);
    indexPairedPartitioner.setPermutator(chainPermutator);
  }
}
