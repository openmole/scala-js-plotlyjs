package com.definitelyscala.plotlyjs

object SizeMode {

  def apply(s: String) = new SizeMode {
    def toJS: String = s
  }

  def diameter = SizeMode("diameter")

  def area = SizeMode("area")

}

trait SizeMode {

  def toJS: String
}
