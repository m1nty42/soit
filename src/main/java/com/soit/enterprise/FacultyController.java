package com.soit.enterprise;

import com.soit.enterprise.model.Faculty;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Faculties")
public class FacultyController {



    //Upload Faculty Info
private List<Faculty> theFaculties;


@PostConstruct
private void loadData(){

    //create faculties
    Faculty fac1 = new Faculty(1,"Kelly","Miller","Assistant Professor", "Kelly@uc.edu");
    Faculty fac2 = new Faculty(2,"Robert","Lee","Instructor Educator", "Robert@uc.edu");
    Faculty fac3 = new Faculty(3,"Laura","West","Adjunct- Professor", "Laura@uc.edu");


    //create list
    theFaculties = new ArrayList<>();



    //add to list
    theFaculties.add(fac1);
    theFaculties.add(fac2);
    theFaculties.add(fac3);


}

    //Mapping for "/List"
    @GetMapping("/List")
    public String listFaculties(Model theModel){

    //Add Faculties to the Model
theModel.addAttribute("faculties", theFaculties);

return "list-faculties";

    }
}
