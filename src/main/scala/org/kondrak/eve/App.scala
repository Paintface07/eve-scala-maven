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

object DB {
  val test = new SelectListBy[String, Test] {
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
      new PooledDataSource("org.postgresql.Driver", "jdbc:postgresql://127.0.0.1:5432/test", "pgadmin", "password")
    )
  )

  config += test

  lazy val context = config.createPersistenceContext
}

object App extends App {
  println( "Hello World!" )

  DB.context.readOnly { implicit session =>
      DB.test("").foreach { p =>
          println(p.id + ", " + p.name)
      }
  }
}
