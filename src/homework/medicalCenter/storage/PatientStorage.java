package homework.medicalCenter.storage;

import homework.homework9.model.Author;
import homework.homework9.model.Book;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size = -1;

    public void add(Patient patient) {
        if (size == patients.length) {
            extendStorage();
        }
        patients[++size] = patient;
    }

    private void extendStorage() {
        Patient[] tmp = new Patient[size + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }
    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.println(patients[i]);
        }
    }


    public Patient getPatientById(String id) {
        for (int i = 0; i <= size; i++) {
            if (patients[i].getId().equals(id)) {
                return patients[i];
            }
        }
        return null;
    }

    public void searchPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i <= size; i++) {
            if (patients[i].getDoctor().equals(doctor)){
                System.out.println(patients[i]);
            }
        }
    }




}
