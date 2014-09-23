import java.util.Scanner; 

public class Perimeter {
	public static void main(String[] args){
		//TODO add a way to detect if it isn't an int to tell them the error 
		Scanner kboard = new Scanner (System.in);
		System.out.print("What shape do you want to calculate the perimeter of; a square, a circle or a rectangle. ");
		String Shape = kboard.nextLine();
			
			if (Shape.equals("square") || Shape.equals("Square")) {
				System.out.println("Please enter the length of a side of the square: ");
				int Squareside = kboard.nextInt();
				int Squareperim = (4*Squareside);
				System.out.println("The perimeter of your square is: " + Squareperim);
			}
			else if (Shape.equals("rectangle") || Shape.equals("Rectangle")) {
				System.out.println("Please enter the length of the first side of the rectangle: ");
				int Rect1 = kboard.nextInt();
				System.out.println("Please enter the length of the second side of the rectangle: ");
				int Rect2 = kboard.nextInt();
				int Rectperim = (2*(Rect1+Rect2));
				System.out.println("The perimeter of your ractangle is: " + Rectperim);
			}
			
			else if (Shape.equals("circle") || Shape.equals("Circle")) {
				System.out.println("Please enter the radius of your circle: ");
				int Radius = kboard.nextInt();
				double Cirlceperim = (2 * Math.PI * Radius);
				System.out.println("The perimeter of your square is: " + Cirlceperim);
			
			} else {
				System.out.print("Invalid Shape!");
			}
	}
}

	

