package com.trickl.sort;

import java.util.Comparator;

public interface Sorter {
   short[] sort(short[] S, int start, int end);
   char[] sort(char[] S, int start, int end);
   double[] sort(double[] S, int start, int end);
   float[] sort(float[] S, int start, int end);
   int[] sort(int[] S, int start, int end);
   <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator);
}
