###### Sintax and Structure

##### 0.0 Introduction

## 0.1 Programming and algorithms

    Computers process data but aren't smart on their own; they need programs (sets of instructions) to perform tasks.

    Programming languages like Java help humans write these instructions, which are then translated into machine language the computer understands.

    An algorithm is a step-by-step guide to solve problems, such as calculating an employee's gross pay by multiplying hours worked by pay rate and displaying the result.

## 0.2 Install IntelliJ

    https://www.jetbrains.com/idea/

## 0.3 Install JDK Java Development Kit

        step-by-step guide based on the video to install Java 17 in IntelliJ IDEA:

        Open IntelliJ IDEA.
        Go to the menu and click on File > Project Structure.
        In the Project Structure window, select SDKs under Platform Settings.
        Click the plus (+) sign to add a new SDK.
        Choose Download JDK from the options.
        In the version dropdown, select 17.
        In the vendor dropdown, select Oracle OpenJDK (the free, open-source version).
        Keep the default download location or choose a different folder if you prefer.
        Click Download and wait for the installation to complete.
        Click OK to confirm and close the window.

##### 1.0 Java Basics

## 1.1 Packages

    In Java, a package is like a special folder within your project that holds one or more Java files. It helps organize your code by grouping related files together logically. For example, you might create a package named gross_calculator to keep all files related to that functionality in one place. The common practice is to name packages in all lowercase to keep things consistent and clear for anyone reading or editing the code.

## 1.2 Classes

    In Java, a class is created within a package, which acts like a container for related Java files.

    Class names should start with an uppercase letter and use camel case (capitalizing the first letter of each word) without spaces for readability.

    Every Java file starts with a package declaration followed by the class declaration.

    Curly braces {} are used to define the block of code that belongs to the class.

        These conventions and structures are essential for organizing and writing clear, maintainable Java code.

## 1.3 Main methode

###### METHODE EXAMPLE

    public class GrossPayCalculator {  //this is a class

    public static void main(String[] args){ //main methode
        System.out.println("Hello World"); //statement
    }

}

    In Java, all executable code must be inside a method, with the main method serving as the program's entry point.

    Curly braces {} define blocks of code for classes and methods, helping organize the structure.

    To display output, use System.out.println with the text inside parentheses and quotation marks, ending the statement with a semicolon.

These basics are essential for writing and running your first Java program successfully.

## 1.4 Reserved words

    Reserved words in Java are special keywords that have predefined meanings and cannot be used as names for variables, classes, or methods.

    Examples include package, public, class, static, and void.

    These reserved words are usually highlighted in a distinct color in code editors to help you recognize them easily.

##### 2.0 Variables

## 2.1 Creating Veriables

###### VARIABLE EXAMPLES

    package gross_calculator;

public class GrossPayCalculator { //this is a class

    public static void main(String[] args){ //main methode
        //1.- Get the number of hours worked
            int hours = 40; //this is a variable defined by the type of data

        //2.- Get the hourly pay rate
            double payRate = 25.50; //this is other variable defined by other data type

        //3.- Multimply hours and pay Rate
            double grossPay = hours * payRate;

        //4.- Display Result
            System.out.println("Gross Pay: " + grossPay);
    }

}

    Java is a statically typed language, so you must declare the data type of variables before assigning values.

    Use int for whole numbers and double for decimal numbers when declaring variables.

    Variables store data that can be used later in the program, such as hours worked and pay rate.

    You can perform arithmetic operations like multiplication on variables to calculate values like gross pay.

    Use System.out.println to display output, combining strings and variables for clear messages.

## 2.2 Primitive date types

    byte:
        8-bit integer, holds values from -128 to 127.

    short:
        16-bit integer.

    int:
        32-bit integer, commonly used for whole numbers.

    long:
        64-bit integer, holds very large whole numbers.

    float:
        32-bit decimal number, holds up to 7 decimal digits.

    double:
        64-bit decimal number, more precise with up to 16 decimal digits.

    boolean:
        holds either true or false.

    char:
        holds a single character, enclosed in single quotes.

        These types are the foundation for handling basic data in Java programs.

## 2.3 Local variable type inference

    Java is statically typed, but you can use var to let Java infer the data type of local variables based on their initial value.

    When using var, you must initialize the variable immediately so Java knows what type to assign.

    var can only be used for local variables inside methods, not for global variables defined at the class level.

###### LOCAL VARIABLE NAMES

        public void calculatePay() {
            int hours = 0; // local variable
            // You can now use 'hours' within this method
        }

## 2.4 Naming variables

    Always use descriptive names for variables to make your code clear and easy to understand, both for yourself and others who may work on it later.

    Follow Java naming conventions: start variable names with a lowercase letter and use camel case for multiple words (e.g., payRate).

    Avoid using spaces or Java reserved words in variable names; numbers can be used but not as the first character.

    Special characters like dollar signs and underscores are allowed, but avoid others like dashes.

###### VARIABLE NAMES EXAMPLES

        hours
        payRate

## 2.5 Modifying Variables

    Instead of hardcoding values, initialize variables with default values and then update them based on user input to make your Java programs more flexible and interactive.

    Use the Scanner class from the java.util package to read user input, choosing the appropriate method like nextInt() for integers or nextDouble() for decimal numbers.

    Remember to import the Scanner class and close the Scanner object after use to free up resources.

###### PROGRAM EXAMPLE

    public class GrossPayCalculator {  //this is a class

    public static void main(String[] args){
        //1.- Get the number of hours worked
            int hours = 0;
            System.out.println("How many hours did you work?"); //It's a way to prompt the user for input, making the program interactive

        Scanner scanner = new Scanner(System.in); //creates a Scanner object that reads input from the keyboard
        hours = scanner.nextInt(); // waits for the user to type an integer number and then stores that number in the variable

//This allows your program to get data from the user instead of using fixed values, making it interactive and flexible.

        //2.- Get the hourly pay rate
            double payRate = 0;
            System.out.println("What is your pay rate?");
            payRate = scanner.nextDouble(); //his allows your program to get the pay rate dynamically instead of using a fixed value, making it interactive and adaptable to different inputs.

            scanner.close(); //is used to close the Scanner object once you're done reading input.

        //3.- Multimply hours and pay Rate
            double grossPay = hours * payRate;

        //4.- Display Result
            System.out.println("Gross Pay: " + grossPay);
    }

}

## 2.5 Arithmetic Operators

    Java provides five main operators for math calculations: plus (+) for addition, minus (-) for subtraction, asterisk (*) for multiplication, slash (/) for division, and percent (%) for modulo (remainder).

    These operators work with numeric data types like byte, short, int, long, float, and double.

    The plus (+) operator is special because it also concatenates (joins) strings, not just adds numbers.

    The modulo operator (%) calculates the remainder of division, which is useful in many programming scenarios.

###### ILUSTRATION EXAMPLES

    int a = 10;
    int b = 3;

    int sum = a + b; // 13
    int difference = a - b; // 7
    int product = a * b; // 30
    int quotient = a / b; // 3 (integer division)
    int remainder = a % b; // 1 (remainder of 10 divided by 3)

    String greeting = "Hello" + " World"; // "Hello World" (string concatenation)

##### 3.0 Decision Structures

## 2.1 If statements

    An if statement lets your program make decisions by executing a block of code only when a specified condition is true.

    The condition inside the parentheses must evaluate to a boolean value (true or false).

    If the condition is true, the code inside the curly braces runs; if false, it is skipped.

    This structure allows your program to take different paths based on different situations, making it flexible and dynamic.

###### STRUCTURE

if (condition) {
// code to run if condition is true
}

- if is a reserved word signaling the decision structure.
- The condition is a boolean expression inside parentheses.
- The code block to execute if true is enclosed in curly braces.

###### ILUSTRATION EXAMPLE

int salary = 1000;
int bonus = 250;
int sales = 15;
int quota = 10;

if (sales > quota) {
salary = salary + bonus;
}
System.out.println("Total pay: $" + salary);

--Since sales (15) is greater than quota (10), the bonus is added, resulting in a total pay of $1250. This approach helps you write programs that respond to different inputs and conditions, essential for real-world applications.

## 2.2 if-else statements

    The if-else statement lets your program choose between two distinct paths based on a condition.

    If the condition inside the if statement is true, the code inside its block runs; if false, the code inside the else block runs.

    The else clause does not have a condition because it covers all cases where the if condition is false.

    After executing one of the branches, the program continues with the main flow.

###### STRUCTURE

if (condition) {
// code to run if condition is true
} else {
// code to run if condition is false
}

- The (condition) is a boolean expression inside parentheses.
- The blocks of code are enclosed in curly braces.

###### ILUSTRATION EXAMPLE

int sales = 15;
int quota = 10;

if (sales >= quota) {
System.out.println("Congrats, you met the quota!");
} else {
System.out.println("You need " + (quota - sales) + " more sales.");
}

## 2.3 if-else-if statements

## 2.4 Switch statements

## 2.5 Switch expressions

## 2.6 Relational operators

## 2.7 Logical Operators

## 2.8 Short circuit logic

##### 2.0 Variables

## 2.1

##### 2.0 Variables

## 2.1
