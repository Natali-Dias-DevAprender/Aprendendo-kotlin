fun main() {
    /*
    3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
     */
         var num1: Int
         var num2: Int
         var num3: Int
         var num4 :Int

         print("Digite valor num1:")
         num1= readln().toInt()

         print("Digite valor num2:")
         num2= readln().toInt()

         print("Digite valor num3:")
         num3= readln().toInt()

         print("Digite valor num4:")
         num4= readln().toInt()

          num1*=num1
          num2*=num2
          num3*=num3
          num4*=num4

          if(num3 >= 1000) {
              println("Resultado : $num3 ")
          }else{
              println("O quadrado do primeiro numero é: $num1")
              println("O quadrado do segundo numero é: $num2")
              println("O quadrado do terceiro numero é: $num3")
              println("O quadrado do quarto numero é: $num4")



          }

}