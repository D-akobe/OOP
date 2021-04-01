import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Main {

    public static void main(String[] args) {
	// Objects consist of state and behaviour, it stores its state in fields, also known as variables and expose that behaviour
       //with methods.
        //A class is a template or blueprint fo creating objects.

        Car porsche = new Car();
        Car holden = new Car();
        //porsche.model = "Carrera"; - update the model directly.

        //Now we can update the model use the set model method
        porsche.setModel("911 ");
        //We can then print out the model of the porsche
        System.out.println("Model is " + porsche.getModel());


    //Main class code for the Bankaccount class
        Bankaccount bobsaccount = new Bankaccount("1234567", 0.00, "Bob", "bob@gmail.com", "08102599098");
        System.out.println(bobsaccount.getBalance());
        System.out.println(bobsaccount.getCustomerName());
    //Since we have created the constructor in the Account class, we no longer need set the variables one by one
        //We just pass them into the constructor like so above.
       //bobsaccount.setBalance(0.00);
        //bobsaccount.setCustomerName("Bob");
        //bobsaccount.setNumber("1234567");
        //bobsaccount.setPhoneNumber("08102599098");


        bobsaccount.deposit(100);

        bobsaccount.withdraw(90);

        //Main class code for the VipCustomer class

        VipCustomer david = new VipCustomer();
        System.out.println(david.getName());

        VipCustomer teni = new VipCustomer("jonas", 450.00);
        System.out.println(teni.getName());

        VipCustomer tobi = new VipCustomer("Jonas ", 350.00, "tobexking2@gmail.com");
        System.out.println(tobi.getCreditLimit());
        System.out.println(tobi.getEmailAddress());

        //Main class code for the simple calculator class

        SimpleCalculator cal = new SimpleCalculator();
        cal.setFirstNumber(5.0);
        cal.setSecondNumber(4);
        System.out.println("add = " + cal.getAdditionResult());
        System.out.println("subtract = " + cal.getSubtractionResult());
        cal.setFirstNumber(5.25);
        cal.setSecondNumber(0);
        System.out.println(" multiplication = " + cal.getMultiplicationResult());
        System.out.println(" divison  = " + cal.getDivisionResult());

        //Main class code for person class

        Person joel = new Person();
        joel.setFirstName("");
        joel.setLastName("");
        joel.setAge(10);
        System.out.println("full name = " + joel.getFullName());
        System.out.println("teen = " + joel.isTeen());
        joel.setFirstName("John");
        joel.setAge(18);
        System.out.println("fullName = " + joel.getFullName());
        System.out.println("teen " + joel.isTeen());
        joel.setLastName("Smith");
        System.out.println("full name " + joel.getFullName());



        //Main class code for the Wall class

        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        //Main class code for complex numbers
        ComplexNumber one = new ComplexNumber(1, 1);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);
        ComplexNumber sum = one.sum(two);
        ComplexNumber difference = one.difference(two);


        System.out.println("The first complex number addition is " + sum);

        //Main class code for point







    }
}
