package Actors

case class Pelouse(var xlim:Int=0,var ylim:Int=0 ) {



  /* Création des dimensions/limites de la pelouse en se basant sur le fichier d'entrée  */
  def Pelouse(coord: String): Unit ={

    val point_supdroit = coord.split(" ")

    this.xlim= point_supdroit(0).toInt
    this.ylim = point_supdroit(1).toInt
  }
}
