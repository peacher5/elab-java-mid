package l01;

// elab-source: Main.java
// elab-mainclass: Main

public class Main {
    public static void main(String[] args) {
        PositiveMixedFraction fraction = new PositiveMixedFraction();
//        PositiveMixedFraction fraction = new PositiveMixedFraction(1, 12, 9);
        System.out.println(fraction.getWholeNumber());
        System.out.println(fraction.getNominator());
        System.out.println(fraction.getDenominator());
    }
}