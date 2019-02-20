package world;

import java.util.List;

public final class Continent {

    private final List<Country> listOfCountry;

    public Continent(List<Country> listOfCountry) {
        this.listOfCountry = listOfCountry;
    }

    public List<Country> getListOfCountry() {
        return listOfCountry;
    }
}
