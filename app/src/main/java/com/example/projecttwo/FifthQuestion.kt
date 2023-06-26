package com.example.projecttwo

fun main() {
    data class Workers(val name: String, val salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    val sortedWorkers = workers.map { Workers(it.name,(it.salary * 0.35) + it.salary) }.shuffled().sortedBy { it.salary }

    val highestSalary = sortedWorkers.maxBy { it.salary }
    println("The person who has highest salary with a raise is: $highestSalary")

    val lowestSalary = sortedWorkers.minBy { it.salary }
    println("The person who has highest salary with a raise is: $lowestSalary")

    val sumOfSalaries = sortedWorkers.sumOf { it.salary }
    val avgOfSalaries = sumOfSalaries/sortedWorkers.count()
    println("Average of the salaries after getting raises is: $avgOfSalaries")
}