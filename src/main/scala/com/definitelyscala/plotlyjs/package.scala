package com.definitelyscala.plotlyjs

package object all extends symbols.PlotSymbols {

  import com.definitelyscala.plotlyjs.HistogramDataBuilder._

  def line = PlotLine

  def marker = PlotMarker

  def color = Color

  def sizemode = SizeMode

  def colorscale = ColorScale

  def ysymbol = PlotSymbol

  def axis = Axis

  def plotmode = PlotMode

  def plottype = PlotType

  def grid = Grid

  // Linechart objects
  def linechart = PlotData

  implicit class PlotDataAPI(plotDataBuilder: PlotDataBuilder) {
    def lines = plotDataBuilder.set(plotmode.markers.lines)

    def text = plotDataBuilder.set(plotmode.markers.text)

    def marker(marker: PlotMarker) = plotDataBuilder.set(marker)
  }

  implicit class PlotMarkerAPI(plotMarkerBuilder: PlotMarkerBuilder) {

    def symbol(symbol: PlotSymbol) = plotMarkerBuilder.set(symbol)

    def color(color: Color) = plotMarkerBuilder.set(color)

    def sizeMode(sizeMode: SizeMode) = plotMarkerBuilder.set(sizeMode)

    def colorScale(colorScale: ColorScale) = plotMarkerBuilder.set(colorScale)

  }

  // Histogram objects
  def histogram = PlotData.set(plottype.histogram).histnorm(HistNorm.default)

  def bin = Bin

  def scatter = PlotData.set(plottype.scatter).set(plotmode.markers)

  def box = PlotData.set(plottype.box)

  def splom = PlotData.set(plottype.splom)

  def heatmap = PlotData.set(plottype.heatmap)

}
