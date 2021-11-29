import org.junit.Test
import org.junit.Assert.*
import org.scalatest.flatspec.AnyFlatSpec

class MainTest:
  @Test def t1(): Unit = 
    assertEquals("Message from 'util2' project", util2.msg)

class MessageSpec extends AnyFlatSpec {

  "Message call to util2 project" should "retrieve message from util2 project" in {
    assert(util2.msg === "Message from 'util2' project")
  }

  it should "not return an empty message" in {
    assert(util2.msg !== "")
  }
}