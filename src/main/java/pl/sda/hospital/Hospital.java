package pl.sda.hospital;

class Hospital {
    private Patient[] patients;
    private int counter;
    private int maxNrOfPatients;

    Hospital(int maxNrOfPatients) {
        this.maxNrOfPatients = maxNrOfPatients;
        patients = new Patient[maxNrOfPatients];
        counter = 0;
    }

    void addPatient(Patient patient) {
        if(counter < maxNrOfPatients) {
            patients[counter] = patient;
            counter++;
        } else {
            System.out.println("Przykro mi nie możemy Cie przyjąć");
        }
    }

    void displayPatients() {
        for(Patient patient: patients) {
            System.out.println(patient);
        }
    }
}
