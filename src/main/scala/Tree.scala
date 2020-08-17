object Tree extends App {
  println("How high do you want your tree?")
  var height = scala.io.StdIn.readInt()

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