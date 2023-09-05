package ch.bbw.cs;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String marke;
    private String modell;
    private double leistung;
    private double preis;
    private double hubraum;

    public Car(String marke, String modell, double leistung, double preis, double hubraum)

    List<Car> myCars = new ArrayList<>();
    {myCars.add(new Car("Skoda","Kodiaq RS",239,31450,1968));
    myCars.add(new Car("Audi","RS6",560, 150000, 3993  ));
    myCars.add(new Car("BMW", "X5 M", 575, 153700, 4395 ));
    myCars.add(new Car("Volvo", "S 90", 314, 72000, 1969 ));
    myCars.add(new Car("Cupra", "Ateca", 300, 77900, 1984));
    myCars.add(new Car("FIAT", "Ducato", 122, 67800, 2198));
    }


}
