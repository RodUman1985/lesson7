package anatherPackage;
import com.company.Car;
public class Test {
    public void test (){
        Car c=new Car ();
        c.maxSpeed= 200;
        c.color= "black";

    }
    public static void  main (String[] args){
        Car c=new Car ();
        c.maxSpeed= 200;
        c.color= "black";
        c.drive(120);
        TestCar ts= new TestCar();


    }
}
