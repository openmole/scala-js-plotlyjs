package com.definitelyscala.plotlyjs

import scala.concurrent.ExecutionContext.Implicits.global
import org.scalajs.dom.raw._

import scala.concurrent.Future
import scala.scalajs.js.Date

import scala.scalajs.js
import js.|

@js.native
trait PlotlyStatic extends js.Object {
  val Plots: StaticPlots = js.native
  type Root = String | HTMLElement
  def newPlot(root: Root, scatterData: js.Array[PlotData], layout: js.UndefOr[Layout] = js.undefined, config: js.UndefOr[Config] = js.undefined): PlotlyHTMLElement = js.native
  def plot(root: Root, data: js.Array[PlotData], layout: js.UndefOr[Layout] = js.undefined, config: js.UndefOr[Config] = js.undefined): PlotlyHTMLElement = js.native
  def relayout(root: Root, layout: Option[Layout]): Future[PlotlyHTMLElement] = js.native
  def redraw(root: Root): Future[PlotlyHTMLElement] = js.native
  def purge(root: Root): Unit = js.native
  val d3: js.Any = js.native
  def restyle(root: Root, aobj: Option[Data], traces: js.Array[Double] | Double = ???): Future[PlotlyHTMLElement] = js.native
  def update(root: Root, traceUpdate: Option[Data], layoutUpdate: Option[Layout], traces: js.Array[Double] | Double = ???): Future[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Option[Data] | js.Array[Option[Data]], newIndices: js.Array[Double] | Double = ???): Future[PlotlyHTMLElement] = js.native
  def deleteTraces(root: Root, indices: js.Array[Double] | Double): Future[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[Double] | Double, newIndices: js.Array[Double] | Double = ???): Future[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: Option[Data] | js.Array[Option[Data]], indices: Double | js.Array[Double]): Future[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: Option[Data] | js.Array[Option[Data]], indices: Double | js.Array[Double]): Future[PlotlyHTMLElement] = js.native
  def toImage(root: Root, opts: ToImgopts): Future[String] = js.native
  def downloadImage(root: Root, opts: DownloadImgopts): Future[String] = js.native
  type AxisType = String
  type ModeBarButtons = String
  type Datum = String | Double | Date | Int
  type Dash = String
  type Data = Option[PlotData]
  type Color = String | js.Array[String | Unit | Null] | js.Array[js.Array[String | Unit | Null]]
}