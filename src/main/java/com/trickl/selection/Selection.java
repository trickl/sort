package com.trickl.selection;

import com.trickl.sort.NaturalOrderingComparator;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/**
 * A selection utility class that performs common selection functions using the given selection
 * algorithm.
 *
 * @author tgee
 * @version $Id: $Id
 */
public final class Selection {
  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();

  private Selection() {}

  /**
   * Select the last k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   */
  public static int[] selectLast(
      char[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, size - k);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] > S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the last k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   */
  public static int[] selectLast(
      short[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, size - k);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] > S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the last k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   */
  public static int[] selectLast(
      int[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, size - k);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] > S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the last k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   */
  public static int[] selectLast(
      double[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, size - k);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] > S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the last k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   */
  public static int[] selectLast(
      float[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      int size = freq == null ? S.length : accumulate(freq, 0, freq.length);
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, size - 1);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, size - k);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] > S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the last k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param comparator a {@link java.util.Comparator} object.
   * @param <T> a T object.
   */
  public static <T> int[] selectLast(
      T[] S,
      int[] freq,
      int k,
      final Comparator<T> comparator,
      SelectionAlgorithm selectionAlgorithm) {
    return selectFirst(S, freq, k, Collections.reverseOrder(comparator), selectionAlgorithm);
  }

  /**
   * Select the first k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param <T> a T object.
   */
  public static <T> int[] selectFirst(
      char[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, k - 1);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] < S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the first k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param <T> a T object.
   */
  public static <T> int[] selectFirst(
      short[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, k - 1);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] < S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the first k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param <T> a T object.
   */
  public static <T> int[] selectFirst(
      double[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, k - 1);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] < S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the first k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param <T> a T object.
   */
  public static <T> int[] selectFirst(
      float[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, k - 1);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] < S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the first k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param <T> a T object.
   */
  public static <T> int[] selectFirst(
      int[] S, int[] freq, int k, SelectionAlgorithm selectionAlgorithm) {
    int[] results = new int[k];
    if (k > 0) {
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, k - 1);

        for (int i = 0; i < S.length; ++i) {
          if (S[i] < S[j]) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (S[i] == S[j]) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
            break;
          }
        }
      }
    }

    return results;
  }

  /**
   * Select the first k elements in an array
   *
   * @param S The array
   * @param freq The frequency of elements in the array
   * @param k a int.
   * @param selectionAlgorithm The algorithm to perform selection with
   * @return A size k array with the elements
   * @param comparator a {@link java.util.Comparator} object.
   * @param <T> a T object.
   */
  public static <T> int[] selectFirst(
      T[] S, int[] freq, int k, Comparator<T> comparator, SelectionAlgorithm selectionAlgorithm) {
    if (comparator == null) comparator = naturalOrderingComparator;
    int[] results = new int[k];
    if (k > 0) {
      if (k == 1) {
        results[0] = selectionAlgorithm.select(S, freq, 0, S.length, 0, comparator);
      } else {
        int j = selectionAlgorithm.select(S, freq, 0, S.length, k - 1, comparator);

        for (int i = 0; i < S.length; ++i) {
          if (comparator.compare(S[i], S[j]) < 0) {
            results[results.length - k] = i;
            k--;
          }
        }

        // Add equal values until we have found k values
        for (int i = 0; i < S.length; ++i) {
          if (comparator.compare(S[i], S[j]) == 0) {
            results[results.length - k] = i;
            k--;
          }

          if (k == 0) {
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
