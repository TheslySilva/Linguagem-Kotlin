fun main() {

  var DiaDaSemana = 4

  val dia = when (DiaDaSemana) {

    1 -> "Segunda"
    2 -> "Terca"
    3 -> "Quarta"
    4 -> "Quinta"
    5 -> "Sexta"
    6 -> "Sabado"
    7 -> "Domingo"

    else -> "Dia Invalido"

  }

  println("O dia da semana é : $dia")

}