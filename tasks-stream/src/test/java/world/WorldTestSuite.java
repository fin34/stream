package world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public  void testGetPeopleQuantity(){

        Country england = new Country(new BigDecimal("150"));
        Country poland = new Country(new BigDecimal("250"));
        Country usa = new Country(new BigDecimal("400"));
        Country canada = new Country(new BigDecimal("200"));
        List<Country> listOfCountryEurope = new ArrayList<>();
        listOfCountryEurope.add(england);
        listOfCountryEurope.add(poland);
        List<Country> listOfCountryAmerica = new ArrayList<>();
        listOfCountryAmerica.add(usa);
        listOfCountryAmerica.add(canada);
        Continent europe = new Continent(listOfCountryEurope);
        Continent america = new Continent(listOfCountryAmerica);
        List<Continent> listOfContinent = new ArrayList<>();
        listOfContinent.add(europe);
        listOfContinent.add(america);
        World world = new World(listOfContinent);

        BigDecimal result = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("1000"), result);
    }
}
