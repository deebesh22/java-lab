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
  scanner sc1=new scanner(System.in);
  scanner sc2=new scanner(System.in);
  scanner sc3=new scanner(System.in);
  velocity=sc1.nextint();
  acceleration=sc2.nextint();
  time=sc3.nextint();
  distance=velocity*time+(acceleration*(time*time))/2;
  System.out.println("the total distance is ="+distance);
  }
}

  