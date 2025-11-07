public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {

        this.height = height;
        this.width = width;
    }
        public void printArea(){
            System.out.println("Dördbucaqlının sahəsi:" + " " + width*height + "sm");
        }
        public void printPerimeter(){
            System.out.println("Dördbucaqlının perimetri:" + " " + (width + height)*2 + "sm");
        }
        }

