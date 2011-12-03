package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

public class FiveElementSort implements Sorter {

   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();
   private Permutator permutator = new StandardPermutator();

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

   public Permutator getPermutator() {
      return permutator;
   }

   public void setPermutator(Permutator permutator) {
      this.permutator = permutator;
   }
}
