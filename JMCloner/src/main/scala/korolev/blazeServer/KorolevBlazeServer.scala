package korolev.blazeServer

import org.http4s.blaze.http.HttpService
import slogging._

import scala.concurrent.ExecutionContextExecutorService


/**
  * @author Aleksey Fomkin <aleksey.fomkin@gmail.com>
  */
abstract class KorolevBlazeServer(config: BlazeServerConfig = BlazeServerConfig.default)(
  implicit executionContext: ExecutionContextExecutorService
) {
  def service: HttpService
  def start(): Unit = {
    // activate SLF4J backend
    //LoggerConfig.factory = SLF4JLoggerFactory()
    runServer(service, config)
  }
  /*def main(args: Array[String]): Unit = {
    // activate SLF4J backend
    LoggerConfig.factory = SLF4JLoggerFactory()
    val escapedConfig = Option(config).getOrElse(BlazeServerConfig())
    runServer(service, escapedConfig)
  }*/
}
