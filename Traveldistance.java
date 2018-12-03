package vehicle;
import java.util.scanner;
public class Traveldistance
{
 public static void main(String args[])
 {
  int distance; 
  int velocity;
  int acceleration;
  int time;
  System.out.println("enter the velocity:");
  System.out.println("enter the acceleration:");
  System.out.println("enter the time:");
  scanner sc=new scanner(System.in);
  velocity=sc.nextint();
  acceleration=sc.nextint();
  time=sc.nextint();
  distance=velocity*time+(acceleration*(time*time))/2;
  System.out.println("the total distance is ="+distance);
  }
}

  