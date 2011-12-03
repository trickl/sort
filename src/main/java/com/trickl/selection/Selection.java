package com.trickl.selection;

import com.trickl.sort.NaturalOrderingComparator;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public final class Selection {
   private static final NaturalOrderingComparator naturalOrderingComparator = new NaturalOrderingComparator();

   private Selection() {
   }

   public static <T> int[] selectLast(char[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, size - count);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] > S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectLast(short[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, size - count);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] > S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectLast(int[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, size - count);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] > S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectLast(double[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, size - count);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] > S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectLast(float[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, size - count);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] > S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectLast(T[] S, int[] freq, int count, final Comparator<T> comparator, SelectionAlgorithm selectionAlgorithm) {
      return selectFirst(S, freq, count, Collections.reverseOrder(comparator), selectionAlgorithm);
   }

   public static <T> int[] selectFirst(char[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, count - 1);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] < S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectFirst(short[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, count - 1);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] < S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectFirst(double[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, count - 1);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] < S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectFirst(float[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, count - 1);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] < S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectFirst(int[] S, int[] freq, int count, SelectionAlgorithm selectionAlgorithm) {
      int[] results = new int[count];
      if (count > 0) {
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, count - 1);

            for (int i = 0; i < S.length; ++i) {
               if (S[i] < S[j]) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (S[i] == S[j]) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }

      return results;
   }

   public static <T> int[] selectFirst(T[] S, int[] freq, int count, Comparator<T> comparator, SelectionAlgorithm selectionAlgorithm) {
      if (comparator == null) comparator = naturalOrderingComparator;
      int[] results = new int[count];
      if (count > 0) {
         if (count == 1) {
            results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0, comparator);
         }
         else {
            int j = selectionAlgorithm.select(S, freq, 0, S.length, count - 1, comparator);

            for (int i = 0; i < S.length; ++i) {
               if (comparator.compare(S[i], S[j]) < 0) {
                  results[results.length - count] = i;
                  count--;
               }
            }

            // Add equal values until we have found k values
            for (int i = 0; i < S.length; ++i) {
               if (comparator.compare(S[i], S[j]) == 0) {
                  results[results.length - count] = i;
                  count--;
               }

               if (count == 0) {
                  break;
               }
            }
         }
      }
      
      return results;
   }

   private static <T> T[] toArray(Collection<T> S) {
      T[] arrayS = (T[]) Array.newInstance(S.iterator().next().getClass(), S.size());
      S.toArray(arrayS);
      return arrayS;
   }

   private static <T> int[] toArray(T[] S, Map<T, Integer> freq) {
      int[] freqArray = new int[S.length];
      if (freq != null) {
         for (int i = 0; i < freqArray.length; ++i) {
            Integer f = freq.get(S[i]);
            freqArray[i] = (f == null ? 1 : f);
         }
      }
      return freqArray;
   }

   private static int accumulate(int[] S, int start, int end) {
      int sum = 0;
      for (int i = start; i < end; ++i) {
         sum += S[i];
      }
      return sum;
   }
}
