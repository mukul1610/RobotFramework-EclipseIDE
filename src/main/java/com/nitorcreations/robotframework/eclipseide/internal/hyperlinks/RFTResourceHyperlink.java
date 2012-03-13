/**
 * Copyright 2012 Nitor Creations Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nitorcreations.robotframework.eclipseide.internal.hyperlinks;

import org.eclipse.jface.text.IRegion;

public class RFTResourceHyperlink extends RFTHyperlink {

  public RFTResourceHyperlink(IRegion region, String path) {
    super(region, path);
  }

  @Override
  public void open() {
    System.out.println("TODO Open hyperlink RFT Resource '" + text + "'");
  }

}