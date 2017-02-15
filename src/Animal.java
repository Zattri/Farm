public class Animal {


    // Declare the data set for storing animal data
    String[][] animalArr = {{"Cow", "Bovine", "2500", "2000"}, {"Pig", "Bovine", "800", "600"},
            {"Horse", "Equidae", "5000", "4000"}, {"Sea Serpent", "Dragon", "10000", "0"}};

    public Animal() {
    }

    public String name;
    public String species;
    public int buyValue;
    public int sellValue;

    public void genStats(int animalNum) {
        this.name = animalArr[animalNum][0];
        this.species = animalArr[animalNum][1];
        this.buyValue = Integer.parseInt(animalArr[animalNum][2]);
        this.sellValue = Integer.parseInt(animalArr[animalNum][3]);
    }

    public void prtStats() {
        System.out.format("%s - %s \nBuy Value: %d\nSell Value: %d", this.name, this.species, this.buyValue, this.sellValue);
    }

}
