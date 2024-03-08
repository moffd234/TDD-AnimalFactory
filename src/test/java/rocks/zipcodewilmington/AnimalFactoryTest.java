package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */

public class AnimalFactoryTest {

    @Test
    public void createDogTest(){
        // Given
        Date expectedBirthDate = new Date();
        String expectedName = "Doggo";
        Dog doggo = AnimalFactory.createDog(expectedName, expectedBirthDate);

        // When
        String actualName = doggo.getName();
        Date actualDate = doggo.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualDate);
    }
    @Test
    public void createCatTest(){
        // Given
        Date expectedBirthDate = new Date();
        String expectedName = "Sage";
        Cat sage = AnimalFactory.createCat(expectedName, expectedBirthDate);

        // When
        String actualName = sage.getName();
        Date actualDate = sage.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualDate);
    }
}
