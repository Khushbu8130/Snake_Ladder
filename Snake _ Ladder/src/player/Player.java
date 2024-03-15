package player;

import java.util.Scanner;

public class Player {
    String name;
    String emailId;
    String contactNumber;
    String address;
    int age;

    public void setPlayerDetails(String name, String emailId, String contactNumber, String address, int age){
        this.name = name;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.address = address;
        this.age = age;

    }
    public void setPlayerName(String name){
        this.name = name;


    }
    public void getPlayerDetails() {
        System.out.println("Player name: " + this.name);
        System.out.println("Player age: " + this.age);
        System.out.println("Player contactNumber: " + this.contactNumber);
        System.out.println("Player emailId: " + this.emailId);
        System.out.println("Player address: " + this.address);

    }

    public String getPlayerName() {
        return this.name;
    }
    public void setPlayerDetailsFromUserInput (Player p) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name: ");
        String name = scn.nextLine();
        System.out.println("Enter the player contact number: ");
        String contactNumber = scn.nextLine();
        System.out.println("Eneter the player address: ");
        String address = scn.nextLine();
        System.out.println("Enter the player Email Id: ");
        String emailID = scn.nextLine();
        System.out.println("Enter the player age");
        int age = scn.nextInt();
        p.setPlayerDetails(name, address, contactNumber, emailID, age);
    }

}
