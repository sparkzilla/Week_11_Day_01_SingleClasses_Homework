public class Printer {

    private int sheetsLeft;
    private int tonerVolume;


    public Printer(int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public int print(int pages, int copies) {
        if (pages * copies <= sheetsLeft) {
            tonerVolume -= (pages * copies);
            return sheetsLeft -= (pages * copies);
        } else {
            return this.sheetsLeft;
        }
    }

}
