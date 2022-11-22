package org.openmole.plotlyjs

import scala.scalajs.js
import scala.scalajs.js.Date
import scala.scalajs.js.annotation.JSGlobal
import js.{ Array, | }

//@js.native
//@JSGlobal
//object Plotly extends js.Object {
//  def Plotly: PlotlyStatic = js.native
//}

object PlotlyTypes {
  type ModeBarButtons = String
  type Datum = String | Double | Date | Int
  type DatumNumeric = Int | Double
  type DatumArray = js.Array[String] | js.Array[Double] | js.Array[Date] | js.Array[Int]
  type DatumNumericArray = Array[Double] | Array[Int]
  type DatumMatrix = js.Array[js.Array[String]] | js.Array[js.Array[Double]] | js.Array[js.Array[Date]] | js.Array[js.Array[Int]]
  type AllDatum = Datum | DatumArray
  type DimensionArray = js.Array[Dimension]
  type Dash = String
}