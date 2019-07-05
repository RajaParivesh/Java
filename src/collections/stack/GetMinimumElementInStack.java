package collections.stack;

import java.util.Stack;

public class GetMinimumElementInStack {
    public Stack minStack;
    public Stack tempStack;

    public GetMinimumElementInStack(){
        minStack = new Stack();
        tempStack = new Stack();
    }

    public int top(Stack s){
       return (int)s.peek();
    }

    public void push(int data){
        tempStack.push(data);
        if(minStack.isEmpty() || top(minStack) >= data){
             minStack.push(data);
        }else{
            minStack.push(top(minStack));
        }
    }

    public int pop(){
        if(tempStack.isEmpty()) return -1;
        minStack.pop();
        return (int)tempStack.pop();
    }

    /**
     * Get minimum element of stack and Complexity must be O(1)
     * @return
     */
    public int getMinimum(){
        return top(minStack);
    }
}
