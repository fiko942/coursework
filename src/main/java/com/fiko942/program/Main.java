package com.fiko942.program;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {

    /**
     * Get the customer details from the scanner input.
     *
     * @param  customer   the customer object to store the details
     * @param  scanner    the scanner object to read the input
     * @return            the customer details along with the period
     */
    private static GetCustomerDetail getCustomereDetail(Customer customer, Scanner scanner) {
        System.out.println("Masukkan nama Anda: ");
        customer.name = scanner.nextLine();

        System.out.println("Masukkan Jenis kelamin (L/P): ");
        String genderInput = scanner.nextLine();
        customer.sex = genderInput.equalsIgnoreCase("p") ? "Perempuan" : "Laki Laki";

        System.out.println("Masukkan tanggal lahir (format: YYYY-MM-DD): ");
        customer.birthDate = LocalDate.parse(scanner.nextLine());

        Period age = Period.between(customer.birthDate, LocalDate.now());
        int years = age.getYears();
        int months = age.getMonths();

        GetCustomerDetail cd = new GetCustomerDetail();
        cd.period = age;
        cd.customer = customer;

        return cd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        GetCustomerDetail customerDetail = getCustomereDetail(customer, scanner);
        System.out.printf("""
                Nama: %s
                Jenis Kelamin: %s
                Usia: %d tahun %d bulan
                """, customer.name, customer.sex, customerDetail.period.getYears(), customerDetail.period.getMonths());
    }
}