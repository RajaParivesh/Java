package collections;

import collections.stack.GetMinimumElementInStack;
import collections.stack.StackUsingArray;
import collections.stack.StackUsingSinglyLinkedList;
import collections.stack.prefixInfixAndPostfixProblems;

import java.util.Stack;


public class StackRun {


    public static void testStackUsingArray(){
        StackUsingArray s = new StackUsingArray();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
//       s.pop();
        System.out.println("Peek of the stack: "+s.peek());
        System.out.println("size of the stack: "+s.size());
        System.out.println("pop of the stack: "+s.pop());
        System.out.println("pop of the stack: "+s.pop());
        System.out.println("pop of the stack: "+s.pop());
        System.out.println("pop of the stack: "+s.pop());
        System.out.println("pop of the stack: "+s.pop());
        System.out.println("pop of the stack: "+s.pop());
        System.out.println("pop of the stack: "+s.pop());

    }

    public static void testStackUsingSinglyLinkedList(){
        StackUsingSinglyLinkedList s = new StackUsingSinglyLinkedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
//        s.pop();
        System.out.println("Peek of the stack: "+s.peek());
        s.print();

    }

    /**
     * Are Bracket balanced in the expression
     * @param exprssion
     * @return
     */
    public static boolean isBalanceSymbolInExpression(String exprssion) {
        Stack<Character> stk = new Stack<Character>();
        if(exprssion == null || exprssion.length() == 0) {
            return false;
        } else {
            for(int i = 0; i < exprssion.length(); i++){

                if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[' ) {
                    stk.push(exprssion.charAt(i));
                } else if(exprssion.charAt(i) == ')') {
                    if(!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    }else {
                        return false;
                    }
                } else if (exprssion.charAt(i) == ']') {
                    if(!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else if(exprssion.charAt(i) == '}'){
                    if(!stk.isEmpty() && stk.peek() == '{') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }

            // if stack is empty finally , it means symbol is balance in expression
            if(stk.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }


    public static void testPrefixInfixAndPostfixProblems(){
        prefixInfixAndPostfixProblems fix = new prefixInfixAndPostfixProblems();
//      String infixExp = "a+b*(c^d-e)^(f+g*h)-i";
        String infixExp = "((a*b)/d)-E";
        System.out.println(fix.infixToPostfix(infixExp));
        String postfixExp = "231*+9-";
        System.out.println("Postfix evaluation of "+ postfixExp + " is : "+ fix.evaluatePostfixUsingStack(postfixExp));
    }

    public static void testGetMinimum(){
        GetMinimumElementInStack m = new GetMinimumElementInStack();
        m.push(2);
        m.push(1);
        m.push(9);
        m.push(7);
        m.push(8);
        System.out.println(m.getMinimum());
    }

    public static void main(String args[]){
//        testStackUsingArray();
//        testStackUsingSinglyLinkedList();
//        testStackUsingArray();
//        System.out.println("Are Bracket balanced in the expression : "+ isBalanceSymbolInExpression("askdfjlkajsia}{()"));
//        testPrefixInfixAndPostfixProblems();
        testGetMinimum();

    }
}


