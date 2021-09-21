package ex037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PasswordGenerator {

    private ArrayList<Character> letters;
    private ArrayList<Character> numbers;
    private ArrayList<Character> specials;

    private ArrayList<Character> password;

    public PasswordGenerator()
    {
        generateSpecials();
        generateLetters();
        generateNumbers();
    }

    public PasswordGenerator(int numbersSize, int lettersSize, int specialsSize)
    {

        this.password = new ArrayList<>();
        generateSpecials();
        generateLetters();
        generateNumbers();
        while(numbersSize+ specialsSize > lettersSize)
        {
            lettersSize++;
        }

        getRandomCharacters(lettersSize);
        getRandomNumbers(numbersSize);
        getRandomSpecials(specialsSize);

        Collections.shuffle(password);



    }

    private void generateSpecials()
    {
        this.specials = new ArrayList<>();
        this.specials.add('~');
        this.specials.add('@');
        this.specials.add('#');
        this.specials.add('-');
        this.specials.add('^');
        this.specials.add('*');
        this.specials.add('%');
        this.specials.add('/');
        this.specials.add('.');
        this.specials.add('+');
        this.specials.add(':');
        this.specials.add(';');
        this.specials.add('=');

    }
    private void generateNumbers()
    {
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 10;i++)
        {
            this.numbers.add(Character.forDigit(i,10));
        }
    }
    private void generateLetters()
    {
        this.letters = new ArrayList<>();
        for (int i = 97; i < 123;i++)
        {
            this.letters.add((char)i);
        }
    }

    private void getRandomCharacters(int size)
    {

        for (int i = 0; i < size; i++)
        {
            int random = getRandom(letters.size());
            this.password.add(letters.get(random));
        }

    }
    private void getRandomSpecials(int size)
    {
        for (int i = 0; i < size; i++)
        {
            int random = getRandom(specials.size());
            this.password.add(specials.get(random));
        }
    }
    private void getRandomNumbers(int size)
    {
        for (int i = 0; i < size; i++)
        {
            int random = getRandom(numbers.size());
            this.password.add(this.numbers.get(random));
        }
    }

    private int getRandom(int size)
    {
        Random rand = new Random();
        return rand.nextInt(size);
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Character character : this.password) {
            temp.append(character);
        }
        return temp.toString();
    }

    public ArrayList<Character> getLetters() {
        return letters;
    }

    public void setLetters(ArrayList<Character> letters) {
        this.letters = letters;
    }

    public ArrayList<Character> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Character> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Character> getSpecials() {
        return specials;
    }

    public void setSpecials(ArrayList<Character> specials) {
        this.specials = specials;
    }

    public ArrayList<Character> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<Character> password) {
        this.password = password;
    }
}
