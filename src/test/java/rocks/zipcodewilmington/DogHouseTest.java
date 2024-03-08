package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testDog(){
        // Given

        Date date = new Date();
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Sage", date, 1);
        int expectedNum = DogHouse.getNumberOfDogs() + 1;

        // When
        DogHouse.add(dog);
        int actualNum = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNum, actualNum);


    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){

        // Given
        Date date = new Date();
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Sage", date, 0);
        Dog expectedOutput = DogHouse.getDogById(dog.getId());

        // When
        DogHouse.add(dog);
        DogHouse.remove(1);
        Dog actualOutput = DogHouse.getDogById(dog.getId());

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog(){
        // Given
        Date date = new Date();
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Sage", date, 1);
        Dog expectedOutput = DogHouse.getDogById(dog.getId());

        // When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actualOutput = DogHouse.getDogById(dog.getId());

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        // Given
        Date date = new Date();
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Sage", date, 1);
        Dog expectedOutput = dog;

        // When
        DogHouse.add(dog);
        Dog actualOutput = DogHouse.getDogById(dog.getId());

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        Date date = new Date();
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Sage", date, 0);
        int expectedOutput = DogHouse.getNumberOfDogs() + 1;

        // When
        DogHouse.add(dog);
        int actualOutput = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
