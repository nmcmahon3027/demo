package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
public class AddOnProj2Application {

   // private LeasingRepo leasingRepo;

   /* @Autowired
    public AddOnProj2Application(LeasingRepo leasingRepo){
        this.leasingRepo = leasingRepo;
    }
*/
    public List<String> unit;
    public AddOnProj2Application(){
        unit = new ArrayList<String>();
        unit.add(new String("MAccree"));
        unit.add(new String("Yaaaa"));
    }

    public Object ResponseBody;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
       // System.out.println("Config loaded");
        //SpringApplication.run(AddOnProj2Application.class, args);
        TestSpringProject testSpringProject = (TestSpringProject) context.getBean("testBean");
        testSpringProject.showItWorks();

    }

    @RequestMapping("/check")
    public Object sayHello() {
        return "THIS iS mY test";
    }

    @RequestMapping(value = "/rent/studio")
    public Object getRent() {
        int studioRent;
        studioRent = 1100;
        System.out.println("rent is $" + studioRent + " per month");
        return "rent is $" + studioRent + " per month";

    }

    @RequestMapping(value = "/units/{availableUnits}", method = RequestMethod.GET)
    public Object getAvailableUnits(@PathVariable int availableUnits) {
        //int availableUnits;
        availableUnits = 8;
        if (availableUnits == 1) {
            System.out.println("there is only " + availableUnits + " two bedroom unit available");
        } else {
            System.out.println("there are " + availableUnits + " two bedroom units available");
        }
        return availableUnits;


    }

    @RequestMapping(value = "/run/{input}", method = RequestMethod.GET)
    public Object run(@PathVariable String input) {


        if(input.equals("studio")) {
            System.out.println("studio has been PASSED");

            System.out.println("                ");
            System.out.println("Welcome to Apartment Finder!");
            System.out.println("Apartment Finder is ranked Chicago's top choice for renters");
            System.out.println("Average rent here is $1475");
            System.out.println("Please type for a search");
            System.out.println("        ");
            System.out.println("'studio'");
            System.out.println("'one bedroom'");
            System.out.println("'two bedroom'");
            System.out.println("'three bedroom'");
            System.out.println("'user' (I am currently a renter and need assistance)'");
            //creates scanner object for user input
        }
        return "Welcome to Apartment Finder! \n" +
                "Apartment Finder is ranked Chicago's top choice for renters \n" +
                "Average rent here is $1475 \n" +
                "You selected " + input;


    }




    @RequestMapping(value = "/build/{input}", method = RequestMethod.GET)
    public Object build(@PathVariable String input) {



            System.out.println("                ");
            System.out.println("Welcome to Apartment Finder!");
            System.out.println("Apartment Finder is ranked Chicago's top choice for renters");
            System.out.println("Average rent here is $1475");
            System.out.println("Please type for a search");
            System.out.println("        ");
            System.out.println("'studio'");
            System.out.println("'one bedroom'");
            System.out.println("'two bedroom'");
            System.out.println("'three bedroom'");
            System.out.println("'user' (I am currently a renter and need assistance)'");
            //creates scanner object for user input

        return "Welcome to Apartment Finder! \n" +
                "Apartment Finder is ranked Chicago's top choice for renters \n" +
                "Average rent here is $1475 \n" +
                "You selected " + input;


    }

@RequestMapping("/list")
    public Object addToList(){
         List<String> unit;
            unit = new ArrayList<>();
            unit.add(new String("Studio"));
            unit.add(new String("One Bedroom"));
            unit.add(new String("Two Bedroom"));
            unit.add(new String("Three Bedroom"));
            return unit;
    }


    @RequestMapping("/list/price")
    public Object addToListPrice(){
        List<Integer> unitP;
        unitP = new ArrayList<Integer>();
        unitP.add((1100));
        unitP.add((1300));
        unitP.add((1600));
        unitP.add(1900);
        return unitP;
    }


}


