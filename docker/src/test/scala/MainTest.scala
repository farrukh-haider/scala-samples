import org.scalatest.flatspec.AnyFlatSpec

class MessageSpec extends AnyFlatSpec {

  "Message call to docker project" should "retrieve message from docker project" in {
    assert(docker.msg === "Message from 'docker' project")
  }

  it should "not return an empty message" in {
    assert(docker.msg !== "")
  }
}