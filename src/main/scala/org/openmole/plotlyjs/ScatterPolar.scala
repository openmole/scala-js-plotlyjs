package org.openmole.plotlyjs

import org.openmole.plotlyjs.AxisType.AxisType
import org.openmole.plotlyjs.PlotlyTypes._
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

    def r(v: Array[Double]) = plotDataBuilder.asJsOpt("r", v)

    def r0(v: Int | String) = plotDataBuilder.asJsOpt("r0", v)

    def dr(v: Double) = plotDataBuilder.asJsOpt("dr", v)

    def theta(v: DatumArray) = plotDataBuilder.asJsOpt("theta", v)

    def theta0(v: Int | String) = plotDataBuilder.asJsOpt("theta0", v)

    def dtheta(v: Double) = plotDataBuilder.asJsOpt("dtheta", v)

    def thetaunit(v: ThetaUnit) = plotDataBuilder.asJsOpt("thetaunit", v)

    def fillPolar(v: Fill) = plotDataBuilder.asJsOpt("fill", v.value)

    def hovertemplate(v: String | Array[String]) = plotDataBuilder.asJsOpt("hovertemplate", v)

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

  def radialAxis(v: Axis) = jsOpt("radialaxis", v)

  def angularAxis(v: Axis) = jsOpt("angularaxis", v)
}

//@js.native
//trait RadialAxis extends js.Object {
//  val `type`: js.UndefOr[AxisType] = js.native
//}
//
//object RadialAxisBuilder {
//
//  implicit def radialAxisBuilderToAxis(radialAxisBuilder: RadialAxisBuilder): Axis = radialAxisBuilder._result
//
//  implicit class RadialAxisBuilder(val axisBuilder: AxisBuilder) {
//    def _result = axisBuilder._result
//  }
//
//}
//
//@js.native
//trait AngularAxis extends js.Object
//
//object AngularAxisBuilder {
//
//  implicit def angularAxisBuilderToAxis(angularAxisBuilder: AngularAxisBuilder): Axis = angularAxisBuilder._result
//
//  implicit class AngularAxisBuilder(val axisBuilder: AxisBuilder) {
//    def _result = axisBuilder._result
//  }
//
//}