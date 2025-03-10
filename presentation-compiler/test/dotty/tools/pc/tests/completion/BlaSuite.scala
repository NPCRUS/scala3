package dotty.tools.pc.tests.completion

import dotty.tools.pc.base.BaseCompletionSuite
import scala.meta.pc.CompletionItemPriority
import org.junit.Test

class BlaSuite  extends BaseCompletionSuite:
  @Test
  def t = 
    check(
      """
      |object M:
      |  val VersionRegex = "".r
      |  Ver@@"1234"
      """.stripMargin,
      "|VersionRegex".stripMargin,
    )
