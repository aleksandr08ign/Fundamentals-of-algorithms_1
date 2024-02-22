import org.junit.jupiter.api.Test;
import ru.skypro.FundamentalsOfAlgorithms.exception.NotEmptyException;
import ru.skypro.FundamentalsOfAlgorithms.exception.OutsideTheArrayException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceStringListimplTest {

    ServiceStringListimpl list = new ServiceStringListimpl(10);

    @Test
    void addNotNullTest() {
        assertThrows(NotEmptyException.class, () -> list.add(null));
    }

    @Test
    void addElementTest() {
        var result = list.add("element");
        assertEquals(result, "element");
    }

    @Test
    void addSizeIncreaseTest() {
        var result = list.add("element");
        assertEquals(list.size(), 1);
    }

    @Test
    void indexOfTest() {
        list.add("element1");
        list.add("element2");
        list.add("element1");
        list.add("element3");
        assertEquals(list.indexOf("element1"), 0);

        assertEquals(list.indexOf("element10"), -1);
    }

    @Test
    void lastIndexOfTest() {
        list.add("element1");
        list.add("element2");
        list.add("element1");
        list.add("element3");
        assertEquals(list.lastIndexOf("element3"), 3);

        assertEquals(list.lastIndexOf("element20"), -1);
    }

    @Test
    void getTest() {
        var result = list.add("element");
        assertEquals(list.get(0), "element");
    }

    @Test
    void testOutsideTheArrayException() {
        assertThrows(OutsideTheArrayException.class, () -> list.get(111));
    }

    @Test
    void setTest() {
        list.add("element1");
        list.add("element2");
        list.add("element3");
        assertEquals(list.set(1, "element2"), "element2");
    }

    @Test
    void setExceptionTest() {
        list.add("element1");
        list.add("element2");
        list.add("element3");

        assertThrows(OutsideTheArrayException.class, () ->  list.set(3, "element4"));
    }
}