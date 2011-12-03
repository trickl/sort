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

public class Quaternion {

   private final double a, b, c, d;

   public Quaternion(double a, double b, double c, double d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   // return the quaternion norm
   public double norm() {
      return Math.sqrt(a * a + b * b + c * c + d * d);
   }

   public Quaternion conjugate() {
      return new Quaternion(a, -b, -c, -d);
   }

   public Quaternion plus(Quaternion other) {
      return new Quaternion(this.a + other.a,
                            this.b + other.b,
                            this.c + other.c,
                            this.d + other.d);
   }

   public Quaternion mult(Quaternion b) {      
      double y0 = this.a * b.a - this.b * b.b - this.c * b.c - this.d * b.d;
      double y1 = this.a * b.b + this.b * b.a + this.c * b.d - this.d * b.c;
      double y2 = this.a * b.c - this.b * b.d + this.c * b.a + this.d * b.b;
      double y3 = this.a * b.d + this.b * b.c - this.c * b.b + this.d * b.a;
      return new Quaternion(y0, y1, y2, y3);
   }

   public Quaternion inv() {
      double norm = a * a + b * b + c * c + d * d;
      return new Quaternion(a / norm, -b / norm, -c / norm, -d / norm);
   }

   public Quaternion div(Quaternion b) {
      return inv().mult(b);
   }

   @Override
   public String toString() {
      return a + " + " + b + "i + " + c + "j + " + d + "k";
   }
}
