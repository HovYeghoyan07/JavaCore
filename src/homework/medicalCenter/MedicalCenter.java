package homework.medicalCenter;



import homework.homework9.storage.util.DateUtil;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;

import java.text.ParseException;
import java.util.Scanner;

public class MedicalCenter implements MedicalCommands {
    private final static PatientStorage patientStorage = new PatientStorage();
    private final static Scanner scanner = new Scanner(System.in);
    private final static DoctorStorage doctorStorage = new DoctorStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            MedicalCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.print();
                    break;
                default:
                    System.out.println("Wrong command");
            }

        }
    }

    private static void printPatientsByDoctor() {
        doctorStorage.print();
        System.out.println("Please choose doctor ID");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor != null) {
            patientStorage.searchPatientsByDoctor(doctor);
        }
    }

    private static void addPatient() {
        doctorStorage.print();
        System.out.println("Please choose doctor ID");
        String doctorId = scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor != null) {
        System.out.println("Please input patient id");
        String id = scanner.nextLine();
            try {
                if (patientStorage.getPatientById(id) == null) {
                    System.out.println("Please input patient name");
                    String name = scanner.nextLine();
                    System.out.println("Please input patient surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input patient phone");
                    String phone = scanner.nextLine();
                    System.out.println("Please input registration date (09-10-2000)");
                    String date = scanner.nextLine();
                    patientStorage.add(new Patient(id, name, surname, phone, doctor, DateUtil.fromStringToDate(date)));
                    System.out.println("Patient added!");
                } else {
                    System.out.println("Patient with " + id + " already exists!");
                }
            } catch (ParseException e) {
                System.out.println("Wrong date format");
            }
        } else {
            System.out.println("wrong doctor id");
        }
    }

    private static void changeDoctorById() {
        doctorStorage.print();
        System.out.println("Please input doctor's ID");
        String doctorId = scanner.nextLine();
        Doctor doctorById = doctorStorage.getDoctorById(doctorId);
        if (doctorById != null) {

            System.out.println("Please input doctor's new name");
            String name = scanner.nextLine();
            System.out.println("Please input doctor's new surname");
            String surname = scanner.nextLine();
            System.out.println("Please input doctor's new phone");
            String phone = scanner.nextLine();
            System.out.println("Please input doctor's new email");
            String email = scanner.nextLine();
            System.out.println("Please input doctor's new profession");
            String profession = scanner.nextLine();
            if (name != null && !name.isEmpty()) {
                doctorById.setName(name);
            }
            if (surname != null && !surname.isEmpty()) {
                doctorById.setSurname(surname);
            }
            if (phone != null && !phone.isEmpty()) {
                doctorById.setPhone(phone);
            }
            if (email != null && !email.isEmpty()) {
                doctorById.setEmail(email);
            }
            if (profession != null && !profession.isEmpty()) {
                doctorById.setProfession(profession);
            }

            System.out.println("Update was succesfully");


        }
    }

    private static void deleteDoctorById() {
        doctorStorage.print();
        System.out.println("Please input doctor's id");
        String id = scanner.nextLine();
        doctorStorage.deleteDoctorById(id);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input doctor's profession");
        String profession = scanner.nextLine();
        doctorStorage.searchDoctorByProfessionName(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id, name, surname, phone, email, profession ");
        String doctorDataStr = scanner.nextLine();
        String[] doctorDataArr = doctorDataStr.split(",");
        if (doctorDataArr.length == 6) {
            String id = doctorDataArr[0];
            if (doctorStorage.getDoctorById(id) == null) {
                Doctor doctor = new Doctor();
                doctor.setId(id);
                doctor.setName(doctorDataArr[1]);
                doctor.setSurname(doctorDataArr[2]);
                doctor.setPhone(doctorDataArr[3]);
                doctor.setEmail(doctorDataArr[4]);
                doctor.setProfession(doctorDataArr[5]);
                doctorStorage.add(doctor);
                System.out.println("Doctor added!!!");
            } else {
                System.out.println("Doctor with id " + id + " already exists");
            }
        }
    }
}
