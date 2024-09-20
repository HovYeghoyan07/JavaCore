package homework.medicalCenter11.storage;


//public class DoctorStorage {
//    private Doctor[] doctors = new Doctor[10];
//    private int size = -1;
//
//    public void add(Doctor doctor) {
//        if (size == doctors.length) {
//            extendStorage();
//        }
//        doctors[++size] = doctor;
//    }
//
//    private void extendStorage() {
//        Doctor[] tmp = new Doctor[size + 10];
//        System.arraycopy(doctors, 0, tmp, 0, size);
//        doctors = tmp;
//    }
//
//    public void print() {
//        for (int i = 0; i <= size; i++) {
//            System.out.println(doctors[i]);
//        }
//    }
//
//
//    public Doctor getDoctorById(String id) {
//        for (int i = 0; i <= size; i++) {
//            if (doctors[i].getId().equals(id)) {
//                return doctors[i];
//            }
//        }
//        return null;
//    }
//
//    public void searchDoctorByProfessionName(String profession) {
//        for (int i = 0; i <= size; i++) {
//            if (doctors[i].getProfession().equals(profession)) {
//                System.out.println(doctors[i]);
//            }
//        }
//    }
//
//
//    public void deleteDoctorById(String Id) {
//        if (size > -1) {
//            for (int i = 0; i <= size; i++) {
//                if (doctors[i].getId().equals(Id)) {
//                    for (int j = i; j <= size - 1; j++) {
//                        doctors[j] = doctors[j + 1];
//                    }
//                    size--;
//                }
//            }
//        }
//    }
//}
