package com.example.data.model

import kotlinx.serialization.Serializable

val expenses = mutableListOf(
    Expense(
        id = 1, amount = 70.0, categoryName = "GROCERIES", description = "Weekly buy"
    ), Expense(
        id = 2, amount = 50000.0, categoryName = "CAR", description = "Chevrolet"
    ), Expense(
        id = 3, amount = 4.0, categoryName = "SNACKS", description = "Kitkat Chocolate"
    ), Expense(
        id = 4, amount = 23.43, categoryName = "PARTY", description = "weekend Party"
    ), Expense(
        id = 5, amount = 43.44, categoryName = "HOUSE", description = "Cleaning"
    ), Expense(
        id = 6, amount = 300.0, categoryName = "OTHER", description = "weekly buy"
    )
)

@Serializable
data class Expense(
    val id: Long = -1,
    val amount: Double,
    val categoryName: String,
    val description: String
)