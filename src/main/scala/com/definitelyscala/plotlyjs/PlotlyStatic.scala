package com.definitelyscala.plotlyjs

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait PlotlyStatic extends js.Object {
  def newPlot(divid: String | HTMLElement, data: js.Array[js.Any], layout: js.Any = js.native, config: PlotlyConfig = js.native): Unit = js.native
}