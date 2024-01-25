import java.util.Scanner;

public class chapter9_16 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String character;

        BigBangCharacter[] characters = { 
            new BigBangCharacter("Bernadette", "Melissa Rauch"),
            new BigBangCharacter("Raj", "Kunal Nayyar"),
            new BigBangCharacter("Amy", "Mayim Bialik"),
            new BigBangCharacter("Sheldon", "Jim Parsons"),
            new BigBangCharacter("Howard", "Simon Helberg"),
            new BigBangCharacter("Leonard", "Johnny Galecki") 
        };

        BigBangCast cast = new BigBangCast(characters);

        System.out.print("Enter the name of the character: ");
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

    public void displayActor(String characterName) {
        for (BigBangCharacter character : characters) {
            if (character.getName().equalsIgnoreCase(characterName)) {
                System.out.println(characterName + " is played by " + character.getActor());
                return;
            }
        }
        System.out.println("Sorry! Couldn't find " + characterName + " in this list of characters.");
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