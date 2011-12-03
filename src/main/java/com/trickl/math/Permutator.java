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
