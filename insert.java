import java.io. *; 
import java.util.Scanner; 
class insert
{
    public static void main(String[] args)
    {
    int Arrayname[]= new int[40];
    int n ,i; 
    System.out.println("Enter the limit");
    Scanner in=new Scanner(System.in);
    n=in.nextInt(); 
    for(i=0; i<=n; i++)
    {
        System.out.println("Enter the numbers");
        Arrayname[i]=in.nextInt(); 
    }
    Subclass_access obj = new Subclass_access(); 
    obj.add(Arrayname,n);
    }
}
class Subclass_access{
    int total=0,i,avg=1;
    public void add (int Arrayname[],int n)
    {
        
        for( i=0; i<n ; i++)
        {
            total=total+Arrayname[i];
        }
        System.out.println("your add number is here"+total);
            {
                
                avg=total/n; 
                System.out.println("avg is here "+avg);
            }
    }
}