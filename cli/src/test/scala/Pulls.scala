package scabot
package cli

import org.scalatest.FunSuite
import org.scalatest.concurrent.{ ScalaFutures, IntegrationPatience }

class TestCLI extends FunSuite with ScalaFutures with IntegrationPatience {

  test("at least 5 closed pull requests in scala/scala") {
    whenReady(new CLI("scala").api.closedPullRequests) { pulls =>
      assert(pulls.size > 5)
    }
  }

}
