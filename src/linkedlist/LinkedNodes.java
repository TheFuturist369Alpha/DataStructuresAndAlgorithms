package linkedlist;

public class LinkedNodes<T> {

    private int size=0;
    private Node<T> head=null;
    private Node<T> tail=null;

    public LinkedNodes( T... args){
        for(T el:args){
            Node<T> newest=new Node<>(el);
            if(head==null){
                head=tail=newest;
                size++;
            }
            else {
                tail.next = newest;
                tail = newest;
                size++;
            }
        }
    }
    public int size(){
        return size;
    }
    public T first(){
        return head.getObj();
    }
    public T last(){
        return tail.getObj();
    }

    public void addFirst(T obj){
        Node<T> node=new Node<>(obj);
            node.next=head;
            head=node;
            size++;

    }

    public void addLast(T obj){
        Node<T> newest=new Node<>(obj);
        tail.next=newest;
        tail=newest;
        size++;
    }

    public void removeFirst(){
        if(size!=0) {
            Node<T> hld = head.next;
            head = null;
            head = hld;
            size--;
        }

    }
    public void removeLast(){
    }

}
