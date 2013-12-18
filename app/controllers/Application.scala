package controllers

import play.api.mvc._
import model._
import com.typesafe.config.ConfigFactory

object Application extends Controller {

  val root = ConfigFactory.load("customParameters.properties").getString("root-folder")

  val testValues: List[ServerEntity] = List(
    new ServerFolder("Dir1", List(
      new ServerFolder("Dir2", List(
        new ServerFile("Fil4", 10)
      )),
      new ServerFile("Fil1", 10),
      new ServerFile("Fil2", 10),
      new ServerFile("Fil3", 10)
    )),
    new ServerFile("Fil5", 30)
  )

  def index = Action {
    Ok( views.html.index( testValues ) )
  }

}