package Patterns.FactoryPattern;

public class Analgin implements Medicine {
    @Override
    public void manufacture(){
        System.out.println("Factory is manufacturing 'Analgin'");
    }
}
