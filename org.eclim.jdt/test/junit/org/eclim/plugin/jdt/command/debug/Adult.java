/**
 * Copyright (C) 2005 - 2014  Eric Van Dewoestine
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.eclim.plugin.jdt.command.debug;

import java.util.ArrayList;
import java.util.Collection;

public class Adult extends Person
{
  private boolean married = false;

  private Adult spouse;

  private Collection<Child> children = new ArrayList<Child>();

  public Adult (String name, Sex sex) {
    super(name, sex);
  }

  public void gotMarried(Adult adult) {
    this.spouse = adult;
    this.married = true;
  }

  public boolean isMarried() {
    return married;
  }

  public void addChild(Child child) {
    children.add(child);
  }

  public Adult getSpouse() {
    return spouse;
  }

  public Collection<Child> getChildren() {
    return children;
  }
}
