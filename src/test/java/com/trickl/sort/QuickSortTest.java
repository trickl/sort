/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trickl.sort;

import com.trickl.sort.QuickSort;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    public QuickSortTest() {
    }


   @Test
   public void testSortDoubleArray() {
      System.out.println("sortDoubleArray");
      double[] sortable = {4,5,3,2,1,6,7,0,9,8};      
      QuickSort sorter = new QuickSort();
      sorter.sort(sortable, 0, sortable.length);
      Assert.assertArrayEquals(new double[] {0,1,2,3,4,5,6,7,8,9}, sortable, 1e-7);
   }

   @Test   
   public void testSortGenericArray() {
      System.out.println("sortGenericArray");      
      Integer[] sortable = new Integer[] {4,5,3,2,1,6,7,0,9,8};
      QuickSort sorter = new QuickSort();
      sorter.sort(sortable, 0, sortable.length);
      Assert.assertArrayEquals(new Integer[] {0,1,2,3,4,5,6,7,8,9}, sortable);
   }
}
   