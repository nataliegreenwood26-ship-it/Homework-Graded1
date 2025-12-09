public class Conditionals {
    public String question = "Can dogs and cats be friends?";
    public String response1 = "Never in a million years";
    public String response2 = "Maybe in 6 or 7 months";
    public String response3 = "Yes absolutely!";
    public String response4 = "Without a doubt";
    public String response5 = "No way!";
    public String response6 = "Answer is uncertain";
    public String response7 = "Try again tomorrow!";

    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();

    } //main method

    public Conditionals() {
        System.out.println(question);
        int randomInt = (int)(Math.random() * 11); //0 to 10

    if (randomInt == 1){
        System.out.println(response1);
    }
    else if (randomInt == 2){
        System.out.println(response2);

    }
    else if (randomInt == 3){
        System.out.println(response3);
    }
     else if (randomInt == 4){
        System.out.println(response4);
    }
    else if (randomInt == 5){
        System.out.println(response5);
    }
    else if (randomInt == 6) {
        System.out.println(response6);
    }
    else {
            System.out.println(response7);
    }


    }
}
