package org.kondrak.eve.api

import scala.beans.BeanProperty

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class ServerCounts {
  @BeanProperty var dust: Int = _
  @BeanProperty var dust_str: String = _
  @BeanProperty var eve: Int = _
  @BeanProperty var eve_str: String = _
}
