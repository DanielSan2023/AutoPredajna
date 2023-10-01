import com.engeto.Autopredajna.Auto;
import com.engeto.Autopredajna.AutoPredajna;
import com.engeto.Autopredajna.Majitel;

public class Main {
    public static void main(String[] args) {


        AutoPredajna autopredajna = new AutoPredajna();

        // Přidání auta a majitele pomocí VIN kódu
        Auto auto1 = new Auto("Skoda", 5000, "VIN123");
        Majitel majitel1 = new Majitel("John Doe", "VIN123");

        autopredajna.pridajAuto(auto1.getVin(), auto1);
        autopredajna.pridajMajitela(majitel1.getVin(), majitel1);

        // Vyhledání majitele a vozidla pomocí VIN kódu
        Majitel hledanyMajitel = autopredajna.najdiMajitelaPodlaVIN("VIN123");
        Auto hledaneAuto = autopredajna.najdiAutoPodlaVIN("VIN123");

        System.out.println("Majitel: " + hledanyMajitel.getMeno());
        System.out.println("Auto: " + hledaneAuto.getModel());
    }
    }
