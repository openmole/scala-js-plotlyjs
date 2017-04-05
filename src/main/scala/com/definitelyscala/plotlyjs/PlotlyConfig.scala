package com.definitelyscala.plotlyjs

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PlotlyConfig extends js.Object {
  var staticPlot: Boolean = js.native
  var editable: Boolean = js.native
  var autosizable: Boolean = js.native
  var fillFrame: Boolean = js.native
  var frameMargins: Double = js.native
  var scrollZoom: Boolean = js.native
  var doubleClick: String = js.native
  var showTips: Boolean = js.native
  var showLink: Boolean = js.native
  var sendData: Boolean = js.native
  var linkText: String = js.native
  var showSources: Boolean = js.native
  var displayModeBar: String | Boolean = js.native
  var modeBarButtonsToRemove: js.Array[js.Any] = js.native
  var modeBarButtonsToAdd: js.Array[js.Any] = js.native
  var modeBarButtons: Boolean = js.native
  var displaylogo: Boolean = js.native
  var plotGlPixelRatio: Double = js.native
  var setBackground: js.Any = js.native
  var topojsonURL: String = js.native
  var mapboxAccessToken: String = js.native
  var logging: Boolean = js.native
}