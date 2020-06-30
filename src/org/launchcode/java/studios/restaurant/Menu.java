package org.launchcode.java.studios.restaurant;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    //The app should know when the menu was last updated,
    // so visitors can see that the restaurant is constantly changing and adding exciting new items
    private Date lastUpdated;
    //The menu consists of several menu items
    private ArrayList<MenuItem> menuItemsList;

    public Menu(Date d, ArrayList <MenuItem>mIL){
        this.lastUpdated=d;
        this.menuItemsList=mIL;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setMenuItemsList(ArrayList<MenuItem> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItemsList() {
        return menuItemsList;
    }
}
