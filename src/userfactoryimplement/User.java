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
public class User 
{
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
 
    User(UserFactory factory) {
        this.firstName = factory.firstName;
        this.lastName = factory.lastName;
        this.age = factory.age;
        this.phone = factory.phone;
        this.address = factory.address;
    }
 
    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
 
    @Override
    public String toString() {
        return "User name: "+this.firstName+" "+this.lastName+" Age: "+this.age+" Phone No:"+this.phone+" Home Address: "+this.address;
        
    }
}

