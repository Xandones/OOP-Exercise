package com.alexandrohlopes.oopexercise

fun main() {
   var iphone99 = MobilePhone("iOS", "Apple", "iPhone 99 Pro")
   var redmi4 = MobilePhone("Android", "Xiaomi", "Redmi Note 4")
   var pocoM3Pro = MobilePhone("Android", "Xiaomi", "Poco M3 Pro")
}

class MobilePhone(osName : String, brand : String, model : String) {
    init {
        println("Brand: $brand | Model: $model | OS: $osName")
    }
}