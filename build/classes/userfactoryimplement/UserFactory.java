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
public class UserFactory 
    {
        String firstName;
        String lastName;
        int age;
        String phone;
        String address;
 
            public UserFactory(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
            
            public UserFactory firstname(String firstName){
                this.firstName = firstName;
                return this;
            }
            
            public  UserFactory lastname(String lastName){
            this.lastName=lastName;
            return this;
            }
            public UserFactory age(int age) {
                this.age = age;
                return this;
            }
            public UserFactory phone(String phone) {
                this.phone = phone;
                return this;
            }       
            public UserFactory address(String address) {
                this.address = address;
                return this;
            }
        //Return the finally consrcuted User object
            public User build() {
                User user =  new User(this);
                return user;
            }
       
}

