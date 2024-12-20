package oo.encapsulation.houseB;

import oo.encapsulation.houseA.Anna;

public class Bob extends Anna{
    void testAcess(){

        Anna mom = new Anna(); 
        
        System.out.println(mom.everyoneKnows);
        // System.out.println(mom.tasksAtHome); Cant access package visibility (because it is not in the same package)
        System.out.println(wayOfSpeech); //Needs to be accessed as an inherited variable to be visible
        // System.out.println(mom.secret); Cant access because its private
    }
}
