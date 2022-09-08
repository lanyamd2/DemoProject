package com.example.DemoProject.Controller;

import com.example.DemoProject.Model.Boss;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BossController {


    @GetMapping("/boss")//getmapping matches the postman method GET to connect to a database
    public List<Boss> getAllBoss(){
        List<Boss> bossList=new ArrayList<Boss>();

        //returns hard-coded data, real-world application will show code to return from the database
        bossList.add(new Boss(1,"Mulan", 16));
        bossList.add(new Boss(74,"Dove", 47));
        bossList.add(new Boss(903,"Jeremiah", 24));
        bossList.add(new Boss(4,"Boss Baby", 2));

        return bossList;
    }

    @GetMapping("boss/{bossID}")
    public Boss getBosswithID(@PathVariable Integer bossID){

        //returns hard-coded data, real-world application will show code to return from the database (that will be deployed to a server (virtual machine) or a Server)
        return new Boss(3, "Mr. Bean", 44);
    }

    @PostMapping("/boss/newBoss")
    public void addPerson(@RequestBody Boss newBoss){
        //returns hard-coded data, real-world application will show code to return from the database (that will be deployed to a server (virtual machine) or a Server)
        System.out.println("Saving Boss Information to the Database");
    }
}
