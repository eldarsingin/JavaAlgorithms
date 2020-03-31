import com.algorithms.strings.StringAlgorithms;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringAlgorithmsTest {

    private StringAlgorithms testedInstance = new StringAlgorithms();

    @Test
    public void shouldReturnWordsInReverseOrder(){
        //given
        final String phrase = "the sky is blue";
        //when
        final String result = testedInstance.reverseWords(phrase);
        //then
        assertEquals("blue is sky the", result);
    }

    @Test
    public void shouldReturnEmptyString(){
        //when
        final String result = testedInstance.reverseWords("");
        //then
        assertEquals("", result);
    }

    @Test
    public void shouldReturnNull(){
        //when
        final String result = testedInstance.reverseWords(null);
        //then
        assertNull(result);
    }
}
