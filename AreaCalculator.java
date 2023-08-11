import java.util.*;

public class AreaCalculator {
  public static double area_triangle(double base, double height) {
		System.out.println();
		double A = (base * height) / 2;

		System.out.println("The area is " + A + ".");
    return A;
	}

  public static double area_rectangle(double length, double width){
		System.out.println();
		double A = length * width;

		System.out.println("The area is " + A + ".");
		return A;
	}

  public static double area_circle(double radius) {
		System.out.println();
		double A = Math.PI * radius * radius;

		System.out.println("The area is " + A + ".");
		return A;
	}

	public static void main(String[] args) {
	  try (Scanner keyboard = new Scanner(System.in)) {
      System.out.println("Shape Area Calculator");

      while (true) {
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Circle");
        System.out.println("4) Quit");
        System.out.println();

        System.out.print("Which shape: ");

        int shape = keyboard.nextInt();
        System.out.println();

        if (shape < 1 || shape > 4) {
          System.out.println("Error: Invalid selection.");
          continue;
        }

        if (shape == 4) {
          System.out.println("Good Bye");
          break;
        }

        switch (shape) {
          case 1:
            System.out.print("Base: ");
            double base = keyboard.nextDouble();

            System.out.print("Height: ");
            double height = keyboard.nextDouble();

            area_triangle(base, height);
            break;
          case 2:
            System.out.print("Length: ");
            double length = keyboard.nextDouble();

            System.out.print("Width: ");
            double width = keyboard.nextDouble();

            area_rectangle(length, width);
            break;
          case 3:
            System.out.print("Radius: ");
            double radius = keyboard.nextDouble();

            area_circle(radius);
            break;
          default:
            break;
        }
      }
    } catch (Exception e) {
      System.err.println("An error occurred.");
      System.err.println(e.getMessage());
    }
  }
}