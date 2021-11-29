import org.junit.Test
import org.junit.Assert.*
import org.scalatest._
import org.scalatest.featurespec.AnyFeatureSpec

class MainTest:
  @Test def t1(): Unit = 
    assertEquals("Message from 'main' project", msg)

class MessageSpec extends AnyFeatureSpec with GivenWhenThen {

  info("As a multiple projects Sbt tester")
  info("I want to retrieve messages from different projects")
  info("So I can get a message from the main project")
  info("And a different message from a subproject")

  feature("Message from project") {
    scenario("Retrieve message from the main project") {

      Given("a multiple project Sbt build")
      When("the message is retrieved from main project")
      Then("the main project message is retrieved")
      assert("Message from 'main' project" === msg)
    }

    Scenario("Retrieve message from core1 project") {

      Given("a multiple project Sbt build")
      When("the message is retrieved from core1 project")
      Then("the core1 project message is retrieved")
      assert("Message from 'core1' project" === core1.msg)
    }
  }
}