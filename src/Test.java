import Models.ShuffleCup;

public class Test {
    public static void main(String[] args) {


        ShuffleCup shuffleCup = new ShuffleCup();
        int to = 0;
        int tre = 0;
        int fire = 0;
        int fem = 0;
        int seks = 0;
        int syv = 0;
        int otte = 0;
        int ni = 0;
        int ti = 0;
        int elleve = 0;
        int tolv = 0;
        int toEns = 0;


        for (int x = 100000; x > 0; x--) {
            shuffleCup.roll();

            if (shuffleCup.roll() == 2) {
                to += 1;
            }

            if (shuffleCup.roll() == 3) {
                tre += 1;
            }

            if (shuffleCup.roll() == 4) {
                fire += 1;
            }

            if (shuffleCup.roll() == 5) {
                fem += 1;
            }

            if (shuffleCup.roll() == 6) {
                seks += 1;
            }

            if (shuffleCup.roll() == 7) {
                syv += 1;
            }

            if (shuffleCup.roll() == 8) {
                otte += 1;
            }

            if (shuffleCup.roll() == 9) {
                ni += 1;
            }

            if (shuffleCup.roll() == 10) {
                ti += 1;
            }

            if (shuffleCup.roll() == 11) {
                elleve += 1;
            }

            if (shuffleCup.roll() == 12) {
                tolv += 1;
            }

            if (shuffleCup.getDice1().getFaceValue() == shuffleCup.getDice2().getFaceValue()){
                toEns += 1;
            }

        }

        System.out.println("To = " + to);
        System.out.println("Tre = " + tre);
        System.out.println("Fire = " + fire);
        System.out.println("Fem = " + fem);
        System.out.println("Seks = " + seks);
        System.out.println("Syv = " + syv);
        System.out.println("Otte = " + otte);
        System.out.println("Ni = " + ni);
        System.out.println("Ti = " + ti);
        System.out.println("Elleve = " + elleve);
        System.out.println("Tolv = " + tolv);
        System.out.println("To ens = " + toEns);

    }

}
