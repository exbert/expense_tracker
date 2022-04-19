package com.action.mongo_demo.repository

import com.action.mongo_demo.model.Expense
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface ExpenseRepository : MongoRepository<Expense, String> {
    @Query("{'name':?0}")
    fun findByName(name: String): Optional<Expense>
}