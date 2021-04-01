//The task her is  to calculate the area of a wall.

public class Wall {

    private double width;
    private double height;



    public Wall(){
        System.out.println("This is an empty constructor ");
    }

    public Wall(double width , double height){
        if(width < 0){
            this.width = 0;
        }
        if(height < 0){
            this.height =0;
        }

        this.width = width;
        this.height = height;

    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        }

    }

    public double getArea(){
        return width * height;
    }


}
