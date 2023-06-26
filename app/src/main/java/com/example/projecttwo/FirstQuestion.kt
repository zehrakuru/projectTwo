package com.example.projecttwo

fun main() {

    val list = arrayListOf("apple", "orange", "banana", "strawberry", "lemon")
    print("Please enter three vegetables and/or fruits' names with comma-separated: ")
    val user_answer = readLine()?.toString()

    val lstValues: List<String> = user_answer!!.split(",")
    if(lstValues.size == 3 && lstValues.isNotEmpty()) {
        lstValues.forEach { it ->
            list.add(it.trim().filter { it.toString() != " " })
        }
        println("The new list is: $list")
    } else {
        println("You did not enter three names!")
    }

}