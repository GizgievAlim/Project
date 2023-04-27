package data

import models.Customers
import models.Employee
import models.Order
import models.clothes

interface DataSource {
    fun getEmployees(): List<Employee>
    fun getCustomers(): List<Customers>
    fun getOrders() :List<Order>
    fun getClothes(): List<clothes>
    fun readCsvFile(): List<String>
}