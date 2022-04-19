package com.action.mongo_demo.model

import org.springframework.context.annotation.ComponentScan
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.stereotype.Component
import java.math.BigDecimal

@ComponentScan
@Document("expense")
data class Expense(
    @Id
    val id: String,
    @Field(name = "name")
    @Indexed(unique = true)
    var expenseName: String,
    @Field(name = "category")
    var expenseCategory: ExpenseCategory,
    @Field(name = "amount")
    var expenseAmount: BigDecimal
)