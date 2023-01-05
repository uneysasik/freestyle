package JavaPractices;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;

        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("*WELCOME TO THE REAL ESTATE CALCULATOR! *");
        System.out.println("**********************************************");

        //***************************
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if("Condo".equals(houseType)) {
            propertyPrice = 50000;
        } else if("Townhouse".equals(houseType)) {
            propertyPrice = 75000;
        } else if("Single Family Home".equals(houseType)) {
            propertyPrice = 95000;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        if(numberOfBedrooms > 0) {
            propertyPrice = propertyPrice + numberOfBedrooms * 30000;
        }

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if("Condo".equals(houseType)) {
            System.out.println("Backyard is not available for condo!");
        } else if (backyard == true){
            propertyPrice += 5000;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots = scan.nextInt();
        if(garageSpots > 10 && garageSpots >= 0) {
            System.out.println("Pardon, it's not a public parking!");
        } else {
            propertyPrice += garageSpots * 20000;
        }

        System.out.println("How close is metro station?");
        metroAccessibility = (float) scan.nextDouble();
        if(metroAccessibility <= 1 && metroAccessibility >= 0) {
            propertyPrice += 10000;
        } else if(metroAccessibility < 3) {
            propertyPrice += 5000;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if(highwayAccessibility <= 1 && metroAccessibility >= 0) {
            propertyPrice += 15000;
        } else if(highwayAccessibility <= 5) {
            propertyPrice +=  8000;
        } else if(highwayAccessibility < 20) {
            propertyPrice = (int) (propertyPrice +  4000);
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = (float) scan.nextDouble();
        if(schoolScore < 4 && schoolScore >= 0) {
            propertyPrice += 5000;
        } else if(schoolScore < 8) {
            propertyPrice += 20000;
        } else if(schoolScore <= 10) {
            propertyPrice += 45000;
        }

        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if(smoking) {
            propertyPrice -= 5000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");



    }
}

