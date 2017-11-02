package com.definitelyscala.plotlyjs

package object plotlyConts {
  type PlotEvent = String

  object PlotEvent {
    val HOVER: PlotEvent = "plotly_hover"
    val UNHOVER: PlotEvent = "plotly_unhover"
    val CLICK: PlotEvent = "plotly_click"
    val DOUBLE_CLICK: PlotEvent = "plotly_doubleclick"
    val SELECTED: PlotEvent = "plotly_selected"
    val AFTER_PLOT: PlotEvent = "after_plot"
  }

}
