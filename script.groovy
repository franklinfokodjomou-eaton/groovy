// single line comment
/* multi-line comment */

// print 'Hello, World!'
// println 'Hello, World!'


// VARIABLES
// groovy is a dynamic language, so you don't need to specify the type of a variable
// groovy is a weakly typed language, so you can change the type of a variable
// groovy is case sensitive
// my_variable = 42
// def my_variable2 = 'Franklin'
// def my_variable3 = true

// println my_variable
// println my_variable3
// println "My name is ${my_variable2}"
// println "My name is $my_variable2"
// println "My name is " + my_variable2
// println "My name is " + my_variable2 + " and I am " + my_variable + " years old."


// def (a, b) = [1, 2]
// println a
// println b


// DATA TYPES
// groovy has the same data types as Java
// groovy has a few additional data types
// byte
// byte my_byte = 12
// println my_byte
// println Byte.MIN_VALUE
// println Byte.MAX_VALUE
// println '============='
// // short
// short my_short = 123
// println my_short
// println Short.MIN_VALUE
// println Short.MAX_VALUE
// println '============='
// // int
// int my_int = 1234
// println my_int
// println Integer.MIN_VALUE
// println Integer.MAX_VALUE
// println '============='
// // long
// long my_long = 12345
// println my_long
// println Long.MIN_VALUE
// println Long.MAX_VALUE
// println '============='
// // float
// float my_float = 123.45
// println my_float
// println Float.MIN_VALUE
// println Float.MAX_VALUE
// println '============='
// // double
// double my_double = 1234.56
// println my_double
// println Double.MIN_VALUE
// println Double.MAX_VALUE
// println '============='
// // char
// char my_char = 'A'
// println my_char
// println '============='
// // boolean
// boolean my_boolean = true
// println my_boolean
// // String
// String my_string = 'Hello, World!'
// println my_string

// b = 10
// println b
// println b.getClass().getName()


// OPERATORS
//Normal Arithmetic Operators: +, -, *, /, %, **
// println 9.intdiv(2)
// Asigment Operators: +=, -=, ++, --
// a = 10
// a += 5
// println a
// a -= 2
// println a
// a++
// println a
// ++a
// println a
// b = a++ * 2
// println b
// println a
// Relational Operators: ==, !=, >, <, >=, <=
// assert 1 + 2 == 3
// assert 1 + 2 != 4
// assert 1 + 2 > 2
// assert 1 + 2 < 4
// assert 1 + 2 >= 3
// assert 1 + 2 <= 3
// Logical Operators: &&, ||, !
// assert true && true
// assert true || false
// assert !false
// Precedence Operators: ()
// The logical "not" operator has the highest precedence, followed by the logical "and" operator, and finally the logical "or" operator.
// assert (!false && false) == false
// assert true || true && false
// Short-Circuit Operators: &&, ||
/**
 * The logical "and" operator (&&) and the logical "or" operator (||) are short-circuit operators.
 * In the || operator if the left operand is true, the right operand is not evaluated.
 * In the && operator if the left operand is false, the right operand is not evaluated.
 */
 // Bitwise Operators: &, |, ^, ~
 // Bitwise operators can be applied on a byte or an int and return an int.
//  int a = 20
//  int b = 25
//  println a & b
//  println Integer.toBinaryString(a)
//  println Integer.toBinaryString(b)
//  println Integer.parseInt('10000', 2)
//  // Conditional Operator: ?:
//  output = (1 > 2) ? "2 is greater than 1" : "2 is not greater than 1"
//  println output


// CONDITIONAL STATEMENTS
// if, else if, else, switch, case, default
// num = 11
// if (num == 10) {
//     println 'Number is 10'
// } else if (num == 11) {
//     println 'Number is 11'
// } else {
//     println 'Number is not 10 or 11'
// }

// x = 10
// switch (x) {
//     case 0:
//         result = 'x is zero'
//         break
//     case {x > 0}:
//         result = 'x is positive'
//         break
//     case {x < 0}:
//         result = 'x is negative'
//         break
//     default:
//         result = 'x is not a number'
// }
// println result


// LOOPS: for, while, for-in
// for (i = 0; i < 5; i++) {
//     println i
// }

// for (i in 0..4) {
//     println i
// }

// for (i in [0, 1, 2, 3, 4]) {
//     println i
// }

// array = (0..4).toArray()
// x = 0
// for (i in array) {
//     x += i
//     println x
// }

// map = [a: 1, b: 2, c: 3]
// x = 0
// for (i in map) {
//     x += i.value
//     println x
// }

// i = 1
// while (i < 5) {
//     println i
//     i++
// }

// 1.upto(5) {
//     println it
// }

// 5.times {
//     println it
// }

// 1.step(10, 2) {
//     println it
// }


// Exception Handling: try, catch, finally
//int 1/0
// try {
//     int i = 1/0
// }catch (Exception e) {
//     println "I am inside exception block" 
//     println e.getCause()
//     println e.getMessage()
//   //  e.printStackTrace()
// }

// try {
//     int i = 1/1
// } catch(ArithmeticException e1) {
//     println "Catch block 1"
// } catch(Exception e2) {
//     println "Catch block 2"
// } finally {
//     println "Finally block"
// }

// println "I am outside exception block"


// String Manipulation: single quotes, double quotes, triple quotes, slashy, dollar slashy, GString
def name = "Franklin"
// println name
// println "My name is " + name
// println "My name is ".concat(name)
// println "My name is ${name}"
// println "My name is $name"

// println 'My name is $name'
// println 'My name is ${name}'
// println name.length()
// println name[0]
// println name[0..2]
// println name[0,2,4]
// println name.indexOf('a')
// println name.substring(2)
// println name.subSequence(0, 5)


// def str = "This is a groovy class"
// println str.split(" ")
// println str-("groovy")
// println str.replace("class", "scripting")
// println str.toUpperCase()
// println str.toLowerCase()
// println str.toList()
// println "Abc".equals("abc")

// println "Groovy " * 3

// def s1 = """This is a groovy course 
// and we are learning groovy scripting"""
// println s1

// def s2 = '''This is a groovy course 
// and we are learning groovy scripting'''
// println s2

def s1 = /a green sky $name/
def s2 = $/a blue tree $name/$
println s1
println s2