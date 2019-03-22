package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
@RequestMapping("/studio")
public class Studio {//was implements RoomInfoInterface


    @ResponseBody
        public void getRent() {
            int studioRent;
            studioRent = 1100;
            System.out.println("rent is $" + studioRent + " per month");

        }


        @ResponseBody
        public void getAvailableUnits() {
            int availableUnits;
            availableUnits = 8;
            if(availableUnits == 1)
            {
                System.out.println("there is only " + availableUnits + " two bedroom unit available");
            }
            else {
                System.out.println("there are " + availableUnits + " two bedroom units available");
            }
        }


        public void getAvailableFloors() {
            String availableFloors;
            availableFloors = "1, 2, 3, and 4";
            if(availableFloors.equals("1"))
            {
                System.out.println("We have a studio apartment available on floor " + availableFloors);
            }
            else {
                System.out.println("We have studio apartments available on floors " + availableFloors);
            }
        }


        public void getMoveInDates() {
            String moveInMonths;
            moveInMonths = "April, May, or June";
            System.out.println("You can move into studio in " + moveInMonths);
        }

@RequestMapping("/all")
        public void getAllRoomInfo() {
            getRent();
            getAvailableUnits();
            getAvailableFloors();
            getMoveInDates();
        }




    public static void main(String[] args) {

       /* ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");


        //Spring to inject the right object implementation in CustomerService for customer using Setter Injection
        //Also, bootstrapping the CustomerService instantiation using factory
        OneBedApartment contextBean = (OneBedApartment) context.getBean("contextBean");

        *//*Customer customer = customerService.getCustomer();
        customer.setFirstName("Michael");
        customer.setLastName("Gerard");
        customer.setCustomerId("AY2345");
*/
        //creates a Counter object to keep track of
      //  Counter unitCount = new Counter(); //was: Counter unitCount = new Counter();
       // unitCount.getValue();
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
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();


        if(input.equals("studio")){
            System.out.println("You selected STUDIO");
            //System.out.println("Currently we have " + unitCount.bedS + " units");
            //studioInfo(); dev note: this is where call was before instantiating instance of Studio
            //creates an instance object for getting studio information
            Studio studio = new Studio();
            studio.getAllRoomInfo();
            //Goes back to the studioInfo method after creating an instance of Studio
            //so the program can continue
            studioInfo();

        }
        if(input.equals("one bedroom")){
            System.out.println("You selected ONE BEDROOM");
            //System.out.println("Currently we have " + unitCount.bedOne + " units");
            System.out.println("Here is what we found: ");
            //uses the RoomInfoInterface to call needed methods
           /* RoomInfoInterface onebdrm = new RoomInfoInterface() {
                @Override
                public void getRent() {

                }

                @Override
                public void getAvailableUnits() {

                }

                @Override
                public void getAvailableFloors() {

                }

                @Override
                public void getMoveInDates() {

                }

                @Override
                public void getAllRoomInfo() {

                }
            };*/

            //goes back through oneBedInfo
            oneBedInfo();
        }
        if(input.equals("two bedroom")){
            System.out.println("You selected TWO BEDROOM");
           // System.out.println("Currently we have " + unitCount.bedTwo + " units");
            System.out.println("Here is more of what we found: ");
            //creates object of type TwoBedroom to call getAllRoomInfo method
            //TwoBedroom twoBedroom = new TwoBedroom();
            //twoBedroom.getAllRoomInfo();
            //calls so program can continue
            twoBedInfo();
        }
        if(input.equals("three bedroom")){
            System.out.println("You selected THREE BEDROOM");
            //System.out.println("Currently we have " + unitCount.bedThree + " units");
            System.out.println("Here is what we found: ");
            //creates object of type ThreeBedroom to call getAllRoomInfo
            //ThreeBedroom threeBedroom = new ThreeBedroom();
            //threeBedroom.getAllRoomInfo();
            //calls so program can continue
            threeBedInfo();
        }
        if(input.equals("user")){
            //OneBedApartment request = new OneBedApartment();
            System.out.println("Enter your apartment number");
            //creates a new scanner for the user to input their apartment number
            Scanner scanner = new Scanner(System.in);
            Object input2 = scanner.nextLine();
            //gets a response from the OneBedApartment class
            //request.setRequest(input2.toString());
           // request.getRequest(""+ scanner);

        }



    }

    @RequestMapping("/try")
    public Object sayHello(){
        return "nnnnmmm";
    }

    public static void threeBedInfo() {
        Studio threeBedPrice = new Studio();

        //goes to amenities method
        threeBedAmmenities();

    }

    public static void oneBedInfo() {
        String oneBedRent = "$1300";
        //also created an int for future use
        int oneBedRentNumber = 1300;
        String availableUnits = "10";
        String availableFloors = "1, 2, 4";
        String moveInDates = "April, June, July, August";
        System.out.println("Rent: " + oneBedRent);
        System.out.println("Available Units: " + availableUnits);
        System.out.println("Available Floors: " + availableFloors);
        System.out.println("Move-in dates: " + moveInDates);

        //creates to set this room price


        System.out.println("Would you like to rent this? ");
        System.out.println("yes or no ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){

            System.out.println("there are now ONE BEDROOM units left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");


        }
        //takes user back to the 3 option directory
        directory();

    }

    public static void studioInfo() {
        //creating and setting the price

        System.out.println("Would you like to see more about our STUDIO apartments?");
        System.out.println("'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            studioAmenities();
        }if(input.equals("no")){
            System.out.println("Going to site directory");
            directory();
        }

    }

    public static void studioAmenities() {
        boolean garageParking = false;
        boolean permitParking = false;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        boolean inUnitWasherDryer = true;
        System.out.println("Covered garage parking: ");
        if(garageParking ==false){
            System.out.println("no");
            System.out.println("currently no other amenities available ");
            directory();//was directory
        }
        System.out.println("Permit Parking: ");
        if(permitParking==false){
            System.out.println("no");
            directory();//
        }
        System.out.println("Pool and Gym access: Yes");
        System.out.println("In unit washer and dryer: " );
        if(inUnitWasherDryer == true){
            System.out.println("yes");
            directory();

        }

    }

    public static void twoBedInfo(){

        //creates to set this room price
        //OneBedApartment twoBedApartment = new OneBedApartment();
        //twoBedApartment.roomTwo("$1600");

        System.out.println("Would you like to see more about our TWO BEDROOM apartments?");
        System.out.println("'yes' or 'no' ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){
            twoBedAmenities();
        }if(input.equals("no")){
            System.out.println("Going to site directory");
            directory();
        }

    }

    private static void twoBedAmenities() {
        boolean garageParking = true;
        boolean permitParking = true;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        boolean inUnitWasherDryer = true;
        System.out.println("Covered garage parking: ");
        if(garageParking ==true){
            System.out.println("yes");
        }
        System.out.println("Permit Parking: ");
        if(permitParking==true){
            System.out.println("yes");
        }
        System.out.println("Pool and Gym access: Yes");
        System.out.println("In unit washer and dryer: ");
        if(inUnitWasherDryer==true){
            System.out.println("yes");
        }
        //this method is here as a helper and for future use
        twoBedFloorPlans();

    }

    private static void twoBedFloorPlans() {
        System.out.println("The floor plans have been sent to your e-mail");
        System.out.println("Would you like to lease this TWO BEDROOM? ");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){

            System.out.println("There are now  ONE BEDROOM units left");
            System.out.println("and  permit parking spots left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
            System.out.println("Your reservation will be active for 24 hours");


        }

    }

    //GUI directory for user
    public static void directory(){
        System.out.println("What would you like to do next?");
        System.out.println("[1] Leasing Office Information ");
        System.out.println("[2] Hours");
        System.out.println("[3] Other");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("1")){
            leasingOfficeInfo();
        }
        if(input.equals("2")){
            hours();
        }
        if(input.equals("3")){
            System.out.println("Please enter your search");
            //dev note: was 'rent'
            search();
        }

    }
    //for showing hours of business for certain offices/areas
    private static void hours() {
        System.out.println("Leasing Office Business Hours: ");
        System.out.println("Mon-Fri 9am-6:30pm");
        System.out.println("Sat 10am-3pm");
        System.out.println("Sun CLOSED");

        System.out.println("Search other building/complex hours");
        System.out.println("[1] Gym hours");
        System.out.println("[2] Pool hours");
        System.out.println("[3] Business Center Hours");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("1")){
            gymHours();
        }
        if(input.equals("2")){
            poolHours();
        }
        if(input.equals("3")){
            businessCenterHours();
        }
    }

    private static void businessCenterHours() {
        System.out.println("Business Center: ");
        System.out.println("NOTE: Available for rent on a 2 hr basis \n" +
                "After, the renter must book the room again ");
        System.out.println("Hours for Rent");
        System.out.println("Mon-Sat 9am-10pm");
        System.out.println("Sun 10am-8pm");
        directory();
    }

    private static void poolHours() {
        System.out.println("Pool hours: ");
        System.out.println("Mon-Fri 5am-10pm ");
        System.out.println("Sat 6am-11pm");
        System.out.println("Sun 6am-8pm");
        directory();
    }

    private static void gymHours() {
        System.out.println("Gym Hours: ");
        System.out.println("24/7");
        System.out.println("Please Note that construction or maintenance \n" +
                "may affect these hours");
        directory();
    }

    private static void leasingOfficeInfo() {
        System.out.println("LEASING OFFICE");
        System.out.println("                ");
        System.out.println("Check with our great staff!");
        EmployeeEmail contact = new EmployeeEmail();
        contact.name = "Stacy ";
        contact.email = "stacyb@apartmentguide.com ";
        contact.phone =" 1(555)232-4566";
        System.out.println(contact.name + contact.email + contact.phone);
    }
    public static void search(){
        System.out.println("Search the site: ");
        System.out.println("Type 'back' to go back to directory");
        System.out.println("or 'lease' to lease this apartment");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("back")){
            directory();
        }
        if(input.equals("lease")){
            //creates an instance and oject of type Counter to count units remaining

            System.out.println("there are now  ONE BEDROOM units left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
            System.out.println("Your request will be reserved for 24 hours ");
            //nn.toString();
        }
    }

    public void roomStudio(String roomPrice) {

    }

public static class EmployeeEmail{
    //separated for possible future extensions
    private String name;
    private String email;
    private String phone;

}
    public static void threeBedAmmenities(){
        boolean garageParking = true;
        boolean permitParking = true;
        boolean POOL_ACCESS = true;
        boolean GYM_ACCESS = true;
        System.out.println("Covered garage parking: ");
        if(garageParking ==true){
            System.out.println("yes");
        }
        System.out.println("Permit Parking: ");
        if(permitParking==true){
            System.out.println("yes");
        }
        System.out.println("Pool and Gym access: Yes");
        System.out.println("            ");
        System.out.println("Would you like to lease this apartment?");
        System.out.println("Type 'yes' or 'no'");
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        if(input.equals("yes")){

            System.out.println("there are now ONE BEDROOM units left");
            System.out.println("and  permit parking spots left");
            System.out.println("Thank you for your business! A representative will contact you \n" +
                    "shortly");
            System.out.println("Your request will be reserved for 24 hours ");
        }
        if(input.equals("no")){
            //returns to directory method to navigate back
            directory();
        }

    }
    //for future use to show floor plans
    public static void floorPlans(){

    }

}



