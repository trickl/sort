package com.trickl.math;

public class StandardPermutator implements Permutator {

   @Override
   public short[] swap(short[] S, int first, int second) {
      short temp = S[first];
      S[first] = S[second];
      S[second] = temp;
      return S;
   }
  
   @Override
   public char[] swap(char[] S, int first, int second) {
      char temp = S[first];
      S[first] = S[second];
      S[second] = temp;
      return S;
   }

   @Override
   public double[] swap(double[] S, int first, int second) {
      double temp = S[first];
      S[first] = S[second];
      S[second] = temp;
      return S;
   }

   @Override
   public float[] swap(float[] S, int first, int second) {
      float temp = S[first];
      S[first] = S[second];
      S[second] = temp;
      return S;
   }

   @Override
   public int[] swap(int[] S, int first, int second) {
      int temp = S[first];
      S[first] = S[second];
      S[second] = temp;
      return S;
   }

   @Override
   public <T> T[] swap(T[] S, int first, int second) {
      T temp = S[first];
      S[first] = S[second];
      S[second] = temp;
      return S;
   }

   @Override
   public short[] cycle(short[] S, int first, int second, int third) {
      short temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = temp;
      return S;
   }

   @Override
   public char[] cycle(char[] S, int first, int second, int third) {
      char temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = temp;
      return S;
   }

   @Override
   public float[] cycle(float[] S, int first, int second, int third) {
      float temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = temp;
      return S;
   }

   @Override
   public double[] cycle(double[] S, int first, int second, int third) {
      double temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = temp;
      return S;
   }

   @Override
   public int[] cycle(int[] S, int first, int second, int third) {
      int temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = temp;
      return S;
   }

   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third) {
      T temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = temp;
      return S;
   }

   @Override
   public short[] cycle(short[] S, int first, int second, int third, int fourth) {
      short temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = temp;
      return S;
   }

   @Override
   public char[] cycle(char[] S, int first, int second, int third, int fourth) {
      char temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = temp;
      return S;
   }

   @Override
   public float[] cycle(float[] S, int first, int second, int third, int fourth) {
      float temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = temp;
      return S;
   }

   @Override
   public double[] cycle(double[] S, int first, int second, int third, int fourth) {
      double temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = temp;
      return S;
   }

   @Override
   public int[] cycle(int[] S, int first, int second, int third, int fourth) {
      int temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = temp;
      return S;
   }

   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third, int fourth) {
      T temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = temp;
      return S;
   }

   @Override
   public short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth) {
      short temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = S[fifth];
      S[fifth] = temp;
      return S;
   }

   @Override
   public char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth) {
      char temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = S[fifth];
      S[fifth] = temp;
      return S;
   }

   @Override
   public float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth) {
      float temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = S[fifth];
      S[fourth] = S[fifth];
      S[fifth] = temp;
      return S;
   }

   @Override
   public double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth) {
      double temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = S[fifth];
      S[fifth] = temp;
      return S;
   }

   @Override
   public int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth) {
      int temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = S[fifth];
      S[fifth] = temp;
      return S;
   }

   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth) {
      T temp = S[first];
      S[first] = S[second];
      S[second] = S[third];
      S[third] = S[fourth];
      S[fourth] = S[fifth];
      S[fifth] = temp;
      return S;
   }

   @Override
   public short[] reverse(short[] S, int start, int end) {
      for (int i = start, j = end - 1; i < j; ++i, --j) {
         swap(S, i, j);
      }
      return S;
   }

   @Override
   public char[] reverse(char[] S, int start, int end) {
      for (int i = start, j = end - 1; i < j; ++i, --j) {
         swap(S, i, j);
      }
      return S;
   }

   @Override
   public double[] reverse(double[] S, int start, int end) {
      for (int i = start, j = end - 1; i < j; ++i, --j) {
         swap(S, i, j);
      }
      return S;
   }

   @Override
   public float[] reverse(float[] S, int start, int end) {
      for (int i = start, j = end - 1; i < j; ++i, --j) {
         swap(S, i, j);
      }
      return S;
   }

   @Override
   public int[] reverse(int[] S, int start, int end) {
      for (int i = start, j = end - 1; i < j; ++i, --j) {
         swap(S, i, j);
      }
      return S;
   }

   @Override
   public <T> T[] reverse(T[] S, int start, int end) {
      for (int i = start, j = end - 1; i < j; ++i, --j) {
         swap(S, i, j);
      }
      return S;
   }
};
