package Patterns.FactoryPattern;

public class PillsManufacturing {
    public static void main(String[] args) {
        PharmaFactory factory = new PharmaFactory();
        Medicine analgin = factory.getMedicine(PillsTypes.ANALGIN);
        Medicine fanigan = factory.getMedicine(PillsTypes.FANIGAN);
        Medicine ibuprofen = factory.getMedicine(PillsTypes.IBUPROFEN);

        analgin.manufacture();
        fanigan.manufacture();
        ibuprofen.manufacture();
    }
}
