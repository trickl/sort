package com.trickl.sort;

import java.util.Comparator;

public class NaturalOrderingComparator<T> implements Comparator<T> {

   @Override
   public int compare(T lhs, T rhs) {
      return ((Comparable<T>) lhs).compareTo(rhs);
   }
}
