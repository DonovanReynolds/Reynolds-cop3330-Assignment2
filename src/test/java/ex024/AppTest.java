package ex024;

import static ex024.App.isAnagram;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Test for anagrams")
    public void shouldAnswerWithTrue()
    {
        assertFalse(isAnagram("first", "second"));
        assertFalse(isAnagram("testing", "nottest"));
        assertFalse(isAnagram("wall", "Brick"));
        assertTrue(isAnagram("note","tone"));
        assertTrue(isAnagram("NoTe" , "Tone"));
        assertTrue(isAnagram("bird" , "drib"));

    }
}
