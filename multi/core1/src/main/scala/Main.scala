object core1 { 
  def main(args: Array[String]): Unit = 
    println("Hello from the 'core1' project!")
    println(s"$msg, called from 'core1' project")

  def msg: String = "Message from 'core1' project"
}