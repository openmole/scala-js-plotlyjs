package com.definitelyscala.plotlyjs

object Symbol {
  type SymbolType = String

  def apply(s: SymbolType) = new Symbol {
    def toJS: SymbolType = s
  }

  def dotsymbol(s: SymbolType) = new DotSymbol {
    override def toJS: SymbolType = s
  }
}

import Symbol._

object TopSymbol {
  def apply(s: SymbolType) = new TopSymbol {
    override def toJS: SymbolType = s
  }

  def circle = TopSymbol("circle")
  def square = TopSymbol("square")
  def diamond = TopSymbol("diamond")
  def cross = TopSymbol("cross")
  def x = TopSymbol("x")

}

import Symbol._

trait Symbol {
  def toJS: SymbolType
}

trait DotSymbol <: Symbol {
  def dot: Symbol = Symbol(s"$toJS-dot")
}

trait OpenSymbol <: Symbol {
  def open: DotSymbol = Symbol.dotsymbol(s"$toJS-open")
}

trait TopSymbol <: DotSymbol with OpenSymbol

