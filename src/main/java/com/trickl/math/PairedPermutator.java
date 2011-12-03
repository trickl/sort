package com.trickl.math;

public class PairedPermutator implements Permutator {

   private static final Permutator permutator = new StandardPermutator();
   
   private int[] pair;

   public PairedPermutator(int[] pair) {
      this.pair = pair;
   }

   @Override
   public short[] cycle(short[] S, int first, int second, int third) {
      permutator.cycle(pair, first, second, third);
      return permutator.cycle(S, first, second, third);
   }

   @Override
   public char[] cycle(char[] S, int first, int second, int third) {
      permutator.cycle(pair, first, second, third);
      return permutator.cycle(S, first, second, third);
   }

   @Override
   public float[] cycle(float[] S, int first, int second, int third) {
      permutator.cycle(pair, first, second, third);
      return permutator.cycle(S, first, second, third);
   }

   @Override
   public double[] cycle(double[] S, int first, int second, int third) {
      permutator.cycle(pair, first, second, third);
      return permutator.cycle(S, first, second, third);
   }

   @Override
   public int[] cycle(int[] S, int first, int second, int third) {
      permutator.cycle(pair, first, second, third);
      return permutator.cycle(S, first, second, third);
   }

   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third) {
      permutator.cycle(pair, first, second, third);
      return permutator.cycle(S, first, second, third);
   }

   @Override
   public short[] cycle(short[] S, int first, int second, int third, int fourth) {
      permutator.cycle(pair, first, second, third, fourth);
      return permutator.cycle(S, first, second, third, fourth);
   }

   @Override
   public char[] cycle(char[] S, int first, int second, int third, int fourth) {
      permutator.cycle(pair, first, second, third, fourth);
      return permutator.cycle(S, first, second, third, fourth);
   }

   @Override
   public float[] cycle(float[] S, int first, int second, int third, int fourth) {
      permutator.cycle(pair, first, second, third, fourth);
      return permutator.cycle(S, first, second, third, fourth);
   }

   @Override
   public double[] cycle(double[] S, int first, int second, int third, int fourth) {
      permutator.cycle(pair, first, second, third, fourth);
      return permutator.cycle(S, first, second, third, fourth);
   }

   @Override
   public int[] cycle(int[] S, int first, int second, int third, int fourth) {
      permutator.cycle(pair, first, second, third, fourth);
      return permutator.cycle(S, first, second, third, fourth);
   }

   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third, int fourth) {
      permutator.cycle(pair, first, second, third, fourth);
      return permutator.cycle(S, first, second, third, fourth);
   }

   @Override
   public short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth) {
      permutator.cycle(pair, first, second, third, fourth, fifth);
      return permutator.cycle(S, first, second, third, fourth, fifth);
   }

   @Override
   public char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth) {
      permutator.cycle(pair, first, second, third, fourth, fifth);
      return permutator.cycle(S, first, second, third, fourth, fifth);
   }

   @Override
   public float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth) {
      permutator.cycle(pair, first, second, third, fourth, fifth);
      return permutator.cycle(S, first, second, third, fourth, fifth);
   }

   @Override
   public double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth) {
      permutator.cycle(pair, first, second, third, fourth, fifth);
      return permutator.cycle(S, first, second, third, fourth, fifth);
   }

   @Override
   public int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth) {
      permutator.cycle(pair, first, second, third, fourth, fifth);
      return permutator.cycle(S, first, second, third, fourth, fifth);
   }

   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth) {
      permutator.cycle(pair, first, second, third, fourth, fifth);
      return permutator.cycle(S, first, second, third, fourth, fifth);
   }

   @Override
   public short[] reverse(short[] S, int start, int end) {
      permutator.reverse(pair, start, end);
      return permutator.reverse(S, start, end);
   }

   @Override
   public char[] reverse(char[] S, int start, int end) {
      permutator.reverse(pair, start, end);
      return permutator.reverse(S, start, end);
   }

   @Override
   public double[] reverse(double[] S, int start, int end) {
      permutator.reverse(pair, start, end);
      return permutator.reverse(S, start, end);
   }

   @Override
   public float[] reverse(float[] S, int start, int end) {
      permutator.reverse(pair, start, end);
      return permutator.reverse(S, start, end);
   }

   @Override
   public int[] reverse(int[] S, int start, int end) {
      permutator.reverse(pair, start, end);
      return permutator.reverse(S, start, end);
   }

   @Override
   public <T> T[] reverse(T[] S, int start, int end) {
      permutator.reverse(pair, start, end);
      return permutator.reverse(S, start, end);
   }

   @Override
   public short[] swap(short[] S, int first, int second) {
      permutator.swap(pair, first, second);
      return permutator.swap(S, first, second);

   }

   @Override
   public char[] swap(char[] S, int first, int second) {
      permutator.swap(pair, first, second);
      return permutator.swap(S, first, second);
   }

   @Override
   public double[] swap(double[] S, int first, int second) {
      permutator.swap(pair, first, second);
      return permutator.swap(S, first, second);
   }

   @Override
   public float[] swap(float[] S, int first, int second) {
      permutator.swap(pair, first, second);
      return permutator.swap(S, first, second);
   }

   @Override
   public int[] swap(int[] S, int first, int second) {
      permutator.swap(pair, first, second);
      return permutator.swap(S, first, second);
   }

   @Override
   public <T> T[] swap(T[] S, int first, int second) {
      permutator.swap(pair, first, second);
      return permutator.swap(S, first, second);
   }

}
