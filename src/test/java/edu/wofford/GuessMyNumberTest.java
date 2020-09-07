package edu.wofford;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class GuessMyNumberTest {

    @Test
    public void testConstructor() {
        GuessMyNumber g = new GuessMyNumber(42);
        assertThat(g.getTarget(), is(42));
    }

    @Test
    public void testGuessTooLow() {
        GuessMyNumber g = new GuessMyNumber(37);
        GuessMyNumber.Result result = g.guess(15);
        assertThat(result, is(GuessMyNumber.Result.LOW));
    }
   
}
