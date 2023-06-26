/*
İsimler listesini kullanarak önce harflere göre listeyi sıralayın.
Kullanıcıdan, 1 adet isim isteyin.
Bu isim names listesinde var mı yok mu kontrol edin.
Varsa bu ismi listede arayın, tüm harfleri büyük ve ters çevrilmiş şekilde konsola yazdırın.*/
package com.example.projecttwo

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    names.sortBy { it }
    val uppercase_names = ArrayList<String>()

    names.forEach{it ->
        uppercase_names.add(it.lowercase())
    }

    print("Please enter a name: ")
    val user_answer = readLine()?.toString()?.lowercase()

    for (i in uppercase_names) {
        if (user_answer != null) {
            if (i.equals(user_answer)) {
                println(user_answer.uppercase().reversed())
            }
        }
    }
    if (user_answer !in uppercase_names)
        println("The name you entered is absent!")
}