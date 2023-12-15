package com.aadhaar;
import java.util.stream.Stream;

public class AadhaarManipulation {
    private String aadhaarID;
    private String firstName;
    private String lastName;
    private String age;
    private String pinCode;
    private String city;

    private String area;


    public static void main(String[] args) {
        AadhaarManipulation searcher = new AadhaarManipulation();
        searcher.filter("age","22");
    }
    public void filter(String filter, String value){
        switch (filter) {
            case "aadhaarID" -> findByAadhaarID(value);
            case "firstName" -> findByFirstName(value);
            case "lastName" -> findByLastName(value);
            case "age" -> findByAge(value);
            case "pinCode" -> findByPinCode(value);
            case "area" -> findByArea(value);
            case "city" -> findByCity(value);
            default -> System.out.println("Invalid Filter type");
        }
    }
    public Stream<AadhaarProfile> getStream(){
        AadhaarManagement aadhaarManager = new AadhaarManagement();
         return aadhaarManager.persistPeopleAadhaarDetails().stream();
    }
    public void streamFilter(String valueFilter){
        switch (valueFilter){
            case "findAadhaar" -> getStream().filter(o->o.getAadhaarID() == Long.parseLong(aadhaarID)).forEach(System.out::println);
            case "findFirstName" -> getStream().filter(o->o.getFirstName().equalsIgnoreCase(firstName)).forEach(System.out::println);
            case "findLastName" -> getStream().filter(o->o.getLastName().equalsIgnoreCase(lastName)).forEach(System.out::println);
            case "findByAge" -> getStream().filter(o->o.getAge() == Integer.parseInt(age)).forEach(System.out::println);
            case "findPinCode" -> getStream().filter(o->o.getPinCode() == Long.parseLong(pinCode)).forEach(System.out::println);
            case "findArea" -> getStream().filter(o->o.getArea().equalsIgnoreCase(area)).forEach(System.out::println);
            case "findCity" -> getStream().filter(o->o.getCity().equalsIgnoreCase(city)).forEach(System.out::println);
            default -> System.out.println("Invalid value");
        }

    }
    public  void findByAadhaarID(String value){
        this.aadhaarID = value;
        streamFilter("findAadhaar");
    }
    public void findByFirstName(String value){
        this.firstName = value;
        streamFilter("findFirstName");
    }
    public void findByLastName(String value){
        this.lastName=value;
        streamFilter("findLastName");
    }
    public void findByAge(String value){
        this.age=value;
        streamFilter("findByAge");
    }
    public void findByPinCode(String value){
        this.pinCode=value;
        streamFilter("findPinCode");
    }
    public void findByCity(String value){
        this.city=value;
        streamFilter("findCity");
    }
    public void findByArea(String value){
        this.area=value;
        streamFilter("findArea");
    }

}
