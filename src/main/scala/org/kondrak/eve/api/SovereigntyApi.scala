package org.kondrak.eve.api

import scala.beans.BeanProperty

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class SovereigntyApi {
  @BeanProperty var campaigns: ApiLink = _
  @BeanProperty var structures: ApiLink = _
}
