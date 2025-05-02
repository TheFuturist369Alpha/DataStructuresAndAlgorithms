import circularlylinkedlist.CircularList;
import linkedlist.LinearList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CircularList<Integer> list=new CircularList<>();
        for(int i=1; i<=10; i++){
            list.addFirst(i);
        }

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.rotate();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());








    }
}