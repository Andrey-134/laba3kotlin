import kotlin.random.Random
fun main(){
    //laba 3
//    print("Введите первое число, знак операции и второе число через пробел: ")
//    val input = readln().split(" ")
//    val symbol = input[1]
//    val firstNumber = input[0].toDouble()
//    val secondNumber = input[2].toDouble()
//    var result = 0.0
//    when (symbol) {
//        "/"->result=firstNumber/secondNumber
//        "*" ->result=firstNumber*secondNumber
//        "+"->result=firstNumber+secondNumber
//        "-"->result=firstNumber-secondNumber
//        else->println("Некорректный ввод")
//    }
//    println("$firstNumber $symbol $secondNumber = $result")
//    val target = Random.nextInt(1,100)
//    println("Угадай число от 1 до 100")
//    while (true) {
//        print("Введи число: ")
//        val input = readln().toInt()
//        when{
//            input < target -> println("Загаданное число больше.")
//            input > target -> println("Загаданное число меньше.")
//            else -> {
//                println("Поздравляю! Ты угадал число: $target")
//                break
//            }
//        }
//    }
//    val dice1=Random.nextInt(from = 1, until = 7)
//    val dice2=Random.nextInt(from = 1, until = 7)
//    val sum = dice1+dice2
//    println("Первый кубик: $dice1")
//    println("Второй кубик: $dice2")
//    println("Сумма: $sum")
//    var level=0
//    println("Добро пожаловать в подземелье!")
//    while (level<5){
//        println("\nВы на уровне $level.")
//        println("Выберите действие: [1] Вперёд | [2] Осмотреться | [0] Сдаться")
//        val input= readln()
//        when (input) {
//            "1" -> {
//                level++
//                println("Вы переходите на уровень $level")
//            }
//            "2" -> {
//                println("Вы осматриваетесь. Тут ничего интересного.")
//                continue
//            }
//            "0" -> {
//                println("Вы сдались. Игра окончена.")
//                break
//            }
//            else -> {
//                println("Неверный ввод. Попробуйте снова.")
//                continue
//            }
//        }
//        if (level == 5)
//            println("Поздравляем! Вы выбрались из подземелья!")
//    }
//    var number: Int
//    do {
//        print("Введите число больше 10: ")
//        number = readln().toInt()
//    } while (number <= 10)
//    println("Спасибо! Вы ввели $number.")
//    print("Введите пароль: ")
//    var password: String? = readln()
//    while (password != "qwerty") {
//        print("Введите пароль: ")
//        password =readln()
//    }
//    println("Доступ разрешён!")
//    var password: String?
//    do {
//        print("Введите пароль: ")
//        password = readln()
//    } while (password != "qwerty")
//    println("Доступ разрешён!")

//    for (i in 1..5) {
//        println("War $i")
//    }
//    val fruits = listOf("apple", "banana", "cherry")
//    for (fruit in fruits) {
//        println("Фрукт: $fruit")
//    }
//    val sentence = "Kotlin is awesome"
//    val words =sentence.split("")
//    println(words)
//    val data = "apple, banana, orange"
//    val fruits = data.split(",")
//    for (fruit in fruits)
//    {
//        println(fruit)
//    }
//    print("Введите числа через пробел: ")
//    val input = readln()
//    val numbers = input.split(" ")
//    var sum = 0
//    for (number in numbers) {
//        sum += number.toInt()
//    }
//    println("Сумма чисел: $sum")
//    var number=1
//    while (number<=5){
//        println("Число: $number")
//        number++
// }
//    var number = 0
//   while (number < 10) {
//       number++
//       if (number == 3) {
//           println("Останавливаемся на $number")
//            continue
//        }
//       println(number)
//    }
//    println("Напишите что-нибудь (для выхода введите 'выход'):")
//    while (true) {
//        val input= readLine()
//        if (input == "выход") {
//            println("До свидания!")
//            break
//        }
//        println("Вы ввели: $input")
//    }
//    var letter = 'A'
//    while (letter <= 'Z') {
//        print(letter)
//        letter++
//    }
//val part1 = arrayOf("Опытный", "Безумный", "Легендарный", "Скрытый", "Гигачад")
//val part2 = arrayOf("стрелок", "геймер", "воин", "волшебник", "трейдер")
//val part3 = arrayOf("из CSGO", "на максималках", "из будущего", "в бане у Габена", "с проклятым лутом")
//val rand1= (Math.random() * part1.size).toInt()
//val rand2 = (Math.random() * part2.size).toInt()
//val rand3 = (Math.random() * part3.size).toInt()
//val phrase = "${part1 [rand1]} ${part2 [rand2]} ${part3 [rand3]}"
//println("Baш титул: $phrase")
    // ДЗ 3

}