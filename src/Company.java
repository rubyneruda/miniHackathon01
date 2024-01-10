public class Company {
    String index;
    String id;
    String salesRepId;
    String name;
    String website;
    String country;
    String description;
    String founded; // int for year
    String industry;
    String numOfEmployees;

    public Company (String index, String id, String salesRepId, String name, String website, String country, String description, String founded, String industry, String numOfEmployees) {
        this.index = index;
        this.id = id;
        this.salesRepId = salesRepId;
        this.name = name;
        this.website = website;
        this.country = country;
        this.description = description;
        this.founded = founded;
        this.industry = industry;
        this.numOfEmployees = numOfEmployees;
    }



}