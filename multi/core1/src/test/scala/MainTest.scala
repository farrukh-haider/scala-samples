import org.junit.Test
import org.junit.Assert.*
import org.scalatest.flatspec.AnyFlatSpec

class MainTest:
  @Test def t1(): Unit = 
    assertEquals("Message from 'core1' project", core1.msg)

class MessageSpec extends AnyFlatSpec {

  "Message call to core1 project" should "retrieve message from core1 project" in {
    assert(core1.msg === "Message from 'core1' project")
  }

  it should "not return an empty message" in {
    assert(core1.msg !== "")
  }
}