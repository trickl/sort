/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trickl.math;

/**
 *
 * @author tgee
 */
public interface Permutator {

   short[] cycle(short[] S, int first, int second, int third);

   char[] cycle(char[] S, int first, int second, int third);

   float[] cycle(float[] S, int first, int second, int third);

   double[] cycle(double[] S, int first, int second, int third);

   int[] cycle(int[] S, int first, int second, int third);

   <T> T[] cycle(T[] S, int first, int second, int third);

   short[] cycle(short[] S, int first, int second, int third, int fourth);

   char[] cycle(char[] S, int first, int second, int third, int fourth);

   float[] cycle(float[] S, int first, int second, int third, int fourth);

   double[] cycle(double[] S, int first, int second, int third, int fourth);

   int[] cycle(int[] S, int first, int second, int third, int fourth);

   <T> T[] cycle(T[] S, int first, int second, int third, int fourth);

   short[] cycle(short[] S, int first, int second, int third, int fourth, int fifth);

   char[] cycle(char[] S, int first, int second, int third, int fourth, int fifth);

   float[] cycle(float[] S, int first, int second, int third, int fourth, int fifth);

   double[] cycle(double[] S, int first, int second, int third, int fourth, int fifth);

   int[] cycle(int[] S, int first, int second, int third, int fourth, int fifth);

   <T> T[] cycle(T[] S, int first, int second, int third, int fourth, int fifth);

   short[] reverse(short[] S, int start, int end);

   char[] reverse(char[] S, int start, int end);

   double[] reverse(double[] S, int start, int end);

   float[] reverse(float[] S, int start, int end);

   int[] reverse(int[] S, int start, int end);

   <T> T[] reverse(T[] S, int start, int end);

   short[] swap(short[] S, int first, int second);

   char[] swap(char[] S, int first, int second);

   double[] swap(double[] S, int first, int second);

   float[] swap(float[] S, int first, int second);

   int[] swap(int[] S, int first, int second);

   <T> T[] swap(T[] S, int first, int second);

}
