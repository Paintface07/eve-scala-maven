package org.kondrak.eve.api

import scala.beans.BeanProperty

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class IndustryApi {
  @BeanProperty var facilities: ApiLink = _
  @BeanProperty var systems: ApiLink = _
}
