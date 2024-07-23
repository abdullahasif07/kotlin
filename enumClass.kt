enum class PizzaSize(
	
    val size:Int
)
    {
        small(10),
        medium(20),
        large(30)
    }

fun printsize(pizzasize:PizzaSize)
{
    println("$pizzasize is ${pizzasize.size} in cm")
}

fun main() {
    
    printsize(PizzaSize.medium)
}