package org.openmole.plotlyjs

import org.openmole.plotlyjs.PlotlyStatic.DatumArray
import org.querki.jsext.{ JSOptionBuilder, OptMap, noOpts }

import scala.scalajs.js
import scala.scalajs.js._

@js.native
trait ScatterTernaryData extends js.Object {

  val a: js.UndefOr[DatumArray] = js.native
  val b: js.UndefOr[DatumArray] = js.native
  val c: js.UndefOr[DatumArray] = js.native
}

object ScatterTernaryDataBuilder {

  implicit def scatterTernaryDataBuilderToPlotData(scatterTernaryDataBuilder: ScatterTernaryDataBuilder): PlotData = scatterTernaryDataBuilder._result

  implicit class ScatterTernaryDataBuilder(val plotDataBuilder: PlotDataBuilder) {

    def a(v: DatumArray) = plotDataBuilder.asJsOpt("a", v)

    def b(v: DatumArray) = plotDataBuilder.asJsOpt("b", v)

    def c(v: DatumArray) = plotDataBuilder.asJsOpt("c", v)

    def _result = plotDataBuilder._result
  }

}

@js.native
trait TernaryLayout extends js.Object {

  val sum: js.UndefOr[Int] = js.native
  val aaxis: js.UndefOr[Axis] = js.native
  val baxis: js.UndefOr[Axis] = js.native
  val caxis: js.UndefOr[Axis] = js.native
}

object TernaryLayout extends TernaryLayoutBuilder(noOpts)

class TernaryLayoutBuilder(val dict: OptMap) extends JSOptionBuilder[TernaryLayout, TernaryLayoutBuilder](new TernaryLayoutBuilder(_)) {
  def sum(v: Int) = jsOpt("sum", v)

  def aaxis(v: Axis) = jsOpt("aaxis", v)

  def baxis(v: Axis) = jsOpt("baxis", v)

  def caxis(v: Axis) = jsOpt("caxis", v)
}