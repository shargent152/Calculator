package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // makes it so when a equation is selected the number gets reset when a new number is selected
        var numequation = false
        // adds text view so you can edit number
        var number = findViewById<TextView>(R.id.number)
        number.setText("0")
        // resets the textView back to zero
        var clearButton = findViewById<Button>(R.id.clear)
        clearButton.setOnClickListener{
            number.setText("0")
        }
        // button to make the function pos or neg
        var posornegButton = findViewById<Button>(R.id.posorneg)
        posornegButton.setOnClickListener{
            if (number.text.toString().contains("-")){
                var pos = number.text.toString().substring(1,number.text.toString().length)
                number.setText(pos)
            }else{
                number.setText("-" + number.text.toString())
            }
        }
        // button that finds the percent of a number provied
        var percentButton = findViewById<Button>(R.id.percent)
        percentButton.setOnClickListener{
            var num = number.text.toString()
            var percentnum = num.toDouble() / 100
            number.setText(percentnum.toString())
        }
        // puts a decimal in the function if one is not provided already
        var decimalButton = findViewById<Button>(R.id.decimal)
        decimalButton.setOnClickListener{
            if (number.text.toString().contains(".")){
                return@setOnClickListener
            }else{
            number.setText(number.text.toString() + ".")
            }
        }
        // All buttons up until the next comment do the same exact thing
        // All they do is add a number to the text view
        var sevenButton = findViewById<Button>(R.id.seven)
        sevenButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                number.setText("7")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "7"
                number.setText(num)
            }else{
                number.setText(num + "7")
            }
        }
        var eightButton = findViewById<Button>(R.id.eight)
        eightButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0|| numequation){
                number.setText("8")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "8"
                number.setText(num)
            }else{
                number.setText(num + "8")
            }

        }
        var nineButton = findViewById<Button>(R.id.nine)
        nineButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("9")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "9"
                number.setText(num)
            }else{
                number.setText(num + "9")
            }


        }
        var fourButton = findViewById<Button>(R.id.four)
        fourButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("4")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "4"
                number.setText(num)
            }else{
                number.setText(num + "4")
            }


        }
        var fiveButton = findViewById<Button>(R.id.five)
        fiveButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("5")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "5"
                number.setText(num)
            }else{
                number.setText(num + "5")
            }


        }
        var sixButton = findViewById<Button>(R.id.six)
        sixButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("6")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "6"
                number.setText(num)
            }else{
                number.setText(num + "6")
            }


        }
        var oneButton = findViewById<Button>(R.id.one)
        oneButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("1")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "1"
                number.setText(num)
            }else{
                number.setText(num + "1")
            }


        }
        var twoButton = findViewById<Button>(R.id.two)
        twoButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("2")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "2"
                number.setText(num)
            }else{
                number.setText(num + "2")
            }


        }
        var threeButton = findViewById<Button>(R.id.three)
        threeButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("3")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "3"
                number.setText(num)
            }else{
                number.setText(num + "3")
            }


        }
        var zeroButton = findViewById<Button>(R.id.zero)
        zeroButton.setOnClickListener{
            var num = number.text.toString()
            if (num.toDouble() == 0.0 || numequation){
                number.setText("0")
                numequation = false
            }else if (number.text.toString().contains("-")){
                var num = number.text.toString().substring(1,number.text.toString().length)
                num = "-" + num + "0"
                number.setText(num)
            }else{
                number.setText(num + "0")
            }


        }
        //end of number buttons


        // This variable saves the first provided number when a equation button is pushed
        var firstNum = ""
        // Figures out which button was pushed
        var selector = 0
        // works the same way as numequation but for the equation buttons
        var forequals = false
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
                    number.setText(calculatedNum.toString())
                }else{
                    number.setText(calculatedNum.toString())
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            selector = 1
            forequals = true
        }
        var multiplyButton = findViewById<Button>(R.id.multiply)
        multiplyButton.setOnClickListener{
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    number.setText(calculatedNum.toString())
                }else{
                    number.setText(calculatedNum.toString())
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            selector = 2
            forequals = true
        }
        var subtractButton = findViewById<Button>(R.id.subtract)
        subtractButton.setOnClickListener{
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    number.setText(calculatedNum.toString())
                }else{
                    number.setText(calculatedNum.toString())
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            selector = 3
            forequals = true
        }
        var addButton = findViewById<Button>(R.id.add)
        addButton.setOnClickListener {
            if (selector != 0){
                var calculatedNum = equation(selector,firstNum,number.text.toString())
                if (calculatedNum.toString().toDouble() > 2147483647 || -2147483647 > calculatedNum.toString().toDouble()
                    || calculatedNum.toString().contains(".")){
                    number.setText(calculatedNum.toString())
                }else{
                    number.setText(calculatedNum.toString())
                }
                selector = 0
                firstNum = ""
            }
            firstNum = number.text.toString()
            numequation = true
            forequals = true
            selector = 4
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
                    number.setText(calculatedNum.toString())
                }else{
                    number.setText(calculatedNum.toString())
                }
                selector = 0
                firstNum = ""
            }else{
                return@setOnClickListener
            }
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
}

