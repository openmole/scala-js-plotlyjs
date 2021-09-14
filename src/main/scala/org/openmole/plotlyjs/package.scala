package org.openmole.plotlyjs

import org.openmole.plotlyjs.ScatterPolar.Toself

package object all extends symbols.PlotSymbols {

  import HistogramDataBuilder._
  import ScatterPolarDataBuilder._
  import ScatterPolar._

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

  def diagonal = Diagonal

  def polar = PolarLayout

  def ternary = TernaryLayout

  def shape = Shape

  def dimension = Dimension

  // Linechart objects
  def linechart = PlotData

  implicit class PlotDataAPI(plotDataBuilder: PlotDataBuilder) {
    def lines = plotDataBuilder.setMode(plotmode.markers.lines)

    def text = plotDataBuilder.setMode(plotmode.markers.text)

    def marker(marker: PlotMarker) = plotDataBuilder.set(marker)
  }

  implicit class PlotMarkerAPI(plotMarkerBuilder: PlotMarkerBuilder) {

    def symbol(symbol: PlotSymbol) = plotMarkerBuilder.set(symbol)

    def line(line: PlotLine) = plotMarkerBuilder.set(line)

    def color(color: Color) = plotMarkerBuilder.set(color)

    def sizeMode(sizeMode: SizeMode) = plotMarkerBuilder.set(sizeMode)

    def colorScale(colorScale: ColorScale) = plotMarkerBuilder.set(colorScale)

  }

  // Histogram objects
  def histogram = PlotData.set(plottype.histogram).histnorm(HistNorm.default)

  def bin = Bin

  def scatter = PlotData.set(plottype.scatter).setMode(plotmode.markers)

  def scatter3d = PlotData.set(plottype.scatter3d)

  def scatterPolar = PlotData.set(plottype.scatterPolar).fillPolar(toself)

  def scatterTernary = PlotData.set(plottype.scatterTernary)

  def box = PlotData.set(plottype.box)

  def splom = PlotData.set(plottype.splom)

  def heatmap = PlotData.set(plottype.heatmap)

  def parallelCoordinates = PlotData.set(plottype.parallelCoordinates)

}
