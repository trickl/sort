package com.trickl.sort;

import java.util.Comparator;

/**
 * Defines a standard interface for many sorting algorithms.
 *
 * @author tgee
 * @version $Id: $Id
 */
public interface Sorter {
  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  short[] sort(short[] arr, int start, int end);
  
  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  char[] sort(char[] arr, int start, int end);
  
  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  double[] sort(double[] arr, int start, int end);
  
  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  float[] sort(float[] arr, int start, int end);
  
  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @return The array
   */
  int[] sort(int[] arr, int start, int end);
  
  /**
   * Sort a range in the array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end The index of the last element in the range to sort
   * @param comparator Object comparator
   * @return The array
   */
  <T> T[] sort(T[] arr, int start, int end, Comparator<T> comparator);
}
