//Create a new class VipCustomer.
//It should have 3 fields name, credit limit, and email address.
//1st constructor empty should call the constructor with 3 parameters with default  values.
//2nd constructor should pass on the 2 values it receives and add a default value for the 3rd parameter.
//3rd constructor should shave all fields.
//create getters only for this using code generation of intellij as setters wont be needed
//test the code in the main.

public class VipCustomer {

    private String name;
    private double creditLimit;
    private  String emailAddress;

    public VipCustomer(){
        this("Peter", 25550.00, "peterdavies@gmail.com");
        System.out.println("This is the empty constructor");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "defaultvalue");





    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName() {
        return name;
    }

    public double  getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
