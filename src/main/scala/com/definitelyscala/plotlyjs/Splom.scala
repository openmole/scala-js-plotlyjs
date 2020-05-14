package org.openmole.plotlyjs

import org.querki.jsext.{ JSOptionBuilder, OptMap, noOpts }

import scala.scalajs.js

@js.native
trait Diagonal extends js.Object {
  val visible: js.UndefOr[Boolean] = js.native
}

object Diagonal extends DiagonalBuilder(noOpts)

class DiagonalBuilder(val dict: OptMap) extends JSOptionBuilder[Diagonal, DiagonalBuilder](new DiagonalBuilder(_)) {
  def visible(v: Boolean) = jsOpt("visible", v)
}

import Diagonal._

@js.native
trait SplomData extends js.Object {

  // Histograms
  val showupperhalf: js.UndefOr[Boolean] = js.native
  val showlowerhalf: js.UndefOr[Boolean] = js.native
  val diagonal: js.UndefOr[Diagonal] = js.native
}

object SplomDataBuilder {

  implicit class SplomDataBuilder(plotDataBuilder: PlotDataBuilder) {

    def showupperhalf(v: Boolean) = plotDataBuilder.aJsOpt("showupperhalf", v)

    def showlowerhalf(v: Boolean) = plotDataBuilder.aJsOpt("showlowerhalf", v)

    def diagonal(v: Diagonal) = plotDataBuilder.aJsOpt("diagonal", v)

    def diagonalOff = {
      val d: Diagonal = Diagonal.visible(false)
      plotDataBuilder.aJsOpt("diagonal", d)
    }
  }

}