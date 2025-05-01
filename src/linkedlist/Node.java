package linkedlist;

public class Node<T> {
    private T obj=null;
    public Node<T> next=null;
    public Node(){}
    public Node(T par){ 
        obj=par;
    }
    public T getObj(){
        return obj;
    }
}
