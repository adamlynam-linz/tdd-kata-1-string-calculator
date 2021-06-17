# TDD Kata - String Calculator [http://osherove.com/kata]
## Before you start:
 * TRY NOT TO READ AHEAD
 * DO ONE TASK AT A TIME
 * THE TRICK IS TO LEARN TO WORK INCREMENTALLY
 * TEST FIRST
 * REMEMBER TO REFACTOR AFTER EACH TEST PASSES

**Create a class with a single method, add, which receives a string and returns an integer. This is the class we will be testing.**

### 1. Return a zero for an empty string

For example

    "" == 0
    
### 2. If a single number is received, return that number

For example

    "1" == 1
   
### 3. If two numbers are received, separated by a comma, return the sum of those numbers

For example

    "1,2" == 3
    
### 4. Handle receiving any amount of numbers

### 5. Handle new lines as well as commas between numbers

The following input is ok:

    "1\n2,3" == 6
    
The following is INVALID input, so do not expect it:

    "1,\n"

### 6. Support different delimiters between numbers

To change a delimiter, the beginning of the string will contain a separate line that looks like this:   

    "//[delimiter]\n[numbers...]"

For example, since the default delimiter is ‘;’:

    "//;\n1;2" == 3

**Note: All existing scenarios and tests should still be supported**

### 7. Throw an exception if a negative number is included, the exception message should contain the negative number that was included

### 8. If there are multiple negative numbers, ensure all of them appear in the exception message

### 9. Numbers bigger than 1000 should be ignored

For example:

    "1001,2" == 2

### 10. Support delimiters of any length

A multi-character delimiter will be surrounded by square brackets, formatted as:

    "//[delimiter]\n"

For example:

    "//[***]\n1***2***3" == 6

### 11. Allow multiple delimiters

Multiple delimiters will be surrounded by square brackets one after another, formatted as:

    "//[delim1][delim2]\n"

For example:

    "//[*][%]\n1*2%3" == 6

### 12. Refactoring

You reached the end of the exercise. Hopefully you have been refactoring as you go; but consider taking some time to reflect on how you might improve the maintainability or understandability of your code.