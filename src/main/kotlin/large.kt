fun secondmax(){
    var number = listOf(1,2,3,4,5,6,7,8,9,10)
    var kwanza = Int.MIN_VALUE
    var two = Int.MIN_VALUE

    for (n in number){
        if (kwanza > n){
            two = kwanza
            kwanza = n
        }
        else if (n !=kwanza && n > two){
            two = n
        }
    }
    println(listOf("${two}"))
}
fun main(){
    secondmax()
}