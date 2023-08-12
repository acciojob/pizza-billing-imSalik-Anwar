package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    private boolean extraCheeseFlag = true;
    private boolean extraToppingFlag = true;
    private boolean bagTaken = false;
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
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.total += this.price;
        addExtraCheese();
        addExtraToppings();
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
        String res = "";
        res += "Base Price Of The Pizza: "+this.price +"\n";
        if(!this.extraCheeseFlag) res += "Extra Cheese Added: 80\n";
        if(!this.extraToppingFlag) {
            if(this.isVeg) res += "Extra Toppings Added: 70\n";
            else res += "Extra Toppings Added: 120\n";
        }
        if(this.bagTaken) res += "Paperbag Added: 20\n";
        res += "Total Price: "+this.total+"\n";
        return res;
    }
}
