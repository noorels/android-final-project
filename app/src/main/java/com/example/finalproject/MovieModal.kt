package com.example.finalproject

class MovieModel(title: String?, category: String?, price: String?) {
    private var title: String
    private var category: String
    private var price: String
    init {
        this.title = title!!
        this.category = category!!
        this.price = price!!
    }
    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
    fun getCategory(): String? {
        return category
    }
    fun setCategory(category: String? ) {
        this.category = category!!
    }
    fun getPrice(): String? {
        return price
    }
    fun setPrice(price: String? ) {
        this.price = price!!
    }
}