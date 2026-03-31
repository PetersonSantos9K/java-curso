package interfaces.ex04;

import interfaces.ex04.model.ComboDevice;
import interfaces.ex04.model.ConcretePrinter;
import interfaces.ex04.model.ConcreteScanner;

public class Program {

    static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice comboDevice = new ComboDevice("2081");
        comboDevice.processDoc("My dissertation");
        comboDevice.print("My dissertation");
        System.out.println("Scan result: "+ comboDevice.scan());
    }
}
