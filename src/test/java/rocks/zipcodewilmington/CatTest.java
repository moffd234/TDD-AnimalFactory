package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){

        // Given
        Date birthDate = new Date();
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        String expectedNewName = "Stormageddon";

        // When
        sage.setName(expectedNewName);
        String actualNewName = sage.getName();

        // Then
        Assert.assertEquals(expectedNewName, actualNewName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // Given
        Date birthDate = new Date();
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        String expectedCatOutput = "meow!";

        // When
        String catOutput = sage.speak();

        // Then
        Assert.assertEquals(expectedCatOutput, catOutput);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        // Given
        Date birthDate = new Date(2022, Calendar.FEBRUARY, 1);
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        Date expectedDate = new Date(2023, Calendar.JANUARY, 24);

        // When
        sage.setBirthDate(expectedDate);
        Date actualDate = sage.getBirthDate();

        // Then
        Assert.assertEquals(expectedDate, actualDate);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        // Given
        Date birthDate = new Date(2022, Calendar.FEBRUARY, 1);
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        int expectedOutput = sage.getNumberOfMealsEaten() + 1;

        // When
        Food fish = new Food();
        sage.eat(fish);
        int actualOutput = sage.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        Date birthDate = new Date(2022, Calendar.FEBRUARY, 1);
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        int expectedOutput = 0;

        // When
        int actualOutput = sage.getId();

        // Then
        Assert.assertEquals(expectedOutput,actualOutput);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        // Given
        Date birthDate = new Date(2022, Calendar.FEBRUARY, 1);
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        boolean expectedOutput = true;
        // When
        boolean actualOutput = sage instanceof Animal;

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        // Given
        Date birthDate = new Date(2022, Calendar.FEBRUARY, 1);
        String startingName = "Sage";
        Cat sage = new Cat(startingName, birthDate, 0);

        boolean expectedOutput = true;
        // When
        boolean actualOutput = sage instanceof Mammal;

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
