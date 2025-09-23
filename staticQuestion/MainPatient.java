class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID + 
                               ", Name: " + name + 
                               ", Age: " + age + 
                               ", Ailment: " + ailment +
                               ", Hospital: " + hospitalName);
        }
    }
}

public class MainPatient {
    public static void main(String[] args) {
        Patient p1 = new Patient(401, "Kiran", 30, "Fever");
        Patient p2 = new Patient(402, "Arjun", 45, "Diabetes");

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}

