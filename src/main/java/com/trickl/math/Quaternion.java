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
package com.trickl.math;

/**
 * http://en.wikipedia.org/wiki/Quaternion
 *
 * @author tgee
 */
public class Quaternion {

  private final double a, b, c, d;

  /**
   * Create a quaternion
   *
   * @param a
   * @param b
   * @param c
   * @param d
   */
  public Quaternion(double a, double b, double c, double d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }

  /**
   * Get the quaternion norm
   *
   * @return The norm
   */
  public double norm() {
    return Math.sqrt(a * a + b * b + c * c + d * d);
  }

  /**
   * Calculate the conjugate
   *
   * @return The conjugate
   */
  public Quaternion conjugate() {
    return new Quaternion(a, -b, -c, -d);
  }

  /**
   * Add another quaternion to this one
   *
   * @param other The other quaternion
   * @return The sum
   */
  public Quaternion plus(Quaternion other) {
    return new Quaternion(this.a + other.a, this.b + other.b, this.c + other.c, this.d + other.d);
  }

  /**
   * Multiply another quaternion with this one
   *
   * @param other The other quaternion
   * @return The product
   */
  public Quaternion mult(Quaternion other) {
    double y0 = this.a * other.a - this.b * other.b - this.c * other.c - this.d * other.d;
    double y1 = this.a * other.b + this.b * other.a + this.c * other.d - this.d * other.c;
    double y2 = this.a * other.c - this.b * other.d + this.c * other.a + this.d * other.b;
    double y3 = this.a * other.d + this.b * other.c - this.c * other.b + this.d * other.a;
    return new Quaternion(y0, y1, y2, y3);
  }

  /**
   * Calculate the inverse
   *
   * @return The inverse
   */
  public Quaternion inv() {
    double norm = a * a + b * b + c * c + d * d;
    return new Quaternion(a / norm, -b / norm, -c / norm, -d / norm);
  }

  /**
   * Divide this quaterion by another
   *
   * @param other The other quaternion, the divisor
   * @return The quotient
   */
  public Quaternion div(Quaternion other) {
    return inv().mult(other);
  }

  /**
   * Get the string representation of this quaternion, e.g. "1 + 2i + 3j + 4k".
   *
   * @return The string representation
   */
  @Override
  public String toString() {
    return a + " + " + b + "i + " + c + "j + " + d + "k";
  }
}
