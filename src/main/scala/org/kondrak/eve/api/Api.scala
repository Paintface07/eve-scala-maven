package org.kondrak.eve.api

import scala.beans.BeanProperty

/**
 * Created by nosferatu-fedora on 10/28/15.
 */
class Api {
  @BeanProperty var motd: Metadata = _
  @BeanProperty var crestEndpoint: ApiLink = _
  @BeanProperty var corporationRoles: ApiLink = _
  @BeanProperty var itemGroups: ApiLink = _
  @BeanProperty var channels: ApiLink = _
  @BeanProperty var corporations: ApiLink = _
  @BeanProperty var alliances: ApiLink = _
  @BeanProperty var itemTypes: ApiLink = _
  @BeanProperty var decode: ApiLink = _
  @BeanProperty var battleTheatres: ApiLink = _
  @BeanProperty var marketPrices: ApiLink = _
  @BeanProperty var itemCategories: ApiLink = _
  @BeanProperty var regions: ApiLink = _
  @BeanProperty var bloodlines: ApiLink = _
  @BeanProperty var marketGroups: ApiLink = _
  @BeanProperty var sovereignty: SovereigntyApi = _
  @BeanProperty var tournaments: ApiLink = _
  @BeanProperty var map: ApiLink = _
  @BeanProperty var virtualGoodStore: ApiLink = _
  @BeanProperty var serverVersion: String = _
  @BeanProperty var wars: ApiLink = _
  @BeanProperty var incursions: ApiLink = _
  @BeanProperty var races: ApiLink = _
  @BeanProperty var authEndpoint: ApiLink = _
  @BeanProperty var serviceStatus: ServerStatus = _
  @BeanProperty var userCounts: ServerCounts = _
  @BeanProperty var industry: IndustryApi = _
  @BeanProperty var clients: ClientsApi = _
  @BeanProperty var time: ApiLink = _
  @BeanProperty var marketTypes: ApiLink = _
  @BeanProperty var serverName: String = _
}

