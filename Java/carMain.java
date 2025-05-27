class Car {
    String make,model;
    int year;
    void displayDetails(){
        System.out.println("Car Make  : " + make);
        System.out.println("Car Model : " + model);
        System.out.println("Car Year  : " + year);
        System.out.println("--------------------");

    }
}
class carMain{
    public static void main(String args[]){
        Car c1=new Car();
        c1.make="Ford";
        c1.model="deluxe";
        c1.year=1948;

        Car c2=new Car();
        c2.make="Ford";
        c2.model="Perfect";
        c2.year=1987;

        c1.displayDetails();
        c2.displayDetails();
    }
}