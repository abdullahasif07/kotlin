data class Dog (
	val name:String,
    val age: Int
)

fun main() {
   
    val dog=Dog("jack",12)
    val newdog = dog.copy("shaggy", age=dog.age+1)
    
    println(newdog)
}