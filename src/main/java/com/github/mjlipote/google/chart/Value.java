/*
 *
 * Copyright 2016 Ming-Jheng Li
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package com.github.mjlipote.google.chart;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@JsonInclude(Include.NON_NULL)
public final class Value<T> {

  private T v;

  private String f;

  private Map<String, Object> p;

  public Value() {}

  public Value(T v) {
    this.v = v;
  }

  // public Value(String f) {
  // this.f = f;
  // }

  public Value(Map<String, Object> p) {
    this.p = p;
  }

  /**
   * @return the v
   */
  public T getV() {
    return v;
  }

  /**
   * @param v
   *          the v to set
   */
  public void setV(T v) {
    this.v = v;
  }

  /**
   * @return the f
   */
  public String getF() {
    return f;
  }

  /**
   * @param f
   *          the f to set
   */
  public void setF(String f) {
    this.f = f;
  }

  /**
   * @return the p
   */
  public Map<String, Object> getP() {
    return p;
  }

  /**
   * @param p
   *          the p to set
   */
  public void setP(Map<String, Object> p) {
    this.p = p;
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Value)) {
      return false;
    }
    Value<?> castOther = (Value<?>) other;
    return Objects.equal(v, castOther.v) && Objects.equal(f, castOther.f)
        && Objects.equal(p, castOther.p);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(v, f, p);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("v", v).add("f", f).add("p", p)
        .toString();
  }

}
