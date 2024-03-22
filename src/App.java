
public class App {

    /**
     * A function to create instances of Tabung, Kubus, and Balok,
     * input their values, and calculate their surface area and volume.
     *
     * @param args an array of command-line arguments for the function
     * @throws Exception if an error occurs during the function execution
     */
    public static void main(String[] args) throws Exception {
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        Balok balok = new Balok("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
