/*
Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
 */
fun main() {
    var idade = 0
    println("Insira idade do atleta:")
    idade = readln().toInt()
    println(idade)

    if (idade >= 5 && idade <= 7) {
        println("Infatil A")

    }
    if (idade >= 8 && idade <= 11) {
        println("Infantil B")

    }
    if (idade >= 12 && idade <= 13) {
        println("Juvenil A")
    }
    if(idade >= 14 && idade <= 17) {
        println("Juvenil B")
    }
    if(idade >= 18) {
        println("Adulto")
    }

}