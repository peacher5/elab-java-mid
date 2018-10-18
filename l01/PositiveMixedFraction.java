package l01;

// elab-source: PositiveMixedFraction.java

public class PositiveMixedFraction {
    private long wholeNumber;
    private long nominator;
    private long denominator;

    public PositiveMixedFraction(long wholeNumber, long nominator, long denominator) {

        if (denominator == 0)
            throw new RuntimeException("Denominator cannot be zero");

        if (denominator < 0 || wholeNumber < 0 || nominator < 0)
            throw new RuntimeException("All values cannot less than zero");

        this.wholeNumber = wholeNumber;
        this.nominator = nominator;
        this.denominator = denominator;

        while (this.nominator > this.denominator) {
            this.wholeNumber++;
            this.nominator -= this.denominator;
        }

        if (this.nominator == this.denominator) {
            this.wholeNumber++;
            this.nominator = 0;
            this.denominator = 1;
        }
    }

    public PositiveMixedFraction() {
        this(0, 0, 1);
    }

    public long getWholeNumber() {
        return wholeNumber;
    }

    public long getNominator() {
        return nominator;
    }

    public long getDenominator() {
        return denominator;
    }
}
