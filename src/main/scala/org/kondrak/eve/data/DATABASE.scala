package org.kondrak.eve.data

import org.apache.ibatis.datasource.pooled.PooledDataSource
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory
import org.mybatis.scala.config.{Environment, Configuration}
import org.mybatis.scala.mapping.SelectList

/**
 * Created by nosferatu-fedora on 10/27/15.
 */
class DATABASE (var database: String, var address: String, var port: String, var username: String, var password: String) {
  val test = new SelectList[Test] {
    def xsql =
      <xsql>
        SELECT id, name
        FROM "TEST";
      </xsql>
  }

  // datasource configuration
  val config = Configuration (
    Environment (
      "default",
      new JdbcTransactionFactory(),
      new PooledDataSource("org.postgresql.Driver", "jdbc:postgresql://" + address + ":" + port + "/" + database, username, password)
    )
  )

  config += test

  lazy val context = config.createPersistenceContext
}

object DATABASE {
  val DEFAULT_USERNAME = "pgadmin"
  val DEFAULT_PASSWORD = "password"
  val DEFAULT_DATABASE = "test"
  val DEFAULT_ADDRESS = "127.0.0.1"
  val DEFAULT_PORT = "5432"
}
