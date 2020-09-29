package org.openmole.plotlyjs

import org.openmole.plotlyjs.ScatterPolar.Toself

package object all extends symbols.PlotSymbols {

  import HistogramDataBuilder._
  import SplomDataBuilder._
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

  def radialaxis = RadialAxis

  def angularaxis = AngularAxis

  def shape = Shape

  // Linechart objects
  def linechart = PlotData

  implicit class PlotDataAPI(plotDataBuilder: PlotDataBuilder) {
    def lines = plotDataBuilder.set(plotmode.lines)

    def text = plotDataBuilder.set(plotmode.text)

    def marker(marker: PlotMarker) = plotDataBuilder.set(plotmode.markers)
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

  def scatterpolar = PlotData.set(plottype.scatterpolar).fillPolar(toself)

  def box = PlotData.set(plottype.box)

  def splom = PlotData.set(plottype.splom)

  def heatmap = PlotData.set(plottype.heatmap)

}
