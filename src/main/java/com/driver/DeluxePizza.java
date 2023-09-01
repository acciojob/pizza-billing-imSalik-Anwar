package com.driver;

public class DeluxePizza extends Pizza {
    private boolean isVeg;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg, 0);
        this.isVeg = isVeg;
    }
}
