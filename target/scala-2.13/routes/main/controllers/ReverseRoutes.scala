// @GENERATOR:play-routes-compiler
// @SOURCE:D:/SBTProjects/playFramwork/javaFirst/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Sun Nov 10 18:05:11 SGT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:12
  class ReverseProductsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/create")
    }
  
    // @LINE:25
    def destruct(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:21
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:24
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products/create")
    }
  
    // @LINE:23
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products/edit")
    }
  
    // @LINE:12
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:18
    def showProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productsss/all")
    }
  
    // @LINE:9
    def hello(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:10
    def about(name:String, lastName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("lastName", lastName)))
    }
  
    // @LINE:7
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:17
    def getProduct(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productss/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:16
    def createProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productss/create")
    }
  
  }

  // @LINE:28
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
