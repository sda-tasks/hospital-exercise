package pl.sda.hospital;

import java.time.LocalDate;
import java.util.Scanner;

public class HospitalLauncher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital(5);

        boolean running = true;

        while (running) {
            System.out.println("1 - dodaj pacjenta \n 2 - wyświetl pacjentów \n 0 - wyjdź z programu");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addPatient(scanner, hospital);
                    break;
                case 2:
                    hospital.displayPatients();
                    break;
                case 0:
                    running = false;
            }
        }

    }

    private static void addPatient(Scanner scanner, Hospital hospital) {
        Patient patient = new Patient();
        System.out.println("Podaj imie");
        patient.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko");
        patient.setLastName(scanner.nextLine());
        System.out.println("Podaj pesel:");
        patient.setPesel(scanner.nextLine());
        System.out.println("Podaj date urodzenia:");
        patient.setBirthDate(LocalDate.parse(scanner.nextLine()));
        hospital.addPatient(patient);
    }
}
