package com.trickl.sort;

import java.util.Comparator;

/**
 * A comparator that casts the data type to Comparable to perform the comparison.
 *
 * @author tgee
 * @param <T> type of element
 */
public class NaturalOrderingComparator<T> implements Comparator<T> {

  /**
   * Compare two elements.
   *
   * @param lhs Left hand side
   * @param rhs Right hand side
   * @return 1 if lhs > rhs, 0 if lhs == rhs, -1 if lhs < rhs
   */
  @Override
  public int compare(T lhs, T rhs) {
    return ((Comparable<T>) lhs).compareTo(rhs);
  }
}
