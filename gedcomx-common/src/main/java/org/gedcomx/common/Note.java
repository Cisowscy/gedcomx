/**
 * Copyright 2011-2012 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.common;

import org.gedcomx.rt.json.JsonElementWrapper;

import javax.xml.XMLConstants;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A note about a genealogical resource (e.g. conclusion or source).
 *
 * @author Ryan Heaton
 */
@XmlRootElement
@JsonElementWrapper(name = "notes")
@XmlType ( name = "Note", propOrder = { "text", "attribution" } )
public class Note implements Attributable, HasText {

  private String lang;
  private String text;
  private Attribution attribution;

  /**
   * The language of the note. See <a href="http://www.w3.org/International/articles/language-tags/>http://www.w3.org/International/articles/language-tags/</a>
   *
   * @return The language of note.
   */
  @XmlAttribute( namespace = XMLConstants.XML_NS_URI )
  public String getLang() {
    return lang;
  }

  /**
   * The language of the note. See <a href="http://www.w3.org/International/articles/language-tags/>http://www.w3.org/International/articles/language-tags/</a>
   *
   * @param lang The language of the note.
   */
  public void setLang(String lang) {
    this.lang = lang;
  }

  /**
   * The text of the note.
   *
   * @return The text of the note.
   */
  public String getText() {
    return text;
  }

  /**
   * The text of the note.
   *
   * @param text The text of the note.
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Attribution metadata for a note.
   *
   * @return Attribution metadata for a note.
   */
  @Override
  public Attribution getAttribution() {
    return attribution;
  }

  /**
   * Attribution metadata for a note.
   *
   * @param attribution Attribution metadata for a note.
   */
  @Override
  public void setAttribution(Attribution attribution) {
    this.attribution = attribution;
  }
}
