package org.kondrak.eve.api

import scala.beans.BeanProperty

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class Metadata {
  @BeanProperty var dust: ApiLink = _
  @BeanProperty var eve: ApiLink = _
  @BeanProperty var server: ApiLink = _
}
