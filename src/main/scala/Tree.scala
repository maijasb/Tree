object Tree extends App {
  var defaultValue:Int = 3
  var height = 0
  if (args.length!=0) height = args(0).toInt else height = defaultValue

  println("Here's your tree!")
  //print star
  print(" "*(height-1) + "*")
  println
  //print body
  var i = 2
  while (i <= height) {
    print(" " * (height - i) + "^" * (i * 2 - 1))
    i += 1
    println
  }
  //print leg
  print(" "*(height-1) + "N")
}
