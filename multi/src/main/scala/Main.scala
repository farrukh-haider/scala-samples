@main def hello: Unit = 
  println("Hello from the 'main' project!")
  println(s"$msg, called from 'main' project")
  println(s"${core1.msg}, called from 'main' project")
  println(s"${util1.msg}, called from 'main' project")

def msg = "Message from 'main' project"