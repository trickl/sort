/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trickl.math;

/**
 * The PairedPerumator applies the same permutation to another paired dataset for every operation
 * requested. This can be set up to perform a variety of operations, the most common being where the
 * paired dataset is initialized to hold the original positions of each element in the dataset. Then
 * after several permutations are performed, the paired data can be analyzed to see the composite
 * permutation effect.
 *
 * @deprecated Use ChainPermutator directly
 * @author tgee
 */
@Deprecated
public class PairedPermutator extends ChainPermutator {
  public PairedPermutator(int pair[]) {
    super(new IntArrayPermutator(pair), new StandardPermutator());
  }
}
