package collections;

import collections.stack.StackUsingArray;
import collections.stack.StackUsingSinglyLinkedList;

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

    public static void main(String args[]){
//        testStackUsingArray();
//        testStackUsingSinglyLinkedList();
//        testStackUsingArray();
        System.out.println("Are Bracket balanced in the expression : "+ isBalanceSymbolInExpression("askdfjlkajsia}{()"));

    }
}


