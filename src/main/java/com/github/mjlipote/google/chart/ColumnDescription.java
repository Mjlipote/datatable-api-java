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

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public final class ColumnDescription {

  private final String id;

  private final String label;

  private final Type type;

  public ColumnDescription(String id, String label, Type type) {
    this.id = id;
    this.label = label;
    this.type = type;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof ColumnDescription)) {
      return false;
    }
    ColumnDescription castOther = (ColumnDescription) other;
    return Objects.equal(id, castOther.id)
        && Objects.equal(label, castOther.label)
        && Objects.equal(type, castOther.type);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id, label, type);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("id", id).add("label", label)
        .add("type", type).toString();
  }

}
