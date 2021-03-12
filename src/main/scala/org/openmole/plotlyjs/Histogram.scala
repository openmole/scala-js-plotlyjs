package org.openmole.plotlyjs

import org.querki.jsext.{ JSOptionBuilder, OptMap, noOpts }

import scala.scalajs.js

object HistNorm {
  type HistNorm = String

  def default = ""

  def percent = "percent"

  def probability = "probability"

  def density = "density"

  def probabilityDensity = "probability density"
}

import HistNorm._

@js.native
trait HistogramData extends js.Object {

  // Histograms
  val nbinsx: js.UndefOr[Int] = js.native
  val nbinsy: js.UndefOr[Int] = js.native
  val xbins: js.UndefOr[Bin] = js.native
  val ybins: js.UndefOr[Bin] = js.native
  val histnorm: js.UndefOr[HistNorm] = js.native

}

object HistogramDataBuilder {
  implicit class HistogramDataBuilder(plotDataBuilder: PlotDataBuilder) extends PlotDataBuilder(plotDataBuilder.dict) {

    def nbinsx(v: Int): HistogramDataBuilder = plotDataBuilder.asJsOpt("nbinsx", v)

    def nbinsy(v: Int): HistogramDataBuilder = plotDataBuilder.asJsOpt("nbinsy", v)

    def xbins(v: Bin): HistogramDataBuilder = plotDataBuilder.asJsOpt("xbins", v)

    def ybins(v: Bin): HistogramDataBuilder = plotDataBuilder.asJsOpt("ybins", v)

    def histnorm(v: HistNorm): HistogramDataBuilder = plotDataBuilder.asJsOpt("histnorm", v)
  }

}

@js.native
trait Bin extends js.Object {
  val start: js.UndefOr[Double] = js.native

  val end: js.UndefOr[Double] = js.native

  val size: js.UndefOr[Int] = js.native
}

object Bin extends BinBuilder(noOpts)

class BinBuilder(val dict: OptMap) extends JSOptionBuilder[Bin, BinBuilder](new BinBuilder(_)) {

  def start(v: Double) = jsOpt("start", v)

  def end(v: Double) = jsOpt("end", v)

  def size(v: Double) = jsOpt("size", v)
}
