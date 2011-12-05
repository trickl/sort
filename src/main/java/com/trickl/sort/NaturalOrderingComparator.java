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
package com.trickl.sort;

import java.util.Comparator;

/**
 * A comparator that casts the data type to Comparable to 
 * perform the comparison.
 * @author tgee
 * @param <T>
 */
public class NaturalOrderingComparator<T> implements Comparator<T> {

   /**
    * Compare two elements
    * @param lhs
    * @param rhs
    * @return 1 if lhs > rhs, 0 if lhs == rhs, -1 if lhs < rhs
    */
   @Override
   public int compare(T lhs, T rhs) {
      return ((Comparable<T>) lhs).compareTo(rhs);
   }
}
