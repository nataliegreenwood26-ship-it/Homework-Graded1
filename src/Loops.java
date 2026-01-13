public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();

    } //main method

    public Loops(){
        countUp();
        countByThrees();
        countDown();
        nestedLoop();
        challengeLoop();

        //call counting methods in here

    }//constructor method

    public void countUp(){
        for (int x = 1; x < 6; x++) {
            System.out.println(x);
        }

    }  //method

    public void countByThrees(){
        for (int x = 3; x < 16; x = x + 3) {
            System.out.print(x+" ");
        }
    }

    public void countDown(){
        System.out.println(" ");
        for (int x = 10; x > 0; x--){
            System.out.print(x + ", ");
        }
        System.out.println(" ");
        System.out.println("Happy Loop Year!");
    }

    public void nestedLoop(){
        for(int x = 1; x < 6; x = x+1){ //outer loop
            for(int y = x; y > 0; y = y - 1 ){ //inner loop
                System.out.print(x + " ");
            }
            System.out.println(" ");

        }

    }

    public void challengeLoop() {
        for (int x = 1; x < 5; x = x + 1) { //outer loop
            for (int y = 1; y < x + 1; y = y + 1) { //inner loop
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
    }   //challenge method

}
