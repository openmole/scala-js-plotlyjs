package com.definitelyscala.plotlyjs

package object all {

  import com.definitelyscala.plotlyjs.HistogramDataBuilder._

  def plotlyline = PlotLine

  def plotlymarker = PlotMarker

  def plotlycolor = Color

  def plotlysizemode = SizeMode

  def plotlycolorscale = ColorScale

  def plotlysymbol = Symbol

  def plotlyaxis = Axis

  def plotlymode = PlotMode

  def plotlytype = PlotType

  // Linechart objects
  def linechart = PlotData

  // Histogram objects
  def histogram = PlotData.set(plotlytype.histogram).histnorm(HistNorm.default)

  def bin = Bin

  def scatter = PlotData.set(plotlytype.scatter)

  def box = PlotData.set(plotlytype.box)

  def splom = PlotData.set(plotlytype.splom)

  def heatmap = PlotData.set(plotlytype.heatmap)

  // implicit def plotDataToHistogram(plotDataBuilder: PlotDataBuilder): HistogramDataBuilder = plotDataBuilder.asInstanceOf[HistogramDataBuilder]
}
