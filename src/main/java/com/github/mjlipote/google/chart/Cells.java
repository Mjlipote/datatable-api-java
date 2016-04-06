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

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public final class Cells {

  private final List<Value<?>> c;

  public Cells(List<Value<?>> c) {
    this.c = c;
  }

  public Cells() {
    this.c = newArrayList();
  }

  public Cells addValue(Value<?> value) {
    this.c.add(value);
    return this;
  }

  /**
   * @return the c
   */
  public List<Value<?>> getC() {
    return c;
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Cells)) {
      return false;
    }
    Cells castOther = (Cells) other;
    return Objects.equal(c, castOther.c);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(c);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("c", c).toString();
  }

}
