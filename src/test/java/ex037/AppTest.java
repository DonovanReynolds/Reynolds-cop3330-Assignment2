package ex037;
import static ex037.App.*;

import static org.junit.Assert.*;

import ex037.PasswordGenerator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;


public class AppTest {


    public ArrayList<Character> makeArr()
    {
        ArrayList<Character> testChars = new ArrayList<>();

        testChars.add('~');
        testChars.add('@');
        testChars.add('#');
        testChars.add('-');
        testChars.add('^');
        testChars.add('*');
        testChars.add('%');
        testChars.add('/');
        testChars.add('.');
        testChars.add('+');
        testChars.add(':');
        testChars.add(';');
        testChars.add('=');
        return testChars;
    }

    @Test
    @DisplayName("Test random characters")
    public void testLetters()
    {
        PasswordGenerator test = new PasswordGenerator();

        for(Character c: test.getLetters())
        {
            assertTrue(Character.isLetter(c));
        }

    }

    @Test
    @DisplayName("Test random specials")
    public void testSpecials()
    {
        PasswordGenerator test = new PasswordGenerator();
        ArrayList<Character> testChars = makeArr();

        for(Character c: test.getSpecials())
        {
            assertTrue(testChars.contains(c));
        }

    }

    @Test
    @DisplayName("Test random Numbers")
    public void testNumbers()
    {
        PasswordGenerator test = new PasswordGenerator();

        for(Character c: test.getNumbers())
        {
            assertTrue(Character.isDigit(c));
        }

    }

    @Test
    @DisplayName("Test Password")
    public void testPassword()
    {
        ArrayList<Character> specialsList = makeArr();
        for (int i = 0; i < 20;i++)
        {
            for (int j = 0; j < 20; j++)
            {
                for (int k = 0; k < 20;k++)
                {
                    int numberCounter = 0;
                    int letterCounter = 0;
                    int specialsCounter = 0;

                    while(i + k > j)
                    {
                        j++;
                    }

                    PasswordGenerator gen = new PasswordGenerator(i,j,k);

                    for (Character c: gen.getPassword())
                    {
                        if (Character.isAlphabetic(c))
                        {
                            letterCounter++;
                        }
                        if (Character.isDigit(c))
                        {
                            numberCounter++;
                        }
                        if (specialsList.contains(c))
                        {
                            specialsCounter++;
                        }

                    }
                    assertTrue(i==numberCounter && j==letterCounter && k==specialsCounter);
                }
            }
        }
    }






}
