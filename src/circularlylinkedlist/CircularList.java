package circularlylinkedlist;

import linkedlist.Node;

public class CircularList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size=0;

    public int getSize(){
        return size;
    }

    public void addLast(T item){
        if(head==null){
            head=new Node<>(item);
            tail=head;
            tail.next=head;
            size++;
        }
        else{
            tail.next=new Node<>(item);
            tail=tail.next;
            tail.next=head;
            size+=1;
        }
    }

    public void addFirst(T item){
        if(head==null){
            head=new Node<>(item);
            tail=head;
            tail.next=head;
            size++;
        }
        else{
            tail.next=new Node<>(item);
            tail.next.next=head;
            head=tail.next;
            size++;
        }
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List empty");
            return;
        }
        tail.next=head.next;
        head=head.next;
        size--;


    }
    public T getLast(){
        if(head==null){
            System.out.println("list empty");
            return null;
        }

        return tail.getObj();
    }

    public T getFirst(){
        if(head==null){
            System.out.println("list empty");
            return null;
        }

        return head.getObj();
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