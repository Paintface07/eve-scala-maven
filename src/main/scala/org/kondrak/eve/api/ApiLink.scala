package org.kondrak.eve.api

import scala.beans.BeanProperty
import scala.io.Source._

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class ApiLink {
  @BeanProperty var href: String = _

  def visit(): String = {
    return fromURL(href).mkString
  }
}
