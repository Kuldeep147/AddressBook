package com.bzl.addbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program.");
        AddressBook ob = new AddressBook();
        ob.addressBook();

    }
    String firstName ;
    String lastName ;
    String address ;
    String city ;
    String state ;
    String phoneNumber;
    String email ;

    public String getAddress (){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter First name : ");
        firstName = sc.nextLine();
        sb.append("Name : "+ firstName + " ");
        System.out.println("Enter lastname : ");
        lastName = sc.nextLine();
        sb.append(lastName+ " ,");
        System.out.println("Enter address : ");
        address = sc.nextLine();
        sb.append(" Address : "+ address + " ,");
        System.out.println("Enter your city : ");
        city = sc.nextLine();
        sb.append("City : "+city+ " ,");
        System.out.println("Enter State : ");
        state = sc.nextLine();
        sb.append("State : "+state+" ,");
        System.out.println("Enter Phone Number : ");
        phoneNumber = sc.nextLine();
        sb.append("Phone number : "+phoneNumber+ " ,");
        System.out.println("Enter email : ");
        email = sc.nextLine();
        sb.append("Email id : "+email+ " .");
        return sb.toString();
    }
    public void addressBook(){
        HashMap<String, String> addressbook = new HashMap<String, String>();
        String add ;
        Scanner sf = new Scanner(System.in);
        boolean t = false;
        while ( t == false ){
            System.out.println("Enter 1. To Add new contact.\n 7. To Exit. \n 2. To edit existing contact. You have to enter all data again now.\n 3. To see last added details.  \n");
            int i = sf.nextInt();
            switch (i){
                case 1:
                    add = getAddress();
                    addressbook.put(firstName, add);
                    break;
                case 7 :
                    t = true;
                    break;
                case 2:
                    System.out.println("Enter first name of contact to edit : ");
                    add = getAddress();
                    addressbook.replace(firstName, add);
                    break;
                case 3:
                    String details = addressbook.get(firstName);
                    System.out.println(details);
                    break;
            }
        }
    }


}