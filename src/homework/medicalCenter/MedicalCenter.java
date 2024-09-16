package homework.medicalCenter;




import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.util.DateUtil;
import homework.medicalCenter.storage.MedicalStorage;
import homework.medicalCenter.util.MedicalCommands;
import homework.medicalCenter.TimeNotAllowedException;
import homework.medicalCenter.model.Profession;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenter implements MedicalCommands {
    private final static MedicalStorage medicalStorage = new MedicalStorage();
    private final static Scanner scanner = new Scanner(System.in);


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
                    medicalStorage.printAllPatients();
                    break;
                default:
                    System.out.println("Wrong command");
            }

        }
    }

    private static void printPatientsByDoctor() {
        medicalStorage.printAllDoctors();
        System.out.println("Please choose doctor ID");
        String doctorId = scanner.nextLine();

            medicalStorage.searchPatientsByDoctor(doctorId);

    }

    private static void addPatient() {
        medicalStorage.printAllDoctors();
        System.out.println("Please choose doctor ID");
        String doctorId = scanner.nextLine();
        Doctor doctor = medicalStorage.getDoctorById(doctorId);
        if (doctor != null) {
            try {
                System.out.println("Please input registration date 09-10-2000 10:00");
                String dateStr = scanner.nextLine();
                Date date = DateUtil.stringToDateByTime(dateStr);

                if (!medicalStorage.isTimeAvailable(date, doctor)) {
                    throw new TimeNotAllowedException("The selected time is not available. Please choose another time.");
                }
                System.out.println("Please input patient id");
                String id = scanner.nextLine();
                System.out.println("Please input patient name");
                String name = scanner.nextLine();
                System.out.println("Please input patient surname");
                String surname = scanner.nextLine();
                System.out.println("Please input phone number");
                String phoneNumber = scanner.nextLine();

                medicalStorage.add(new Patient(id, name, surname, phoneNumber, doctor, date));

            } catch (ParseException e) {
                System.out.println("Error: Please input date in this format 09-10-2000 10:00");
            } catch (TimeNotAllowedException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Invalid doctor id please try again");
        }
    }

    private static void changeDoctorById() {
        System.out.println("Please input id for change doctor");
        String doctorId = scanner.nextLine();
        Doctor doctor = medicalStorage.getDoctorById(doctorId);
        if (doctor != null) {
            System.out.println("Please input doctor's name ");
            String name = scanner.nextLine();
            System.out.println("Please input doctor's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input doctor's phone");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please input doctor's email");
            String email = scanner.nextLine();
            System.out.println("Please input doctor's profession");
            String profession = scanner.nextLine();

            if (!name.isEmpty()) {
                doctor.setName(name);
            }
            if (!surname.isEmpty()) {
                doctor.setSurname(surname);
            }
            if (!phoneNumber.isEmpty()) {
                doctor.setPhone(phoneNumber);
            }
            if (!email.isEmpty()) {
                doctor.setEmail(email);
            }
            if (!profession.isEmpty()) {
                doctor.setProfession(Profession.valueOf(profession.toUpperCase()));
            }
        } else {
            System.out.println("Doctor does not exist!!!");
        }

    }

    private static void deleteDoctorById() {
        medicalStorage.printAllDoctors();
        System.out.println("Please input doctor's id");
        String id = scanner.nextLine();
        medicalStorage.deleteDoctorById(id);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input doctor's profession");
        String profession = scanner.nextLine();
        medicalStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id, name, surname, phone, email, profession ");
        String doctorDataStr = scanner.nextLine();
        String[] doctorDataArr = doctorDataStr.split(",");
        if (doctorDataArr.length == 6) {
            String id = doctorDataArr[0];
            if (medicalStorage.getDoctorById(id) == null) {
                Doctor doctor = new Doctor();
                doctor.setId(id);
                String name = doctorDataArr[1];
                String surname = doctorDataArr[2];
                String phone = doctorDataArr[3];
                String email = doctorDataArr[4];
                String profession = doctorDataArr[5];
                medicalStorage.add(new Doctor(id, name, surname, email, phone, Profession.valueOf(profession.toUpperCase())));
                System.out.println("Doctor added!!!");
            } else {
                System.out.println("Doctor with id " + id + " already exists");
            }
        }
    }
}
