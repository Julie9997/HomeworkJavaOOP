import homework4.gb.list.GBArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GBArrayListTest {

    @Test
    void getTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        assertEquals("1", strings.get(0));
    }

    @Test
    void getNegativeTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        assertNotEquals("2", strings.get(0));
    }

    @Test
    void addTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        strings.add("4");
        assertEquals("4", strings.get(1));
    }

    @Test
    void sizeTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        strings.add("4");
        assertEquals(2, strings.size());
    }

    @Test
    void updateTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        strings.add("4");
        strings.update(0, "3");
        assertEquals("3", strings.get(0));
    }

    @Test
    void removeTest() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        strings.add("4");
        strings.remove(0);
        assertEquals(1, strings.size());
    }

    @Test
    void removeTest1() {
        GBArrayList<String> strings = new GBArrayList<>();
        strings.add("1");
        strings.add("4");
        strings.remove(0);
        assertEquals("4", strings.get(0));
    }
}
