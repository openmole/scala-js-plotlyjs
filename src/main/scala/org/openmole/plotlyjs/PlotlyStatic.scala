package org.openmole.plotlyjs

import scala.concurrent.Future
import scala.scalajs.js.Date

import scala.scalajs.js
import js.|

object PlotlyStatic {
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

@js.native
trait PlotlyStatic extends js.Object {
  type Root = String | PlotlyHTMLElement
  def newPlot(root: Root, scatterData: js.Array[PlotData], layout: js.UndefOr[Layout] = js.undefined, config: js.UndefOr[Config] = js.undefined): Unit = js.native
  def plot(root: Root, data: js.Array[PlotData], layout: js.UndefOr[Layout] = js.undefined, config: js.UndefOr[Config] = js.undefined): Unit = js.native
  def relayout(root: Root, layout: js.UndefOr[Layout] = js.undefined): Unit = js.native
  def redraw(root: Root): Unit = js.native
  def purge(root: Root): Unit = js.native
  val d3: js.Any = js.native
  def restyle(root: Root, aobj: js.Array[PlotData], traces: js.UndefOr[js.Array[Double] | Double] = js.undefined): Future[PlotlyHTMLElement] = js.native
  def update(root: Root, traceUpdate: js.UndefOr[js.Array[PlotData]] = js.undefined, layoutUpdate: js.UndefOr[Layout] = js.undefined, traces: js.UndefOr[js.Array[Double] | Double] = js.undefined): Future[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.UndefOr[PlotData] | js.Array[js.UndefOr[PlotData]] = js.undefined, newIndices: js.Array[Double] | Double = ???): Future[PlotlyHTMLElement] = js.native
  def deleteTraces(root: Root, indices: js.Array[Double] | Double): Future[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[Double] | Double, newIndices: js.Array[Double] | Double = ???): Future[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: js.UndefOr[PlotData] | js.Array[js.UndefOr[PlotData]] = js.undefined, indices: Double | js.Array[Double]): Future[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: js.UndefOr[PlotData] | js.Array[js.UndefOr[PlotData]] = js.undefined, indices: Double | js.Array[Double]): Future[PlotlyHTMLElement] = js.native
  def toImage(root: Root, opts: ToImgopts): Future[String] = js.native
  def downloadImage(root: Root, opts: DownloadImgopts): Future[String] = js.native
}