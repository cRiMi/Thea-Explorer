package model

class ServerFile(val name: String, val size: Long) extends ServerEntity {

  val icon: String = "glyphicon-file"
  val content: List[ServerEntity] = Nil
}
