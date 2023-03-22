import homework4.gb.list.GBLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GBLinkedListTest {

    @Test
    void isEmptyTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        assertEquals(true, gbLList.isEmpty());
    }

    @Test
    void isEmptyNegativeTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        assertNotEquals(true, gbLList.isEmpty());
    }

    @Test
    void addFirstTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        assertEquals(1, gbLList.size());
        gbLList.addFirst(1);
        assertEquals(1, gbLList.get(0));
    }

    @Test
    void addFirstNegativeTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(4);
        assertNotEquals(3, gbLList.size());
    }

    @Test
    void addLastTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addLast(10);
        gbLList.addLast(3);
        assertEquals(3, gbLList.get(1));
        assertEquals(2, gbLList.size());
    }

    @Test
    void addTest(){
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        gbLList.add(1);
        gbLList.add(5);
        gbLList.add(3, 1);
        assertEquals(3, gbLList.get(1));
    }

    @Test
    void removeTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        gbLList.add(1);
        gbLList.add(5);
        gbLList.add(3, 1);
        gbLList.remove(1);
        assertEquals(1, gbLList.get(1));
    }

    @Test
    void getTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        gbLList.add(1);
        gbLList.add(5);
        assertEquals(1, gbLList.get(1));
        assertEquals(10, gbLList.get(0));
    }

    @Test
    void sizeTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        gbLList.add(1);
        gbLList.add(5);
        gbLList.add(3, 1);
        assertEquals(4, gbLList.size());
    }

    @Test
    void sizeNegativeTest() {
        GBLinkedList<Integer> gbLList = new GBLinkedList<>();
        gbLList.addFirst(10);
        gbLList.add(1);
        gbLList.add(5);
        gbLList.add(3, 1);
        assertNotEquals(7, gbLList.size());
    }
}
