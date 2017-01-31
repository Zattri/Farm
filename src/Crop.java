/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zattri
 */
public class Crop {
    // Variables declared in the class
    private String name;
    private int price;
    private int grow;
    private int state;
    private int maxState;
    
    public Crop(String cropName, int cropPrice, int growTime, int max) {
        name = cropName;
        price = cropPrice;
        grow = growTime;
        state = 0;
        maxState = max;
    }

    public void prtStats(){
        System.out.println(this.name + "\nPrice - " + this.price + " | Grow Time - " + this.grow + " | State - " + getState() + "\n");
    }

    public void prtName(){
        System.out.println("Name - " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public void prtPrice(){
        System.out.println("Price - £" + this.price);
    }

    public int getPrice() {
        return this.price;
    }

    public void prtGrow() {
        System.out.println("Grow Time - " + this.grow);
    }

    public int getGrowTime() {
        return this.grow;
    }

    public String getState() {
        String rtnString;
        if (this.state == this.maxState) {
            rtnString = "READY";
        }
        else {
            rtnString = this.state + "/" + this.maxState;
        }
        return rtnString;
    }

    public void waterPlant() {
        if (this.state < this.maxState) {
            this.state += 1;
            System.out.println("Watered " + this.name + "...");
        }
    }
}



