package com.trickl.sort;

import com.trickl.math.Permutator;
import com.trickl.math.StandardPermutator;
import java.util.Comparator;

/**
 * An optimal five element sort that only uses seven comparisons.
 *
 * @author tgee
 */
public class FiveElementSort implements Sorter {

  private static final NaturalOrderingComparator naturalOrderingComparator =
      new NaturalOrderingComparator();
  private Permutator permutator = new StandardPermutator();

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 4 is always the last element in the range.
   * @return The array
   */
  @Override
  public char[] sort(char[] arr, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;
    
    // Minimum seven comparisons and swaps
    if (arr[i0] > arr[i1]) {
      // Ensure B > A
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      // Ensure D > C
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      permutator.swap(arr, i1, i3);
      permutator.swap(arr, i0, i2);
    }
    
    int i4 = start + 4;

    // So far, we know A < B < D and C < D
    // First establish E in (A, B, D). (i2 comparisons required).
    // Then establish C. (Given we know C < D, two comparisons required).
    if (arr[i4] > arr[i1]) {
      if (arr[i4] > arr[i3]) {
        // A < B < D < E
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, D, E
            permutator.cycle(arr, i0, i2, i1);
          } else {
            // A, C, B, D, E
            permutator.swap(arr, i1, i2);
          }
        }
        // else
        // A, B, C, D, E
      } else {
        // A < B < E < D
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, E, D
            permutator.cycle(arr, i0, i2, i1);
            permutator.swap(arr, i3, i4);
          } else {
            // A, C, B, E, D
            permutator.swap(arr, i1, i2);
            permutator.swap(arr, i3, i4);
          }
        } else {
          if (arr[i2] < arr[i4]) {
            // A, B, C, E, D
            permutator.swap(arr, i3, i4);
          } else {
            // A, B, E, C, D
            permutator.cycle(arr, i2, i4, i3);
          }
        }
      }
    } else {
      if (arr[i4] > arr[i0]) {
        // A < E < B < D
        if (arr[i2] < arr[i4]) {
          // C < E
          if (arr[i2] < arr[i0]) {
            // C, A, E, B, D
            permutator.cycle(arr, i0, i2, i4, i3, i1);
          } else {
            // A, C, E, B, D
            permutator.cycle(arr, i1, i2, i4, i3);
          }
        } else {
          // C > E
          if (arr[i2] < arr[i1]) {
            // A, E, C, B, D
            permutator.cycle(arr, i1, i4, i3);
          } else {
            // A, E, B, C, D
            permutator.cycle(arr, i1, i4, i3, i2);
          }
        }
      } else {
        // E < A < B < D
        if (arr[i2] < arr[i0]) {
          // C < A
          if (arr[i2] < arr[i4]) {
            // C, E, A, B, D
            permutator.swap(arr, i0, i2);
            permutator.cycle(arr, i4, i3, i1);
          } else {
            // E, C, A, B, D
            permutator.cycle(arr, i0, i4, i3, i1, i2);
          }
        } else {
          // C > A
          if (arr[i2] < arr[i1]) {
            // E, A, C, B, D
            permutator.cycle(arr, i0, i4, i3, i1);
          } else {
            // E, A, B, C, D
            permutator.cycle(arr, i0, i4, i3, i2, i1);
          }
        }
      }
    }

    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 4 is always the last element in the range.
   * @return The array
   */
  @Override
  public short[] sort(short[] arr, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;
    
    // Minimum seven comparisons and swaps
    if (arr[i0] > arr[i1]) {
      // Ensure B > A
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      // Ensure D > C
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      permutator.swap(arr, i1, i3);
      permutator.swap(arr, i0, i2);
    }
    
    int i4 = start + 4;

    // So far, we know A < B < D and C < D
    // First establish E in (A, B, D). (i2 comparisons required).
    // Then establish C. (Given we know C < D, two comparisons required).
    if (arr[i4] > arr[i1]) {
      if (arr[i4] > arr[i3]) {
        // A < B < D < E
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, D, E
            permutator.cycle(arr, i0, i2, i1);
          } else {
            // A, C, B, D, E
            permutator.swap(arr, i1, i2);
          }
        }
        // else
        // A, B, C, D, E
      } else {
        // A < B < E < D
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, E, D
            permutator.cycle(arr, i0, i2, i1);
            permutator.swap(arr, i3, i4);
          } else {
            // A, C, B, E, D
            permutator.swap(arr, i1, i2);
            permutator.swap(arr, i3, i4);
          }
        } else {
          if (arr[i2] < arr[i4]) {
            // A, B, C, E, D
            permutator.swap(arr, i3, i4);
          } else {
            // A, B, E, C, D
            permutator.cycle(arr, i2, i4, i3);
          }
        }
      }
    } else {
      if (arr[i4] > arr[i0]) {
        // A < E < B < D
        if (arr[i2] < arr[i4]) {
          // C < E
          if (arr[i2] < arr[i0]) {
            // C, A, E, B, D
            permutator.cycle(arr, i0, i2, i4, i3, i1);
          } else {
            // A, C, E, B, D
            permutator.cycle(arr, i1, i2, i4, i3);
          }
        } else {
          // C > E
          if (arr[i2] < arr[i1]) {
            // A, E, C, B, D
            permutator.cycle(arr, i1, i4, i3);
          } else {
            // A, E, B, C, D
            permutator.cycle(arr, i1, i4, i3, i2);
          }
        }
      } else {
        // E < A < B < D
        if (arr[i2] < arr[i0]) {
          // C < A
          if (arr[i2] < arr[i4]) {
            // C, E, A, B, D
            permutator.swap(arr, i0, i2);
            permutator.cycle(arr, i4, i3, i1);
          } else {
            // E, C, A, B, D
            permutator.cycle(arr, i0, i4, i3, i1, i2);
          }
        } else {
          // C > A
          if (arr[i2] < arr[i1]) {
            // E, A, C, B, D
            permutator.cycle(arr, i0, i4, i3, i1);
          } else {
            // E, A, B, C, D
            permutator.cycle(arr, i0, i4, i3, i2, i1);
          }
        }
      }
    }

    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 4 is always the last element in the range.
   * @return The array
   */
  @Override
  public double[] sort(double[] arr, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;    

    // Minimum seven comparisons and swaps
    if (arr[i0] > arr[i1]) {
      // Ensure B > A
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      // Ensure D > C
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      permutator.swap(arr, i1, i3);
      permutator.swap(arr, i0, i2);
    }
    
    int i4 = start + 4;

    // So far, we know A < B < D and C < D
    // First establish E in (A, B, D). (i2 comparisons required).
    // Then establish C. (Given we know C < D, two comparisons required).
    if (arr[i4] > arr[i1]) {
      if (arr[i4] > arr[i3]) {
        // A < B < D < E
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, D, E
            permutator.cycle(arr, i0, i2, i1);
          } else {
            // A, C, B, D, E
            permutator.swap(arr, i1, i2);
          }
        }
        // else
        // A, B, C, D, E
      } else {
        // A < B < E < D
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, E, D
            permutator.cycle(arr, i0, i2, i1);
            permutator.swap(arr, i3, i4);
          } else {
            // A, C, B, E, D
            permutator.swap(arr, i1, i2);
            permutator.swap(arr, i3, i4);
          }
        } else {
          if (arr[i2] < arr[i4]) {
            // A, B, C, E, D
            permutator.swap(arr, i3, i4);
          } else {
            // A, B, E, C, D
            permutator.cycle(arr, i2, i4, i3);
          }
        }
      }
    } else {
      if (arr[i4] > arr[i0]) {
        // A < E < B < D
        if (arr[i2] < arr[i4]) {
          // C < E
          if (arr[i2] < arr[i0]) {
            // C, A, E, B, D
            permutator.cycle(arr, i0, i2, i4, i3, i1);
          } else {
            // A, C, E, B, D
            permutator.cycle(arr, i1, i2, i4, i3);
          }
        } else {
          // C > E
          if (arr[i2] < arr[i1]) {
            // A, E, C, B, D
            permutator.cycle(arr, i1, i4, i3);
          } else {
            // A, E, B, C, D
            permutator.cycle(arr, i1, i4, i3, i2);
          }
        }
      } else {
        // E < A < B < D
        if (arr[i2] < arr[i0]) {
          // C < A
          if (arr[i2] < arr[i4]) {
            // C, E, A, B, D
            permutator.swap(arr, i0, i2);
            permutator.cycle(arr, i4, i3, i1);
          } else {
            // E, C, A, B, D
            permutator.cycle(arr, i0, i4, i3, i1, i2);
          }
        } else {
          // C > A
          if (arr[i2] < arr[i1]) {
            // E, A, C, B, D
            permutator.cycle(arr, i0, i4, i3, i1);
          } else {
            // E, A, B, C, D
            permutator.cycle(arr, i0, i4, i3, i2, i1);
          }
        }
      }
    }

    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 4 is always the last element in the range.
   * @return The array
   */
  @Override
  public float[] sort(float[] arr, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;
    
    // Minimum seven comparisons and swaps
    if (arr[i0] > arr[i1]) {
      // Ensure B > AS
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      // Ensure D > C
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      permutator.swap(arr, i1, i3);
      permutator.swap(arr, i0, i2);
    }
    
    int i4 = start + 4;

    // So far, we know A < B < D and C < D
    // First establish E in (A, B, D). (i2 comparisons required).
    // Then establish C. (Given we know C < D, two comparisons required).
    if (arr[i4] > arr[i1]) {
      if (arr[i4] > arr[i3]) {
        // A < B < D < E
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, D, E
            permutator.cycle(arr, i0, i2, i1);
          } else {
            // A, C, B, D, E
            permutator.swap(arr, i1, i2);
          }
        }
        // else
        // A, B, C, D, E
      } else {
        // A < B < E < D
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, E, D
            permutator.cycle(arr, i0, i2, i1);
            permutator.swap(arr, i3, i4);
          } else {
            // A, C, B, E, D
            permutator.swap(arr, i1, i2);
            permutator.swap(arr, i3, i4);
          }
        } else {
          if (arr[i2] < arr[i4]) {
            // A, B, C, E, D
            permutator.swap(arr, i3, i4);
          } else {
            // A, B, E, C, D
            permutator.cycle(arr, i2, i4, i3);
          }
        }
      }
    } else {
      if (arr[i4] > arr[i0]) {
        // A < E < B < D
        if (arr[i2] < arr[i4]) {
          // C < E
          if (arr[i2] < arr[i0]) {
            // C, A, E, B, D
            permutator.cycle(arr, i0, i2, i4, i3, i1);
          } else {
            // A, C, E, B, D
            permutator.cycle(arr, i1, i2, i4, i3);
          }
        } else {
          // C > E
          if (arr[i2] < arr[i1]) {
            // A, E, C, B, D
            permutator.cycle(arr, i1, i4, i3);
          } else {
            // A, E, B, C, D
            permutator.cycle(arr, i1, i4, i3, i2);
          }
        }
      } else {
        // E < A < B < D
        if (arr[i2] < arr[i0]) {
          // C < A
          if (arr[i2] < arr[i4]) {
            // C, E, A, B, D
            permutator.swap(arr, i0, i2);
            permutator.cycle(arr, i4, i3, i1);
          } else {
            // E, C, A, B, D
            permutator.cycle(arr, i0, i4, i3, i1, i2);
          }
        } else {
          // C > A
          if (arr[i2] < arr[i1]) {
            // E, A, C, B, D
            permutator.cycle(arr, i0, i4, i3, i1);
          } else {
            // E, A, B, C, D
            permutator.cycle(arr, i0, i4, i3, i2, i1);
          }
        }
      }
    }

    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 4 is always the last element in the range.
   * @return The array
   */
  @Override
  public int[] sort(int[] arr, int start, int end) {
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;
    
    // Minimum seven comparisons and swaps
    if (arr[i0] > arr[i1]) {
      // Ensure A > B
      permutator.swap(arr, i0, i1);
    }
    if (arr[i2] > arr[i3]) {
      // Ensure D > C
      permutator.swap(arr, i2, i3);
    }
    if (arr[i1] > arr[i3]) {
      permutator.swap(arr, i1, i3);
      permutator.swap(arr, i0, i2);
    }

    int i4 = start + 4;
    
    // So far, we know A < B < D and C < D
    // First establish E in (A, B, D). (i2 comparisons required).
    // Then establish C. (Given we know C < D, two comparisons required).
    if (arr[i4] > arr[i1]) {
      if (arr[i4] > arr[i3]) {
        // A < B < D < E
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, D, E
            permutator.cycle(arr, i0, i2, i1);
          } else {
            // A, C, B, D, E
            permutator.swap(arr, i1, i2);
          }
        }
        // else
        // A, B, C, D, E
      } else {
        // A < B < E < D
        if (arr[i2] < arr[i1]) {
          // C < B
          if (arr[i2] < arr[i0]) {
            // C, A, B, E, D
            permutator.cycle(arr, i0, i2, i1);
            permutator.swap(arr, i3, i4);
          } else {
            // A, C, B, E, D
            permutator.swap(arr, i1, i2);
            permutator.swap(arr, i3, i4);
          }
        } else {
          if (arr[i2] < arr[i4]) {
            // A, B, C, E, D
            permutator.swap(arr, i3, i4);
          } else {
            // A, B, E, C, D
            permutator.cycle(arr, i2, i4, i3);
          }
        }
      }
    } else {
      if (arr[i4] > arr[i0]) {
        // A < E < B < D
        if (arr[i2] < arr[i4]) {
          // C < E
          if (arr[i2] < arr[i0]) {
            // C, A, E, B, D
            permutator.cycle(arr, i0, i2, i4, i3, i1);
          } else {
            // A, C, E, B, D
            permutator.cycle(arr, i1, i2, i4, i3);
          }
        } else {
          // C > E
          if (arr[i2] < arr[i1]) {
            // A, E, C, B, D
            permutator.cycle(arr, i1, i4, i3);
          } else {
            // A, E, B, C, D
            permutator.cycle(arr, i1, i4, i3, i2);
          }
        }
      } else {
        // E < A < B < D
        if (arr[i2] < arr[i0]) {
          // C < A
          if (arr[i2] < arr[i4]) {
            // C, E, A, B, D
            permutator.swap(arr, i0, i2);
            permutator.cycle(arr, i4, i3, i1);
          } else {
            // E, C, A, B, D
            permutator.cycle(arr, i0, i4, i3, i1, i2);
          }
        } else {
          // C > A
          if (arr[i2] < arr[i1]) {
            // E, A, C, B, D
            permutator.cycle(arr, i0, i4, i3, i1);
          } else {
            // E, A, B, C, D
            permutator.cycle(arr, i0, i4, i3, i2, i1);
          }
        }
      }
    }
    return arr;
  }

  /**
   * Sort a range in the array.
   *
   * @param <T> The data type of the array
   * @param arr The array
   * @param start The index of the first element in the range to sort
   * @param end Unused, instead start + 4 is always the last element in the range.
   * @param comparator The comparator to define the sort order
   * @return The array
   */
  @Override
  public <T> T[] sort(T[] arr, int start, int end, Comparator<T> comparator) {
    if (comparator == null) {
      comparator = naturalOrderingComparator;
    }
    int i0 = start;
    int i1 = start + 1;
    int i2 = start + 2;
    int i3 = start + 3;    

    // Minimum seven comparisons and swaps
    if (comparator.compare(arr[i0], arr[i1]) > 0) {
      // Ensure B > A
      permutator.swap(arr, i0, i1);
    }
    if (comparator.compare(arr[i2], arr[i3]) > 0) {
      // Ensure D > C
      permutator.swap(arr, i2, i3);
    }
    if (comparator.compare(arr[i1], arr[i3]) > 0) {
      permutator.swap(arr, i1, i3);
      permutator.swap(arr, i0, i2);
    }
    
    int i4 = start + 4;

    // So far, we know A < B < D and C < D
    // First establish E in (A, B, D). (i2 comparisons required).
    // Then establish C. (Given we know C < D, two comparisons required).
    if (comparator.compare(arr[i4], arr[i1]) > 0) {
      if (comparator.compare(arr[i4], arr[i3]) > 0) {
        // A < B < D < E
        if (comparator.compare(arr[i2], arr[i1]) < 0) {
          // C < B
          if (comparator.compare(arr[i2], arr[i0]) < 0) {
            // C, A, B, D, E
            permutator.cycle(arr, i0, i2, i1);
          } else {
            // A, C, B, D, E
            permutator.swap(arr, i1, i2);
          }
        }
        // else
        // A, B, C, D, E
      } else {
        // A < B < E < D
        if (comparator.compare(arr[i2], arr[i1]) < 0) {
          // C < B
          if (comparator.compare(arr[i2], arr[i0]) < 0) {
            // C, A, B, E, D
            permutator.cycle(arr, i0, i2, i1);
            permutator.swap(arr, i3, i4);
          } else {
            // A, C, B, E, D
            permutator.swap(arr, i1, i2);
            permutator.swap(arr, i3, i4);
          }
        } else {
          if (comparator.compare(arr[i2], arr[i4]) < 0) {
            // A, B, C, E, D
            permutator.swap(arr, i3, i4);
          } else {
            // A, B, E, C, D
            permutator.cycle(arr, i2, i4, i3);
          }
        }
      }
    } else {
      if (comparator.compare(arr[i4], arr[i0]) > 0) {
        // A < E < B < D
        if (comparator.compare(arr[i2], arr[i4]) < 0) {
          // C < E
          if (comparator.compare(arr[i2], arr[i0]) < 0) {
            // C, A, E, B, D
            permutator.cycle(arr, i0, i2, i4, i3, i1);
          } else {
            // A, C, E, B, D
            permutator.cycle(arr, i1, i2, i4, i3);
          }
        } else {
          // C > E
          if (comparator.compare(arr[i2], arr[i1]) < 0) {
            // A, E, C, B, D
            permutator.cycle(arr, i1, i4, i3);
          } else {
            // A, E, B, C, D
            permutator.cycle(arr, i1, i4, i3, i2);
          }
        }
      } else {
        // E < A < B < D
        if (comparator.compare(arr[i2], arr[i0]) < 0) {
          // C < A
          if (comparator.compare(arr[i2], arr[i4]) < 0) {
            // C, E, A, B, D
            permutator.swap(arr, i0, i2);
            permutator.cycle(arr, i4, i3, i1);
          } else {
            // E, C, A, B, D
            permutator.cycle(arr, i0, i4, i3, i1, i2);
          }
        } else {
          // C > A
          if (comparator.compare(arr[i2], arr[i1]) < 0) {
            // E, A, C, B, D
            permutator.cycle(arr, i0, i4, i3, i1);
          } else {
            // E, A, B, C, D
            permutator.cycle(arr, i0, i4, i3, i2, i1);
          }
        }
      }
    }

    return arr;
  }

  /**
   * Get the permutator used by this sorter.
   *
   * @return The permutator used
   */
  public Permutator getPermutator() {
    return permutator;
  }

  /**
   * Set the permutator used by this sorter.
   *
   * @param permutator The permutator to use
   */
  public void setPermutator(Permutator permutator) {
    this.permutator = permutator;
  }
}
