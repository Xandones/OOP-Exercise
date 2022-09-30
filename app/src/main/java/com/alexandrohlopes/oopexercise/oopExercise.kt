package com.alexandrohlopes.oopexercise

fun main() {

   var pocoM3Pro = MobilePhone("Android", "Xiaomi", "Poco M3 Pro")
   pocoM3Pro.chargeBattery(30) // The parameter is how much we will charge the battery
}

class MobilePhone(osName : String, brand : String, model : String, battery : Byte = 0) {
    init {
        println("Brand: $brand | Model: $model | OS: $osName | Battery: $battery")
    }

    fun chargeBattery(chargedBy: Byte) {
        var battery = 0
        println("The battery was $battery and it's ${battery + chargedBy} now.")
    }
}