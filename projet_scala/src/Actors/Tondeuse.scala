package Actors


case class Tondeuse(var x: Int, var y: Int, var orientation: Char){


  def moveRight(): Unit = {
    orientation = orientation match {
      case 'N' => 'E'
      case 'E' => 'S'
      case 'W' => 'N'
      case 'S' => 'W'
    }
  }


  def moveLeft(): Unit = {
    orientation = orientation match {
      case 'N' => 'W'
      case 'E' => 'N'
      case 'W' => 'S'
      case 'S' => 'E'
    }
  }


  def moveForward(pelouse: Pelouse): Unit = {
    orientation match {
      case 'N' => if (y + 1 <= pelouse.ylim) y += 1 else y
      case 'E' => if (x + 1 <= pelouse.xlim) x += 1 else x
      case 'W' => if (x - 1 >= 0) x -= 1 else x
      case 'S' => if (y - 1 >= 0) y -= 1 else y
    }
  }

}
