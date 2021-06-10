# TDD Kata - String Calculator [http://osherove.com/kata]
## Before you start:
 * TRY NOT TO READ AHEAD
 * DO ONE TASK AT A TIME
 * THE TRICK IS TO LEARN TO WORK INCREMENTALLY
 * TEST FIRST
 * REMEMBER TO REFACTOR AFTER EACH TEST PASSES

**Create a class with a single method, add, which receives a string and returns an integer. This is the class we will be testing.**

### 1. Return a zero for an empty string

    “” == 0
    
### 2. If a single number is received, return that number

    “1” == 1
   
### 3. If two numbers are received, separated by a comma, return the sum of those numbers

    “1,2” == 3
    
### 4. Handle receiving any amount of numbers

### 5. Handle new lines as well as commas between numbers
  1.	the following input is ok:

    “1\n2,3” == 6
    
  3.	the following is INVALID input, so do not expect it:

    “1,\n”

### 6. Support different delimiters between numbers

To change a delimiter, the beginning of the string will contain a separate line that looks like this:   

    “//[delimiter]\n[numbers...]”

For example
    “//;\n1;2”== 3 since the default delimiter is ‘;’

**Note: All existing scenarios and tests should still be supported**

### 7. Throw an exception if a negative number is included, the exception message should contain the negative number
