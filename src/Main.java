public class Main {
    
    public static void main(String args[]){

        Crop[] cropList = new Crop[3];
        cropList[0] = new Crop("Pumpkin", 3, 10, 3);
        cropList[1] = new Crop("Radish", 5, 7, 5);
        cropList[2] = new Crop("Aubergine", 9, 4, 4);
        for (int i = 0; i < 3; i++) {
            cropList[i].prtStats();
        }
        cropList[0].waterPlant();
        cropList[0].prtStats();
        cropList[0].waterPlant();
        cropList[0].waterPlant();
        cropList[0].prtStats();
    }
    
}
