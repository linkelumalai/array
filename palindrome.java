class palindrome{
static void  check( char a[],int n)
{
int flag=0;
for(int  i=0; i<=n/2 && n!=0; i++)
{
if(a[i]!=a[n-i-1])
{
flag=1;
break;
}
}
if(flag==1)
System.out.println(" it is not  palindrome");
else
                System.out.println("it is  palindrome");
}
public static void main(String[] args)
{
char arr[]={'a','b','a','b'};
int n=arr.length;
check(arr,n);
}
}
