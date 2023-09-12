package com.example.calculator

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.cos
import kotlin.math.ln
import kotlin.math.log10
import kotlin.math.sin
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    // This makes it so i am actually able to save the string whenever the user rotates the phone
    var numbersString = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // makes it so when a equation is selected the number gets reset when a new number is selected
        var numequation = false
        // adds text view so you can edit number
        var number = findViewById<TextView>(R.id.number)
        // checks if savedInstanceState has happened and if so it returns the number
        // if not it sets the number to zero
        if(savedInstanceState == null){
            numbersString = "0"
        }else{
            numbersString = savedInstanceState.getString("Number")!!
        }
        number.setText(numbersString)
        // Figures out which equation button was pushed
        var selector = 0
        //works the same as numequation but for equation
        var forequals = false
        // This variable saves the first provided number when a equation button is pushed
        var firstNum = ""
        // The new landscape buttons will go here
        // This way the app does not crash on start because it cant find a button that may not exist
        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            // All these buttons are the same logically speaking
            // That's because when a calculator is doing any of these calculations
            // it immediately gives you the answer
            // that way i don't have to do the checks i run in the normal equation buttons
            var sinButton = findViewById<Button>(R.id.sin)
            sinButton.setOnClickListener{
                var numSin = sin(numbersString.toDouble())
                numbersString = numSin.toString()
                number.setText(numbersString)
                Log.i("SIN", "sin button has been pushed")
            }
            var cosButton = findViewById<Button>(R.id.cos)
            cosButton.setOnClickListener{
                var cosNum = cos(numbersString.toDouble())
                numbersString = cosNum.toString()
                number.setText(numbersString)
                Log.i("COS", "cos button has been pushed")
            }
            var tanButton = findViewById<Button>(R.id.tan)
            tanButton.setOnClickListener{
                var tanNum = tan(numbersString.toDouble())
                numbersString = tanNum.toString()
                number.setText(numbersString)
                Log.i("TAN", "tan button has been pushed")
            }
            var logButton = findViewById<Button>(R.id.log)
            logButton.setOnClickListener{
                var logNum = log10(numbersString.toDouble())
                numbersString = logNum.toString()
                number.setText(numbersString)
                Log.i("log", "log10 button has been pushed")
            }
            var lnButton = findViewById<Button>(R.id.ln)
            lnButton.setOnClickListener{
                var lnNum = ln(numbersString.toDouble())
                numbersString = lnNum.toString()
                number.setText(numbersString)
                Log.i("LN", "ln button has been pushed")
            }
        }
        // this is the clear button is resets everything to the original state
        var clearButton = findViewById<Button>(R.id.clear)
        clearButton.setOnClickListener{
            numbersString = "0"
            number.setText(numbersString)
            numequation = false
            forequals = false
            selector = 0
            firstNum = ""
            Log.i("CLEAR", "clear button has been pushed")
        }
        // button to make the function pos or neg
        var posornegButton = findViewById<Button>(R.id.posorneg)
        posornegButton.setOnClickListener{
            if (number.text.toString().contains("-")){
                numbersString = number.text.toString().substring(1,number.text.toString().length)
                number.setText(numbersString)
            }else{
                numbersString = "-" + number.text.toString()
                number.setText(numbersString)
            }
            Log.i("pos/neg", "positive or negative button has been pushed")
        }
        // button that finds the percent of a number provied
        var percentButton = findViewById<Button>(R.id.percent)
        percentButton.setOnClickListener{
            var num = number.text.toString()
            var percentnum = num.toDouble() / 100
            numbersString = percentnum.toString()
            number.setText(numbersString)
            Log.i("PERCENT", "percent button has been pushed")
        }
        // puts a decimal in the function if one is not provided already
        var decimalButton = findViewById<Button>(R.id.decimal)
        decimalButton.setOnClickListener{
            if (number.text.toString().contains(".")){
                return@setOnClickListener
            }else{
                numbersString = number.text.toString() + "."
                number.setText(numbersString)
            }
            Log.i("DECIMAL", "decimal button has been pushed")
        }
        // All buttons up until the next comment do the same exact thing
        // All they do is add a number to the text view
        var sevenButton = findViewById<Button>(R.id.seven)
        sevenButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "7"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "7"
                number.setText(numbersString)
            }else{
                numbersString = num + "7"
                number.setText(numbersString)
            }
            Log.i("SEVEN", "seven button has been pushed")
        }
        var eightButton = findViewById<Button>(R.id.eight)
        eightButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "8"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "8"
                number.setText(numbersString)
            }else{
                numbersString = num + "8"
                number.setText(numbersString)
            }
            Log.i("EIGHT", "eight button has been pushed")

        }
        var nineButton = findViewById<Button>(R.id.nine)
        nineButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "9"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "9"
                number.setText(numbersString)
            }else{
                numbersString = num + "9"
                number.setText(numbersString)
            }
            Log.i("NINE", "nine button has been pushed")

        }
        var fourButton = findViewById<Button>(R.id.four)
        fourButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "4"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "4"
                number.setText(numbersString)
            }else{
                numbersString = num + "4"
                number.setText(numbersString)
            }
            Log.i("FOUR", "four button has been pushed")

        }
        var fiveButton = findViewById<Button>(R.id.five)
        fiveButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "5"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "5"
                number.setText(numbersString)
            }else{
                numbersString = num + "5"
                number.setText(numbersString)
            }
            Log.i("FIVE", "five button has been pushed")

        }
        var sixButton = findViewById<Button>(R.id.six)
        sixButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "6"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "6"
                number.setText(numbersString)
            }else{
                numbersString = num + "6"
                number.setText(numbersString)
            }
            Log.i("SIX", "six button has been pushed")

        }
        var oneButton = findViewById<Button>(R.id.one)
        oneButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "1"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "1"
                number.setText(numbersString)
            }else{
                numbersString = num + "1"
                number.setText(numbersString)
            }
            Log.i("one", "one button has been pushed")

        }
        var twoButton = findViewById<Button>(R.id.two)
        twoButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "2"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "2"
                number.setText(numbersString)
            }else{
                numbersString = num + "2"
                number.setText(numbersString)
            }
            Log.i("TWO", "two button has been pushed")

        }
        var threeButton = findViewById<Button>(R.id.three)
        threeButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "3"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "3"
                number.setText(numbersString)
            }else{
                numbersString = num + "3"
                number.setText(numbersString)
            }
            Log.i("THREE", "three button has been pushed")

        }
        var zeroButton = findViewById<Button>(R.id.zero)
        zeroButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                numbersString = "0"
                number.setText(numbersString)
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                numbersString = "-" + num + "0"
                number.setText(numbersString)
            }else{
                numbersString = num + "0"
                number.setText(numbersString)
            }
            Log.i("ZERO", "zero button has been pushed")

        }
        //end of number buttons


        // This button does the dividing
        // All the equation buttons are practically the same
        // For instance first it checks if the selector is zero to make sure no other equation has been selected
        // if so then it saves the number
        // changes the selector to a number so the computer knows what to do
        // changes all the booleans to true for the number and the equals
        var divideButton = findViewById<Button>(R.id.divide)
        divideButton.setOnClickListener{
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }else{
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            selector = 1
            forequals = true
            Log.i("DIVIDE", "division button has been pushed")
        }
        var multiplyButton = findViewById<Button>(R.id.multiply)
        multiplyButton.setOnClickListener{
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }else{
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            selector = 2
            forequals = true
            Log.i("MULTI", "multipy button has been pushed")
        }
        var subtractButton = findViewById<Button>(R.id.subtract)
        subtractButton.setOnClickListener{
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }else{
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            selector = 3
            forequals = true
            Log.i("SUB", "subtract button has been pushed")
        }
        var addButton = findViewById<Button>(R.id.add)
        addButton.setOnClickListener {
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }else{
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            forequals = true
            selector = 4
            Log.i("ADD", "addition button has been pushed")
        }
        // end of equation buttons
        // makes it so a equation can be done
        // it first finds out if a equation button has been selected
        // if so then it runs the calculatedNum function with all the variables and runs the equations
        var equalsButton = findViewById<Button>(R.id.equals)
        equalsButton.setOnClickListener{
            if (forequals){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }else{
                    numbersString = calculatedNum.toString()
                    number.setText(numbersString)
                }
                selector = 0
                firstNum = ""
            }else{
                return@setOnClickListener
            }
            Log.i("EQUALS", "equals button has been pushed")
        }



    }

    /**
     * equation returns any so to try to keep a decimal out if the user did not insert one
     * it checks firstly what selector was selected then runs based off that input and does the equation
     *
     */
    fun equation(x: Int ,num1: String ,num2: String): Any {
        if (x == 1){
            if (num1.contains(".")||num2.contains(".")
                ||num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647||
                num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647){
                var divednum = num1.toDouble() / num2.toDouble()
                return divednum
            }else{
                var divednum = num1.toInt() / num2.toInt()
                return divednum
            }

        }else if (x == 2){
            if (num1.contains(".")||num2.contains(".")
                ||num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647||
                num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647){
                var multinum = num1.toDouble() * num2.toDouble()
                return multinum
            }else{
                var multinum = num1.toInt() * num2.toInt()
                return multinum
            }
        }else if (x==3){
            if (num1.contains(".")||num2.contains(".")
                ||num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647||
                num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647){
                var subtractnum = num1.toDouble() - num2.toDouble()
                return subtractnum
            }else{
                var subtractnum = num1.toInt() - num2.toInt()
                return subtractnum
            }
        }else{
            if (num1.contains(".")||num2.contains(".")
                ||num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647||
                num1.toDouble() > 2147483647 || num1.toDouble() < -2147483647){
                var addnum = num1.toDouble() + num2.toDouble()
                return addnum
            }else{
                var addnum = num1.toInt() + num2.toInt()
                return addnum
            }
        }


    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("Number",numbersString)
    }
}



