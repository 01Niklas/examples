package example
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import org.scalatest.freespec.AnyFreeSpec

@RunWith(classOf[JUnitRunner])
class HelloSpec extends AnyFreeSpec {
  "Say" - {
    "hello spec" in {
      print("Hello Spec")
    }
  }
}
