package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testCat(){
        // Given

        Date date = new Date();
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Sage", date, 1);
        int expectedNum = CatHouse.getNumberOfCats() + 1;

        // When
        CatHouse.add(cat);
        int actualNum = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNum, actualNum);


    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId(){

        // Given
        Date date = new Date();
        Cat cat = new Cat("Sage", date, 0);
        Cat expectedOutput = CatHouse.getCatById(0);

        // When
        CatHouse.add(cat);
        CatHouse.remove(0);
        Cat actualOutput = CatHouse.getCatById(0);

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat(){
        // Given
        Date date = new Date();
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Sage", date, 1);
        Cat expectedOutput = CatHouse.getCatById(cat.getId());

        // When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actualOutput = CatHouse.getCatById(cat.getId());

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        // Given
        Date date = new Date();
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Sage", date, 0);
        Cat expectedOutput = cat;

        // When
        CatHouse.add(cat);
        Cat actualOutput = CatHouse.getCatById(cat.getId());

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        // Given
        Date date = new Date();
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Sage", date, 1);
        int expectedOutput = 1;

        // When
        CatHouse.add(cat);
        int actualOutput = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
