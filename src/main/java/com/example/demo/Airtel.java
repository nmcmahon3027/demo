package com.example.demo;

public class Airtel implements Sim  {


    public Airtel(){
        System.out.println("[Airtel] Apartment Finder constructor called!");

        Studio.directory(); //!!!!
    }


    @Override
    public void calling(){
        System.out.println("Calling interface");
    }

    @Override
    public void data(){
        System.out.println("browsing now :)");
        System.out.println("Thank you for using Apartment Finder!");
    }
}
