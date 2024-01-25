

import java.util.Scanner;

public class chapter9_16 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String character;


        BigBangCharacter[] characters = 
        { new BigBangCharacter("Bernadette", "Melissa Rauch"),
          new BigBangCharacter("Raj", "Kunal Nayyar"), 
          new BigBangCharacter("Amy", "Mayim Bialik"),
          new BigBangCharacter("Sheldon", "Jim Parsons"),
          new BigBangCharacter("Howard", "Simon Helberg"),
          new BigBangCharacter("Leonard", "Johnny Galecki") };

          BigBangCast cast = new BigBangCast(characters);

          character = stdIn.nextLine();
          cast.displayActor(character);

          stdIn.close();
    }
}


 class BigBangCast {

    private BigBangCharacter[] characters;
    

    public BigBangCast(BigBangCharacter[] characters) {
        this.characters = characters;
    }

    public void displayActor(String character) {
        
        for(BigBangCast characters : character) {

        }
    }
}

class BigBangCharacter {
    private String name;
    private String actor;

    public BigBangCharacter(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public String getName() { 
        return this.name;
    }

    public String getActor() {
        return this.actor;
    }
}