package oo.encapsulation.houseA;

public class Paul {
    void testAcess(){

        Anna wife = new Anna();
        
        System.out.println(wife.everyoneKnows);
        System.out.println(wife.tasksAtHome);
        System.out.println(wife.wayOfSpeech);
        // System.out.println(wife.secret); Cant access because its private
    }
}
