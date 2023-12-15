package com.aadhaar;

import java.util.Arrays;
import java.util.List;

public class AadhaarManagement {

    public List<AadhaarProfile> persistPeopleAadhaarDetails(){
        return Arrays.asList(
                new AadhaarProfile(74071674990123L,"Nagendran","Manikumar",
                        22,Gender.MALE,641666,"Tirupur","Perumanallur",
                        "Kanban St","1/306"),
                new AadhaarProfile(74071674990112L,"Surya","Mani",
                        22,Gender.MALE,641333,"Tirupur","Perumanallur",
                        "Sangi St","2/106"),
                new AadhaarProfile(74071674990111L,"Vaishnavi","Senkoda",
                        12,Gender.FEMALE,641444,"Chennai","Avinashi",
                        "DMK St","2/06"),
                new AadhaarProfile(74071674990111L,"Manic","Priyan",
                        78,Gender.MALE,641666,"Tirupur","Kanakkampalayam",
                        "ADMK St","2/06")
        );
    }
}
