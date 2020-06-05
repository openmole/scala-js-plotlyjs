package org.openmole.plotlyjs

import scalajs.js
import scalajs.js._

object ColorScale {

  def apply(s: ColorScaleType) = new ColorScale {
    def toJS: ColorScaleType = s
  }

  type ColorScaleType = String

  //  def define(lowerBound: Double, lowerColor: Color, upperBound: Double, upperColor: Color) =
  //    ColorScale(js.Array(js.Array(lowerBound, lowerColor.toJS), js.Array(upperBound, upperColor.toJS)))

  val greys = ColorScale("Greys")
  val ylgNbu = ColorScale("YlGnBu")
  val greens = ColorScale("Greens")
  val ylORrd = ColorScale("YlOrRd")
  val blueRed = ColorScale("Bluered")
  val rdbu = ColorScale("RdBu")
  val reds = ColorScale("Reds")
  val blues = ColorScale("Blues")
  val picnic = ColorScale("Picnic")
  val rainbow = ColorScale("Rainbow")
  val portland = ColorScale("Portland")
  val jet = ColorScale("Jet")
  val hot = ColorScale("Hot")
  val blackbody = ColorScale("Blackbody")
  val earth = ColorScale("Earth")
  val electric = ColorScale("Electric")
  val viridis = ColorScale("Viridis")
}

import ColorScale._

trait ColorScale {

  def toJS: ColorScaleType
}

//   * Sets the colorscale and only has an effect if `marker.color` is set to a numerical array.
//   * The colorscale must be an array containing arrays mapping a normalized value to an rgb, rgba, hex, hsl, hsv,
//   * or named color string. At minimum, a mapping for the lowest (0) and highest (1) values are required.
//   * For example, `[[0, 'rgb(0,0,255)', [1, 'rgb(255,0,0)']]`.
//   * To control the bounds of the colorscale in color space, use `marker.cmin` and `marker.cmax`.
//   * Alternatively, `colorscale` may be a palette name string of the following list: Greys, YlGnBu, Greens, YlOrRd,
//   * Bluered, RdBu, Reds, Blues, Picnic, Rainbow, Portland, Jet, Hot, Blackbody, Earth, Electric, Viridis