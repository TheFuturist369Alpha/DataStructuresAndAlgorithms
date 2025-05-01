import linkedlist.LinearList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private static LinearList<Integer> list;

    @BeforeEach
    public void preMeths(){
        list =new LinearList<>(1, 2, 3, 4, 5);
    }
    @Test
    @DisplayName("Remove first")
    public void removeFirst(){
        list.removeFirst();
       assertEquals(4, list.size());

        while(list.size() > 0){
            list.removeFirst();
        }

        assertNull(list.first());
        assertNull(list.last());



    }
    @Test
    @DisplayName("Add last")
    public void  addLast(){
        list.addLast(6);
        assertEquals(6, list.size());
        assertEquals(6, list.last());
    }

    @Test
    @DisplayName("Add first")
    public void  addFirst(){
        list.addFirst(0);
        assertEquals(6, list.size());
        assertEquals(0, list.first());

    }


    @Test
    @DisplayName("Not null check")
    public void notNullTest(){
        assertNotNull(list);
    }


}
