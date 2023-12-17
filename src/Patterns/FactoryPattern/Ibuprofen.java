package Patterns.FactoryPattern;

public class Ibuprofen implements Medicine {
    @Override
    public void manufacture(){
        System.out.println("Factory is manufacturing 'Ibuprofen'");
    }
}