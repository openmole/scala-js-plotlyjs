package com.definitelyscala.plotlyjs

package object all extends symbols.PlotSymbols {

  import com.definitelyscala.plotlyjs.HistogramDataBuilder._

  def plotlyline = PlotLine

  def plotlymarker = PlotMarker

  def plotlycolor = Color

  def plotlysizemode = SizeMode

  def plotlycolorscale = ColorScale

  def plotlysymbol = PlotSymbol

  def plotlyaxis = Axis

  def plotlymode = PlotMode

  def plotlytype = PlotType

  // Linechart objects
  def linechart = PlotData

  implicit class PlotDataAPI(plotDataBuilder: PlotDataBuilder) {
    def lines = plotDataBuilder.set(plotlymode.markers.lines)

    def text = plotDataBuilder.set(plotlymode.markers.text)

    def marker(marker: PlotMarker) = plotDataBuilder.set(marker)
  }

  implicit class PlotMarkerAPI(plotMarkerBuilder: PlotMarkerBuilder) {

    def symbol(symbol: PlotSymbol) = plotMarkerBuilder.set(symbol)

    def color(color: Color) = plotMarkerBuilder.set(color)

    def sizeMode(sizeMode: SizeMode) = plotMarkerBuilder.set(sizeMode)

    def colorScale(colorScale: ColorScale) = plotMarkerBuilder.set(colorScale)

  }

  // Histogram objects
  def histogram = PlotData.set(plotlytype.histogram).histnorm(HistNorm.default)

  def bin = Bin

  def scatter = PlotData.set(plotlytype.scatter).set(plotlymode.markers)

  def box = PlotData.set(plotlytype.box)

  def splom = PlotData.set(plotlytype.splom)

  def heatmap = PlotData.set(plotlytype.heatmap)

  // implicit def plotDataToHistogram(plotDataBuilder: PlotDataBuilder): HistogramDataBuilder = plotDataBuilder.asInstanceOf[HistogramDataBuilder]
}
