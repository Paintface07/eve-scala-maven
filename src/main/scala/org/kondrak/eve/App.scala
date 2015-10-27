package org.kondrak.eve

import org.kondrak.eve.data.DATABASE
import scala.io.Source._
import scala.util.parsing.json._

/**
 * Hello world!
 *
 */

object App {

  def main(args: Array[String]) {
    println("Hello World!")

//    val myVal = readLine("Please enter a delimiter: ")
    val EVE_API = "https://public-crest.eveonline.com/"

    val DB = new DATABASE(
      DATABASE.DEFAULT_DATABASE,
      DATABASE.DEFAULT_ADDRESS,
      DATABASE.DEFAULT_PORT,
      DATABASE.DEFAULT_USERNAME,
      DATABASE.DEFAULT_PASSWORD
    )

//    DB.context.readOnly { implicit session =>
//      DB.test().foreach { p =>
//        println(p.id + myVal + p.name)
//      }
//    }

    val result = fromURL(EVE_API).mkString
    println(result)
    JSON.parseFull(result).foreach { p =>
      def values = p match {
        case p2: Map[String, Map[String, Any]] => p2
        case _ => throw new ClassCastException
      }
      println(values.mkString)
      values.foreach { e =>
        println(e)
      }
    }
  }
}
