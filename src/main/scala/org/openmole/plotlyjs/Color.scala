package org.openmole.plotlyjs

import scala.scalajs.js
import js.|
import PlotlyTypes._

object Color {
  type ColorType = String | js.Array[String | Unit | Null] | js.Array[js.Array[String | Unit | Null]] | Datum | DatumArray

  def apply(s: ColorType) = new Color {
    def toJS: ColorType = s
  }

  //Ex: rgb(125,11,120)
  def rgb(red: Int, green: Int, blue: Int): Color = Color(s"rgb($red,$green,$blue)")

  //Ex: rgba(125,11,120,0.4)
  def rgba(red: Int, green: Int, blue: Int, alpha: Double): Color = Color(s"rgba($red,$green,$blue,$alpha)")

  // Ex: hsl(220, 95, 21)
  def hsl(hue: Int, saturation: Int, lightness: Int): Color = Color(s"hsl($hue,$saturation%,$lightness%)")

  // Ex: hsl(220, 95, 21)
  def hsv(hue: Int, saturation: Int, value: Int): Color = Color(s"hsv($hue,$saturation%,$value%)")

  // Ex: hex("0021aa")
  def hex(code: ColorType): Color = Color(s"hex(#$code)")

  def array(a: DatumArray): Color = Color(a)
}

import Color._

trait Color {

  def toJS: ColorType
}
