scala-js-plotlyjs
===============

[![Build Status](https://travis-ci.org/DefinitelyScala/scala-js-plotlyjs.svg?branch=master)](https://travis-ci.org/DefinitelyScala/scala-js-plotlyjs)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.15.svg)](https://www.scala-js.org/)

Scala.js facades for [plotly.js](https://plot.ly/javascript/).

Generated from [TypeScript definitions](https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/plotlyjs) based on plotly.js .

Usage
-----

First, add the JCenter resolver to your build file:
 
```
resolvers += Resolver.jcenterRepo,
```

Then, add it to your SBT dependencies:

```
libraryDependencies += "org.openmole" %%% "scala-js-plotlyjs" % "1.4.2"
```

Classes and traits are available in the package `com.definitelyscala.plotlyjs`, scaladoc is provided.

This project provides Scala.js facades. You will still need to include the JavaScript library source in your web page.

Demo
------
[https://github.com/mathieuleclaire/scala-js-plotlyjs-demo](https://github.com/mathieuleclaire/scala-js-plotlyjs-demo)

Example
-------
```scala
val plotDiv = div.render

  val layout: Layout = Layout
    .title("My beautifull plot")
    .showlegend(true)

  val data = PlotData
    .mode(PlotMode.MARKERS + PlotMode.LINES)

  val data1 = data
    .x(js.Array(1999, 2000, 2001, 2002))
    .y(js.Array(10, 1, 4, 7))
    .customdata(js.Array("one", "two", "three", "four"))
    .marker(plotlymarker.size(12.0).color(plotlycolor("red")))

  val data2 = data
    .x(js.Array(1999, 2000, 2001, 2002))
    .y(js.Array(6, 9, 8, 7))
    .customdata(js.Array[String]("one", "two", "three", "four"))
    .marker(plotlymarker.size(12.0).color(plotlycolor.rgb(0, 136, 170)))

  val config: Config = Config.displayModeBar(false)

  val plot = Plotly.newPlot(plotDiv,
    js.Array(data1, data2),
    layout,
    config)


  plotDiv.on(PlotEvent.HOVER, (d: PointsData) => {
    hoverText() = d.points.map { p => s"${p.x} ${p.y} ${p.customdata}" }.mkString(" and ")
    })


  dom.document.body.appendChild(plotDiv)
```
