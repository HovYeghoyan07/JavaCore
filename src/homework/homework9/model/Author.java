package homework.homework9.model;

import homework.homework9.storage.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Author {
    private String id;
    private String name;
    private String surname;
    private String phone;
    private Date dateOfBirthday;
    public Author() {

    }

    public Author(String id, String name, String surname, String phone, Date dateOfBirthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(phone, author.phone) && Objects.equals(dateOfBirthday, author.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone, dateOfBirthday);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirthday=" + DateUtil.fromDateToString(dateOfBirthday) +
                '}';
    }
}
