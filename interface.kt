interface Animal {
    val breed : String
    fun pet()
}

class Cat(
	val name:String,
    override val breed: String   
):Animal{
    override fun pet ()
    {
        println("${this.name} said meow")
    }
}

class Dog(
	val name:String,
    override val breed: String   
):Animal{
    override fun pet ()
    {
        println("${this.name} said waff")
    }
}

fun pet(animal:Animal)
{
    animal.pet()
}

fun main() {
    pet(Cat("Fluffy","homecat"))
    pet(Dog("Jack","homedog"))
    
}