package com.definitelyscala.plotlyjs

package object colorscale {

  type ColorScale = String

  def rgb(red: Int, green: Int, blue: Int): ColorScale = s"rgb($red,$green,$blue)"

}
