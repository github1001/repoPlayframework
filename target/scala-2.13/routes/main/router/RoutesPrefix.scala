// @GENERATOR:play-routes-compiler
// @SOURCE:D:/SBTProjects/playFramwork/javaFirst/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Sun Nov 10 18:05:11 SGT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
