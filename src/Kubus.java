import java.util.Scanner;

import static java.lang.System.out;

class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    Kubus(String name) {
        super(name);
    }

    /**
     * Overrides the inputNilai method from the parent class.
     * Prompts the user to input the values for the base class's variables and then
     * prompts the user to input the value for the sisi variable.
     *
     * @param None
     * @return None
     */
    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scanner.nextDouble();
    }

    /**
     * Calculates the surface area of a cube.
     *
     * @param sisi the length of each side of the cube
     * @return the surface area of the cube
     */
    @Override
    public void luasPermukaan() {
        double hasil = 6 * Math.pow(sisi, 2); // Rumus luas permukaan kubus
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    /**
     * Calculates the volume of a cube.
     *
     * This method calculates the volume of a cube using the formula: volume =
     * sideLength^3.
     * It then calls the superclass method to perform any additional operations and
     * prints the result.
     *
     * @param sisi the length of the side of the cube
     * @return the volume of the cube
     */
    @Override
    public void volume() {
        double hasil = Math.pow(sisi, 3); // Rumus volume kubus
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
