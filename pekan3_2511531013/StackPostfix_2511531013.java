package pekan3_2511531013;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511531013 {

	public static int postfixEvaluate_1013 (String expression) {
		Stack <Integer> s = new Stack <Integer>();
		Scanner input_1013 = new Scanner (expression);
		while (input_1013.hasNext()) {
			if (input_1013.hasNextInt()) {  //an operan (integer)
				s.push(input_1013.nextInt());
			} else {                        //an operator
				String operator_1013 = input_1013.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator_1013.equals("+")) {
					s.push (operand1+operand2);
				} else if (operator_1013.equals("-")) {
					s.push(operand1-operand2);
				} else if (operator_1013.equals("*")) {
					s.push(operand1*operand2);
				} else {
					s.push(operand1/operand2);
				}
			}
		} 
		input_1013.close();
		return s.pop();
	}
	public static void main (String [] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_1013("5 2 5 * + 7 -"));
	}

}
