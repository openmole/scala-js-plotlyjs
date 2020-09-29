package org.openmole.plotlyjs

object PlotMode {
  trait PlotMode {
    def toJS: String
  }

  object markers extends PlotMode {
    def toJS: String = "markers"
  }

  object lines extends PlotMode {
    def toJS = "lines"
  }

  object text extends PlotMode {
    def toJS = "text"
  }

  object markersAndText extends PlotMode {
    def toJS = s"${markers.toJS}+${text.toJS}"
  }

  object linesAndText extends PlotMode {
    def toJS = s"${lines.toJS}+${text.toJS}"
  }

}
