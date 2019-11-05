// @GENERATOR:play-routes-compiler
// @SOURCE:D:/SBTProjects/javaFirst/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Tue Nov 05 02:38:26 SGT 2019


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
