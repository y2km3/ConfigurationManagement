public class BeerSong {

    public static void main (String [] args) {
        BeerSong drinker = new BeerSong();
        drinker.Ninety_Nine_Bottle_of_Beer();
    }


    public void Ninety_Nine_Bottle_of_Beer() {
        
        for (int i = 99; 2 < i; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("take on down, pass it around, " + (i - 1) + " bottles of beer");
        }

    }



}
