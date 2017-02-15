public class Crop {
    // Inside the brackets are the parameters you supply when creating the class
    public Crop(String cropName, int cropPrice, int growTime, int max) {
        // Declare the object variables as the parameters from the constructor method
        name = cropName;
        price = cropPrice;
        grow = growTime;
        state = 0;
        maxState = max;
    }


    // Variables initialised in the class
    protected String name;
    private int price;
    private int grow;
    private int state;
    private int maxState;
    

    public void prtStats(){
        // Non-formatted - System.out.println(this.name + "\nPrice - " + this.price + " | Grow Time - " + this.grow + " | State - " + getState() + "\n");
        System.out.format("%s - Price: %d | Grow Time: %d | State: %s\n", getName(), getPrice(), getGrowTime(), getState());
    }

    // Name variable functions
    public void prtName()
    {
        System.out.println("Name - " + getName());
    }
    public String getName() {
        return this.name;
    }


    // Price variable functions
    public void prtPrice(){
        System.out.println("Price - £" + getPrice());
    }
    private int getPrice() {
        return this.price;
    }


    // Grow variable functions
    public void prtGrow() {
        System.out.println("Grow Time - " + getGrowTime());
    }
    private int getGrowTime() {
        return this.grow;
    }

    // State function, private since it just returns a string we want to use in displaying the state
    private String getState() {
        // Declare a local variable and then modify it to reflect the state of the plant, and if it's ready
        String rtnString;
        if (this.state == this.maxState) {
            rtnString = "READY";
        }
        else {
            rtnString = this.state + "/" + this.maxState;
        }
        // Return the local variable as an output
        return rtnString;
    }

    // Water plant function increases the state of the plant, unless it is maxed
    public void waterPlant() {
        if (this.state < this.maxState) {
            // ++ adds one -- takes one away
            this.state ++;
            System.out.println("Watered " + this.name + "...");
        }
    }
}

// Sub class Tree, of the super class Crop - Use extends
class Tree extends Crop {

    private int height;
    public Tree(String cropName, int cropPrice, int growTime, int max, int treeHeight) {
        // Super declares what variables are inherited from the super class in the sub class
        super(cropName, cropPrice, growTime, max);
        name = getName() + " tree";
        height = treeHeight;
    }

    // New methods declared in Tree, based around the height variable
    public void prtHeight(){
        System.out.format("Height = %dm\n", getHeight());
    }
    private int getHeight() {return this.height;}
}



