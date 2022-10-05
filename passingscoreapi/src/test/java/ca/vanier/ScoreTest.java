package ca.vanier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class ScoreTest 
{
    Scores scores = new Scores();

    @Test
    public void shouldAnswerWithTrue()
    {
        String args = "7";
        boolean answer = scores.result(args);
        assertNotNull(answer);
        assertTrue(answer);
        
    }
}
