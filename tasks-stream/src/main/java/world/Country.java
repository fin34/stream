package world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;

    public Country(BigDecimal quantityPeople) {
        this.peopleQuantity = quantityPeople;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
