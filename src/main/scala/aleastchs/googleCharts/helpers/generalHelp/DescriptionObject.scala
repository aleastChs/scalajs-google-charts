/****************************************
  *      HELP CLASS TO GOOGLE CHARTS     *
  ****************************************/
package aleastchs.googleCharts.helpers.generalHelp

// trait of a description object
trait DescriptionObjectTrait {
  // A string with the data type of the values of the column
  val columnType: String
  // A label for the column
  val optionalLabel: String
  // An ID for the column
  val optionalId: String
  // TODO:Implement GOOGLEVISUALIZATION ROLE
  // A role for the column
  val optionalRole: String
  // A number (or date) format string specifying how to display the column value
  val optionalPattern: String
}

class DescriptionObject(
                              // columnType must be set
                              override val columnType:       String,
                              // optional variables
                              override val optionalLabel:    String,
                              override val optionalId:       String,
                              override val optionalRole:     String,
                              override val optionalPattern:  String
                            ) extends DescriptionObjectTrait {

  // method: toArray()
  // returns: Array of Strings
  // description: makes an array of the localvariables and returns the array
  def toArray: Array[String] =
  Array(this.columnType, this.optionalLabel, this.optionalId, this.optionalRole, this.optionalPattern)

  // toString method that prints local variables
  override def toString: String = s"DescriptionObject($columnType, $optionalLabel, " +
    s"$optionalId, $optionalRole, $optionalPattern)"
}

object DescriptionObject {
  def apply(
             columnType:      String,
             optionalLabel:   String,
             optionalId:      String,
             optionalRole:    String,
             optionalPattern: String
           ) = new DescriptionObject(
    columnType, optionalLabel, optionalId, optionalRole, optionalPattern
  )

  def apply(columnType: String) =
    new DescriptionObject(columnType, "", "", "", "")
}