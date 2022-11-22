package com.example.storeapp

object DataManager {

    val products = mutableListOf<Product>()

    init {
        createMockData()
    }

    fun createMockData(){
        products.add(Product("Berry Milk", 12, R.drawable.berrymilk))
        products.add(Product("Chips", 25, R.drawable.chips))
        products.add(Product("Choco Bar", 16, R.drawable.chocobar))
        products.add(Product("Juice", 19, R.drawable.juice))
        products.add(Product("Milk", 12, R.drawable.milk))
        products.add(Product("Peanut Butter", 35, R.drawable.peanutbutter))
        products.add(Product("Noodles", 8, R.drawable.noodles))
        products.add(Product("Soda", 12, R.drawable.soda))
        products.add(Product("Pickles", 28, R.drawable.pickles))
        products.add(Product("Canned Tuna", 12, R.drawable.tuna))

    }
}