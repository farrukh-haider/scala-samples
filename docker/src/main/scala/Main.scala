object docker { 
  def main(args: Array[String]): Unit = 
    println("Hello from the 'docker' project!")
    println(s"$msg, called from 'docker' project")

  def msg: String = "Message from 'docker' project"
}