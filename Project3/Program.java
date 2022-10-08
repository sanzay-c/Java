public class Program {
    public static void main(String[] args) {
        Instrument guitar = new Instrument("guitar");
        guitar.setInstrumentId(45);
        guitar.display();
        System.out.println();
        InstrumentToRent drum = new InstrumentToRent("Drum", 10000);
        drum.display();
        System.out.println();
        InstrumentToSell flute = new InstrumentToSell("Flute", 10000);
        flute.display();
    }
}
