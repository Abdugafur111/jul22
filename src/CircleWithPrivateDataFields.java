public class CircleWithPrivateDataFields {
    private double radius;
    private static int numberOfObjects;

    CircleWithPrivateDataFields () {
        radius = 1;
        numberOfObjects ++;
    }

    CircleWithPrivateDataFields(double newRadius ){
        radius = newRadius;
        numberOfObjects ++;
    }

    public void setRadius(double newRadius){
        radius = (newRadius>=0)?newRadius:0;
    }

    public double getRadius(){
        return radius;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
