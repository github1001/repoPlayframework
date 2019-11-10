// @GENERATOR:play-routes-compiler
// @SOURCE:D:/SBTProjects/playFramwork/javaFirst/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Sun Nov 10 18:05:11 SGT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:12
  ProductsController_1: controllers.ProductsController,
  // @LINE:28
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:12
    ProductsController_1: controllers.ProductsController,
    // @LINE:28
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_2, ProductsController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, ProductsController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello""", """controllers.HomeController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about/""" + "$" + """name<[^/]+>/""" + "$" + """lastName<[^/]+>""", """controllers.HomeController.about(name:String, lastName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductsController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/create""", """controllers.ProductsController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productss/create""", """controllers.HomeController.createProduct()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productss/""" + "$" + """id<[^/]+>""", """controllers.HomeController.getProduct(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productsss/all""", """controllers.HomeController.showProduct()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/""" + "$" + """id<[^/]+>""", """controllers.ProductsController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/edit/""" + "$" + """id<[^/]+>""", """controllers.ProductsController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/edit""", """controllers.ProductsController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/create""", """controllers.ProductsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/delete/""" + "$" + """id<[^/]+>""", """controllers.ProductsController.destruct(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_hello3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello")))
  )
  private[this] lazy val controllers_HomeController_hello3_invoker = createInvoker(
    HomeController_2.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_about4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("lastName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_about4_invoker = createInvoker(
    HomeController_2.about(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """about/""" + "$" + """name<[^/]+>/""" + "$" + """lastName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductsController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductsController_index5_invoker = createInvoker(
    ProductsController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "index",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductsController_create6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/create")))
  )
  private[this] lazy val controllers_ProductsController_create6_invoker = createInvoker(
    ProductsController_1.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "create",
      Nil,
      "GET",
      this.prefix + """products/create""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_createProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productss/create")))
  )
  private[this] lazy val controllers_HomeController_createProduct7_invoker = createInvoker(
    HomeController_2.createProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createProduct",
      Nil,
      "GET",
      this.prefix + """productss/create""",
      """ Mongo tests""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_getProduct8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productss/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getProduct8_invoker = createInvoker(
    HomeController_2.getProduct(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getProduct",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """productss/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_showProduct9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productsss/all")))
  )
  private[this] lazy val controllers_HomeController_showProduct9_invoker = createInvoker(
    HomeController_2.showProduct(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showProduct",
      Nil,
      "GET",
      this.prefix + """productsss/all""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ProductsController_show10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_show10_invoker = createInvoker(
    ProductsController_1.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """products/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ProductsController_edit11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_edit11_invoker = createInvoker(
    ProductsController_1.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """products/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProductsController_update12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/edit")))
  )
  private[this] lazy val controllers_ProductsController_update12_invoker = createInvoker(
    ProductsController_1.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "update",
      Nil,
      "POST",
      this.prefix + """products/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProductsController_save13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/create")))
  )
  private[this] lazy val controllers_ProductsController_save13_invoker = createInvoker(
    ProductsController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "save",
      Nil,
      "POST",
      this.prefix + """products/create""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProductsController_destruct14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductsController_destruct14_invoker = createInvoker(
    ProductsController_1.destruct(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductsController",
      "destruct",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """products/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_2.explore)
      }
  
    // @LINE:8
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_2.tutorial)
      }
  
    // @LINE:9
    case controllers_HomeController_hello3_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HomeController_hello3_invoker.call(HomeController_2.hello(name))
      }
  
    // @LINE:10
    case controllers_HomeController_about4_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("lastName", None)) { (name, lastName) =>
        controllers_HomeController_about4_invoker.call(HomeController_2.about(name, lastName))
      }
  
    // @LINE:12
    case controllers_ProductsController_index5_route(params@_) =>
      call { 
        controllers_ProductsController_index5_invoker.call(ProductsController_1.index())
      }
  
    // @LINE:13
    case controllers_ProductsController_create6_route(params@_) =>
      call { 
        controllers_ProductsController_create6_invoker.call(ProductsController_1.create())
      }
  
    // @LINE:16
    case controllers_HomeController_createProduct7_route(params@_) =>
      call { 
        controllers_HomeController_createProduct7_invoker.call(HomeController_2.createProduct())
      }
  
    // @LINE:17
    case controllers_HomeController_getProduct8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HomeController_getProduct8_invoker.call(HomeController_2.getProduct(id))
      }
  
    // @LINE:18
    case controllers_HomeController_showProduct9_route(params@_) =>
      call { 
        controllers_HomeController_showProduct9_invoker.call(HomeController_2.showProduct())
      }
  
    // @LINE:21
    case controllers_ProductsController_show10_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProductsController_show10_invoker.call(ProductsController_1.show(id))
      }
  
    // @LINE:22
    case controllers_ProductsController_edit11_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProductsController_edit11_invoker.call(ProductsController_1.edit(id))
      }
  
    // @LINE:23
    case controllers_ProductsController_update12_route(params@_) =>
      call { 
        controllers_ProductsController_update12_invoker.call(ProductsController_1.update())
      }
  
    // @LINE:24
    case controllers_ProductsController_save13_route(params@_) =>
      call { 
        controllers_ProductsController_save13_invoker.call(ProductsController_1.save())
      }
  
    // @LINE:25
    case controllers_ProductsController_destruct14_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ProductsController_destruct14_invoker.call(ProductsController_1.destruct(id))
      }
  
    // @LINE:28
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
