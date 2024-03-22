import java.util.Scanner;

import static java.lang.System.out;

class Balok extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(String name) {
        super(name);
    }

    /**
     * Overrides the inputNilai method from the parent class to input the values
     * of panjang, lebar, and tinggi. Calls the inputNilai method of the parent
     * class and prompts the user to input the values of panjang, lebar, and tinggi.
     *
     * @param None
     * @return None
     */
    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    /**
     * A description of the entire Java function.
     *
     * @param paramName description of parameter
     * @return description of return value
     */
    @Override
    public void luasPermukaan() {
        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)); // Rumus luas permukaan balok
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    /**
     * A method to calculate the volume of a block and print the result.
     *
     * @param None
     * @return None
     */
    @Override
    public void volume() {
        double hasil = panjang * lebar * tinggi; // Rumus volume balok
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
