package com.trickl.selection;

import java.util.Comparator;

public interface SelectionAlgorithm {
   int select(char[] S, int[] freq, int start, int end, int k);
   int select(short[] S, int[] freq, int start, int end, int k);
   int select(double[] S, int[] freq, int start, int end, int k);
   int select(float[] S, int[] freq, int start, int end, int k);
   int select(int[] S, int[] freq, int start, int end, int k);
   <T> int select(T[] S, int[] freq, int start, int end, int k, Comparator<T> comparator);
}
