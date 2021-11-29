import org.junit.Test
import org.junit.Assert.*
import org.scalatest.flatspec.AnyFlatSpec

class MainTest:
  @Test def t1(): Unit = 
    assertEquals("Message from 'core2' project", core2.msg)

class MessageSpec extends AnyFlatSpec {

  "Message call to core2 project" should "retrieve message from core2 project" in {
    assert(core2.msg === "Message from 'core2' project")
  }

  it should "not return an empty message" in {
    assert(core2.msg !== "")
  }
}