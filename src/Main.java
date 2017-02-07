import java.util.ArrayList;

public class Main {
    
    public static void main(String args[]){

        // ArrayList version of crops - No size required
        ArrayList<Crop> cropList = new ArrayList<Crop>();
        cropList.add(new Crop("Pumpkin", 3, 10, 3)) ;
        cropList.add(new Crop("Radish", 5, 7, 5)) ;
        cropList.add(new Crop("Aubergine", 9, 4, 4));


        // Array version of crops - Must declare size
        Crop[] cropArr = new Crop[3];
        cropArr[0] = new Crop("Pumpkin", 3, 10, 3);
        cropArr[1] = new Crop("Radish", 5, 7, 5);
        cropArr[2] = new Crop("Aubergine", 9, 4, 4);

        Tree tree = new Tree("Apple", 9, 10, 5, 10);

        // Uses ArrayList
        System.out.println("ArrayList Implementation - ");
        for (int i = 0; i < cropList.size(); i++) {
            cropList.get(i).prtStats();
        }

        // Uses Array
        System.out.println("Normal Array Implementation - ");
        for (int i = 0; i < cropArr.length; i++) {
            cropArr[i].prtStats();
        }

        tree.prtStats();
        tree.prtHeight();

        // Animal test variable - Tidy up later
        Animal testAnimal = new Animal();
        testAnimal.genStats(3);
        testAnimal.prtStats();
    }
    
}
