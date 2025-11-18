public class MadLib {
   //instance variables
    public String classmate;
    public String city;
    public String noun;
    public String adjective;
    public String pluralNoun;
    public String pluralAnimal;
    public String miltonTeacher;
    public String miltonDean;
    public String season;
    public char letterGrade;
    public char otherlettergrade;
    public boolean trueOrFalse;
    public double decimalBiggerThan1;
    public int number1;
    public int number2;
    public int wholeNumberBetween1And4;



    public static void main(String[] args) {
        System.out.println("MadLibs RULE");

        new MadLib();

    }


    //constructor method
    public MadLib(){
        System.out.println("Yay MadLibs!!");
        classmate = "Spencer";
        city = "Boston";
        noun = "dog";
        adjective = "beautiful";
        pluralNoun = "glasses";
        pluralAnimal = "Geese";
        trueOrFalse = true;
        decimalBiggerThan1 = 80.5;
        number1 = 30;
        number2 = 17;
        wholeNumberBetween1And4 = 3;
        miltonTeacher = "Mx.Bradford";
        miltonDean = "Ms.Sugrue";
        letterGrade = 'A';
        season = "Spring";
        otherlettergrade = 'F';

        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class. But, if we do not survive than we will get a "+otherlettergrade+" in the class :( I hope that we survive and make "+miltonTeacher+" proud!";


//now print story to the dos window
        System.out.println(story);



    }






}
