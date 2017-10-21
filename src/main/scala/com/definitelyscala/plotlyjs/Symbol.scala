package com.definitelyscala.plotlyjs

object Symbol {
  type SymbolType = String

  def apply(s: SymbolType) = new Symbol {
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

  def toporientable(s: SymbolType) = new TopOrientable {
    def toJS: SymbolType = s
  }

  def topUpAndDown(s: SymbolType) = new TopUpAndDown {
    def toJS: SymbolType = s
  }

  def circle = top("circle") // 0
  def square = top("square") // 1
  def diamond = top("diamond") // 2
  def cross = top("cross") // 3
  def x = top("x") // 4
  def triangleUp = toporientable("triangle").up // 5
  def triangleDown = toporientable("triangle").down // 6
  def triangleLeft = toporientable("triangle").left // 7
  def triangleRight = toporientable("triangle").right // 8
  def pentagon = top("pentagon") // 13
  def hexagon = top("hexagon") // 14
  def hexagon2 = top("hexagon2") // 15
  def octogon = top("octogon") // 16
  def star = top("star") // 17
  def hexagram = top("hexagram") // 18
  def startriangleUp = topUpAndDown("star-triangle").up // 19
  def startriangleDown = topUpAndDown("star-triangle").down // 20
  def yUp = orientable("y").up // 37
  def yDown = orientable("y").down // 38
  def yLeft = orientable("y").left // 39
  def yRight = orientable("y").right // 40
  def starsquare = top("star-square") // 21
  def stardiamond = top("star-diamond") // 22
}

import Symbol._

trait Symbol {
  def toJS: SymbolType
}

trait Dotable <: Symbol {
  def dot: Symbol = Symbol(s"$toJS-dot")
}

trait Openable <: Symbol {
  def open: Dotable = Symbol.dot(s"$toJS-open")
}

trait OpenableOnly <: Symbol {
  def open: Symbol = Symbol(s"$toJS-open")
}

trait Upable <: Symbol {
  def up: OpenableOnly = Symbol.openonly(s"$toJS-up")
}

trait Downable <: Symbol {
  def down: OpenableOnly = Symbol.openonly(s"$toJS-down")
}

trait Rightable <: Symbol {
  def right: OpenableOnly = Symbol.openonly(s"$toJS-right")
}

trait Leftable <: Symbol {
  def left: OpenableOnly = Symbol.openonly(s"$toJS-left")
}

trait TopUpable <: Symbol {
  def up: TopSymbol = Symbol.top(s"$toJS-up")
}

trait TopDownable <: Symbol {
  def down: TopSymbol = Symbol.top(s"$toJS-down")
}

trait TopRightable <: Symbol {
  def right: TopSymbol = Symbol.top(s"$toJS-right")
}

trait TopLeftable <: Symbol {
  def left: TopSymbol = Symbol.top(s"$toJS-left")
}

trait Orientable <: Upable with Downable with Rightable with Leftable
trait TopUpAndDown <: TopUpable with TopDownable
trait TopOrientable <: TopUpable with TopDownable with TopRightable with TopLeftable
trait TopSymbol <: Openable with Dotable
trait UpSymbol <: Upable with Openable
trait DownSymbol <: Downable with Openable

