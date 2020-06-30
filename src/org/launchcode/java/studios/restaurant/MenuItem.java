package org.launchcode.java.studios.restaurant;

public class MenuItem{
    //Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private double price;
    private String description;
    private String category;
	//It should be possible to display whether a menu item is new or not
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN){
        this.price=p;
        this.description=d;
        this.category=c;
        this.isNew=iN;
    }

    //set price
    public void setPrice(double price){
        this.price=price;
    }
    //set description

    public void setDescription(String description) {
        this.description = description;
    }

    //set category

    public void setCategory(String category) {
        this.category = category;
    }

    //indicate whether new item
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
