package _02_smurf;

public class SmurfRunner {
    public static void main(String[] args) {
        Smurf handySmurf = new Smurf("Handy");
        handySmurf.eat();
        System.out.println(handySmurf.getName());

        Smurf papaSmurf = new Smurf("Papa");
        System.out.println(papaSmurf.getName());
        System.out.println(papaSmurf.getHatColor());
        System.out.println(papaSmurf.isGirlOrBoy());

        Smurf smurfette = new Smurf("Smurfette");
        System.out.println("My name is Smurfette");
        System.out.println(smurfette.getHatColor());
        System.out.println(smurfette.isGirlOrBoy());
    }
}
