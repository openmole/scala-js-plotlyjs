package org.openmole.plotlyjs

import org.openmole.plotlyjs.PlotlyStatic.{ Datum, DatumArray, DatumNumeric, DatumNumericArray }
import org.querki.jsext.{ JSOptionBuilder, OptMap, noOpts }

import scala.scalajs.js
import scala.scalajs.js._

object ScatterPolar {
  type ThetaUnit = String

  val degrees: ThetaUnit = "degrees"

  val radians: ThetaUnit = "radians"

  val gradians: ThetaUnit = "gradians"

  val none = None()
  val toself = Toself()
  val tonext = Tonext()

  sealed trait Fill {
    def value: String
  }

  case class None() extends Fill {
    def value = "none"
  }

  case class Toself() extends Fill {
    def value = "toself"
  }

  case class Tonext() extends Fill {
    def value = "tonext"
  }

}

import ScatterPolar._

@js.native
trait ScatterPolarData extends js.Object {

  val r: js.UndefOr[Array[Double]] = js.native
  val r0: js.UndefOr[Int | String] = js.native
  val dr: js.UndefOr[Double] = js.native
  val theta: js.UndefOr[DatumArray] = js.native
  val theta0: js.UndefOr[Int | String] = js.native
  val dtheta: js.UndefOr[Double] = js.native
  val thetaunit: js.UndefOr[ThetaUnit] = js.native
  val fillPolar: js.UndefOr[Fill] = js.native
  val hovertemplate: js.UndefOr[String | Array[String]] = js.native
}

object ScatterPolarDataBuilder {

  implicit def scatterPolarDataBuilderToPlotData(scatterPolarDataBuilder: ScatterPolarDataBuilder): PlotData = scatterPolarDataBuilder._result

  implicit class ScatterPolarDataBuilder(val plotDataBuilder: PlotDataBuilder) {

    def r(v: Array[Double]) = plotDataBuilder.aJsOpt("r", v)

    def r0(v: Int | String) = plotDataBuilder.aJsOpt("r0", v)

    def dr(v: Double) = plotDataBuilder.aJsOpt("dr", v)

    def theta(v: DatumArray) = plotDataBuilder.aJsOpt("theta", v)

    def theta0(v: Int | String) = plotDataBuilder.aJsOpt("theta0", v)

    def dtheta(v: Double) = plotDataBuilder.aJsOpt("dtheta", v)

    def thetaunit(v: ThetaUnit) = plotDataBuilder.aJsOpt("thetaunit", v)

    def fillPolar(v: Fill) = plotDataBuilder.aJsOpt("fill", v.value)

    def hovertemplate(v: String | Array[String]) = plotDataBuilder.aJsOpt("hovertemplate", v)

    def _result = plotDataBuilder._result
  }

}

@js.native
trait PolarLayout extends js.Object {

  val bgcolor: js.UndefOr[Color] = js.native

  val sector: js.UndefOr[Array[Double]] = js.native
}

object PolarLayout extends PolarLayoutBuilder(noOpts)

class PolarLayoutBuilder(val dict: OptMap) extends JSOptionBuilder[PolarLayout, PolarLayoutBuilder](new PolarLayoutBuilder(_)) {
  def bgcolor(v: Color) = jsOpt("bgcolor", v.toJS)

  def sector(v: Array[Double]) = jsOpt("sector", v)

  def set(v: RadialAxis) = jsOpt("radialaxis", v)

  def set(v: AngularAxis) = jsOpt("angularaxis", v)
}

object RadialAxisType {
  type RadialAxisType = String

  val dash: RadialAxisType = "-"
  val linear: RadialAxisType = "linear"
  val log: RadialAxisType = "log"
  val date: RadialAxisType = "date"
  val category: RadialAxisType = "category"
}

object TickType {
  type TickType = String

  val none = ""
  val inside = "inside"
  val outside = "outside"
}

import RadialAxisType._, TickType._

@js.native
trait RadialAxis extends js.Object {
  val visible: js.UndefOr[Boolean] = js.native
  val `type`: js.UndefOr[RadialAxisType] = js.native
  val showticklabels: js.UndefOr[Boolean] = js.native
  val ticks: js.UndefOr[TickType] = js.native
  val linewidth: js.UndefOr[Int] = js.native
}

object RadialAxis extends RadialAxisBuilder(noOpts)

class RadialAxisBuilder(val dict: OptMap) extends JSOptionBuilder[RadialAxis, RadialAxisBuilder](new RadialAxisBuilder(_)) {
  def visible(v: Boolean) = jsOpt("visible", v)

  def `type`(v: RadialAxisBuilder) = jsOpt("type", v)

  def showticklabels(v: Boolean) = jsOpt("showticklabels", v)

  def ticks(v: TickType) = jsOpt("ticks", v)

  def linewidth(v: Int) = jsOpt("linewidth", v)
}

@js.native
trait AngularAxis extends js.Object {
  val visible: js.UndefOr[Boolean] = js.native
  val showticklabels: js.UndefOr[Boolean] = js.native
  val gridcolor: js.UndefOr[Color] = js.native
  val ticks: js.UndefOr[TickType] = js.native
  val linewidth: js.UndefOr[Int] = js.native
}

object AngularAxis extends AngularAxisBuilder(noOpts)

class AngularAxisBuilder(val dict: OptMap) extends JSOptionBuilder[AngularAxis, AngularAxisBuilder](new AngularAxisBuilder(_)) {
  def visible(v: Boolean) = jsOpt("visible", v)
  def showticklabels(v: Boolean) = jsOpt("showticklabels", v)
  def gridcolor(v: Color) = jsOpt("color", v.toJS)
  def ticks(v: TickType) = jsOpt("ticks", v)
  def linewidth(v: Int) = jsOpt("linewidth", v)
}
