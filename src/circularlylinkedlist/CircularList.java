package circularlylinkedlist;

import linkedlist.Node;

public class CircularList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size=0;

    public int getSize(){
        return size;
    }

    public void addFirst(T item){
        if(tail==null){
            tail=new Node<>(item);
            tail.next=tail;
            size++;
        }
        else{
            Node<T> next=tail.next;
            tail.next=new Node<>(item);
            tail.next.next=next;
            size+=1;
        }
    }

    public void addLast(T item){
        if(tail==null){
            tail=new Node<>(item);
            tail.next=tail;
            size++;
        }
        else{
           Node<T> last=new Node<>(item).next=tail;
            tail=last;
            size++;
        }
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List empty");
            return;
        }

        Node<T> rfirst=tail.next.next;
        tail.next=null;
        tail.next=rfirst;

        size--;


    }

    public void rotate(){
        if(tail!=null)
            tail=tail.next;
    }
    public T getLast(){
        if(!(tail==null))
            return tail.getObj();
        return null;


    }

    public T getFirst(){
        if(!(tail==null))
            return tail.next.getObj();
        return null;
    }


    /*
    Can't be done with a circularly linked list

    public void removeLast(){

        if(head==null){
            System.out.println("List empty");
            return;
        }


    }
    */


}