
package views.html.home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name : String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <title>My Welcome page</title>
</head>
<body>
<p> Welcome """),_display_(/*7.14*/name),format.raw/*7.18*/(""" """),_display_(/*7.20*/lastName),format.raw/*7.28*/(""" """),format.raw/*7.29*/("""to our channel</p>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-07T00:38:59.547
                  SOURCE: D:/SBTProjects/playFramwork/javaFirst/play-samples-play-java-hello-world-tutorial/app/views/home/welcome.scala.html
                  HASH: bc29562666d222cfda0e7eb6e4a51e645be08116
                  MATRIX: 962->1|1090->34|1118->36|1226->118|1250->122|1278->124|1306->132|1334->133
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|39->7|39->7
                  -- GENERATED --
              */
          