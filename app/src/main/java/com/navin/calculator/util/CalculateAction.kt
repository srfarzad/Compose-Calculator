package com.navin.calculator.util

sealed class CalculateAction{

    data class Number(val number : Int): CalculateAction()
    object Clear : CalculateAction()
    object  Delete : CalculateAction()
    data class Operation(val operation : CalculatorOperation ): CalculateAction()
    object  Calculate : CalculateAction()
    object Decimal : CalculateAction()


}
