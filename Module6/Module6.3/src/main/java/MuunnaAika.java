public class MuunnaAika{
    double kokonaisAika;

    public int toMinutes (double kokonaisAika){
        double minutes = kokonaisAika / 60;
        int result = (int) minutes;
        return result;
    }
    public double toSeconds(double kokonaisAika){
        return kokonaisAika % 60;
    }

    public static void main(String[] args) {
        MuunnaAika muunnaAika = new MuunnaAika();
        System.out.println(muunnaAika.toMinutes(564));
        System.out.println(muunnaAika.toSeconds(564));
    }
}