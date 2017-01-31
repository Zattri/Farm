public class Main {
    
    public static void main(String args[]){

        // Just used for changing 2 variables at once
        int listLen = 3;

        Crop[] cropList = new Crop[listLen];
        cropList[0] = new Crop("Pumpkin", 3, 10, 3);
        cropList[1] = new Crop("Radish", 5, 7, 5);
        cropList[2] = new Crop("Aubergine", 9, 4, 4);
        Tree tree = new Tree("Apple", 9, 10, 5, 10);
        for (int i = 0; i < listLen; i++) {
            cropList[i].prtStats();
        }
        tree.prtStats();
        tree.prtHeight();
    }
    
}
