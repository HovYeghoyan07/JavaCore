package homework.medicalCenter11.storage;

import homework.medicalCenter11.model.Doctor;
import homework.medicalCenter11.model.Patient;
import homework.medicalCenter11.model.Person;
import homework.medicalCenter11.model.Profession;

import java.util.Date;


public class MedicalStorage {
    private Person[] persons = new Person[10];
    private int size;

    public void add(Person person) {

        persons[size++] = person;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                if (persons[i].getId().equals(id)) {
                    return (Doctor) persons[i];
                }
            }
        }
        return null;
    }


    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size - 1);
        persons = tmp;
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                if (((Doctor) persons[i]).getProfession().equals(Profession.valueOf(profession.toUpperCase()))) {
                    System.out.println((Doctor) persons[i]);
                }
            }
        }
    }

    public void searchPatientsByDoctor(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                if (((Patient) persons[i]).getDoctor().getId().equals(doctorId)) {
                    System.out.println((Patient) persons[i]);
                }
            }
        }
    }

    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println((Patient) persons[i]);
            }
        }
    }

    public Patient getPatientById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                if (persons[i].getId().equals(id)) {
                    return (Patient) persons[i];
                }
            }
        }
        return null;
    }





    public boolean deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && persons[i] != null && persons[i].getId().equals(id)) {
                for (int j = i; j < size - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                persons[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }



    public void printAllDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println((Doctor) persons[i]);
            }
        }
    }
    public boolean isTimeAvailable(Date date, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().getId().equals(doctor.getId())) {
                    long timeDifference = Math.abs(patient.getRegisterDateTime().getTime() - date.getTime());
                    if (timeDifference < 30 * 60 * 1000) { // Разница меньше 30 минут
                        return false;
                    }
                }
            }
        }
        return true;
    }

}