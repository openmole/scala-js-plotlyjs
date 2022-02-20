scala-js-plotlyjs
===============

[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.0.0.svg)](https://www.scala-js.org/)

Scala.js facades for [plotly.js](https://plot.ly/javascript/).

Usage
-----

First, add the JCenter resolver to your build file:
 
```
resolvers += Resolver.jcenterRepo,
```

Then, add it to your SBT dependencies:

```
libraryDependencies += "org.openmole" %%% "scala-js-plotlyjs" % "1.6.0"
```

This project provides Scala.js facades. The plotly.js (1.54.1) file resources is embedd in the jars through the jsDependency sbt plugin.


Demo
------
[Plotly demo](https://web.openmole.org/leclaire/plotly-demo.html)

Sources: [https://github.com/openmole/scala-js-plotlyjs-demo](https://github.com/openmole/scala-js-plotlyjs-demo) 

Example
-------
```scala
    val plotDiv = div()

val layout = Layout
  .title("My line plot")
  .showlegend(true)
  .xaxis(axis.title("Time"))
  .yaxis(axis.title("Production"))

val data = linechart.lines

val ref = Utils.randomDoubles(15, 10)

val dataRef = data
  .x((0 to 14).toJSArray)
  .y(ref)
  .marker(marker.symbol(square).color(all.color.rgb(180, 0, 0)).size(12.0))
  .name("Reds")


val dataN = (for (i <- 1 to 6) yield {
  data
    .x((0 to 14).toJSArray)
    .y(ref.map { x => x + Utils.rng.nextDouble * 2 - 1 }.toJSArray)
    .marker(marker.size(10.0).color(all.color.rgb(200, 136, 170)))
    ._result
}).toJSArray


val config = Config.displayModeBar(false)

Plotly.newPlot(plotDiv.ref,
  dataN :+ dataRef._result,
  layout,
  config)

plotDiv

```
