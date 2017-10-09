package com.definitelyscala.plotlyjs

package object plotlyConts {

  type PlotMode = String

  object PlotMode {
    val LINES: PlotMode = "lines"
    val MARKERS: PlotMode = "markers"
    val TEXT: PlotMode = "text"
    val NONE: PlotMode = "none"
  }

}
