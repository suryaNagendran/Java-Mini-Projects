package com.aadhaar;


public class AadhaarProfile {
    private final long aadhaarID;
    private String firstName;
    private String lastName;
    private int age;
    private final Gender gender;
    private long pinCode;
    private String city;
    private String area;
    private String streetName;
    private String doorNumber;

    public AadhaarProfile(long aadhaarID, String firstName,
                          String lastName, int age, Gender gender,
                          long pinCode, String city, String area,
                          String streetName, String doorNumber) {
        this.aadhaarID = aadhaarID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.pinCode = pinCode;
        this.city = city;
        this.area = area;
        this.streetName = streetName;
        this.doorNumber = doorNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public long getAadhaarID() {
        return aadhaarID;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "AadharProfile{" +
                "aadharID=" + aadhaarID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", pinCode=" + pinCode +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", streetName='" + streetName + '\'' +
                ", doorNumber='" + doorNumber + '\'' +
                '}';
    }
}
