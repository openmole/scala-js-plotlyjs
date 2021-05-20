package org.openmole.plotlyjs

object PlotModeBuilder {
  type PlotModeType = String

  def linable(s: PlotModeType) = new Linable {
    def toJS: PlotModeType = s"$s+lines"
  }

  def textable(s: PlotModeType) = new Textable {
    def toJS: PlotModeType = s"$s+text"
  }

  def apply(s: PlotModeType) = new PlotSymbol {
    def toJS: PlotModeType = s
  }

  def markable = new Markable {
    def toJS: PlotModeType = "markers"
  }

  def linable: Linable = linable("")

  def textable: Textable = textable("")
}

import PlotModeBuilder._

trait PlotMode {
  def toJS: PlotModeType
}

trait Markable extends PlotMode {
  def lines = linable(toJS)

  def text = textable(toJS)
}

trait Linable extends PlotMode {
  def text = textable(toJS)
}

trait Textable extends PlotMode

object PlotMode {
  val markers = markable
  val lines = linable
  val text = textable
  val markersAndText = textable(markers.toJS)
}
