package scala.scalanative
package sbtplugin

import java.lang.System.{lineSeparator => nl}

import scala.language.postfixOps

import sbt._

object Utilities {
  implicit class RichLogger(logger: Logger) {
    def toLogger: build.Logger =
      build.Logger(logger.debug(_),
                   logger.info(_),
                   logger.warn(_),
                   logger.error(_))

    def running(command: Seq[String]): Unit =
      logger.debug("running" + nl + command.mkString(nl + "\t"))
  }
}
