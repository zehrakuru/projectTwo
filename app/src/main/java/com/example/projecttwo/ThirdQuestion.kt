/*
İlk olarak en büyük ve en küçük yaşa sahip olan öğrencinin ismini ve kaçıncı indexte olduğunu konsola yazdırın.
Listede school değeri Üniversite A olanları filtreleyin.
Filtreleme işleminden dönen listeyi yaşları 25’ten büyükler ve küçükler olarak alt alta konsola yazdırın.
*/
package com.example.projecttwo

fun main() {
    data class Student(val name: String, val age: Int, val school: String)

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    val oldest_student = students.maxBy { it -> it.age }
    println("The oldest student is ${oldest_student.name}, and indexed at ${students.indexOf(oldest_student)}")

    val youngest_student = students.minBy { it -> it.age }
    println("The youngest student is ${youngest_student.name}, and indexed at ${students.indexOf(youngest_student)}")

    val students_in_Uni_A = students.filter { it.school.equals("Üniversite A") }
    println("The students who are in University A: $students_in_Uni_A")

    val olderStudents = students_in_Uni_A.filter { it.age > 25}
    println("The students who are older than 25")
    olderStudents.forEach { it ->
        println(it)
    }
    val youngerStudents = students_in_Uni_A.filter { it.age < 25}
    println("The students who are younger than 25")
    youngerStudents.forEach { it ->
        println(it)
    }
}