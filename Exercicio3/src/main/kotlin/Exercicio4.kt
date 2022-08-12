/*
Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo. */
   fun main() {
   var num: Int=0
   var soma: Int=0
   var contador: Int=0
    while(num >=0) {
       println("Digite um numero:")
       num=readln().toInt()
       contador++

       if(num>=0){
          soma+=num

       }
    }

      contador-=1
      println("A soma dos valores : $soma")
      println("A media dos valores : ${soma/contador}")
      println("total de valores lidos $contador")

   }