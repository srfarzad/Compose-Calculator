package com.navin.calculator.util

sealed class CalculatorOperation(val symbol : String){

    object  Add : CalculatorOperation("+")
    object  Minus : CalculatorOperation("-")
    object Multiply : CalculatorOperation("*")
    object Divide : CalculatorOperation("/")


}
