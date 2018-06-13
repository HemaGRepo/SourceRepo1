/**
 * This code is used by Jenkins
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Create a loop variable
	int i=0;
       //Loop starts
	for(i=0;i<5;i++)
	{
        System.out.println( "Hello World!....");
		System.out.println( ".............Jenkins Build..........");
		System.out.println( "Success!...."+i); //Print the iteration id
	} //Loop ends
    }
}
