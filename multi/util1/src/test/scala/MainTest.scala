import org.junit.Test
import org.junit.Assert.*
import org.scalatest.flatspec.AnyFlatSpec

class MainTest:
  @Test def t1(): Unit = 
    assertEquals("Message from 'util1' project", util1.msg)

class MessageSpec extends AnyFlatSpec {

  "Message call to util1 project" should "retrieve message from util1 project" in {
    assert(util1.msg === "Message from 'util1' project")
  }

  it should "not return an empty message" in {
    assert(util1.msg !== "")
  }
}