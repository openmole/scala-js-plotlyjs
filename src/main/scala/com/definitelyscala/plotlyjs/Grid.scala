package com.definitelyscala.plotlyjs

import org.querki.jsext.{ JSOptionBuilder, OptMap, noOpts }

import scala.scalajs.js

object RowOrder {
  type RowOrder = String

  def topToBottom = "top to bottom"

  def bottomToTop = "bottom to top"
}

object Pattern {
  type Pattern = String

  def independent = "independent"

  def coupled = "coupled"
}

object XSide {
  type XSide = String

  def bottom = "bottom"

  def bottomPlot = "bottom plot"

  def top = "top"

  def topPlot = "top plot"
}

object YSide {
  type YSide = String

  def left = "left"

  def leftPlot = "left plot"

  def right = "right"

  def rightPlot = "right plot"
}

import RowOrder._, Pattern._, XSide._, YSide._

@js.native
trait Grid extends js.Object {
  val rows: js.UndefOr[Int] = js.native
  val roworder: js.UndefOr[RowOrder] = js.native
  val columns: js.UndefOr[Int] = js.native
  val xaxes: js.UndefOr[String] = js.native
  val yaxes: js.UndefOr[String] = js.native
  val pattern: js.UndefOr[Pattern] = js.native
  val xgap: js.UndefOr[Double] = js.native
  val ygap: js.UndefOr[Double] = js.native
  val xside: js.UndefOr[XSide] = js.native
  val yside: js.UndefOr[YSide] = js.native
}

object Grid extends GridBuilder(noOpts)

class GridBuilder(val dict: OptMap) extends JSOptionBuilder[Grid, GridBuilder](new GridBuilder(_)) {
  def rows(v: Int) = jsOpt("rows", v)

  def rowOrder(v: RowOrder) = jsOpt("roworder", v)

  def columns(v: Int) = jsOpt("columns", v)

  def xaxes(v: String) = jsOpt("xaxes", v)

  def yaxes(v: String) = jsOpt("yaxes", v)

  def pattern(v: Pattern) = jsOpt("pattern", v)

  def xgap(v: Double) = jsOpt("xgap", v)

  def ygap(v: Double) = jsOpt("ygap", v)

  def xside(v: XSide) = jsOpt("xside", v)

  def yside(v: YSide) = jsOpt("yside", v)
}