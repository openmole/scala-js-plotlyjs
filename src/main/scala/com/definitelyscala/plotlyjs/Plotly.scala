package com.definitelyscala.plotlyjs

import com.definitelyscala.plotlyjs.Plotly._
import org.scalajs.dom.raw.HTMLElement
import scala.language.implicitConversions
import org.querki.jsext._

import scala.scalajs.js
import js.|
import scala.scalajs.js.annotation.{ JSExportTopLevel, JSGlobal, JSGlobalScope, ScalaJSDefined }

object PlotlyImplicits {
  implicit def elToPlotlyElement[T <: HTMLElement](element: T): PlotlyHTMLElement = element.asInstanceOf[PlotlyHTMLElement]
}

@js.native
@JSGlobal
object Plotly extends PlotlyStatic

@js.native
trait PlotlyHTMLElement extends js.Object {
  def on(event: String, callback: js.Function1[PointsData, Unit]): Unit

  def on(event: String, callback: js.Function0[Unit]): Unit
}

@js.native
trait ToImgopts extends js.Object {
  var format: String = js.native
  var width: Double = js.native
  var height: Double = js.native
}

@js.native
trait DownloadImgopts extends js.Object {
  var format: String = js.native
  var width: Double = js.native
  var height: Double = js.native
  var filename: String = js.native
}

@js.native
trait Layout extends js.Object {
  var title: js.UndefOr[String] = js.native
  var autosize: js.UndefOr[Boolean] = js.native
  var showlegend: js.UndefOr[Boolean] = js.native
  var xaxis: js.UndefOr[Axis] = js.native
  var yaxis: js.UndefOr[Axis] = js.native
  var margin: js.UndefOr[Margin] = js.native
  var height: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var hovermode: js.UndefOr[String] = js.native
  var `xaxis.range`: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  var `xaxis.range[0]`: js.UndefOr[Datum] = js.native
  var `xaxis.range[1]`: js.UndefOr[Datum] = js.native
  var `yaxis.range`: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  var `yaxis.range[0]`: js.UndefOr[Datum] = js.native
  var `yaxis.range[1]`: js.UndefOr[Datum] = js.native
  var `yaxis.type`: js.UndefOr[AxisType] = js.native
  var `xaxis.type`: js.UndefOr[AxisType] = js.native
  var `xaxis.autorange`: js.UndefOr[Boolean] = js.native
  var `yaxis.autorange`: js.UndefOr[Boolean] = js.native
  var dragmode: js.UndefOr[String] = js.native
  var shapes: js.UndefOr[js.Array[Shape]] = js.native
  var legend: js.UndefOr[Legend] = js.native
}

object Layout extends LayoutBuilder(noOpts)

class LayoutBuilder(val dict: OptMap) extends JSOptionBuilder[Layout, LayoutBuilder](new LayoutBuilder(_)) {
  def title(v: String) = jsOpt("title", v)
  def hovermode(v: String) = jsOpt("hovermode", v)
  def autosize(v: Boolean) = jsOpt("autosize", v)
  def showlegend(v: Boolean) = jsOpt("showlegend", v)
  def xaxis(v: Axis) = jsOpt("xaxis", v)
  def yaxis(v: Axis) = jsOpt("yaxis", v)
  def margin(v: Margin) = jsOpt("margin", v)
  def height(v: Double) = jsOpt("height", v)
  def width(v: Double) = jsOpt("width", v)
  def `xaxis.range`(v: js.Tuple2[Datum, Datum]) = jsOpt("xaxis.range", v)
  def `xaxis.range[0]`(v: Datum) = jsOpt("xaxis.range[0]", v)
  def `xaxis.range[1]`(v: Datum) = jsOpt("xaxis.range[1]", v)
  def `yaxis.range`(v: js.Tuple2[Datum, Datum]) = jsOpt("yaxis.range", v)
  def `yaxis.range[0]`(v: Datum) = jsOpt("yaxis.range[0]", v)
  def `yaxis.range[1]`(v: Datum) = jsOpt("yaxis.range[1]", v)
  def `yaxis.type`(v: AxisType) = jsOpt("yaxis.type", v)
  def `xaxis.type`(v: AxisType) = jsOpt("xaxis.type", v)
  def `xaxis.autorange`(v: Boolean) = jsOpt("xaxis.autorange", v)
  def `yaxis.autorange`(v: Boolean) = jsOpt("yaxis.autourang", v)
  def dragmode(v: String) = jsOpt("dragmode", v)
  def shapes(v: js.Array[Shape]) = jsOpt("shapes", v)
  def legend(v: Legend) = jsOpt("legend", v)
}

@js.native
trait Legend extends js.Object {
  var traceorder: String = js.native
  var x: Double = js.native
  var y: Double = js.native
  var font: Option[Font] = js.native
  var bgcolor: String = js.native
  var bordercolor: String = js.native
  var borderwidth: Double = js.native
  var orientation: String = js.native
  var tracegroupgap: Double = js.native
  var xanchor: String = js.native
  var yanchor: String = js.native
}

@js.native
trait Axis extends js.Object {
  var title: String = js.native
  var showgrid: Boolean = js.native
  var fixedrange: Boolean = js.native
  var rangemode: String = js.native
  var `type`: AxisType = js.native
  var tickformat: String = js.native
  var hoverformat: String = js.native
  var rangeslider: Option[RangeSlider] = js.native
  var rangeselector: Option[RangeSelector] = js.native
  var range: js.Tuple2[Datum, Datum] = js.native
  var showticklabels: Boolean = js.native
  var autotick: Boolean = js.native
  var zeroline: Boolean = js.native
  var autorange: Boolean | String = js.native
}

@js.native
trait ShapeLine extends js.Object {
  var color: String = js.native
  var width: Double = js.native
  var dash: Dash = js.native
}

@js.native
trait Shape extends js.Object {
  var visible: Boolean = js.native
  var layer: String = js.native
  var `type`: String = js.native
  var path: String = js.native
  var xref: String = js.native
  var yref: String = js.native
  var x0: Datum = js.native
  var y0: Datum = js.native
  var x1: Datum = js.native
  var y1: Datum = js.native
  var fillcolor: String = js.native
  var opacity: Double = js.native
  var line: Option[ShapeLine] = js.native
}

@js.native
trait Margin extends js.Object {
  var t: Double = js.native
  var b: Double = js.native
  var l: Double = js.native
  var r: Double = js.native
}

@js.native
trait PointsData extends js.Object {
  var points: js.Array[PointData] = js.native
}

@js.native
trait PointData extends js.Object {
  val curveNumber: Int = js.native
  var pointNumber: Int = js.native
  var customdata: String = js.native
  val x: Int = js.native
  val y: Int = js.native
  val z: Int = js.native
}

@js.native
trait PlotData extends js.Object {
  var `type`: js.UndefOr[String] = js.native
  var x: js.UndefOr[js.Array[Datum] | js.Array[js.Array[Datum]]] = js.native
  var y: js.UndefOr[js.Array[Datum] | js.Array[js.Array[Datum]]] = js.native
  var z: js.UndefOr[js.Array[Datum] | js.Array[js.Array[Datum]]] = js.native
  var customdata: js.UndefOr[js.Array[String]] = js.native
  var text: js.UndefOr[String | js.Array[String]] = js.native
  var line: js.UndefOr[PlotLine] = js.native
  var `line.color`: js.UndefOr[Color] = js.native
  var `line.width`: js.UndefOr[Double] = js.native
  var `line.dash`: js.UndefOr[Dash] = js.native
  var `line.shape`: js.UndefOr[String] = js.native
  var `line.smoothing`: js.UndefOr[Double] = js.native
  var `line.simplify`: js.UndefOr[Boolean] = js.native
  var marker: js.UndefOr[PlotMarker] = js.native
  var `marker.symbol`: js.UndefOr[String | js.Array[String]] = js.native
  var `marker.color`: js.UndefOr[Color] = js.native
  var `marker.opacity`: js.UndefOr[Double | js.Array[Double]] = js.native
  var `marker.size`: js.UndefOr[Double | js.Array[Double]] = js.native
  var `marker.maxdisplayed`: js.UndefOr[Double] = js.native
  var `marker.sizeref`: js.UndefOr[Double] = js.native
  var `marker.sizemin`: js.UndefOr[Double] = js.native
  var `marker.sizemode`: js.UndefOr[String] = js.native
  var `marker.showscale`: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var hoveron: js.UndefOr[String] = js.native
  var hoverinfo: js.UndefOr[String] = js.native
  var fill: js.UndefOr[String] = js.native
  var fillcolor: js.UndefOr[String] = js.native
  var legendgroup: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var connectgaps: js.UndefOr[Boolean] = js.native
}

object PlotData extends PlotDataBuilder(noOpts)

class PlotDataBuilder(val dict: OptMap) extends JSOptionBuilder[PlotData, PlotDataBuilder](new PlotDataBuilder(_)) {
  def `type`(v: String) = jsOpt("type", v)

  def x(v: js.Array[Datum] | js.Array[js.Array[Datum]]) = jsOpt("x", v)

  def y(v: js.Array[Datum] | js.Array[js.Array[Datum]]) = jsOpt("y", v)

  def z(v: js.Array[Datum] | js.Array[js.Array[Datum]]) = jsOpt("y", v)

  def customdata(v: js.Array[String]) = jsOpt("customdata", v)

  def text(v: String | js.Array[String]) = jsOpt("text", v)

  def line(v: PlotLine) = jsOpt("line", v)

  def `line.color`(v: Color) = jsOpt("line.color", v)

  def `line.width`(v: Double) = jsOpt("line.width", v)

  def `line.dash`(v: Dash) = jsOpt("line.dash", v)

  def `line.shape`(v: String) = jsOpt("line.shape", v)

  def `line.smoothing`(v: Double) = jsOpt("line.smoothing", v)

  def `line.simplify`(v: Boolean) = jsOpt("line.simplify", v)

  def marker(v: PlotMarker) = jsOpt("marker", v)

  def `marker.symbol`(v: String | js.Array[String]) = jsOpt("marker.symbol", v)

  def `marker.color`(v: Color) = jsOpt("marker.color", v)

  def `marker.opacity`(v: Double | js.Array[Double]) = jsOpt("marker.opacity", v)

  def `marker.size`(v: Double | js.Array[Double]) = jsOpt("marker.size", v)

  def `marker.maxdisplayed`(v: Double) = jsOpt("marker.maxdisplayed", v)

  def `marker.sizeref`(v: Double) = jsOpt("marker.sizeref", v)

  def `marker.sizemin`(v: Double) = jsOpt("marker.sizemin", v)

  def `marker.sizemode`(v: String) = jsOpt("marker.sizemode", v)

  def `marker.showscale`(v: Boolean) = jsOpt("marker.showscale", v)

  def mode(v: String) = jsOpt("mode", v)

  def hoveron(v: String) = jsOpt("hoveron", v)

  def hoverinfo(v: String) = jsOpt("hoverinfo", v)

  def fill(v: String) = jsOpt("fill", v)

  def fillcolor(v: String) = jsOpt("fillcolor", v)

  def legendgroup(v: String) = jsOpt("legendgroup", v)

  def name(v: String) = jsOpt("name", v)

  def connectgaps(v: Boolean) = jsOpt("connectgaps", v)
}

@js.native
trait PlotMarker extends js.Object {
  var symbol: String | js.Array[String] = js.native
  var color: Color = js.native
  var opacity: Double | js.Array[Double] = js.native
  var size: Double | js.Array[Double] = js.native
  var maxdisplayed: Double = js.native
  var sizeref: Double = js.native
  var sizemin: Double = js.native
  var sizemode: String = js.native
  var showscale: Boolean = js.native
}

object PlotMarker extends PlotMarkerBuilder(noOpts)

class PlotMarkerBuilder(val dict: OptMap) extends JSOptionBuilder[PlotMarker, PlotMarkerBuilder](new PlotMarkerBuilder(_)) {
  def symbol(v: String | js.Array[String]) = jsOpt("symbol", v)
  def color(v: Color) = jsOpt("color", v)
  def opacity(v: Double | js.Array[Double]) = jsOpt("opacity", v)
  def size(v: Double | js.Array[Double]) = jsOpt("size", v)
  def maxdisplayed(v: Double) = jsOpt("maxdisplayed", v)
  def sizeref(v: Double) = jsOpt("sizref", v)
  def sizemin(v: Double) = jsOpt("sizemin", v)
  def sizemode(v: String) = jsOpt("sizemode", v)
  def showscale(v: Boolean) = jsOpt("showscale", v)
}

@js.native
trait PlotLine extends js.Object {
  var color: Color = js.native
  var width: Double = js.native
  var dash: Dash = js.native
  var shape: String = js.native
  var smoothing: Double = js.native
  var simplify: Boolean = js.native
}

@js.native
trait Font extends js.Object {
  var family: String = js.native
  var size: Double = js.native
  var color: String = js.native
}

@js.native
trait Config extends js.Object {
  var staticPlot: Boolean = js.native
  var editable: Boolean = js.native
  var autosizable: Boolean = js.native
  var queueLength: Double = js.native
  var fillFrame: Boolean = js.native
  var frameMargins: Double = js.native
  var scrollZoom: Boolean = js.native
  var doubleClick: String = js.native
  var showTips: Boolean = js.native
  var showLink: Boolean = js.native
  var sendData: Boolean = js.native
  var linkText: String = js.native
  var showSources: Boolean = js.native
  var displayModeBar: String | Boolean = js.native
  var modeBarButtonsToRemove: js.Array[ModeBarButtons] = js.native
  var modeBarButtonsToAdd: js.Array[ModeBarButtons] = js.native
  var modeBarButtons: js.Array[js.Array[ModeBarButtons]] = js.native
  var displaylogo: Boolean = js.native
  var plotGlPixelRatio: Double = js.native
  var setBackground: String = js.native
  var topojsonURL: String = js.native
  var mapboxAccessToken: String = js.native
  var logging: Boolean = js.native
  var globalTransforms: js.Array[js.Any] = js.native
}

@js.native
trait RangeSlider extends js.Object {
  var visible: Boolean = js.native
  var thickness: Double = js.native
  var range: js.Tuple2[Datum, Datum] = js.native
  var borderwidth: Double = js.native
  var bordercolor: String = js.native
  var bgcolor: String = js.native
}

@js.native
trait RangeSelectorButton extends js.Object {
  var step: String = js.native
  var stepmode: String = js.native
  var count: Double = js.native
  var label: String = js.native
}

@js.native
trait RangeSelector extends js.Object {
  var buttons: js.Array[Option[RangeSelectorButton]] = js.native
  var visible: Boolean = js.native
  var x: Double = js.native
  var xanchor: String = js.native
  var y: Double = js.native
  var yanchor: String = js.native
  var bgcolor: String = js.native
  var activecolor: String = js.native
  var bordercolor: String = js.native
  var borderwidth: Double = js.native
  var font: Option[Font] = js.native
}