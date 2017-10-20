package com.definitelyscala.plotlyjs

import Plotly._
import scala.scalajs.js
import js.|

object Color {
  type ColorType = String | js.Array[String | Unit | Null] | js.Array[js.Array[String | Unit | Null]] | Datum | DatumArray

  def apply(s: ColorType) = new Color {
    def toJS: ColorType = s
  }

  def rgb(red: Int, green: Int, blue: Int): Color = Color(s"rgb($red,$green,$blue)")

  def array(a: DatumArray) = Color(a)
}

import Color._

trait Color {

  def toJS: ColorType
}
