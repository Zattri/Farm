import java.util.ArrayList;

/*
    A FEW THINGS TO NOTE
    // - This is a single line comment, please read them they're helpful
    The words function and method are inter-changeable in the way I use them (but it's best to call them methods)
    You need public static void main(String args[]) at the beginning of any class file that you wish to be executable
    - Put all the code that you wish to run inside it
    It's best practice to make each separate class you use a separate class file
    You can leave everything public if you want, it's just messier than having private variables and geter methods
    USE GOOGLE - I can't state this enough, if you don't get something look it up
    BE PATIENT - Following the last comment it's going to take some time and effort learning this, keep at it!
    And finally don't forget your ;s
    Have fun =)

    DISCLAIMER -
    You can use and modify this code all you like, do whatever you want with it it's yours now!

 */


public class Main {
    
    public static void main(String args[]){

        // ArrayList version of crops - No size required
        ArrayList<Crop> cropList = new ArrayList<>();
        cropList.add(new Crop("Pumpkin", 3, 10, 3)) ;
        cropList.add(new Crop("Radish", 5, 7, 5)) ;
        cropList.add(new Crop("Aubergine", 9, 4, 4));


        // Array version of crops - Must declare size
        Crop[] cropArr = new Crop[3];
        cropArr[0] = new Crop("Pumpkin", 3, 10, 3);
        cropArr[1] = new Crop("Radish", 5, 7, 5);
        cropArr[2] = new Crop("Aubergine", 9, 4, 4);


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

        // Tree test - Declare an object to a variable instead of a place in an array
        Tree tree = new Tree("Apple", 9, 10, 5, 10);
        tree.prtStats();
        tree.prtHeight();

        // Animal test variable - Tidy up later
        Animal testAnimal = new Animal();
        testAnimal.genStats(3);
        testAnimal.prtStats();
    }
    
}
