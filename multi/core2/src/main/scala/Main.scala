object core2 { 
  def main(args: Array[String]): Unit = 
    println("Hello from the 'core2' project!")
    println(s"$msg, called from 'core2' project")
    println(s"${util2.msg}, called from 'core2' project")

  def msg = "Message from 'core2' project"
}