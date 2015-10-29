package org.kondrak.eve.api

import scala.beans.BeanProperty

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class ServerStatus {
  @BeanProperty var dust: String = _
  @BeanProperty var eve: String = _
  @BeanProperty var server: String = _
}
