/*
5 isim içeren bir ArrayList oluşturun.
Kullanıcıdan, aralarına virgül koyarak 3 isim girmesini isteyin.
Bu girilen 3 isimlik String’i aradaki virgülleri kullanarak parçalayın ve listeye dönüştürün
Bu listenin bol olup olmadığını kontrol edin.
Boş değilse oluşturduğunuz 5 isimlik listeye ekleyin ve son halini konsola yazdırın.
* */

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