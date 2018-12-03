package cylinder
import java.util.Scanner
public static void main(String args[])
{
 class Cylindervolume
 {
  int volume;
  int radius;
  int height;
  System.out.println("enter the radius:");
  System.out.println("enter the height:");
  Scanner sc=new Scanner(System.in);
  radius=sc.nextInt();
  height=sc.nextInt();
  volume=22/7*(radius*radius)*height;
  System.out.println("the  volume of cylinder is "+volume);
 }
}

  
