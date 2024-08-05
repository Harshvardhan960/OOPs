package Encapsulation;

public class Staudent {

    public String name;
    private String dob;
    public String gender;
    public int rollNumber;

    public Staudent(String name, String dob, String gender, int rollNumber) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.rollNumber = rollNumber;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String showDOB()
    {
        return dob;
    }
}
