import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;


public class ListTests {

    @Test
    public void testMerge() {

        List<String> input1 = new ArrayList<>();
        input1.add("apple");
        input1.add("pear");

        List<String> input2 = new ArrayList<>();
        input2.add("kiwi");
        input2.add("banana");

        List<String> finalList = ListExamples.merge(input1, input2);
        
        assertEquals(4, finalList.size());
    }
    
}
