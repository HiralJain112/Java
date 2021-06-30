public class decisionMaking
{
    public static void main(String [] args)
    {
        System.out.println("Pick a number between 1 to 10");
        Scanner s = new Scanner(System.in);
        
        int inputNum = s.nextInt();
        if(inputnum < 5)
        {
            System.out.println("Less than 5");
        }
        else
        {
            System.out.println("Greater than 5");
        }
    }
}
