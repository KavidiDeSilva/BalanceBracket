# BalanceBracket

Challenge 2

This Java program checks if a given string of brackets (parentheses, curly braces, and square brackets) is balanced or not. It defines a function called "isValid" that takes a string as input and returns a boolean value indicating whether the brackets are balanced or not. The program uses a stack data structure to keep track of the opening brackets and compare them with the closing brackets in the input string. If a closing bracket is found, the program checks whether it matches the most recent opening bracket on the stack. If not, the brackets are not balanced and the program returns false. If all brackets match and the stack is empty at the end of the iteration, the brackets are balanced and the program returns true.

To run the program, you can follow these steps:

- Install Java on your computer if it's not already installed. You can download it from the official website: https://www.java.com/en/download/

- Open a text editor and copy the code into a new file.

- Save the file with a ".java" extension (e.g., BalanceBracket.java).

- Open a terminal or command prompt and navigate to the directory where the file is saved.

- Compile the code by running the command: javac BalanceBracket.java

- Run the program by running the command: java BalanceBracket

- The program will output the result of the "isValid" function for the default input ("{}"), which should be true. You can change the input by modifying the "x" variable in the "main" function.
