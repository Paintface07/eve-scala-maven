package org.kondrak.eve

import org.mybatis.scala.mapping._
import org.mybatis.scala.config._
import org.mybatis.scala.session._


/**
 * Hello world!
 *
 */

class Test {
  var id: Int = _
  var name: String = _
}

class DATABASE (var database: String, var address: String, var port: String, var username: String, var password: String) {
  val test = new SelectList[Test] {
    def xsql =
      <xsql>
        SELECT *
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

object App {

  def main(args: Array[String]) {
    println("Hello World!")

    val myVal = readLine("Please enter a delimiter: ")

    val DB = new DATABASE(
      DATABASE.DEFAULT_DATABASE,
      DATABASE.DEFAULT_ADDRESS,
      DATABASE.DEFAULT_PORT,
      DATABASE.DEFAULT_USERNAME,
      DATABASE.DEFAULT_PASSWORD
    )

    DB.context.readOnly { implicit session =>
      DB.test().foreach { p =>
        println(p.id + myVal + p.name)
      }
    }
  }
}
