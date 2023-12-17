package Patterns.FactoryPattern;
public class PharmaFactory {
    public Medicine getMedicine(PillsTypes type){
        Medicine toReturn = null;
        switch (type){
            case ANALGIN:
                toReturn = new Analgin();
                break;
            case FANIGAN:
                toReturn = new Fanigan();
                break;
            case IBUPROFEN:
                toReturn = new Ibuprofen();
                break;
            default:
                throw new IllegalArgumentException("Wrong pill type:" + type);
        }
        return toReturn;
    }
}
