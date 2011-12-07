/*
 * This file is part of the Trickl Open Source Libraries.
 *
 * Trickl Open Source Libraries - http://open.trickl.com/
 *
 * Copyright (C) 2011 Tim Gee.
 *
 * Trickl Open Source Libraries are free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Trickl Open Source Libraries are distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this project.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.trickl.math;

/**
 * The ChainPermutator allows you to chain Permutators together.
 * A common application of this is to get ensure permutations apply 
 * to more than one set of data. 
 */
public class ChainPermutator implements Permutator {

   private Permutator lhsPermutator = new StandardPermutator();
   
   private Permutator rhsPermutator = new StandardPermutator();

   /**
    * @return the permutator
    */
   public Permutator getLhsPermutator() {
      return lhsPermutator;
   }

   /**
    * @param rhsPermutator the permutator to set
    */
   public void setLhsPermutator(Permutator lhsPermutator) {
      this.lhsPermutator = lhsPermutator;
   }
   
   /**
    * @return the permutator
    */
   public Permutator getRhsPermutator() {
      return rhsPermutator;
   }

   /**
    * @param rhsPermutator the permutator to set
    */
   public void setRhsPermutator(Permutator rhsPermutator) {
      this.rhsPermutator = rhsPermutator;
   }
   
   /**
    * Create a paired permutator.
    * @param pair The paired data.
    */
   public ChainPermutator(Permutator lhsPermutator, Permutator rhsPermutator) {
      this.lhsPermutator = lhsPermutator;
      this.rhsPermutator = rhsPermutator;
   }

   /**
    * Perform a three cycle permutation
    * [ 1, 2, 3 ] ->
    * [ 2, 3, 1 ]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @return The array
    */
   @Override
   public short[] cycle(short[] S, int first, int second, int third) {
      lhsPermutator.cycle(S, first, second, third);
      return rhsPermutator.cycle(S, first, second, third);
   }

   /**
    * Perform a three cycle permutation
    * [ 1, 2, 3 ] ->
    * [ 2, 3, 1 ] 
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @return The array
    */
   @Override
   public char[] cycle(char[] S, int first, int second, int third) {
      lhsPermutator.cycle(S, first, second, third);
      return rhsPermutator.cycle(S, first, second, third);
   }

   /**
    * Perform a three cycle permutation
    * [ 1, 2, 3 ] ->
    * [ 2, 3, 1 ] 
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @return The array
    */
   @Override
   public float[] cycle(float[] S, int first, int second, int third) {
      lhsPermutator.cycle(S, first, second, third);
      return rhsPermutator.cycle(S, first, second, third);
   }

   /**
    * Perform a three cycle permutation
    * [ 1, 2, 3 ] ->
    * [ 2, 3, 1 ] 
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @return The array
    */
   @Override
   public double[] cycle(double[] S, int first, int second, int third) {
      lhsPermutator.cycle(S, first, second, third);
      return rhsPermutator.cycle(S, first, second, third);
   }

   /**
    * Perform a three cycle permutation
    * [ 1, 2, 3 ] ->
    * [ 2, 3, 1 ] 
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @return The array
    */
   @Override
   public int[] cycle(int[] S, int first, int second, int third) {
      lhsPermutator.cycle(S, first, second, third);
      return rhsPermutator.cycle(S, first, second, third);
   }

   /**
    * Perform a three cycle permutation
    * [ 1, 2, 3 ] ->
    * [ 2, 3, 1 ] 
    * @param <T> The type of the array
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @return The array
    */
   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third) {
      lhsPermutator.cycle(S, first, second, third);
      return rhsPermutator.cycle(S, first, second, third);
   }

   /**
    * Perform a four cycle permutation
    * [ 1, 2, 3, 4] ->
    * [ 2, 3, 4, 1] 
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @return The array
    */
   @Override
   public short[] cycle(short[] S, int first, int second, int third, int fourth) {
      lhsPermutator.cycle(S, first, second, third, fourth);
      return rhsPermutator.cycle(S, first, second, third, fourth);
   }

   /**
    * Perform a four cycle permutation
    * [ 1, 2, 3, 4] ->
    * [ 2, 3, 4, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @return The array
    */
   @Override
   public char[] cycle(char[] S, int first, int second, int third, int fourth) {
      lhsPermutator.cycle(S, first, second, third, fourth);
      return rhsPermutator.cycle(S, first, second, third, fourth);
   }

   /**
    * Perform a four cycle permutation
    * [ 1, 2, 3, 4] ->
    * [ 2, 3, 4, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @return The array
    */
   @Override
   public float[] cycle(float[] S, int first, int second, int third, int fourth) {
      lhsPermutator.cycle(S, first, second, third, fourth);
      return rhsPermutator.cycle(S, first, second, third, fourth);
   }

   /**
    * Perform a four cycle permutation
    * [ 1, 2, 3, 4] ->
    * [ 2, 3, 4, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @return The array
    */
   @Override
   public double[] cycle(double[] S, int first, int second, int third, int fourth) {
      lhsPermutator.cycle(S, first, second, third, fourth);
      return rhsPermutator.cycle(S, first, second, third, fourth);
   }

   /**
    * Perform a four cycle permutation
    * [ 1, 2, 3, 4] ->
    * [ 2, 3, 4, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @return The array
    */
   @Override
   public int[] cycle(int[] S, int first, int second, int third, int fourth) {
      lhsPermutator.cycle(S, first, second, third, fourth);
      return rhsPermutator.cycle(S, first, second, third, fourth);
   }

   /**
    * Perform a four cycle permutation
    * [ 1, 2, 3, 4] ->
    * [ 2, 3, 4, 1]
    * @param <T> The type of the array
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @return The array
    */
   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third, int fourth) {
      lhsPermutator.cycle(S, first, second, third, fourth);
      return rhsPermutator.cycle(S, first, second, third, fourth);
   }

   /**
    * Perform a five cycle permutation
    * [ 1, 2, 3, 4, 5] ->
    * [ 2, 3, 4, 5, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @param fifth The index of the fifth element to swap
    * @return The array
    */
   @Override
   public short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth) {
      lhsPermutator.cycle(S, first, second, third, fourth, fifth);
      return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
   }

   /**
    * Perform a five cycle permutation
    * [ 1, 2, 3, 4, 5] ->
    * [ 2, 3, 4, 5, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @param fifth The index of the fifth element to swap
    * @return The array
    */
   @Override
   public char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth) {
      lhsPermutator.cycle(S, first, second, third, fourth, fifth);
      return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
   }

   /**
    * Perform a five cycle permutation
    * [ 1, 2, 3, 4, 5] ->
    * [ 2, 3, 4, 5, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @param fifth The index of the fifth element to swap
    * @return The array
    */
   @Override
   public float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth) {
      lhsPermutator.cycle(S, first, second, third, fourth, fifth);
      return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
   }

   /**
    * Perform a five cycle permutation
    * [ 1, 2, 3, 4, 5] ->
    * [ 2, 3, 4, 5, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @param fifth The index of the fifth element to swap
    * @return The array
    */
   @Override
   public double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth) {
      lhsPermutator.cycle(S, first, second, third, fourth, fifth);
      return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
   }

   /**
    * Perform a five cycle permutation
    * [ 1, 2, 3, 4, 5] ->
    * [ 2, 3, 4, 5, 1]
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @param fifth The index of the fifth element to swap
    * @return The array
    */
   @Override
   public int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth) {
      lhsPermutator.cycle(S, first, second, third, fourth, fifth);
      return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
   }

   /**
    * Perform a five cycle permutation
    * [ 1, 2, 3, 4, 5] ->
    * [ 2, 3, 4, 5, 1]
    * @param <T> The data type of the array
    * @param S The array
    * @param first The index of the first element to swap
    * @param second The index of the second element to swap
    * @param third The index of the third element to swap
    * @param fourth The index of the fourth element to swap
    * @param fifth The index of the fifth element to swap
    * @return The array
    */
   @Override
   public <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth) {
      lhsPermutator.cycle(S, first, second, third, fourth, fifth);
      return rhsPermutator.cycle(S, first, second, third, fourth, fifth);
   }

   /**
    * Reverse the elements in the array
    * @param S The array 
    * @param start The first element in the range to be reversed
    * @param end The last element in the range to be reversed
    * @return The array
    */
   @Override
   public short[] reverse(short[] S, int start, int end) {
      lhsPermutator.reverse(S, start, end);
      return rhsPermutator.reverse(S, start, end);
   }

   /**
    * Reverse the elements in the array
    * @param S The array 
    * @param start The first element in the range to be reversed
    * @param end The last element in the range to be reversed
    * @return The array
    */
   @Override
   public char[] reverse(char[] S, int start, int end) {
      lhsPermutator.reverse(S, start, end);
      return rhsPermutator.reverse(S, start, end);
   }

   /**
    * Reverse the elements in the array
    * @param S The array 
    * @param start The first element in the range to be reversed
    * @param end The last element in the range to be reversed
    * @return The array
    */
   @Override
   public double[] reverse(double[] S, int start, int end) {
      lhsPermutator.reverse(S, start, end);
      return rhsPermutator.reverse(S, start, end);
   }

   /**
    * Reverse the elements in the array
    * @param S The array 
    * @param start The first element in the range to be reversed
    * @param end The last element in the range to be reversed
    * @return The array
    */
   @Override
   public float[] reverse(float[] S, int start, int end) {
      lhsPermutator.reverse(S, start, end);
      return rhsPermutator.reverse(S, start, end);
   }

   /**
    * Reverse the elements in the array
    * @param S The array 
    * @param start The first element in the range to be reversed
    * @param end The last element in the range to be reversed
    * @return The array
    */
   @Override
   public int[] reverse(int[] S, int start, int end) {
      lhsPermutator.reverse(S, start, end);
      return rhsPermutator.reverse(S, start, end);
   }

   /**
    * Reverse the elements in the array
    * @param <T> The data type of the array
    * @param S The array 
    * @param start The first element in the range to be reversed
    * @param end The last element in the range to be reversed
    * @return The array
    */
   @Override
   public <T> T[] reverse(T[] S, int start, int end) {
      lhsPermutator.reverse(S, start, end);
      return rhsPermutator.reverse(S, start, end);
   }

   /**
    * Swap the elements in the array
    * @param S The array
    * @param first The index of the first element
    * @param second The index of the second element
    * @return The array
    */
   @Override
   public short[] swap(short[] S, int first, int second) {
      lhsPermutator.swap(S, first, second);
      return rhsPermutator.swap(S, first, second);

   }

   /**
    * Swap the elements in the array
    * @param S The array
    * @param first The index of the first element
    * @param second The index of the second element
    * @return The array
    */
   @Override
   public char[] swap(char[] S, int first, int second) {
      lhsPermutator.swap(S, first, second);
      return rhsPermutator.swap(S, first, second);
   }

   /**
    * Swap the elements in the array
    * @param S The array
    * @param first The index of the first element
    * @param second The index of the second element
    * @return The array
    */
   @Override
   public double[] swap(double[] S, int first, int second) {
      lhsPermutator.swap(S, first, second);
      return rhsPermutator.swap(S, first, second);
   }

   /**
    * Swap the elements in the array
    * @param S The array
    * @param first The index of the first element
    * @param second The index of the second element
    * @return The array
    */
   @Override
   public float[] swap(float[] S, int first, int second) {
      lhsPermutator.swap(S, first, second);
      return rhsPermutator.swap(S, first, second);
   }

   /**
    * Swap the elements in the array
    * @param S The array
    * @param first The index of the first element
    * @param second The index of the second element
    * @return The array
    */
   @Override
   public int[] swap(int[] S, int first, int second) {
      lhsPermutator.swap(S, first, second);
      return rhsPermutator.swap(S, first, second);
   }

   /**
    * Swap the elements in the array
    * @param <T> The data type of the array
    * @param S The array
    * @param first The index of the first element
    * @param second The index of the second element
    * @return The array
    */
   @Override
   public <T> T[] swap(T[] S, int first, int second) {
      lhsPermutator.swap(S, first, second);
      return rhsPermutator.swap(S, first, second);
   }
}
