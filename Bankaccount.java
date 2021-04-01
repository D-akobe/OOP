//The challenge here is to create a new bank account class , create various fields for the account class
//Create getters and setters for each field
//Create two additional methods
//The first one to allow the customer deposit funds into the account(this should inrement the balance field)
//The second method to allow the customer make a withdrawal, which deducts from the balance field.
//The withdrawal should not process, if there are insufficient funds.
//The code will then be confirmed in the main method.

public class Bankaccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //We are creating a constructor which makes it easier to set the fields of the Bank Account class.
    //A constructor has only the accessmodifier and the name of the class and also the paramaters.
    public Bankaccount(){
        //We are initializing default values for whenever this constructor is called
        this("5678", 2.50, "Defualt", "Defualt address", "default phonre");
        System.out.println(" This is an empty constructor ");
    }
    public Bankaccount(String number, double balance, String customerName, String email, String phoneNumber ){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;

        System.out.println(" Account constructor with parameters called ");

    }


    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(" deposit of  " + depositAmount + " made " + " new balance is  " + this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println(" only " + this.balance + " available. Withdrawal not processed");
        }else{
            this.balance = this.balance - withdrawalAmount;
            System.out.println(" withdrawal of " +withdrawalAmount + " processed " + "Remaining balance is = " + this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}


