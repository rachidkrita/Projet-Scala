package Run

import Actors.Pelouse
import Actors.Tondeuse

object Run extends App{


  val lines = io.Source.fromResource("instructions.txt").getLines()
  val coordonneesTopRight = lines.next()

  val pelouse = Pelouse()
  pelouse.Pelouse(coordonneesTopRight)

  var  i = 1
  while (lines.hasNext) {
    val tondeuseArray = lines.next().split(" ")
    val tondeuse: Tondeuse = new Tondeuse(tondeuseArray(0).toInt, tondeuseArray(1).toInt, tondeuseArray(2).charAt(0))
    val sequenceArray = lines.next().toCharArray
    for (i <- 0 until sequenceArray.length) {
      sequenceArray(i) match {
        case 'G' => tondeuse.moveLeft()
        case 'D' => tondeuse.moveRight()
        case 'A' => tondeuse.moveForward(pelouse)
        case _ => println(sequenceArray(i)," : instruction non reconnue")
      }
    }
    println("Tondeuse " +i+" : "+tondeuse.x+" "+tondeuse.y+" "+tondeuse.orientation)
    i+=1
  }
}
