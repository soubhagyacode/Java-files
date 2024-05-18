class FindLargest implements Runnable
{
    private int[] arr;
    FindLargest(int[] set)
    {
        this.arr=set;
    }

    public void run(){
        int maxi=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(maxi<arr[i])
            {
                maxi=arr[i];
            }
        }
        System.out.println(maxi);
    }
}

class FindSum implements Runnable
{
    private int[] arr;
    FindSum(int[] set)
    {
        this.arr=set;
    }

    public void run(){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

class sortArray implements Runnable
{
    private int[] arr;
    sortArray(int[] set)
    {
        this.arr=set;
    }
    public void run(){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}



public class ThreadImp {
    public static void main(String args[])
    {
        int[] set={1,5,4,3,2};
        FindLargest obj1=new FindLargest(set);
        FindSum obj2=new FindSum(set);
        sortArray obj3=new sortArray(set);
        Thread th1= new Thread(obj1,"FindLargest");
        Thread th2= new Thread(obj2,"Findsum");
        Thread th3= new Thread(obj3,"Sortarray");

        th1.start();
        th2.start();
        th3.start();
    }
}




