//The carpet Company has asked me to write an application that calculates the price of carpeting for rectangular rooms
//To calculate the price of carpeting, I would have to multiply the area of the floor (width times length )
//by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is
//120 square meters. To cover the floor with a carpet that cost $8 per square meter would cost $ 960.
//Hence we will create three classess, the floor class, carpet class and calulator class.
//The carpet class deals with the cost of the carpet , the floor class deals with the floor area. while the calculator
// makes use of both the floor and carpet class to calculate the total price.

public class Carpet {

    private double cost;

    public Carpet(double cost){
        if(cost < 0){
            this.cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
