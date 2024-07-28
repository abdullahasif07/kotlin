data class Student(
    val Name: String,
    val stdID: Int,
    val grade: Double
)

val students = listOf<Student>(
    Student("John", 223, 140.0),
    Student("Mark", 548, 120.0),
    Student("Natali", 342, 150.0),
    Student("Sara", 781, 130.0)
)

fun main() {
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    val studentById = getStdbyId(id)
    if (studentById != null) {
        println(studentById)
    } else {
        println("Student with ID $id not found.")
    }

    println("Please, Enter the student's name")
    val name = readln()
    val studentByName = searchIntStd(name)
    if (studentByName != null) {
        println(studentByName)
    } else {
        println("Student with name $name not found.")
    }
}

fun getStdbyId(id: Int): Student? {
    return students.find { it.stdID == id }
}

fun searchIntStd(name: String): Student? {
    return students.find { it.Name.lowercase() == name.lowercase() }
}
