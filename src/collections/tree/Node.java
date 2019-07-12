package collections.tree;

/* Class containing left and right child of current node and key value*/

public class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }


    public void insert(int value){
            if(value <= data){
                if(left == null){
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            }else {
                if(right== null){
                    right = new Node(value);
                }else{
                    right.insert(value);
                }
            }
    }

    public boolean constains(int value) {
        if(value == data){
            return  true;
        }else if(value <= data){
            if(left == null){
                return false;
            }else {
                left.constains(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
               return right.constains(value);
            }
        }
        return false;
    }


    public void printInOrder(){
        if (left != null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        System.out.println(data);
        if(left != null){
            left.printPreOrder();
        }
        if(right != null){
            right.printPreOrder();
        }
    }



}


