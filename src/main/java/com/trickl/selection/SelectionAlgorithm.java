package com.trickl.selection;

import java.util.Comparator;

/**
 * http://en.wikipedia.org/wiki/Selection_algorithm
 *
 * @author tgee
 */
public interface SelectionAlgorithm {
  /**
   * Select the kth element in the range of an array.
   *
   * @param arr The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  int select(char[] arr, int[] freq, int start, int end, int k);
  
  /**
   * Select the kth element in the range of an array.
   *
   * @param arr The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  int select(short[] arr, int[] freq, int start, int end, int k);
  
  /**
   * Select the kth element in the range of an array.
   *
   * @param arr The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  int select(double[] arr, int[] freq, int start, int end, int k);
  
  /**
   * Select the kth element in the range of an array.
   *
   * @param arr The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  int select(float[] arr, int[] freq, int start, int end, int k);
  
  /**
   * Select the kth element in the range of an array.
   *
   * @param arr The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  int select(int[] arr, int[] freq, int start, int end, int k);
  
  /**
   * Select the kth element in the range of an array.
   *
   * @param arr The array
   * @param freq The frequency of elements in the array, if null freq(element) = 1
   * @param start The first element in the range
   * @param end The last element in the range
   * @param k
   * @return The index of the kth element
   */
  <T> int select(T[] arr, int[] freq, int start, int end, int k, Comparator<T> comparator);
}
