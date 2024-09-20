package homework.medicalCenter11.model;

import java.util.Objects;

public class Doctor extends Person{
    private String email;
    private Profession professionType;

    public Doctor(String id, String name, String surname, String phone, String email, Profession professionType) {
        super(id, name, surname, phone);
        this.email = email;
        this.professionType = professionType;
    }
    public Doctor(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profession getProfession() {
        return professionType;
    }

    public void setProfession(Profession profession) {
        this.professionType = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && professionType == doctor.professionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, professionType);
    }

    @Override
    public String toString() {
        return  super.toString()+
                ",email='" + email + '\'' +
                ", profession=" + professionType +
                '}';
    }
}
