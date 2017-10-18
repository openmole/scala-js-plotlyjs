package com.definitelyscala.plotlyjs

import com.definitelyscala.plotlyjs.Plotly._
import com.definitelyscala.plotlyjs.plotlyConts.PlotMode
import org.scalajs.dom.raw.HTMLElement

import scala.language.implicitConversions
import org.querki.jsext._

import scala.scalajs.js
import js.|
import scala.scalajs.js.annotation.{ JSExportTopLevel, JSGlobal, JSGlobalScope, ScalaJSDefined }

object PlotlyImplicits {
  implicit def elToPlotlyElement[T <: HTMLElement](element: T): PlotlyHTMLElement = element.asInstanceOf[PlotlyHTMLElement]

  implicit def thisBuilderToThis[T <: js.Object, B <: JSOptionBuilder[T, _]](b: B): T = b._result

  implicit def thisBuilderToUndefForThis[T <: js.Object, B <: JSOptionBuilder[T, _]](b: B): js.UndefOr[T] = b._result
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

  def dragmode(v: String) = jsOpt("dragmode", v)

  def shapes(v: js.Array[Shape]) = jsOpt("shapes", v)

  def legend(v: Legend) = jsOpt("legend", v)
}

@js.native
trait Legend extends js.Object {
  var traceorder: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var font: js.UndefOr[Font] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[String] = js.native
  var tracegroupgap: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[String] = js.native
  var yanchor: js.UndefOr[String] = js.native
}

object Legend extends LegendBuilder(noOpts)

class LegendBuilder(val dict: OptMap) extends JSOptionBuilder[Legend, LegendBuilder](new LegendBuilder(_)) {
  def traceorder(v: String) = jsOpt("traceorder", v)

  def x(v: Double) = jsOpt("x", v)

  def y(v: Double) = jsOpt("y", v)

  def font(v: Font) = jsOpt("font", v)

  def bgcolor(v: String) = jsOpt("bgcolor", v)

  def bordercolor(v: String) = jsOpt("bordercolor", v)

  def borderwidth(v: Double) = jsOpt("borderwidth", v)

  def orientation(v: String) = jsOpt("orientation", v)

  def tracegroupgap(v: Double) = jsOpt("tracegroupgap", v)

  def xanchor(v: String) = jsOpt("xanchor", v)

  def yanchor(v: String) = jsOpt("yanchor", v)
}

@js.native
trait Axis extends js.Object {
  var title: js.UndefOr[String] = js.native
  var showgrid: js.UndefOr[Boolean] = js.native
  var fixedrange: js.UndefOr[Boolean] = js.native
  var rangemode: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[AxisType] = js.native
  var tickformat: js.UndefOr[String] = js.native
  var hoverformat: js.UndefOr[String] = js.native
  var rangeslider: js.UndefOr[RangeSlider] = js.native
  var rangeselector: js.UndefOr[RangeSelector] = js.native
  var range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  var showticklabels: js.UndefOr[Boolean] = js.native
  var autotick: js.UndefOr[Boolean] = js.native
  var zeroline: js.UndefOr[Boolean] = js.native
  var autorange: js.UndefOr[Boolean | String] = js.native
}

object Axis extends AxisBuilder(noOpts)

class AxisBuilder(val dict: OptMap) extends JSOptionBuilder[Axis, AxisBuilder](new AxisBuilder(_)) {
  def title(v: String) = jsOpt("title", v)

  def showgrid(v: Boolean) = jsOpt("showgrid", v)

  def fixedrange(v: Boolean) = jsOpt("fixedrange", v)

  def rangemode(v: String) = jsOpt("rangemode", v)

  def `type`(v: AxisType) = jsOpt("type", v)

  def tickformat(v: String) = jsOpt("tickformat", v)

  def hoverformat(v: String) = jsOpt("hoverformat", v)

  def rangeslider(v: RangeSlider) = jsOpt("rangeslider", v)

  def rangeselector(v: RangeSelector) = jsOpt("rangeselector", v)

  def range(v: js.Tuple2[Datum, Datum]) = jsOpt("range", v)

  def showticklabels(v: Boolean) = jsOpt("showticklabels", v)

  def autotick(v: Boolean) = jsOpt("auotick", v)

  def zeroline(v: Boolean) = jsOpt("zeroline", v)

  def autorange(v: Boolean | String) = jsOpt("autorange", v)
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
  val pointNumber: Int = js.native
  val customdata: String = js.native
  val x: Double = js.native
  val y: Double = js.native
  val z: Double = js.native
  val data: PlotData = js.native
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
  var marker: js.UndefOr[PlotMarker] = js.native
  var mode: js.UndefOr[PlotMode] = js.native
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

  def marker(v: PlotMarker) = jsOpt("marker", v)

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
  var symbol: js.UndefOr[String | js.Array[String]] = js.native
  var color: js.UndefOr[Color] = js.native
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  var size: js.UndefOr[Double | js.Array[Double]] = js.native
  var maxdisplayed: js.UndefOr[Double] = js.native
  var sizeref: js.UndefOr[Double] = js.native
  var sizemin: js.UndefOr[Double] = js.native
  var sizemode: js.UndefOr[String] = js.native
  var showscale: js.UndefOr[Boolean] = js.native
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
  var color: js.UndefOr[Color] = js.native
  var width: js.UndefOr[Double] = js.native
  var dash: js.UndefOr[Dash] = js.native
  var shape: js.UndefOr[String] = js.native
  var smoothing: js.UndefOr[Double] = js.native
  var simplify: js.UndefOr[Boolean] = js.native
}

object PlotLine extends PlotLineBuilder(noOpts)

class PlotLineBuilder(val dict: OptMap) extends JSOptionBuilder[PlotLine, PlotLineBuilder](new PlotLineBuilder(_)) {
  def color(v: Color) = jsOpt("color", v)

  def width(v: Double) = jsOpt("width", v)

  def dash(v: Dash) = jsOpt("dash", v)

  def shape(v: String) = jsOpt("shape", v)

  def smoothing(v: Double) = jsOpt("smoothing", v)

  def simplify(v: Boolean) = jsOpt("simplify", v)
}

@js.native
trait Font extends js.Object {
  var family: String = js.native
  var size: Double = js.native
  var color: String = js.native
}

@js.native
trait Config extends js.Object {
  var staticPlot: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var autosizable: js.UndefOr[Boolean] = js.native
  var queueLength: js.UndefOr[Double] = js.native
  var fillFrame: js.UndefOr[Boolean] = js.native
  var frameMargins: js.UndefOr[Double] = js.native
  var scrollZoom: js.UndefOr[Boolean] = js.native
  var doubleClick: js.UndefOr[String] = js.native
  var showTips: js.UndefOr[Boolean] = js.native
  var showLink: js.UndefOr[Boolean] = js.native
  var sendData: js.UndefOr[Boolean] = js.native
  var linkText: js.UndefOr[String] = js.native
  var showSources: js.UndefOr[Boolean] = js.native
  var displayModeBar: js.UndefOr[String | Boolean] = js.native
  var modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarButtons]] = js.native
  var modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButtons]] = js.native
  var modeBarButtons: js.UndefOr[js.Array[js.Array[ModeBarButtons]]] = js.native
  var displaylogo: js.UndefOr[Boolean] = js.native
  var plotGlPixelRatio: js.UndefOr[Double] = js.native
  var setBackground: js.UndefOr[String] = js.native
  var topojsonURL: js.UndefOr[String] = js.native
  var mapboxAccessToken: js.UndefOr[String] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var globalTransforms: js.UndefOr[js.Array[js.Any]] = js.native
}

object Config extends ConfigBuilder(noOpts)
class ConfigBuilder(val dict: OptMap) extends JSOptionBuilder[Config, ConfigBuilder](new ConfigBuilder(_)) {
  def staticPlot(v: Boolean) = jsOpt("staticPlot", v)
  def editable(v: Boolean) = jsOpt("editable", v)
  def autosizable(v: Boolean) = jsOpt("autosizable", v)
  def queueLength(v: Double) = jsOpt("queueLength", v)
  def fillFrame(v: Boolean) = jsOpt("fillFrame", v)
  def frameMargins(v: Double) = jsOpt("frameMargins", v)
  def scrollZoom(v: Boolean) = jsOpt("scrollZoom", v)
  def doubleClick(v: String) = jsOpt("doubleClick", v)
  def showTips(v: Boolean) = jsOpt("showTips", v)
  def showLink(v: Boolean) = jsOpt("showLink", v)
  def sendData(v: Boolean) = jsOpt("sendData", v)
  def linkText(v: String) = jsOpt("linkText", v)
  def showSources(v: Boolean) = jsOpt("showSources", v)
  def displayModeBar(v: String | Boolean) = jsOpt("displayModeBar", v)
  def modeBarButtonsToRemove(v: js.Array[ModeBarButtons]) = jsOpt("modeBarButtonsToRemove", v)
  def modeBarButtonsToAdd(v: js.Array[ModeBarButtons]) = jsOpt("modeBarButtonsToAdd", v)
  def modeBarButtons(v: js.Array[js.Array[ModeBarButtons]]) = jsOpt("modeBarButtons", v)
  def displaylogo(v: Boolean) = jsOpt("displaylogo", v)
  def plotGlPixelRatio(v: Double) = jsOpt("plotGlPixelRatio", v)
  def setBackground(v: String) = jsOpt("setBackground", v)
  def topojsonURL(v: String) = jsOpt("topojsonURL", v)
  def mapboxAccessToken(v: String) = jsOpt("mapboxAccessToken", v)
  def logging(v: Boolean) = jsOpt("logging", v)
  def globalTransforms(v: js.Array[js.Any]) = jsOpt("globalTransforms", v)
}

@js.native
trait RangeSlider extends js.Object {
  var visible: js.UndefOr[Boolean] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var bgcolor: js.UndefOr[String] = js.native
}

object RangeSlider extends RangeSliderBuilder(noOpts)

class RangeSliderBuilder(val dict: OptMap) extends JSOptionBuilder[RangeSlider, RangeSliderBuilder](new RangeSliderBuilder(_)) {
  def visible(v: Boolean) = jsOpt("visible", v)

  def thickness(v: Double) = jsOpt("thickness", v)

  def range(v: js.Tuple2[Datum, Datum]) = jsOpt("range", v)

  def borderwidth(v: Double) = jsOpt("borderwidth", v)

  def bordercolor(v: String) = jsOpt("bordercolor", v)

  def bgcolor(v: String) = jsOpt("bgcolor", v)
}

@js.native
trait RangeSelectorButton extends js.Object {
  var step: js.UndefOr[String] = js.native
  var stepmode: js.UndefOr[String] = js.native
  var count: js.UndefOr[Double] = js.native
  var label: js.UndefOr[String] = js.native
}

object RangeSelectorButton extends RangeSelectorButtonBuilder(noOpts)

class RangeSelectorButtonBuilder(val dict: OptMap) extends JSOptionBuilder[RangeSelectorButton, RangeSelectorButtonBuilder](new RangeSelectorButtonBuilder(_)) {
  def step(v: String) = jsOpt("step", v)

  def stepmode(v: String) = jsOpt("stepmode", v)

  def count(v: Double) = jsOpt("count", v)

  def label(v: String) = jsOpt("label", v)
}

@js.native
trait RangeSelector extends js.Object {
  var buttons: js.UndefOr[js.Array[RangeSelectorButton]] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[String] = js.native
  var y: js.UndefOr[Double] = js.native
  var yanchor: js.UndefOr[String] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var activecolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var font: js.UndefOr[Font] = js.native
}

object RangeSelector extends RangeSelectorBuilder(noOpts)

class RangeSelectorBuilder(val dict: OptMap) extends JSOptionBuilder[RangeSelector, RangeSelectorBuilder](new RangeSelectorBuilder(_)) {
  def buttons(v: js.Array[RangeSelectorButton]) = jsOpt("buttons", v)

  def visible(v: Boolean) = jsOpt("visble", v)

  def x(v: Double) = jsOpt("x", v)

  def xanchor(v: String) = jsOpt("xanchor", v)

  def y(v: Double) = jsOpt("y", v)

  def yanchor(v: String) = jsOpt("yanchor", v)

  def bgcolor(v: String) = jsOpt("bgcolor", v)

  def activecolor(v: String) = jsOpt("activecolor", v)

  def bordercolor(v: String) = jsOpt("bordercolor", v)

  def borderwidth(v: Double) = jsOpt("borderwidth", v)

  def font(v: Font) = jsOpt("font", v)
}