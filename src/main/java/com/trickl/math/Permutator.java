package com.trickl.math;

/**
 * Permutators are responsible for reordering the elements in arrays.
 *
 * @author tgee
 */
public interface Permutator {

  /**
   * Perform a three cycle permutation.
   * [ 1, 2, 3 ] -> [ 2, 3, 1 ]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @return The array
   */
  short[] cycle(short[] S, int first, int second, int third);

  /**
   * Perform a three cycle permutation.
   * [ 1, 2, 3 ] -> [ 2, 3, 1 ]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @return The array
   */
  char[] cycle(char[] S, int first, int second, int third);

  /**
   * Perform a three cycle permutation.
   * [ 1, 2, 3 ] -> [ 2, 3, 1 ]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @return The array
   */
  float[] cycle(float[] S, int first, int second, int third);

  /**
   * Perform a three cycle permutation.
   * [ 1, 2, 3 ] -> [ 2, 3, 1 ]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @return The array
   */
  double[] cycle(double[] S, int first, int second, int third);

  /**
   * Perform a three cycle permutation.
   * [ 1, 2, 3 ] -> [ 2, 3, 1 ]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @return The array
   */
  int[] cycle(int[] S, int first, int second, int third);

  /**
   * Perform a three cycle permutation.
   * [ 1, 2, 3 ] -> [ 2, 3, 1 ]
   *
   * @param <T> The type of the array
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @return The array
   */
  <T> T[] cycle(T[] S, int first, int second, int third);

  /**
   * Perform a four cycle permutation.
   * [ 1, 2, 3, 4] -> [ 2, 3, 4, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @return The array
   */
  short[] cycle(short[] S, int first, int second, int third, int fourth);

  /**
   * Perform a four cycle permutation.
   * [ 1, 2, 3, 4] -> [ 2, 3, 4, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @return The array
   */
  char[] cycle(char[] S, int first, int second, int third, int fourth);

  /**
   * Perform a four cycle permutation [ 1, 2, 3, 4] -> [ 2, 3, 4, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @return The array
   */
  float[] cycle(float[] S, int first, int second, int third, int fourth);

  /**
   * Perform a four cycle permutation [ 1, 2, 3, 4] -> [ 2, 3, 4, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @return The array
   */
  double[] cycle(double[] S, int first, int second, int third, int fourth);

  /**
   * Perform a four cycle permutation [ 1, 2, 3, 4] -> [ 2, 3, 4, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @return The array
   */
  int[] cycle(int[] S, int first, int second, int third, int fourth);

  /**
   * Perform a four cycle permutation [ 1, 2, 3, 4] -> [ 2, 3, 4, 1]
   *
   * @param <T> The type of the array
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @return The array
   */
  <T> T[] cycle(T[] S, int first, int second, int third, int fourth);

  /**
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -> [ 2, 3, 4, 5, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @param fifth The index of the fifth element to swap
   * @return The array
   */
  short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth);

  /**
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -> [ 2, 3, 4, 5, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @param fifth The index of the fifth element to swap
   * @return The array
   */
  char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth);

  /**
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -> [ 2, 3, 4, 5, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @param fifth The index of the fifth element to swap
   * @return The array
   */
  float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth);

  /**
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -> [ 2, 3, 4, 5, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @param fifth The index of the fifth element to swap
   * @return The array
   */
  double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth);

  /**
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -> [ 2, 3, 4, 5, 1]
   *
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @param fifth The index of the fifth element to swap
   * @return The array
   */
  int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth);

  /**
   * Perform a five cycle permutation [ 1, 2, 3, 4, 5] -> [ 2, 3, 4, 5, 1]
   *
   * @param <T> The data type of the array
   * @param S The array
   * @param first The index of the first element to swap
   * @param second The index of the second element to swap
   * @param third The index of the third element to swap
   * @param fourth The index of the fourth element to swap
   * @param fifth The index of the fifth element to swap
   * @return The array
   */
  <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth);

  /**
   * Reverses the elements in the array.
   *
   * @param arr The array
   * @param start The first element in the range to be reversed
   * @param end The last element in the range to be reversed
   * @return The array
   */
  short[] reverse(short[] arr, int start, int end);

  /**
   * Reverses the elements in the array.
   *
   * @param arr The array
   * @param start The first element in the range to be reversed
   * @param end The last element in the range to be reversed
   * @return The array
   */
  char[] reverse(char[] arr, int start, int end);

  /**
   * Reverses the elements in the array.
   *
   * @param arr The array
   * @param start The first element in the range to be reversed
   * @param end The last element in the range to be reversed
   * @return The array
   */
  double[] reverse(double[] arr, int start, int end);

  /**
   * Reverses the elements in the array.
   *
   * @param arr The array
   * @param start The first element in the range to be reversed
   * @param end The last element in the range to be reversed
   * @return The array
   */
  float[] reverse(float[] arr, int start, int end);

  /**
   * Reverses the elements in the array.
   *
   * @param arr The array
   * @param start The first element in the range to be reversed
   * @param end The last element in the range to be reversed
   * @return The array
   */
  int[] reverse(int[] arr, int start, int end);

  /**
   * Reverses the elements in the array
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The first element in the range to be reversed
   * @param end The last element in the range to be reversed
   * @return The array
   */
  <T> T[] reverse(T[] arr, int start, int end);

  /**
   * Swaps the elements in the array.
   *
   * @param arr The array
   * @param first The index of the first element
   * @param second The index of the second element
   * @return The array
   */
  short[] swap(short[] arr, int first, int second);

  /**
   * Swaps the elements in the array.
   *
   * @param arr The array
   * @param first The index of the first element
   * @param second The index of the second element
   * @return The array
   */
  char[] swap(char[] arr, int first, int second);

  /**
   * Swaps the elements in the array
   *
   * @param arr The array
   * @param first The index of the first element
   * @param second The index of the second element
   * @return The array
   */
  double[] swap(double[] arr, int first, int second);

  /**
   * Swaps the elements in the array.
   *
   * @param arr The array
   * @param first The index of the first element
   * @param second The index of the second element
   * @return The array
   */
  float[] swap(float[] arr, int first, int second);

  /**
   * Swaps the elements in the array.
   *
   * @param arr The array
   * @param first The index of the first element
   * @param second The index of the second element
   * @return The array
   */
  int[] swap(int[] arr, int first, int second);

  /**
   * Swaps the elements in the array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param first The index of the first element
   * @param second The index of the second element
   * @return The array
   */
  <T> T[] swap(T[] arr, int first, int second);
}
