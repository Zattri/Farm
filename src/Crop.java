public class Crop {
    public Crop(String cropName, int cropPrice, int growTime, int max) {
        name = cropName;
        price = cropPrice;
        grow = growTime;
        state = 0;
        maxState = max;
    }


    // Variables declared in the class
    public String name;
    public int price;
    public int grow;
    public int state;
    public int maxState;
    

    public void prtStats(){
        System.out.println(this.name + "\nPrice - " + this.price + " | Grow Time - " + this.grow + " | State - " + getState() + "\n");
    }

    // Name variable functions
    public void prtName()
    {
        System.out.println("Name - " + this.name);
    }
    public String getName() {
        return this.name;
    }


    // Price variable functions
    public void prtPrice(){
        System.out.println("Price - £" + this.price);
    }
    public int getPrice() {
        return this.price;
    }


    // Grow variable functions
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

    // Water plant function increases the state of the plant, unless it is maxed
    public void waterPlant() {
        if (this.state < this.maxState) {
            this.state += 1;
            System.out.println("Watered " + this.name + "...");
        }
    }
}

class Tree extends Crop {

    public int height;
    public Tree(String cropName, int cropPrice, int growTime, int max, int treeHeight) {
        super(cropName, cropPrice, growTime, max);
        name = cropName + " tree";
        height = treeHeight;
    }

    public void prtHeight(){
        System.out.print("Height = " + this.height +"m\n");
    }
}



