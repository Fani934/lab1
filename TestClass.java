public class TestClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        
        System.out.println("Default length: " + rectangle.getLength());
        System.out.println("Default width: " + rectangle.getWidth());
        System.out.println("Default perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Default area: " + rectangle.calculateArea());

        rectangle.setLength(10.5);
        rectangle.setWidth(5.5);

        System.out.println("\nUpdated length: " + rectangle.getLength());
        System.out.println("Updated width: " + rectangle.getWidth());
        System.out.println("Updated perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Updated area: " + rectangle.calculateArea());

    
    }
}