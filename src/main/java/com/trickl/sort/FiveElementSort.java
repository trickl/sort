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

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * An optimal five element sort that only uses seven comparisons
 * @author tgee
 */
public class FiveElementSort implements Sorter {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();
   private Permutator permutator = new StandardPermutator();

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end Unused, instead start + 4 is always the last element in the range.
    * @return The array
    */
   @Override
   public char[] sort(char[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      int i4 = start + 4;

      // Minimum seven comparisons and swaps
      if (S[i0] > S[i1]) {
         // Ensure B > A
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         // Ensure D > C
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         permutator.swap(S, i1, i3);
         permutator.swap(S, i0, i2);
      }

      // So far, we know A < B < D and C < D
      // First establish E in (A, B, D). (i2 comparisons required).
      // Then establish C. (Given we know C < D, two comparisons required).
      if (S[i4] > S[i1]) {
         if (S[i4] > S[i3]) {
            // A < B < D < E
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, D, E
                  permutator.cycle(S, i0, i2, i1);
               } else {
                  // A, C, B, D, E
                  permutator.swap(S, i1, i2);
               }
            }
            // else
            // A, B, C, D, E
         } else {
            // A < B < E < D
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, E, D
                  permutator.cycle(S, i0, i2, i1);
                  permutator.swap(S, i3, i4);
               } else {
                  // A, C, B, E, D
                  permutator.swap(S, i1, i2);
                  permutator.swap(S, i3, i4);
               }
            } else {
               if (S[i2] < S[i4]) {
                  // A, B, C, E, D
                  permutator.swap(S, i3, i4);
               } else {
                  // A, B, E, C, D
                  permutator.cycle(S, i2, i4, i3);
               }
            }
         }
      } else {
         if (S[i4] > S[i0]) {
            // A < E < B < D
            if (S[i2] < S[i4]) {
               // C < E
               if (S[i2] < S[i0]) {
                  // C, A, E, B, D
                  permutator.cycle(S, i0, i2, i4, i3, i1);
               } else {
                  // A, C, E, B, D
                  permutator.cycle(S, i1, i2, i4, i3);
               }
            } else {
               // C > E
               if (S[i2] < S[i1]) {
                  // A, E, C, B, D
                  permutator.cycle(S, i1, i4, i3);
               } else {
                  // A, E, B, C, D
                  permutator.cycle(S, i1, i4, i3, i2);
               }
            }
         } else {
            // E < A < B < D
            if (S[i2] < S[i0]) {
               // C < A
               if (S[i2] < S[i4]) {
                  // C, E, A, B, D
                  permutator.swap(S, i0, i2);
                  permutator.cycle(S, i4, i3, i1);
               } else {
                  // E, C, A, B, D
                  permutator.cycle(S, i0, i4, i3, i1, i2);
               }
            } else {
               // C > A
               if (S[i2] < S[i1]) {
                  // E, A, C, B, D
                  permutator.cycle(S, i0, i4, i3, i1);
               } else {
                  // E, A, B, C, D
                  permutator.cycle(S, i0, i4, i3, i2, i1);
               }
            }
         }
      }

      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end Unused, instead start + 4 is always the last element in the range.
    * @return The array
    */
   @Override
   public short[] sort(short[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      int i4 = start + 4;

      // Minimum seven comparisons and swaps
      if (S[i0] > S[i1]) {
         // Ensure B > A
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         // Ensure D > C
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         permutator.swap(S, i1, i3);
         permutator.swap(S, i0, i2);
      }

      // So far, we know A < B < D and C < D
      // First establish E in (A, B, D). (i2 comparisons required).
      // Then establish C. (Given we know C < D, two comparisons required).
      if (S[i4] > S[i1]) {
         if (S[i4] > S[i3]) {
            // A < B < D < E
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, D, E
                  permutator.cycle(S, i0, i2, i1);
               } else {
                  // A, C, B, D, E
                  permutator.swap(S, i1, i2);
               }
            }
            // else
            // A, B, C, D, E
         } else {
            // A < B < E < D
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, E, D
                  permutator.cycle(S, i0, i2, i1);
                  permutator.swap(S, i3, i4);
               } else {
                  // A, C, B, E, D
                  permutator.swap(S, i1, i2);
                  permutator.swap(S, i3, i4);
               }
            } else {
               if (S[i2] < S[i4]) {
                  // A, B, C, E, D
                  permutator.swap(S, i3, i4);
               } else {
                  // A, B, E, C, D
                  permutator.cycle(S, i2, i4, i3);
               }
            }
         }
      } else {
         if (S[i4] > S[i0]) {
            // A < E < B < D
            if (S[i2] < S[i4]) {
               // C < E
               if (S[i2] < S[i0]) {
                  // C, A, E, B, D
                  permutator.cycle(S, i0, i2, i4, i3, i1);
               } else {
                  // A, C, E, B, D
                  permutator.cycle(S, i1, i2, i4, i3);
               }
            } else {
               // C > E
               if (S[i2] < S[i1]) {
                  // A, E, C, B, D
                  permutator.cycle(S, i1, i4, i3);
               } else {
                  // A, E, B, C, D
                  permutator.cycle(S, i1, i4, i3, i2);
               }
            }
         } else {
            // E < A < B < D
            if (S[i2] < S[i0]) {
               // C < A
               if (S[i2] < S[i4]) {
                  // C, E, A, B, D
                  permutator.swap(S, i0, i2);
                  permutator.cycle(S, i4, i3, i1);
               } else {
                  // E, C, A, B, D
                  permutator.cycle(S, i0, i4, i3, i1, i2);
               }
            } else {
               // C > A
               if (S[i2] < S[i1]) {
                  // E, A, C, B, D
                  permutator.cycle(S, i0, i4, i3, i1);
               } else {
                  // E, A, B, C, D
                  permutator.cycle(S, i0, i4, i3, i2, i1);
               }
            }
         }
      }

      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end Unused, instead start + 4 is always the last element in the range.
    * @return The array
    */
   @Override
   public double[] sort(double[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      int i4 = start + 4;

      // Minimum seven comparisons and swaps
      if (S[i0] > S[i1]) {
         // Ensure B > A
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         // Ensure D > C
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         permutator.swap(S, i1, i3);
         permutator.swap(S, i0, i2);
      }

      // So far, we know A < B < D and C < D
      // First establish E in (A, B, D). (i2 comparisons required).
      // Then establish C. (Given we know C < D, two comparisons required).
      if (S[i4] > S[i1]) {
         if (S[i4] > S[i3]) {
            // A < B < D < E
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, D, E
                  permutator.cycle(S, i0, i2, i1);
               } else {
                  // A, C, B, D, E
                  permutator.swap(S, i1, i2);
               }
            }
            // else
            // A, B, C, D, E
         } else {
            // A < B < E < D
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, E, D
                  permutator.cycle(S, i0, i2, i1);
                  permutator.swap(S, i3, i4);
               } else {
                  // A, C, B, E, D
                  permutator.swap(S, i1, i2);
                  permutator.swap(S, i3, i4);
               }
            } else {
               if (S[i2] < S[i4]) {
                  // A, B, C, E, D
                  permutator.swap(S, i3, i4);
               } else {
                  // A, B, E, C, D
                  permutator.cycle(S, i2, i4, i3);
               }
            }
         }
      } else {
         if (S[i4] > S[i0]) {
            // A < E < B < D
            if (S[i2] < S[i4]) {
               // C < E
               if (S[i2] < S[i0]) {
                  // C, A, E, B, D
                  permutator.cycle(S, i0, i2, i4, i3, i1);
               } else {
                  // A, C, E, B, D
                  permutator.cycle(S, i1, i2, i4, i3);
               }
            } else {
               // C > E
               if (S[i2] < S[i1]) {
                  // A, E, C, B, D
                  permutator.cycle(S, i1, i4, i3);
               } else {
                  // A, E, B, C, D
                  permutator.cycle(S, i1, i4, i3, i2);
               }
            }
         } else {
            // E < A < B < D
            if (S[i2] < S[i0]) {
               // C < A
               if (S[i2] < S[i4]) {
                  // C, E, A, B, D
                  permutator.swap(S, i0, i2);
                  permutator.cycle(S, i4, i3, i1);
               } else {
                  // E, C, A, B, D
                  permutator.cycle(S, i0, i4, i3, i1, i2);
               }
            } else {
               // C > A
               if (S[i2] < S[i1]) {
                  // E, A, C, B, D
                  permutator.cycle(S, i0, i4, i3, i1);
               } else {
                  // E, A, B, C, D
                  permutator.cycle(S, i0, i4, i3, i2, i1);
               }
            }
         }
      }

      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end Unused, instead start + 4 is always the last element in the range.
    * @return The array
    */
   @Override
   public float[] sort(float[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      int i4 = start + 4;

      // Minimum seven comparisons and swaps
      if (S[i0] > S[i1]) {
         // Ensure B > A
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         // Ensure D > C
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         permutator.swap(S, i1, i3);
         permutator.swap(S, i0, i2);
      }

      // So far, we know A < B < D and C < D
      // First establish E in (A, B, D). (i2 comparisons required).
      // Then establish C. (Given we know C < D, two comparisons required).
      if (S[i4] > S[i1]) {
         if (S[i4] > S[i3]) {
            // A < B < D < E
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, D, E
                  permutator.cycle(S, i0, i2, i1);
               } else {
                  // A, C, B, D, E
                  permutator.swap(S, i1, i2);
               }
            }
            // else
            // A, B, C, D, E
         } else {
            // A < B < E < D
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, E, D
                  permutator.cycle(S, i0, i2, i1);
                  permutator.swap(S, i3, i4);
               } else {
                  // A, C, B, E, D
                  permutator.swap(S, i1, i2);
                  permutator.swap(S, i3, i4);
               }
            } else {
               if (S[i2] < S[i4]) {
                  // A, B, C, E, D
                  permutator.swap(S, i3, i4);
               } else {
                  // A, B, E, C, D
                  permutator.cycle(S, i2, i4, i3);
               }
            }
         }
      } else {
         if (S[i4] > S[i0]) {
            // A < E < B < D
            if (S[i2] < S[i4]) {
               // C < E
               if (S[i2] < S[i0]) {
                  // C, A, E, B, D
                  permutator.cycle(S, i0, i2, i4, i3, i1);
               } else {
                  // A, C, E, B, D
                  permutator.cycle(S, i1, i2, i4, i3);
               }
            } else {
               // C > E
               if (S[i2] < S[i1]) {
                  // A, E, C, B, D
                  permutator.cycle(S, i1, i4, i3);
               } else {
                  // A, E, B, C, D
                  permutator.cycle(S, i1, i4, i3, i2);
               }
            }
         } else {
            // E < A < B < D
            if (S[i2] < S[i0]) {
               // C < A
               if (S[i2] < S[i4]) {
                  // C, E, A, B, D
                  permutator.swap(S, i0, i2);
                  permutator.cycle(S, i4, i3, i1);
               } else {
                  // E, C, A, B, D
                  permutator.cycle(S, i0, i4, i3, i1, i2);
               }
            } else {
               // C > A
               if (S[i2] < S[i1]) {
                  // E, A, C, B, D
                  permutator.cycle(S, i0, i4, i3, i1);
               } else {
                  // E, A, B, C, D
                  permutator.cycle(S, i0, i4, i3, i2, i1);
               }
            }
         }
      }

      return S;
   }

   /**
    * Sort a range in the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end Unused, instead start + 4 is always the last element in the range.
    * @return The array
    */
   @Override
   public int[] sort(int[] S, int start, int end) {
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      int i4 = start + 4;

      // Minimum seven comparisons and swaps
      if (S[i0] > S[i1]) {
         // Ensure A > B
         permutator.swap(S, i0, i1);
      }
      if (S[i2] > S[i3]) {
         // Ensure D > C
         permutator.swap(S, i2, i3);
      }
      if (S[i1] > S[i3]) {
         permutator.swap(S, i1, i3);
         permutator.swap(S, i0, i2);
      }

      // So far, we know A < B < D and C < D
      // First establish E in (A, B, D). (i2 comparisons required).
      // Then establish C. (Given we know C < D, two comparisons required).
      if (S[i4] > S[i1]) {
         if (S[i4] > S[i3]) {
            // A < B < D < E
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, D, E
                  permutator.cycle(S, i0, i2, i1);
               } else {
                  // A, C, B, D, E
                  permutator.swap(S, i1, i2);
               }
            }
            // else
            // A, B, C, D, E
         } else {
            // A < B < E < D
            if (S[i2] < S[i1]) {
               // C < B
               if (S[i2] < S[i0]) {
                  // C, A, B, E, D
                  permutator.cycle(S, i0, i2, i1);
                  permutator.swap(S, i3, i4);
               } else {
                  // A, C, B, E, D
                  permutator.swap(S, i1, i2);
                  permutator.swap(S, i3, i4);
               }
            } else {
               if (S[i2] < S[i4]) {
                  // A, B, C, E, D
                  permutator.swap(S, i3, i4);
               } else {
                  // A, B, E, C, D
                  permutator.cycle(S, i2, i4, i3);
               }
            }
         }
      } else {
         if (S[i4] > S[i0]) {
            // A < E < B < D
            if (S[i2] < S[i4]) {
               // C < E
               if (S[i2] < S[i0]) {
                  // C, A, E, B, D
                  permutator.cycle(S, i0, i2, i4, i3, i1);
               } else {
                  // A, C, E, B, D
                  permutator.cycle(S, i1, i2, i4, i3);
               }
            } else {
               // C > E
               if (S[i2] < S[i1]) {
                  // A, E, C, B, D
                  permutator.cycle(S, i1, i4, i3);
               } else {
                  // A, E, B, C, D
                  permutator.cycle(S, i1, i4, i3, i2);
               }
            }
         } else {
            // E < A < B < D
            if (S[i2] < S[i0]) {
               // C < A
               if (S[i2] < S[i4]) {
                  // C, E, A, B, D
                  permutator.swap(S, i0, i2);
                  permutator.cycle(S, i4, i3, i1);
               } else {
                  // E, C, A, B, D
                  permutator.cycle(S, i0, i4, i3, i1, i2);
               }
            } else {
               // C > A
               if (S[i2] < S[i1]) {
                  // E, A, C, B, D
                  permutator.cycle(S, i0, i4, i3, i1);
               } else {
                  // E, A, B, C, D
                  permutator.cycle(S, i0, i4, i3, i2, i1);
               }
            }
         }
      }
      return S;
   }

   /**
    * Sort a range in the array
    * @param <T> The data type of the array
    * @param S The array
    * @param start The index of the first element in the range to sort
    * @param end Unused, instead start + 4 is always the last element in the range.
    * @param comparator The comparator to define the sort order
    * @return The array
    */
   @Override
   public <T> T[] sort(T[] S, int start, int end, Comparator<T> comparator) {
      if (comparator == null) {
         comparator = naturalOrderingComparator;
      }
      int i0 = start;
      int i1 = start + 1;
      int i2 = start + 2;
      int i3 = start + 3;
      int i4 = start + 4;

      // Minimum seven comparisons and swaps
      if (comparator.compare(S[i0], S[i1]) > 0) {
         // Ensure B > A
         permutator.swap(S, i0, i1);
      }
      if (comparator.compare(S[i2], S[i3]) > 0) {
         // Ensure D > C
         permutator.swap(S, i2, i3);
      }
      if (comparator.compare(S[i1], S[i3]) > 0) {
         permutator.swap(S, i1, i3);
         permutator.swap(S, i0, i2);
      }

      // So far, we know A < B < D and C < D
      // First establish E in (A, B, D). (i2 comparisons required).
      // Then establish C. (Given we know C < D, two comparisons required).
      if (comparator.compare(S[i4], S[i1]) > 0) {
         if (comparator.compare(S[i4], S[i3]) > 0) {
            // A < B < D < E
            if (comparator.compare(S[i2], S[i1]) < 0) {
               // C < B
               if (comparator.compare(S[i2], S[i0]) < 0) {
                  // C, A, B, D, E
                  permutator.cycle(S, i0, i2, i1);
               } else {
                  // A, C, B, D, E
                  permutator.swap(S, i1, i2);
               }
            }
            // else
            // A, B, C, D, E
         } else {
            // A < B < E < D
            if (comparator.compare(S[i2], S[i1]) < 0) {
               // C < B
               if (comparator.compare(S[i2], S[i0]) < 0) {
                  // C, A, B, E, D
                  permutator.cycle(S, i0, i2, i1);
                  permutator.swap(S, i3, i4);
               } else {
                  // A, C, B, E, D
                  permutator.swap(S, i1, i2);
                  permutator.swap(S, i3, i4);
               }
            } else {
               if (comparator.compare(S[i2], S[i4]) < 0) {
                  // A, B, C, E, D
                  permutator.swap(S, i3, i4);
               } else {
                  // A, B, E, C, D
                  permutator.cycle(S, i2, i4, i3);
               }
            }
         }
      } else {
         if (comparator.compare(S[i4], S[i0]) > 0) {
            // A < E < B < D
            if (comparator.compare(S[i2], S[i4]) < 0) {
               // C < E
               if (comparator.compare(S[i2], S[i0]) < 0) {
                  // C, A, E, B, D
                  permutator.cycle(S, i0, i2, i4, i3, i1);
               } else {
                  // A, C, E, B, D
                  permutator.cycle(S, i1, i2, i4, i3);
               }
            } else {
               // C > E
               if (comparator.compare(S[i2], S[i1]) < 0) {
                  // A, E, C, B, D
                  permutator.cycle(S, i1, i4, i3);
               } else {
                  // A, E, B, C, D
                  permutator.cycle(S, i1, i4, i3, i2);
               }
            }
         } else {
            // E < A < B < D
            if (comparator.compare(S[i2], S[i0]) < 0) {
               // C < A
               if (comparator.compare(S[i2], S[i4]) < 0) {
                  // C, E, A, B, D
                  permutator.swap(S, i0, i2);
                  permutator.cycle(S, i4, i3, i1);
               } else {
                  // E, C, A, B, D
                  permutator.cycle(S, i0, i4, i3, i1, i2);
               }
            } else {
               // C > A
               if (comparator.compare(S[i2], S[i1]) < 0) {
                  // E, A, C, B, D
                  permutator.cycle(S, i0, i4, i3, i1);
               } else {
                  // E, A, B, C, D
                  permutator.cycle(S, i0, i4, i3, i2, i1);
               }
            }
         }
      }

      return S;
   }

   /**
    * Get the permutator used by this sorter
    * @return The permutator used
    */
   public Permutator getPermutator() {
      return permutator;
   }

   /**
    * Set the permutator used by this sorter
    * @param permutator The permutator to use
    */
   public void setPermutator(Permutator permutator) {
      this.permutator = permutator;
   }
}
