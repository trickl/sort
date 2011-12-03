/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trickl.math;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import com.trickl.math.Permutations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author tgee
 */
public class PermutationsTest {

   private static final float tolerance = 1e-7f;
   
   private static Permutator permutator;

   public PermutationsTest() {
   }

   @Before
   public void beforeTest() {
      permutator = new StandardPermutator();
   }

   @Test
   public void testPermutationShortArray() {
      short[] S = new short[] {0, 1, 2};            
      Assert.assertArrayEquals(new short[] {0, 2, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new short[] {1, 0, 2}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new short[] {1, 2, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new short[] {2, 0, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new short[] {2, 1, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new short[] {0, 1, 2}, Permutations.permutation(S, permutator));
   }

   @Test
   public void testPermutationCharArray() {
      char[] S = new char[] {0, 1, 2};
      Assert.assertArrayEquals(new char[] {0, 2, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new char[] {1, 0, 2}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new char[] {1, 2, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new char[] {2, 0, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new char[] {2, 1, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new char[] {0, 1, 2}, Permutations.permutation(S, permutator));
   }

   @Test
   public void testPermutationDoubleArray() {
      double[] S = new double[] {0, 1, 2};
      Assert.assertArrayEquals(new double[] {0, 2, 1}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new double[] {1, 0, 2}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new double[] {1, 2, 0}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new double[] {2, 0, 1}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new double[] {2, 1, 0}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new double[] {0, 1, 2}, Permutations.permutation(S, permutator), tolerance);
   }

   @Test
   public void testPermutationFloatArray() {
      float[] S = new float[] {0, 1, 2};
      Assert.assertArrayEquals(new float[] {0, 2, 1}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new float[] {1, 0, 2}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new float[] {1, 2, 0}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new float[] {2, 0, 1}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new float[] {2, 1, 0}, Permutations.permutation(S, permutator), tolerance);
      Assert.assertArrayEquals(new float[] {0, 1, 2}, Permutations.permutation(S, permutator), tolerance);
   }

   @Test
   public void testPermutationIntArray() {
      int[] S = new int[] {0, 1, 2};
      Assert.assertArrayEquals(new int[] {0, 2, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new int[] {1, 0, 2}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new int[] {1, 2, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new int[] {2, 0, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new int[] {2, 1, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new int[] {0, 1, 2}, Permutations.permutation(S, permutator));
   }

   @Test
   public void testPermutationObjectArray() {
      Integer[] S = new Integer[] {0, 1, 2};
      Assert.assertArrayEquals(new Integer[] {0, 2, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new Integer[] {1, 0, 2}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new Integer[] {1, 2, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new Integer[] {2, 0, 1}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new Integer[] {2, 1, 0}, Permutations.permutation(S, permutator));
      Assert.assertArrayEquals(new Integer[] {0, 1, 2}, Permutations.permutation(S, permutator));
   }

}