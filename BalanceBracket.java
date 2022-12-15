import java.io.*;
import java.util.*;
import java.util.Stack;

class Challenge2 {


	public static boolean isValid(String x) {


		//need atleast 2 brackets to compare
	  if ((x.length() % 2) == 1) {
	  	return false;
	  }
	  else {

	    //Declaring a stack (empty stack) ->  can use this too (Stack stack = new Stack<>();)
	    Stack<Character> stack = new Stack<>(); 


	    for (char brac : x.toCharArray())

	      switch (brac) {
	        case '(': 
	        	// Push the ) in the stack
	        	stack.push(')'); 
	        	break;
	        case '{': 
	        	// Push the } in the stack
	        	stack.push('}'); 
	        	break;
	        case '[': 
	        	// Push the ] in the stack
	        	stack.push(']'); 
	        	break;
	        default :
	        	//if the stack is empty or value not equal to the top of the stack
	          if (stack.isEmpty() || brac != stack.peek()) { 
	          	return false;
	          }
	          // Pop the element in the stack
	          stack.pop();
	      }

	    // Check Empty Stack
	    return stack.isEmpty();
	  }
	}


	public static void main(String[] args) {
		//User input
    	// Scanner in = new Scanner(System.in);
	    // String x = in.nextLine();

	    String x = "{}";

	    boolean response = isValid(x);
	    
	    //true
	    System.out.println(response);

	}



}

