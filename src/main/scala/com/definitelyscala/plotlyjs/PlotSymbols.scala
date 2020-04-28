package com.definitelyscala.plotlyjs

object PlotSymbol {
  type SymbolType = String

  def apply(s: SymbolType) = new PlotSymbol {
    def toJS: SymbolType = s
  }

  def dot(s: SymbolType) = new Dotable {
    def toJS: SymbolType = s
  }

  def open(s: SymbolType) = new Openable {
    def toJS: SymbolType = s
  }

  def openonly(s: SymbolType) = new OpenableOnly {
    def toJS: SymbolType = s
  }

  def top(s: SymbolType) = new TopSymbol {
    def toJS: SymbolType = s
  }

  def orientable(s: SymbolType) = new Orientable {
    def toJS: SymbolType = s
  }

  def compassable(s: SymbolType) = new Compassable {
    def toJS: SymbolType = s
  }

  def toporientable(s: SymbolType) = new TopOrientable {
    def toJS: SymbolType = s
  }

  def topcompassable(s: SymbolType) = new TopCompassable {
    def toJS: SymbolType = s
  }

  def topUpAndDown(s: SymbolType) = new TopUpAndDown {
    def toJS: SymbolType = s
  }
}

package symbols {

  import PlotSymbol._

  trait PlotSymbols {
    def circle = top("circle") // 0
    def square = top("square") // 1
    def diamond = top("diamond") // 2
    def cross = top("cross") // 3
    def x = top("x") // 4
    def triangleUp = toporientable("triangle").up // 5
    def triangleDown = toporientable("triangle").down // 6
    def triangleLeft = toporientable("triangle").left // 7
    def triangleRight = toporientable("triangle").right // 8
    def triangleNE = topcompassable("triangle").ne // 9
    def triangleSE = topcompassable("triangle").se // 10
    def triangleSW = topcompassable("triangle").sw // 11
    def triangleNW = topcompassable("triangle").nw // 12
    def pentagon = top("pentagon") // 13
    def hexagon = top("hexagon") // 14
    def hexagon2 = top("hexagon2") // 15
    def octogon = top("octogon") // 16
    def star = top("star") // 17
    def hexagram = top("hexagram") // 18
    def startriangleUp = topUpAndDown("star-triangle").up // 19
    def startriangleDown = topUpAndDown("star-triangle").down // 20
    def starsquare = top("star-square") // 21
    def stardiamond = top("star-diamond") // 22
    def diamondtall = top("diamond-tall") // 23
    def diamondwide = top("diamond-wid") // 24
    def hourglass = openonly("hourglass") // 25
    def bowtie = openonly("bowtie") // 26
    def circlecross = openonly("circle-cross") // 27
    def circlex = openonly("circle-x") // 28
    def squarecross = openonly("square-cross") // 29
    def squarex = openonly("square-x") // 30
    def diamondcross = openonly("diamond-cross") // 31
    def diamondx = openonly("diamond-x") // 32
    def crossthin = openonly("cross-thin") // 33
    def xthin = openonly("x-thin") // 34
    def asterisk = openonly("asterisk") // 35
    def hash = top("hash") // 36
    def yUp = orientable("y").up // 37
    def yDown = orientable("y").down // 38
    def yLeft = orientable("y").left // 39
    def yRight = orientable("y").right // 40
    def lineew = compassable("line").ew // 41
    def linens = compassable("line").ns // 42
    def linene = compassable("line").ne // 43
    def linenw = compassable("line").nw // 44
  }
}

import PlotSymbol._

trait PlotSymbol {
  def toJS: SymbolType
}

trait Dotable extends PlotSymbol {
  def dot: PlotSymbol = PlotSymbol(s"$toJS-dot")
}

trait Openable extends PlotSymbol {
  def open: Dotable = PlotSymbol.dot(s"$toJS-open")
}

trait OpenableOnly extends PlotSymbol {
  def open: PlotSymbol = PlotSymbol(s"$toJS-open")
}

trait Upable extends PlotSymbol {
  def up: OpenableOnly = PlotSymbol.openonly(s"$toJS-up")
}

trait Downable extends PlotSymbol {
  def down: OpenableOnly = PlotSymbol.openonly(s"$toJS-down")
}

trait Rightable extends PlotSymbol {
  def right: OpenableOnly = PlotSymbol.openonly(s"$toJS-right")
}

trait Leftable extends PlotSymbol {
  def left: OpenableOnly = PlotSymbol.openonly(s"$toJS-left")
}

trait EWable extends PlotSymbol {
  def ew: OpenableOnly = PlotSymbol.openonly(s"$toJS-ew")
}

trait NSable extends PlotSymbol {
  def ns: OpenableOnly = PlotSymbol.openonly(s"$toJS-ns")
}

trait NEable extends PlotSymbol {
  def ne: OpenableOnly = PlotSymbol.openonly(s"$toJS-ne")
}

trait NWable extends PlotSymbol {
  def nw: OpenableOnly = PlotSymbol.openonly(s"$toJS-nw")
}

trait TopUpable extends PlotSymbol {
  def up: TopSymbol = PlotSymbol.top(s"$toJS-up")
}

trait TopDownable extends PlotSymbol {
  def down: TopSymbol = PlotSymbol.top(s"$toJS-down")
}

trait TopRightable extends PlotSymbol {
  def right: TopSymbol = PlotSymbol.top(s"$toJS-right")
}

trait TopLeftable extends PlotSymbol {
  def left: TopSymbol = PlotSymbol.top(s"$toJS-left")
}

trait TopSWable extends PlotSymbol {
  def sw: TopSymbol = PlotSymbol.top(s"$toJS-sw")
}

trait TopSEable extends PlotSymbol {
  def se: TopSymbol = PlotSymbol.top(s"$toJS-se")
}

trait TopNEtable extends PlotSymbol {
  def ne: TopSymbol = PlotSymbol.top(s"$toJS-ne")
}

trait TopNWable extends PlotSymbol {
  def nw: TopSymbol = PlotSymbol.top(s"$toJS-nw")
}

trait Orientable extends Upable with Downable with Rightable with Leftable

trait Compassable extends EWable with NEable with NWable with NSable

trait TopUpAndDown extends TopUpable with TopDownable

trait TopOrientable extends TopUpable with TopDownable with TopRightable with TopLeftable

trait TopCompassable extends TopSEable with TopNEtable with TopNWable with TopSWable

trait TopSymbol extends Openable with Dotable

trait UpSymbol extends Upable with Openable

trait DownSymbol extends Downable with Openable
