// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
      int startingseconds = 10000;
	  int hours = (startingseconds/3600);
	  int remainder = (startingseconds % 3600);
	  int minutes = (remainder/60);
	  int seconds = (remainder % 60);
	  System.out.println("Starting Seconds:" + startingseconds);
	  System.out.println("Hours:" + hours);
	  System.out.println("Minutes:" + minutes);
	  System.out.println("Seconds:" + seconds);



	}
}

