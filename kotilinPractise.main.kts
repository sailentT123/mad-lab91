#!/usr/bin/env kotlin

package tz.ac.suza.hellosuza

class KotlinPractice {
    

    
    fun area(width: Double, height: Double): Double {
        return width * height
    }

    // 3. Control Flow — Grade Calculator
    fun grade(score: Int): String {
        return when {
            score >= 80 -> "A"
            score >= 70 -> "B"
            score >= 60 -> "C"
            score >= 50 -> "D"
            else -> "F"
        }
    }

    
    class Course(val code: String, val title: String, val credits: Int) {
        override fun toString(): String {
            return "[$code] $title ($credits)"
        }
    }

    fun main() {

        
        val name = "Tahir Bakar Ali"
        var age = 23
        println("My name is $name and I am $age years old.")

        
        println("Area of rectangle: ${area(3.0, 4.0)}")

        
        println("Grade for 75: ${grade(75)}")

        
        for (i in 1..30) {
            when {
                i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
                i % 3 == 0 -> println("Fizz")
                i % 5 == 0 -> println("Buzz")
                else -> println(i)
            }
        }

        // 5. List Operations
        val nums = listOf(1, 2, 3, 4, 5, 6)

        println("Sum: ${nums.sum()}")
        println("Even numbers: ${nums.filter { it % 2 == 0 }}")
        println("Doubled: ${nums.map { it * 2 }}")

        // 6. Create and print Course objects
        val courses = listOf(
            Course("CS101", "Intro to Programming", 3),
            Course("MATH201", "Discrete Mathematics", 4),
            Course("ENG105", "Academic Writing", 2)
        )

        println("Courses:")
        courses.forEach { println(it) }

        
        val nullableName: String? = readLine()

        
        println("Name length: ${nullableName?.length ?: 0}")
    }
}
