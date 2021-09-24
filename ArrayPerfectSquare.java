class ArrayPerfectSquare{
    static void CountSquares(int arr[], int N)
    {
        int count=0; 
        for(int i=0; i<N; i++)
        {
            int square=arr[i]* arr[i];
            for(int j=0; j<N ;j++)
            {
                if(arr[j]==square)
                {
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
            int arr[] ={2,4,8,20,16,64};
            int N=arr.length; 
            CountSquares(arr,N);
    }

}
