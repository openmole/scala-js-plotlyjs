package org.openmole.plotlyjs

object PlotType {
  type PlotType = String

  val bar: PlotType = "bar"
  val box: PlotType = "box"
  val heatmap: PlotType = "heatmap"
  val area: PlotType = "area"
  val pie: PlotType = "pie"
  val contour: PlotType = "contour"
  val surface: PlotType = "surface"
  val mesh: PlotType = "mesh"
  val histogram: PlotType = "histogram"
  val splom: PlotType = "splom"
  val scatter: PlotType = "scatter"
  val scatter3d: PlotType = "scatter3d"
  val scatterPolar: PlotType = "scatterpolar"
  val scatterTernary: PlotType = "scatterternary"
  val parallelCoordinates: PlotType = "parcoords"

}
