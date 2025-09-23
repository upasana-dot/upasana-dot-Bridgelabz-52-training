interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private String[] records = new String[10];
    private int count = 0;
    private double dailyRate = 2000;
    private int days = 5;

    public InPatient(String id, String name, int age) { super(id, name, age); }

    @Override
    public double calculateBill() { return dailyRate * days; }

    @Override
    public void addRecord(String record) { records[count++] = record; }

    @Override
    public void viewRecords() {
        for (int i = 0; i < count; i++) System.out.println(records[i]);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String[] records = new String[10];
    private int count = 0;
    private double consultationFee = 500;

    public OutPatient(String id, String name, int age) { super(id, name, age); }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records[count++] = record; }

    @Override
    public void viewRecords() {
        for (int i = 0; i < count; i++) System.out.println(records[i]);
    }
}

// Main
public class HospitalManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P101", "Alice", 30),
            new OutPatient("P102", "Bob", 25)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) ((MedicalRecord) p).addRecord("Checkup done");
            if (p instanceof MedicalRecord) ((MedicalRecord) p).viewRecords();
            System.out.println("-------------------");
        }
    }
}

