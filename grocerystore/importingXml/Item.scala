package com.varun.grocerystore.importingXml

import scala.xml.Node

case class Item(id: Int, name: String, amount: Double, stock: Double)

object Item {

  def toItemXML(obj: Node): Item = {
    Item((obj \\ "id").text.toInt, (obj \\ "name").text, (obj \\ "amount").text.toDouble, (obj \\ "stock").text.toDouble)
  }

}
