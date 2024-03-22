import java.util.Scanner;

public class Tabung extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    Tabung(String name) {
        super(name);
    }

    /**
     * Overrides the inputNilai method from the parent class and prompts the user to
     * input the height and radius of a cylindrical shape.
     * This method calls the inputNilai method from the parent class to ensure any
     * necessary setup is performed.
     * It then prompts the user to input the height and radius of the cylindrical
     * shape using the Scanner class.
     * The inputted values are stored in the corresponding instance variables tinggi
     * and jari_jari.
     */
    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();
    }

    /**
     * Calculate the surface area of the object and print the result.
     */
    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan " + getName() + ": " + hasil);
    }

    /**
     * Calculates the volume of a cylinder and prints the result.
     *
     * This method calculates the volume of a cylinder using the formula:
     * volume = π * radius^2 * height. It then calls the volume() method of the
     * parent class to perform any additional calculations, and prints the
     * result along with the name of the cylinder.
     *
     * @return void
     */
    @Override
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        super.volume();
        System.out.println("Hasil volume " + getName() + ": " + hasil);
    }
}