import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
// Use collection that can store company objects by key/value
        // Use map of key/value pairs where key
        // key is: companyId
        // value is: lastName
        // key: salesRepId: [companyIdOne, companyIdTwo,...]
        /* CREATE HASHMAP COLLECTION */
        Map<ArrayList<SalesRep>, ArrayList<Company>> map = new HashMap<>();
        System.out.println(map);
        // Create file reader object
        // Open Company.csv
        // Each line in CSV, we create a company object

        // Ask user for last name
        // Use that string to lookup sales rep
        // show each company associated to that sales rep

        // Variable for last name string
        String input;
        String[] stringArray;
        ArrayList<SalesRep> salesReps = new ArrayList<>();
        FileReader salesRepFileReader = new FileReader("C:\\Users\\Learner_9ZH3Z121\\IdeaProjects\\MiniHackathonOne\\src\\SalesReps.csv"); // reads the Company.csv
        Scanner sc = new Scanner(salesRepFileReader); // For going through CSV lines

        while (sc.hasNextLine()) {
            input = sc.nextLine();
            stringArray = input.split(",");
            SalesRep salesRep = new SalesRep(stringArray[0], stringArray[1], stringArray[2], stringArray[3], stringArray[4], stringArray[5]);
            salesReps.add(salesRep);
        }
        salesReps.remove(0); // Remove first line

        /* Now we read company data */
        FileReader companyFileReader = new FileReader("C:\\Users\\Learner_9ZH3Z121\\IdeaProjects\\MiniHackathonOne\\src\\Company.csv");
        sc = new Scanner(companyFileReader);
        String companyInput;
        ArrayList<Company> companies = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            companyInput = sc.nextLine();
            // We need:
            // Company Name, Company Id, Country, Industry, Num of Employees
            // Separate arguments to create Company object
            stringArray = companyInput.split(",");
            Company companyObj = new Company(stringArray[0], stringArray[1], stringArray[2], stringArray[3], stringArray[4], stringArray[5], stringArray[6], stringArray[7], stringArray[8], stringArray[9]);
            companies.add(companyObj);
        }

        // At this point we have arrayList of lastNames and arrayList of companies
        map.put(salesReps, companies);
        System.out.println(map);
        /*

        {
         lastName1: [company1, company2, company3];
        }
         */
    }
}