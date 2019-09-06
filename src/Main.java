public class Main {

    public static void main(String[] args) {
        int beerNum = 99;
        String word = "sections";

        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " of wall on the beer.");
            System.out.println(beerNum + " " + word + " of wall.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum -= 1;
            if (beerNum == 1) word = "section";
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of wall on the beer. \n");
            } else {
                System.out.println("No more sections of wall on the beer.");
            }
        }
    }
}
