import play.api.libs.json.{ OFormat, Format }

// test file without imports to avoid regressions with missing imports in macros
sealed trait Modifier
case object early extends Modifier
case object mid extends Modifier
case object late extends Modifier
case class Foo( i: Int )
object a {
  import ai.x.play.json.SingletonEncoder.simpleName
  import ai.x.play.json.implicits.formatSingleton
  import ai.x.play.json.{ BaseNameEncoder, NameEncoder }
  implicit val encoder: NameEncoder = BaseNameEncoder()
  implicit def jsonFormat: Format[Modifier] = ai.x.play.json.Jsonx.formatSealed[Modifier]
  implicit def jsonFormat2: OFormat[Foo] = ai.x.play.json.Jsonx.formatCaseClass[Foo]
  implicit def jsonFormat3: Format[Foo] = ai.x.play.json.Jsonx.formatInline[Foo]
}
object b {
  import ai.x.play.json.{ BaseNameEncoder, NameEncoder }
  implicit val encoder: NameEncoder = BaseNameEncoder()
  implicit def jsonFormat4: Format[Foo] = ai.x.play.json.Jsonx.formatAuto[Foo]
}
