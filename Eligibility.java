package type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Eligibility {

    public static void main(String[] args) throws IOException {
        Scanner obj = new Scanner(System.in);
        BufferedReader show = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of candidates : ");
        int x = obj.nextInt();
        for(int i=1; i<=x; i++){
        System.out.println("Enter your name:");
        String s1 = show.readLine();
        System.out.println("enter your DOB");
        System.out.println("Date : ");
        int date = obj.nextInt();
        System.out.println("Month : ");
        int month = obj.nextInt();
        System.out.println("Year : ");
        int year = obj.nextInt();
        System.out.println("Enter your gender:");
        String s3 = show.readLine();
        LocalDate Cur = LocalDate.of(2021, 12, 31);
        LocalDate dob = LocalDate.of(year, month, date);
        long Years = ChronoUnit.YEARS.between(dob, Cur);
        System.out.println(Years);
        switch (s3) {
            case "Male":
                System.out.println("Name : " + s1);
                if (Years < 18) {
                    System.out.println("Not Eligible for Voting");
                    System.out.println("No Booth Number");
                } else if (18 <= Years && 31 > Years) {
                    System.out.println("Eligible for Voting");
                    System.out.println("Your Booth number is 1");
                } else if (31 <= Years && Years <= 60) {
                    System.out.println("Eligible for Voting");
                    System.out.println("Your Booth number is 2");
                } else {
                    System.out.println("Eligible for Voting");
                    System.out.println("Your Booth number is 3");
                }
                break;
            case "Female":
                System.out.println("Name :" + s1);
                if (Years < 18) {
                    System.out.println("Not Eligible for Voting");
                    System.out.println("no Booth Number");
                } else if (18 <= Years && 46 > Years) {
                    System.out.println("Eligible");
                    System.out.println("Your Booth number is 4");
                } else if (46 <= Years && Years <= 60) {
                    System.out.println("Eligible");
                    System.out.println("Your Booth number is 5");
                } else {
                    System.out.println("Eligible");
                    System.out.println("Your Booth number is 3");
                }
                break;
            case "Transgender":
                System.out.println("Name :" + s1);
                if (Years < 18) {
                    System.out.println("Not Eligible for Voting");
                    System.out.println("No Booth Number");
                } else {
                    System.out.println("Eligible for Voting");
                    System.out.println("Your Booth number is 4");
                }
                break;
            }
        }
    }
}
