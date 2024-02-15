// Pond Program:
// As part of your internship at Parkville’s Parks and Recreation Department, you’ve been
// asked to write a program that keeps track of pond life. Your program doesn’t have to do
// much—it simply prints pond life forms. For this exercise, provide a Pond class that uses
// the following two instance variables and supports the subsequent main method:

public class chapter9_4 {
        
    public static void main(String[] args) {
        
        Pond pond1 = new Pond();
        Pond pond2 = new Pond("Parkville", null);
        Pond pond3 = new Pond("Parkville", new String[] {"sunfish", "algae", "beer cans", "tires"});

        pond1.display();
        pond2.display();
        pond3.display();

    }
        
}

 class Pond {

    private String city;
    private String[] life = new String[] {"no life"};

    public Pond() {

    }

    public Pond(String city, String[] life) {
        this.city = city;
        this.life = life;
    }
    
    private boolean isValid() {
        if(this.city == null) {
            return false;
        }
        else{
            return true;
        }
    }

    private boolean isLifeValid() { 
        if(this.life == null) {
            return false;
        }
        else { 
            return true;

        }
    }
    public void display() {

        if(isValid() == true) {
            System.out.print(this.city + ": ");
            if(isLifeValid() == true) {
                for(int i= 0; i < this.life.length; i++) {
                    System.out.print(this.life[i]);
                    if(i < this.life.length - 1) {
                        System.out.print(", ");
                    }
                }
            } else {
                System.out.println("none");
            }
            
        }

        else {
            System.out.println("No pond");
        }
    }
}
