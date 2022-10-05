package ca.vanier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class ScoreTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        String args = "7";
        boolean answer = Scores.result(args);
        assertNotNull(answer);
        assertTrue(message:"Checking if scores grater than 6", anser == true);
        
    }
}
