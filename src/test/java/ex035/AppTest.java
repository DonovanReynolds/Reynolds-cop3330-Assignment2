package ex035;
import static ex035.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;


public class AppTest {

    @Test
    @DisplayName("Pick a winner test")
    public void testWinner()
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Homer");
        names.add("Bart");
        names.add("Maggie");
        names.add("Lisa");
        names.add("Moe");

        assertEquals(names.get(3), pickRandom(names,3));

    }

}