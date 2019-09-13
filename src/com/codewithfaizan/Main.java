package com.codewithfaizan;

import java.util.Scanner;

public class Main {

    public static int loanEligibilityCalculator(int customerAge, String customerGender, int customerAssets, String customerProfession){
        int result =0;

        if (customerAge >= 16 & customerAge <= 25 & customerAssets < 25000){

            if(customerProfession.equals("s")){
                    result = 10000;
            }
            else  if (customerProfession.equals("p")){
                result = 15000;
            }
        }

        else if (customerAge >= 26 & customerAge <= 40 & customerAssets < 40000){

            if(customerGender.equals("m")){

                result = 25000;
            }
            else  if (customerGender.equals("f")){
                result = 30000;
            }
        }


        else if (customerAge >= 41 & customerAge <= 60 & customerAssets < 50000){

            result = 40000;
        }



        else if (customerAge > 60 & customerAssets < 25000){


            if (customerProfession.equals("s") ){

                result = 30000 - customerAge * 100;

            }

            else if(customerProfession.equals("r")){

                result = 25000 - customerAge * 100;
            }

            else
            {
                System.out.println("You're inserting incorrect values");
            }
        }

        else
        {
            System.out.println("Sorry!! You're Not Eligible for this loan" );
        }



        return result;
    }




    public static void main(String[] args) {


        System.out.println("Enter Customer's Age: ");
        int customerAge = new Scanner(System.in).nextInt();

        System.out.println("Enter Customer's Gender 'M' for Male and 'F' for Female: ");
        String customerGender = new Scanner(System.in).next().toLowerCase();

        System.out.println("Enter The Value of Customer's total Assets In Rupees: ");
        int customerAssets = new Scanner(System.in).nextInt();

        System.out.println("Enter Customer's Profession 'S' for Self-Emplaoyed and 'P' for Professional or 'R' if Retired:");
        String customerProfession = new Scanner(System.in).next().toLowerCase();


        System.out.println("You're Eligible for the Loan of:" + loanEligibilityCalculator(customerAge,customerGender,customerAssets,customerProfession));

    }
}
