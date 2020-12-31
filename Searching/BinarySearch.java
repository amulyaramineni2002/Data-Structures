public class BinarySearch
{
    public static void main(String args[])
    {
       int a[]={23,34,45,56,67,78,89};
       int key,position;
       key=78;
       
       position=binarysearch(a,a.length,key);
       
       if(position==-1)
            System.out.println("element not found");
       else
            System.out.println("element found at position " + position);
     }
     public static int binarysearch(int b[],int n,int key)
     {
         int lb=0,ub=n-1,mid;
 	 
         while(lb<=ub)
         {
            mid=(lb+ub)/2;
            if(b[mid]==key)
                 return mid;
            else 
            if (b[mid]<key)
                 lb=mid+1;
            else  
                 ub=mid-1;
           } 
           return -1;
       }
}
      
       