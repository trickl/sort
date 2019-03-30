package com.trickl.sort;

import java.util.Comparator;

/**
 * A comparator that casts the data type to Comparable to perform the comparison.
 *
 * @author tgee
 * @param <T> type of element
 * @version $Id: $Id
 */
public class NaturalOrderingComparator<T> implements Comparator<T> {

  /**
   * {@inheritDoc}
   *
   * Compare two elements.
   */
  @Override
  public int compare(T lhs, T rhs) {
    return ((Comparable<T>) lhs).compareTo(rhs);
  }
}
