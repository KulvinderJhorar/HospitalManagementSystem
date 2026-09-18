import java.util.ArrayList;
import java.util.Scanner;

// Patient class
class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String disease;

    public Patient(int id, String name, int age, String gender, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Patient ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Disease    : " + disease);
    }
}

// Doctor class
class Doctor {
    private int id;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Doctor ID        : " + id);
        System.out.println("Name             : " + name);
        System.out.println("Specialization   : " + specialization);
    }
}

// Appointment class
class Appointment {
    private int patientId;
    private int doctorId;
    private String date;

    public Appointment(int patientId, int doctorId, String date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Doctor ID  : " + doctorId);
        System.out.println("Date       : " + date);
    }
}

// Main Hospital Management System
public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();

    // Add Patient
    static void addPatient() {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, gender, disease));

        System.out.println("\nPatient added successfully!");
    }

    // Add Doctor
    static void addDoctor() {

        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        doctors.add(new Doctor(id, name, specialization));

        System.out.println("\nDoctor added successfully!");
    }

    // Display Patients
    static void displayPatients() {

        if (patients.isEmpty()) {
            System.out.println("\nNo patients found.");
            return;
        }

        System.out.println("\n========== PATIENT LIST ==========");

        for (Patient p : patients) {
            p.display();
        }
    }

    // Display Doctors
    static void displayDoctors() {

        if (doctors.isEmpty()) {
            System.out.println("\nNo doctors found.");
            return;
        }

        System.out.println("\n========== DOCTOR LIST ==========");

        for (Doctor d : doctors) {
            d.display();
        }
    }

    // Book Appointment
    static void bookAppointment() {

        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("\nPlease add at least one patient and one doctor first.");
            return;
        }

        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();

        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Appointment Date: ");
        String date = sc.nextLine();

        boolean patientFound = false;
        boolean doctorFound = false;

        for (Patient p : patients) {
            if (p.getId() == patientId) {
                patientFound = true;
                break;
            }
        }

        for (Doctor d : doctors) {
            if (d.getId() == doctorId) {
                doctorFound = true;
                break;
            }
        }

        if (!patientFound) {
            System.out.println("Patient not found!");
            return;
        }

        if (!doctorFound) {
            System.out.println("Doctor not found!");
            return;
        }

        appointments.add(
            new Appointment(patientId, doctorId, date)
        );

        System.out.println("\nAppointment booked successfully!");
    }

    // Display Appointments
    static void displayAppointments() {

        if (appointments.isEmpty()) {
            System.out.println("\nNo appointments found.");
            return;
        }

        System.out.println("\n========== APPOINTMENTS ==========");

        for (Appointment a : appointments) {
            a.display();
        }
    }

    // Search Patient
    static void searchPatient() {

        System.out.print("Enter Patient ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Patient p : patients) {

            if (p.getId() == id) {
                System.out.println("\nPatient Found!");
                p.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nPatient not found!");
        }
    }

    // Main method
    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("       HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Search Patient");
            System.out.println("8. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    addDoctor();
                    break;

                case 3:
                    displayPatients();
                    break;

                case 4:
                    displayDoctors();
                    break;

                case 5:
                    bookAppointment();
                    break;

                case 6:
                    displayAppointments();
                    break;

                case 7:
                    searchPatient();
                    break;

                case 8:
                    System.out.println("\nThank you for using the system!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
