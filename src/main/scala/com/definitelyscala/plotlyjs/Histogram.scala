package com.definitelyscala.plotlyjs

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
  var nbinsx: js.UndefOr[Int] = js.native
  var nbinsy: js.UndefOr[Int] = js.native
  var xbins: js.UndefOr[Bin] = js.native
  var ybins: js.UndefOr[Bin] = js.native
  var histnorm: js.UndefOr[HistNorm] = js.native

}

object HistogramDataBuilder {
  implicit class HistogramDataBuilder(plotDataBuilder: PlotDataBuilder) {

    //  plotDataBuilder.set(com.definitelyscala.plotlyjs.all.plotlytype.histogram)

    def nbinsx(v: Int) = plotDataBuilder.aJsOpt("nbinsx", v)

    def nbinsy(v: Int) = plotDataBuilder.aJsOpt("nbinsy", v)

    def xbins(v: Bin) = plotDataBuilder.aJsOpt("xbins", v)

    def ybins(v: Bin) = plotDataBuilder.aJsOpt("ybins", v)

    def histnorm(v: HistNorm) = plotDataBuilder.aJsOpt("histnorm", v)
  }

}

@js.native
trait Bin extends js.Object {
  var start: js.UndefOr[Double] = js.native

  var end: js.UndefOr[Double] = js.native

  var size: js.UndefOr[Int] = js.native
}

object Bin extends BinBuilder(noOpts)

class BinBuilder(val dict: OptMap) extends JSOptionBuilder[Bin, BinBuilder](new BinBuilder(_)) {

  def start(v: Double) = jsOpt("start", v)

  def end(v: Double) = jsOpt("end", v)

  def size(v: Double) = jsOpt("size", v)
}
