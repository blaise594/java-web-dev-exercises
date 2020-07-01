package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Restaurant {
    public static void main(String[] args){
        MenuItem spaghetti = new MenuItem(14.99, "Spaghetti", "Pasta", true);
        MenuItem burger = new MenuItem(4.99, "Burger", "Burgers", true);
        MenuItem tacos = new MenuItem(10.99, "Tacos", "Value", false);
        //get today's date
        Date currentDate = Calendar.getInstance().getTime();
        ArrayList<MenuItem> firstMenu = new ArrayList<>();

        Menu theMenu = new Menu(currentDate, firstMenu);
        //add items to menu
        theMenu.addItem(spaghetti);
        theMenu.addItem(burger);
        theMenu.addItem(tacos);

        theMenu.printMenu();
        //try removing items
        theMenu.removeItem(tacos);
        theMenu.printMenu();
    }
}
