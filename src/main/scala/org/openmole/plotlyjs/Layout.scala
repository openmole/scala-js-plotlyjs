package org.openmole.plotlyjs

import org.openmole.plotlyjs.PlotlyStatic.Datum
import org.querki.jsext.{ JSOptionBuilder, OptMap, noOpts }

import scala.scalajs.js
import js._

object DragMode {
  type DragMode = String | Boolean

  def default: DragMode = zoom

  def zoom: DragMode = "zoom"

  def select: DragMode = "select"

  def pan: DragMode = "pan"

  def lasso: DragMode = "lasso"

  def orbit: DragMode = "orbit"

  def turntable: DragMode = "turntable"

  def `false`: DragMode = false
}

object HoverMode {
  type HoverMode = String | Boolean

  def x: HoverMode = "x"

  def y: HoverMode = "y"

  def closest: HoverMode = "closest"

  def `false`: HoverMode = false

  def xUnified: HoverMode = "x unified"

  def yUnified: HoverMode = "y unified"
}

import DragMode._, HoverMode._

object TickType {
  type TickType = String

  val none = ""
  val inside = "inside"
  val outside = "outside"
}

import TickType._

@js.native
trait Layout extends js.Object {
  val title: js.UndefOr[String] = js.native
  val autosize: js.UndefOr[Boolean] = js.native
  val showlegend: js.UndefOr[Boolean] = js.native
  val xaxis: js.UndefOr[Axis] = js.native
  val yaxis: js.UndefOr[Axis] = js.native
  val xaxis2: js.UndefOr[Axis] = js.native
  val yaxis2: js.UndefOr[Axis] = js.native
  val xaxis3: js.UndefOr[Axis] = js.native
  val yaxis3: js.UndefOr[Axis] = js.native
  val xaxis4: js.UndefOr[Axis] = js.native
  val yaxis4: js.UndefOr[Axis] = js.native
  val xaxis5: js.UndefOr[Axis] = js.native
  val yaxis5: js.UndefOr[Axis] = js.native
  val xaxis6: js.UndefOr[Axis] = js.native
  val yaxis6: js.UndefOr[Axis] = js.native
  val xaxis7: js.UndefOr[Axis] = js.native
  val yaxis7: js.UndefOr[Axis] = js.native
  val xaxis8: js.UndefOr[Axis] = js.native
  val yaxis8: js.UndefOr[Axis] = js.native
  val xaxis9: js.UndefOr[Axis] = js.native
  val yaxis9: js.UndefOr[Axis] = js.native
  val xaxis10: js.UndefOr[Axis] = js.native
  val yaxis10: js.UndefOr[Axis] = js.native
  val margin: js.UndefOr[Margin] = js.native
  val height: js.UndefOr[Double] = js.native
  val width: js.UndefOr[Double] = js.native
  val hovermode: js.UndefOr[HoverMode] = js.native
  val dragmode: js.UndefOr[DragMode] = js.native
  val shapes: js.UndefOr[js.Array[Shape]] = js.native
  val legend: js.UndefOr[Legend] = js.native
  val grid: js.UndefOr[Grid] = js.native
  val polar: js.UndefOr[PolarLayout] = js.native
  val ternary: js.UndefOr[TernaryLayout] = js.native
}

object Layout extends LayoutBuilder(noOpts)

class LayoutBuilder(val dict: OptMap) extends JSOptionBuilder[Layout, LayoutBuilder](new LayoutBuilder(_)) {
  def title(v: String) = jsOpt("title", v)

  def hovermode(v: HoverMode) = jsOpt("hovermode", v)

  def dragmode(v: DragMode) = jsOpt("dragmode", v)

  def autosize(v: Boolean) = jsOpt("autosize", v)

  def showlegend(v: Boolean) = jsOpt("showlegend", v)

  def xaxis(v: Axis) = jsOpt("xaxis", v)

  def yaxis(v: Axis) = jsOpt("yaxis", v)

  def xaxis2(v: Axis) = jsOpt("xaxis2", v)

  def yaxis2(v: Axis) = jsOpt("yaxis2", v)

  def xaxis3(v: Axis) = jsOpt("xaxis3", v)

  def yaxis3(v: Axis) = jsOpt("yaxis3", v)

  def xaxis4(v: Axis) = jsOpt("xaxis4", v)

  def yaxis4(v: Axis) = jsOpt("yaxis4", v)

  def xaxis5(v: Axis) = jsOpt("xaxis5", v)

  def yaxis5(v: Axis) = jsOpt("yaxis5", v)

  def xaxis6(v: Axis) = jsOpt("xaxis6", v)

  def yaxis6(v: Axis) = jsOpt("yaxis6", v)

  def xaxis7(v: Axis) = jsOpt("xaxis7", v)

  def yaxis7(v: Axis) = jsOpt("yaxis7", v)

  def xaxis8(v: Axis) = jsOpt("xaxis8", v)

  def yaxis8(v: Axis) = jsOpt("yaxis8", v)

  def xaxis9(v: Axis) = jsOpt("xaxis9", v)

  def yaxis9(v: Axis) = jsOpt("yaxis9", v)

  def xaxis10(v: Axis) = jsOpt("xaxis10", v)

  def yaxis10(v: Axis) = jsOpt("yaxis10", v)

  def margin(v: Margin) = jsOpt("margin", v)

  def height(v: Double) = jsOpt("height", v)

  def width(v: Double) = jsOpt("width", v)

  def shapes(v: js.Array[Shape]) = jsOpt("shapes", v)

  def legend(v: Legend) = jsOpt("legend", v)

  def grid(v: Grid) = jsOpt("grid", v)

  def polar(v: PolarLayout) = jsOpt("polar", v)

  def ternary(v: TernaryLayout) = jsOpt("ternary", v)
}
