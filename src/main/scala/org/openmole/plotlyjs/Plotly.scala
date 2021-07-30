package org.openmole.plotlyjs

import PlotlyStatic._
import org.openmole.plotlyjs.ScatterPolar.{ Fill, ThetaUnit }
import plotlyConts._
import org.scalajs.dom.raw.HTMLElement
import PlotMode._
import org.openmole.plotlyjs.TickType.TickType

import scala.language.implicitConversions
import org.querki.jsext._

import scala.scalajs.js
import js.{ Array, | }
import scala.scalajs.js.JSConverters.JSRichIterableOnce
import scala.scalajs.js.annotation.{ JSExport, JSGlobal }

object PlotlyImplicits {
  implicit def elToPlotlyElement[T <: HTMLElement](element: T): PlotlyHTMLElement = element.asInstanceOf[PlotlyHTMLElement]

  implicit def thisBuilderToThis[T <: js.Object, B <: JSOptionBuilder[T, _]](b: JSOptionBuilder[T, B]): T = b._result

  implicit def thisBuilderToUndefForThis[T <: js.Object, B <: JSOptionBuilder[T, _]](b: JSOptionBuilder[T, B]): js.UndefOr[T] = b._result
}

@js.native
@JSGlobal
object Plotly extends PlotlyStatic

@js.native
trait PlotlyHTMLElement extends js.Object {
  def on(event: PlotEvent, callback: js.Function1[PointsData, Unit]): Unit

  def on(event: PlotEvent, callback: js.Function0[Unit]): Unit
}

@js.native
trait ToImgopts extends js.Object {
  val format: String = js.native
  val width: Double = js.native
  val height: Double = js.native
}

object ToImgopts extends ToImgoptsBuilder(noOpts)

class ToImgoptsBuilder(val dict: OptMap) extends JSOptionBuilder[ToImgopts, ToImgoptsBuilder](new ToImgoptsBuilder(_)) {
  def format(v: String) = jsOpt("format", v)

  def width(v: Double) = jsOpt("width", v)

  def height(v: Double) = jsOpt("height", v)
}

@js.native
trait DownloadImgopts extends js.Object {
  val format: js.UndefOr[String] = js.native
  val width: js.UndefOr[Double] = js.native
  val height: js.UndefOr[Double] = js.native
  val filename: js.UndefOr[String] = js.native
}

object DownloadImgopts extends DownloadImgoptsBuilder(noOpts)

class DownloadImgoptsBuilder(val dict: OptMap) extends JSOptionBuilder[DownloadImgopts, DownloadImgoptsBuilder](new DownloadImgoptsBuilder(_)) {
  def format(v: String) = jsOpt("format", v)

  def width(v: Double) = jsOpt("width", v)

  def height(v: Double) = jsOpt("height", v)

  def filename(v: String) = jsOpt("filename", v)
}

@js.native
trait Legend extends js.Object {
  val traceorder: js.UndefOr[String] = js.native
  val x: js.UndefOr[Double] = js.native
  val y: js.UndefOr[Double] = js.native
  val font: js.UndefOr[Font] = js.native
  val bgcolor: js.UndefOr[String] = js.native
  val bordercolor: js.UndefOr[String] = js.native
  val borderwidth: js.UndefOr[Double] = js.native
  val orientation: js.UndefOr[String] = js.native
  val tracegroupgap: js.UndefOr[Double] = js.native
  val xanchor: js.UndefOr[String] = js.native
  val yanchor: js.UndefOr[String] = js.native
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

object AxisType {
  type AxisType = String

  val dash: AxisType = "-"
  val linear: AxisType = "linear"
  val log: AxisType = "log"
  val date: AxisType = "date"
  val category: AxisType = "category"
}

object TickMode {
  type TickMode = String

  val linear = "linear"
  val auto = "auto"
  val array = "array"
}

import AxisType._, TickMode._
@js.native
trait Axis extends js.Object {
  val title: js.UndefOr[String] = js.native
  val showgrid: js.UndefOr[Boolean] = js.native
  val fixedrange: js.UndefOr[Boolean] = js.native
  val rangemode: js.UndefOr[String] = js.native
  val `type`: js.UndefOr[AxisType] = js.native
  val tickformat: js.UndefOr[String] = js.native
  val hoverformat: js.UndefOr[String] = js.native
  val rangeslider: js.UndefOr[RangeSlider] = js.native
  val rangeselector: js.UndefOr[RangeSelector] = js.native
  val range: js.UndefOr[js.Array[Datum]] = js.native
  val showticklabels: js.UndefOr[Boolean] = js.native
  val autotick: js.UndefOr[Boolean] = js.native
  val dtick: js.UndefOr[Datum] = js.native
  val tickmode: js.UndefOr[TickMode] = js.native
  val showline: js.UndefOr[Boolean] = js.native
  val zeroline: js.UndefOr[Boolean] = js.native
  val autorange: js.UndefOr[Boolean | String] = js.native
  val overlaying: js.UndefOr[String] = js.native
  val side: js.UndefOr[String] = js.native
  val anchor: js.UndefOr[String] = js.native
  val domain: js.UndefOr[DatumArray | DatumMatrix] = js.native
  val visible: js.UndefOr[Boolean] = js.native
  val gridcolor: js.UndefOr[Color] = js.native
  val ticks: js.UndefOr[TickType] = js.native
  val linewidth: js.UndefOr[Int] = js.native
  val bounds: js.UndefOr[DatumArray] = js.native
}

object Axis extends AxisBuilder(noOpts)

class AxisBuilder(val dict: OptMap) extends JSOptionBuilder[Axis, AxisBuilder](new AxisBuilder(_)) {

  def asJsOpt(n: String, o: Any) = jsOpt(n, o)

  def title(v: String) = jsOpt("title", v)

  def showgrid(v: Boolean) = jsOpt("showgrid", v)

  def fixedrange(v: Boolean) = jsOpt("fixedrange", v)

  def rangemode(v: String) = jsOpt("rangemode", v)

  def `type`(v: AxisType) = jsOpt("type", v)

  def tickformat(v: String) = jsOpt("tickformat", v)

  def hoverformat(v: String) = jsOpt("hoverformat", v)

  def rangeslider(v: RangeSlider) = jsOpt("rangeslider", v)

  def rangeselector(v: RangeSelector) = jsOpt("rangeselector", v)

  def range(v1: Datum, v2: Datum) = jsOpt("range", js.Array(v1, v2))

  def showticklabels(v: Boolean) = jsOpt("showticklabels", v)

  def autotick(v: Boolean) = jsOpt("auotick", v)

  def dtick(v: Datum) = jsOpt("dtick", v)

  def tickmode(v: TickMode) = jsOpt("tickmode", v)

  def zeroline(v: Boolean) = jsOpt("zeroline", v)

  def showline(v: Boolean) = jsOpt("showline", v)

  def autorange(v: Boolean | String) = jsOpt("autorange", v)

  def overlaying(v: String) = jsOpt("overlaying", v)

  def anchor(v: String) = jsOpt("anchor", v)

  def domain(v: DatumArray | DatumMatrix) = jsOpt("domain", v)

  def visible(v: Boolean) = jsOpt("visible", v)

  def gridcolor(v: Color) = jsOpt("gridcolor", v.toJS)

  def ticks(v: TickType) = jsOpt("ticks", v)

  def linewidth(v: Int) = jsOpt("linewidth", v)

  def bounds(v: DatumArray) = jsOpt("bounds", v)

  def scaleanchor(v: String) = jsOpt("scaleanchor", v)
}

object ShapeType {
  type ShapeType = String

  val circle: ShapeType = "circle"

  val path: ShapeType = "path"

  val line: ShapeType = "line"

  val rect: ShapeType = "rect"
}

import ShapeType._

@js.native
trait Shape extends js.Object {
  val visible: Boolean = js.native
  val layer: String = js.native
  val `type`: ShapeType = js.native
  val path: String = js.native
  val xref: String = js.native
  val yref: String = js.native
  val x0: Datum = js.native
  val y0: Datum = js.native
  val x1: Datum = js.native
  val y1: Datum = js.native
  val fillcolor: Color = js.native
  val opacity: Double = js.native
  val line: Option[PlotLine] = js.native
}

object Shape extends ShapeBuilder(noOpts)

class ShapeBuilder(val dict: OptMap) extends JSOptionBuilder[Shape, ShapeBuilder](new ShapeBuilder(_)) {
  def visible(v: Boolean) = jsOpt("visible", v)

  def layer(v: String) = jsOpt("layer", v)

  def `type`(v: ShapeType) = jsOpt("type", v)

  def path(v: String) = jsOpt("path", v)

  def xref(v: String) = jsOpt("xref", v)

  def yref(v: String) = jsOpt("yref", v)

  def x0(v: Datum) = jsOpt("x0", v)

  def y0(v: Datum) = jsOpt("y0", v)

  def x1(v: Datum) = jsOpt("x1", v)

  def y1(v: Datum) = jsOpt("y1", v)

  def fillcolor(v: Color) = jsOpt("fillcolor", v.toJS)

  def opacity(v: Double) = jsOpt("opacity", v)

  def line(v: PlotLine) = jsOpt("line", v)

}

@js.native
trait Annotation extends js.Object {
  val x: Datum = js.native
  val y: Datum = js.native
  val text: String = js.native
  val textangle: Datum = js.native
  val showarrow: Boolean = js.native
}

object Annotation extends AnnotationBuilder(noOpts)

class AnnotationBuilder(val dict: OptMap) extends JSOptionBuilder[Annotation, AnnotationBuilder](new AnnotationBuilder(_)) {
  def x(v: Datum) = jsOpt("x", v)
  def y(v: Datum) = jsOpt("y", v)
  def text(v: String) = jsOpt("text", v)
  def textangle(v: Datum) = jsOpt("textangle", v)
  def showarrow(v: Boolean) = jsOpt("showarrow", v)
}

@js.native
trait Margin extends js.Object {
  val t: Int = js.native
  val b: Int = js.native
  val l: Int = js.native
  val r: Int = js.native
}

object Margin extends MarginBuilder(noOpts)

class MarginBuilder(val dict: OptMap) extends JSOptionBuilder[Margin, MarginBuilder](new MarginBuilder(_)) {
  def t(v: Int) = jsOpt("t", v)

  def b(v: Int) = jsOpt("b", v)

  def l(v: Int) = jsOpt("l", v)

  def r(v: Int) = jsOpt("r", v)
}

@js.native
trait PointsData extends js.Object {
  val points: js.Array[PointData] = js.native
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
trait Dimension extends js.Object {
  val label: js.UndefOr[String] = js.native
  val values: js.UndefOr[DatumArray] = js.native
}

object Dimension extends DimensionBuilder(noOpts)

class DimensionBuilder(val dict: OptMap) extends JSOptionBuilder[Dimension, DimensionBuilder](new DimensionBuilder(_)) {

  def label(v: String) = jsOpt("label", v)

  def values(v: DatumArray | DatumMatrix) = jsOpt("values", v)
}

@js.native
trait PlotData extends js.Object {
  val `type`: js.UndefOr[PlotType.PlotType] = js.native
  val x: js.UndefOr[DatumArray | DatumMatrix] = js.native
  val y: js.UndefOr[DatumArray | DatumMatrix] = js.native
  val z: js.UndefOr[DatumArray | DatumMatrix] = js.native
  val customdata: js.UndefOr[js.Array[String]] = js.native
  val text: js.UndefOr[String | js.Array[String]] = js.native
  val line: js.UndefOr[PlotLine] = js.native
  val marker: js.UndefOr[PlotMarker] = js.native
  val mode: js.UndefOr[PlotMode] = js.native
  val hoveron: js.UndefOr[String] = js.native
  val hoverinfo: js.UndefOr[String] = js.native
  val fill: js.UndefOr[String] = js.native
  val fillcolor: js.UndefOr[String] = js.native
  val legendgroup: js.UndefOr[String] = js.native
  val name: js.UndefOr[String] = js.native
  val connectgaps: js.UndefOr[Boolean] = js.native
  val dimensions: js.UndefOr[DimensionArray] = js.native
  val errorY: js.UndefOr[ErrorY] = js.native
  val xaxis: js.UndefOr[String] = js.native
  val yaxis: js.UndefOr[String] = js.native
}

object PlotData extends PlotDataBuilder(noOpts)

class PlotDataBuilder(val dict: OptMap) extends JSOptionBuilder[PlotData, PlotDataBuilder](new PlotDataBuilder(_)) {

  def asJsOpt(n: String, o: Any) = jsOpt(n, o)

  def x(v: DatumArray | DatumMatrix) = jsOpt("x", v)

  def y(v: DatumArray | DatumMatrix) = jsOpt("y", v)

  def z(v: DatumArray | DatumMatrix) = jsOpt("z", v)

  def customdata(v: js.Array[String]) = jsOpt("customdata", v)

  def text(v: String | js.Array[String]) = jsOpt("text", v)

  def textPosition(v: TextPosition.TextPosition) = jsOpt("textposition", v)

  def line(v: PlotLine) = jsOpt("line", v)

  def set(v: PlotMarker) = jsOpt("marker", v)

  def set(v: DimensionArray) = jsOpt("dimensions", v)

  /*
   * Any combination of "lines", "markers", "text" joined with a "+" OR "none".
   * examples: "lines", "markers", "lines+markers", "lines+markers+text", "none"
   * Determines the drawing mode for this scatter trace.
   * If the provided `mode` includes "text" then the `text` elements appear at the coordinates.
   * Otherwise, the `text` elements appear on hover.
   * If there are less than 20 points, then the default is "lines+markers". Otherwise, "lines".
   *
  */

  def setMode(v: PlotMode) = jsOpt("mode", v.toJS)
  //def set(v: PlotMode.PlotMode) = jsOpt("mode", v.toJS)

  def set(v: PlotType.PlotType) = jsOpt("type", v)

  def hoveron(v: String) = jsOpt("hoveron", v)

  def hoverinfo(v: String) = jsOpt("hoverinfo", v)

  def fill(v: String) = jsOpt("fill", v)

  def fillcolor(v: String) = jsOpt("fillcolor", v)

  def legendgroup(v: String) = jsOpt("legendgroup", v)

  def name(v: String) = jsOpt("name", v)

  def connectgaps(v: Boolean) = jsOpt("connectgaps", v)

  def errorY(v: ErrorY) = jsOpt("error_y", v)

  def xaxis(v: String) = jsOpt("xaxis", v)

  def yaxis(v: String) = jsOpt("yaxis", v)

  //TODO general or create a ParallelCoordinatesDataBuilder ?
  def dimensions(v: DimensionArray) = jsOpt("dimensions", v)

}

@js.native
trait PlotMarker extends js.Object {
  val symbol: js.UndefOr[String | js.Array[String]] = js.native
  val color: js.UndefOr[Color] = js.native
  val colorscale: js.UndefOr[String] = js.native
  val cmin: js.UndefOr[Double] = js.native
  val cmax: js.UndefOr[Double] = js.native
  val line: js.UndefOr[PlotLine] = js.native
  val opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  val size: js.UndefOr[Double | js.Array[Double]] = js.native
  val maxdisplayed: js.UndefOr[Double] = js.native
  val sizeref: js.UndefOr[Double] = js.native
  val sizemin: js.UndefOr[Double] = js.native
  val sizemode: js.UndefOr[SizeMode] = js.native
  val showscale: js.UndefOr[Boolean] = js.native
}

object PlotMarker extends PlotMarkerBuilder(noOpts)

class PlotMarkerBuilder(val dict: OptMap) extends JSOptionBuilder[PlotMarker, PlotMarkerBuilder](new PlotMarkerBuilder(_)) {
  /*
   *  enumerated or array of enumerateds :
   *  "0" | "circle" | "100" | "circle-open" | "200" | "circle-dot" | "300" | "circle-open-dot" |
   *  "1" | "square" | "101" | "square-open" | "201" | "square-dot" | "301" | "square-open-dot" |
   *  "2" | "diamond" | "102" | "diamond-open" | "202" | "diamond-dot" | "302" | "diamond-open-dot" |
   *  "3" | "cross" | "103" | "cross-open" | "203" | "cross-dot" | "303" | "cross-open-dot" |
   *  "4" | "x" | "104" | "x-open" | "204" | "x-dot" | "304" | "x-open-dot" |
   *  "5" | "triangle-up" | "105" | "triangle-up-open" | "205" | "triangle-up-dot" | "305" | "triangle-up-open-dot" |
   *  "6 "| "triangle-down" | "106" | "triangle-down-open" | "206" | "triangle-down-dot" | "306" | "triangle-down-open-dot" |
   *  "7" | "triangle-left" | "107" | "triangle-left-open" | "207" | "triangle-left-dot" | "307" | "triangle-left-open-dot" |
   *  "8" | "triangle-right" | "108" | "triangle-right-open" | "208" | "triangle-right-dot" | "308" | "triangle-right-open-dot" |
   *  "9" | "triangle-ne" | "109" | "triangle-ne-open" | "209" | "triangle-ne-dot" | "309" | "triangle-ne-open-dot" |
   *  "10" | "triangle-se" | "110" | "triangle-se-open" | "210" | "triangle-se-dot" | "310" | "triangle-se-open-dot" |
   *  "11" | "triangle-sw" | "111" | "triangle-sw-open" | "211" | "triangle-sw-dot" | "311" | "triangle-sw-open-dot" |
   *  "12" | "triangle-nw" | "112" | "triangle-nw-open" | "212" | "triangle-nw-dot" | "312" | "triangle-nw-open-dot" |
   *  "13" | "pentagon" | "113" | "pentagon-open" | "213" | "pentagon-dot" | "313" | "pentagon-open-dot" |
   *  "14" | "hexagon"  | "114" | "hexagon-open" | "214" | "hexagon-dot" | "314" | "hexagon-open-dot" |
   *  "15" | "hexagon2" | "115" | "hexagon2-open" | "215" | "hexagon2-dot" | "315" | "hexagon2-open-dot" |
   *  "16" | "octagon"  |"116" | "octagon-open" | "216" | "octagon-dot" | "316" | "octagon-open-dot" |
   *  "17" | "star" | 117" | "star-open" | "217" | "star-dot" | "317" | "star-open-dot" |
   *  "18" | "hexagram" | "118" | "hexagram-open" | "218" | "hexagram-dot" | "318" | "hexagram-open-dot" |
   *  "19" | "star-triangle-up" | "119" | "star-triangle-up-open" | "219" | "star-triangle-up-dot" | "319" | "star-triangle-up-open-dot" |
   *  "20" | "star-triangle-down" | "120" | "star-triangle-down-open" | "220" | "star-triangle-down-dot" | "320" | "star-triangle-down-open-dot" |
   *  "21" | "star-square" | "121" | "star-square-open" | "221" | "star-square-dot" | "321" | "star-square-open-dot" |
   *  "22" | "star-diamond" | "122" | "star-diamond-open" | "222" | "star-diamond-dot" | "322" | "star-diamond-open-dot" |
   *  "23" | "diamond-tall" | "123" | "diamond-tall-open" | "223" | "diamond-tall-dot" | "323" | "diamond-tall-open-dot" |
   *  "24" | "diamond-wide" | "124" | "diamond-wide-open" | "224" | "diamond-wide-dot" | "324" | "diamond-wide-open-dot" |
   *  "25" | "hourglass" | "125" | "hourglass-open" |
   *  "26" | "bowtie" | "126" | "bowtie-open" |
   *  "27" | "circle-cross" | "127" | "circle-cross-open" |
   *  "28" | "circle-x" | "128" | "circle-x-open" |
   *  "29" | "square-cross" | "129" | "square-cross-open" |
   *  "30" | "square-x" | "130" | "square-x-open" |
   *  "31" | "diamond-cross" | "131" | "diamond-cross-open" |
   *  "32" | "diamond-x" | "132" | "diamond-x-open" |
   *  "33" | "cross-thin" | "133" | "cross-thin-open" |
   *  "34" | "x-thin" | "134" | "x-thin-open" |
   *  "35" | "asterisk" | "135" | "asterisk-open" |
   *  "36" | "hash" | "136" | "hash-open" | "236" | "hash-dot" | "336" | "hash-open-dot" |
   *  "37" | "y-up" | "137" | "y-up-open" |
   *  "38" | "y-down" | "138" | "y-down-open" |
   *  "39" | "y-left" | "139" | "y-left-open" |
   *  "40" | "y-right" | "140" | "y-right-open" |
   *  "41" | "line-ew" | "141" | "line-ew-open" |
   *  "42" | "line-ns" | "142" | "line-ns-open" |
   *  "43" | "line-ne" | "143" | "line-ne-open" |
   *  "44" | "line-nw" | "144" | "line-nw-open" )
   *  default: "circle"
   *
   * Reference: Plotly.js API
   */
  def set(v: PlotSymbol) = jsOpt("symbol", v.toJS)

  /*
   * Sets the marker color.
   * It accepts either a specific color or an array of numbers that are mapped to the
   * colorscale relative to the max and min values of the array or relative to `cmin` and `cmax` if set.
   *
   * Reference: Plotly.js API
   */
  //  def color(v: Color) = jsOpt("color", v.toJS)

  def set(v: Color) = jsOpt("color", v.toJS)

  /*
   * Sets the colorscale and only has an effect if `marker.color` is set to a numerical array.
   * The colorscale must be an array containing arrays mapping a normalized value to an rgb, rgba, hex, hsl, hsv,
   * or named color string. At minimum, a mapping for the lowest (0) and highest (1) values are required.
   * For example, `[[0, 'rgb(0,0,255)', [1, 'rgb(255,0,0)']]`.
   * To control the bounds of the colorscale in color space, use `marker.cmin` and `marker.cmax`.
   * Alternatively, `colorscale` may be a palette name string of the following list: Greys, YlGnBu, Greens, YlOrRd,
   * Bluered, RdBu, Reds, Blues, Picnic, Rainbow, Portland, Jet, Hot, Blackbody, Earth, Electric, Viridis
   *
   * Reference: Plotly.js API
   */
  def set(v: ColorScale) = jsOpt("colorscale", v.toJS)

  def set(l: PlotLine) = jsOpt("line", l)

  /*
   * Number or array of numbers between or equal to 0 and 1)
   * Sets the marker opacity.
   *
   * Reference: Plotly.js API
   */
  def opacity(v: Double | js.Array[Double]) = jsOpt("opacity", v)

  /*
   * Number or array of numbers greater than or equal to 0, default: 6
   * Sets the marker size (in px).
   *
   * Reference: Plotly.js API
   */
  def size(v: Double | js.Array[Double]) = jsOpt("size", v)

  /*
   * Number greater than or equal to 0, default: 0
   * Sets a maximum number of points to be drawn on the graph.
   * "0" corresponds to no limit.
   *
   * Reference: Plotly.js API
   */
  def maxdisplayed(v: Double) = jsOpt("maxdisplayed", v)

  /*
   *default: 1
   * Has an effect only if `marker.size` is set to a numerical array.
   * Sets the scale factor used to determine the rendered size of marker points.
   * Use with `sizemin` and `sizemode`.
   * Reference: Plotly.js API
   */
  def sizeref(v: Double) = jsOpt("sizref", v)

  /*
   * default: 0
   * Has an effect only if `marker.size` is set to a numerical array.
   * Sets the minimum size (in px) of the rendered marker points.
   *
   * Reference: Plotly.js API
   */
  def sizemin(v: Double) = jsOpt("sizemin", v)

  /*
   * default: "diameter"
   * Has an effect only if `marker.size` is set to a numerical array.
   * Sets the rule for which the data in `size` is converted to pixels.
   *
   * Reference: Plotly.js API
   */
  def set(v: SizeMode) = jsOpt("sizemode", v.toJS)

  /*
     * Has an effect only if `marker.color` is set to a numerical array.
     * Reverses the color mapping if true (`cmin` will correspond to the last color
     * in the array and `cmax` will correspond to the first color).
     * Reference: Plotly.js API
     */
  def reversescale(v: Boolean) = jsOpt("reversescale", v)

  /*
     * Has an effect only if `marker.color` is set to a numerical array.
     * Sets the lower bound of the color domain.
     * Value should be associated to the `marker.color` array index,
     * and if set, `marker.cmax` must be set as well.
     *
     * Reference: Plotly.js API
     */
  def cmin(v: Double) = jsOpt("cmin", v)

  /*
   * Has an effect only if `marker.color` is set to a numerical array.
   * Sets the upper bound of the color domain.
   * Value should be associated to the `marker.color` array index,
   * and if set, `marker.cmin` must be set as well.
   * Reference: Plotly.js API
   */
  def cmax(v: Double) = jsOpt("cmax", v)

  /*
   * Has an effect only if `marker.color` is set to a numerical array.
   * Determines whether or not a colorbar is displayed.
   *
   * Reference: Plotly.js API
   */
  def showscale(v: Boolean) = jsOpt("showscale", v)
}

@js.native
trait PlotLine extends js.Object {
  val color: js.UndefOr[Color] = js.native
  val width: js.UndefOr[Double] = js.native
  val dash: js.UndefOr[Dash] = js.native
  val shape: js.UndefOr[String] = js.native
  val smoothing: js.UndefOr[Double] = js.native
  val simplify: js.UndefOr[Boolean] = js.native
}

object PlotLine extends PlotLineBuilder(noOpts)

class PlotLineBuilder(val dict: OptMap) extends JSOptionBuilder[PlotLine, PlotLineBuilder](new PlotLineBuilder(_)) {
  def color(v: Color) = jsOpt("color", v.toJS)

  def width(v: Double) = jsOpt("width", v)

  def dash(v: Dash) = jsOpt("dash", v)

  def shape(v: String) = jsOpt("shape", v)

  def smoothing(v: Double) = jsOpt("smoothing", v)

  def simplify(v: Boolean) = jsOpt("simplify", v)
}

@js.native
trait Font extends js.Object {
  val family: String = js.native
  val size: Double = js.native
  val color: String = js.native
}

@js.native
trait Config extends js.Object {
  val staticPlot: js.UndefOr[Boolean] = js.native
  val editable: js.UndefOr[Boolean] = js.native
  val autosizable: js.UndefOr[Boolean] = js.native
  val queueLength: js.UndefOr[Double] = js.native
  val fillFrame: js.UndefOr[Boolean] = js.native
  val frameMargins: js.UndefOr[Double] = js.native
  val scrollZoom: js.UndefOr[Boolean] = js.native
  val doubleClick: js.UndefOr[String] = js.native
  val showTips: js.UndefOr[Boolean] = js.native
  val showLink: js.UndefOr[Boolean] = js.native
  val sendData: js.UndefOr[Boolean] = js.native
  val linkText: js.UndefOr[String] = js.native
  val showSources: js.UndefOr[Boolean] = js.native
  val displayModeBar: js.UndefOr[String | Boolean] = js.native
  val modeBarButtonsToRemove: js.UndefOr[js.Array[ModeBarButtons]] = js.native
  val modeBarButtonsToAdd: js.UndefOr[js.Array[ModeBarButtons]] = js.native
  val modeBarButtons: js.UndefOr[js.Array[js.Array[ModeBarButtons]]] = js.native
  val displaylogo: js.UndefOr[Boolean] = js.native
  val plotGlPixelRatio: js.UndefOr[Double] = js.native
  val setBackground: js.UndefOr[String] = js.native
  val topojsonURL: js.UndefOr[String] = js.native
  val mapboxAccessToken: js.UndefOr[String] = js.native
  val logging: js.UndefOr[Boolean] = js.native
  val globalTransforms: js.UndefOr[js.Array[js.Any]] = js.native
  val responsive: js.UndefOr[Boolean] = js.native
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

  def responsive(v: Boolean) = jsOpt("responsive", v)
}

@js.native
trait RangeSlider extends js.Object {
  val visible: js.UndefOr[Boolean] = js.native
  val thickness: js.UndefOr[Double] = js.native
  val range: js.UndefOr[js.Tuple2[Datum, Datum]] = js.native
  val borderwidth: js.UndefOr[Double] = js.native
  val bordercolor: js.UndefOr[String] = js.native
  val bgcolor: js.UndefOr[String] = js.native
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
  val step: js.UndefOr[String] = js.native
  val stepmode: js.UndefOr[String] = js.native
  val count: js.UndefOr[Double] = js.native
  val label: js.UndefOr[String] = js.native
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
  val buttons: js.UndefOr[js.Array[RangeSelectorButton]] = js.native
  val visible: js.UndefOr[Boolean] = js.native
  val x: js.UndefOr[Double] = js.native
  val xanchor: js.UndefOr[String] = js.native
  val y: js.UndefOr[Double] = js.native
  val yanchor: js.UndefOr[String] = js.native
  val bgcolor: js.UndefOr[String] = js.native
  val activecolor: js.UndefOr[String] = js.native
  val bordercolor: js.UndefOr[String] = js.native
  val borderwidth: js.UndefOr[Double] = js.native
  val font: js.UndefOr[Font] = js.native
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

@js.native
trait ErrorY extends js.Object {
  val array: js.UndefOr[DatumArray] = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object ErrorY extends ErrorYBuilder(noOpts)

class ErrorYBuilder(val dict: OptMap) extends JSOptionBuilder[ErrorY, ErrorYBuilder](new ErrorYBuilder(_)) {
  def array(v: DatumArray) = jsOpt("array", v)

  def visible(v: Boolean) = jsOpt("visible", v)
}
