package simschool;

import simschool.inhabitants.Professor;
import java.util.ArrayList;
import java.util.Scanner;
import simschool.inhabitants.AbstractInhabitant;


public class SimSchool {


    public static void main(String[] args) {
        
        // set how long to run the virtual world
        final int NUMBER_OF_MOVES = 5;
        
        // start with an empty list of generic inhabitants
        ArrayList<AbstractInhabitant> inhabitantList = new ArrayList<>();

        // add a new professor instance to the list
        Professor profCase = new Professor("Dr. Denise");
        inhabitantList.add(profCase);

        // startup each inhabitant on the list
        for (AbstractInhabitant inhabitant : inhabitantList) {
            inhabitant.Start();
        }

        //display a blank line just for readability
        System.out.println();

        // run the virtual world
        for (int i = 0; i <= NUMBER_OF_MOVES; i++) {
            //display what move we're on
            System.out.println(i);

            // have each inhabitant execute their updated state
            for (AbstractInhabitant inhabitant : inhabitantList) {
                inhabitant.Execute();
            }

            //display a blank line just for readability
            System.out.println();
        }

        // virtual world is winding down - have the inhabitants finish up
        for (AbstractInhabitant inhabitant : inhabitantList) {
            inhabitant.Finish();
        }

        // keep the command window open
        System.out.println("\nPress any key to continue...");
        Scanner scan = new Scanner(System.in);
        scan.next();

    }

}
