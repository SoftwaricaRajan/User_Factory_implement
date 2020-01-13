/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userfactoryimplement;

/**
 *
 * @author MomentumSubash
 */
public class UserFactoryImplement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UserFactory person = new UserFactory("subash", "acharya");
        person.age(28);
        person.address("Sinamangal");
        person.phone("9851179962");
        person.build();
        User my = new User(person);
        
        UserFactory person1 = new UserFactory("momentum", "subash");
        person1.age(28);
        person1.address("Sinamangal");
        person1.phone("9851179962");
        person1.build();
        User my1 = new User(person1);
        
        
        
        
        
//        String p = person.toString();
            
    
 
    System.out.println(""+my+"\n"+my1);
 
    
 
   
    }
    
}
