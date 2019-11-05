
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.17*/main("Hello")/*1.30*/ {_display_(Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<section id="content">
    <div class="wrapper doc">
        <article>
            <h2>Hello """),_display_(/*5.24*/name),format.raw/*5.28*/("""!</h2>
        </article>
        <aside>
            """),_display_(/*8.14*/commonSidebar()),format.raw/*8.29*/("""
        """),format.raw/*9.9*/("""</aside>
    </div>
</section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-05T02:40:17.242
                  SOURCE: D:/SBTProjects/javaFirst/play-samples-play-java-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 8a9310b37346a2100ae7aa15cb2fe42766a5eadb
                  MATRIX: 948->1|1057->16|1078->29|1117->31|1145->33|1268->130|1292->134|1376->192|1411->207|1447->217
                  LINES: 28->1|33->1|33->1|33->1|34->2|37->5|37->5|40->8|40->8|41->9
                  -- GENERATED --
              */
          