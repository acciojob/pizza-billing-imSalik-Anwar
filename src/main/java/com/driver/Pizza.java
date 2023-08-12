package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    private boolean extraCheeseFlag = true;
    private boolean extraToppingFlag = true;
    private boolean bagTaken = false;
    private boolean isDeluxe = false;
    // Constructor for bade Pizza
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) this.price = 300;
        else this.price = 400;
        this.total += this.price;
    }
    // Constructor for Deluxe Pizza
    public Pizza(Boolean isVeg, int i) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 500;
        } else {
            this.price = 600;
        }
        this.total += this.price;
        this.extraCheeseFlag = false;
        this.extraToppingFlag = false;
        this.isDeluxe = true;
    }

    public int getPrice(){
        return price;
    }

    public void addExtraCheese(){
        if(this.extraCheeseFlag){
            this.total += 80;
            this.extraCheeseFlag = false;
        }
    }

    public void addExtraToppings(){
        if(this.extraToppingFlag){
            if(this.isVeg) this.total += 70;
            else this.total += 120;
            this.extraToppingFlag = false;
        }

    }

    public void addTakeaway(){
        if(!bagTaken){
            this.total += 20;
            bagTaken = true;
        }
    }

    public String getBill(){
        System.out.println("Base Price Of The Pizza: " +this.price);
        if(!this.extraCheeseFlag && !this.isDeluxe) System.out.println("Extra Cheese Added: 80");
        if(!this.extraToppingFlag && !this.isDeluxe) {
            if(this.isVeg) System.out.println("Extra Toppings Added: 70");
            else System.out.println("Extra Toppings Added: 120");
        }
        if(this.bagTaken) System.out.println("Paperbag Added: 20");
        System.out.println("Total Price: "+this.total);
        return "";
    }
}
