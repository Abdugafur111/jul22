public class TestCircleWithPrivateDataFields {

    public static void main(String[] args) {
	CircleWithPrivateDataFields circle1 = new CircleWithPrivateDataFields(5);
	printCircle(circle1);
	
    }

    public static void printCircle(CircleWithPrivateDataFields c){
        System.out.println("The area of the circle of radius " + c.getRadius()+ " is " + c.getArea()
        );
    }
}
