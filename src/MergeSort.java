import java.util.Arrays;

class Sorting
{
    public static int[] sort_and_merge(int[] arr,int[] arr1,int[] arr2)
    {
        String s1="";
        String s2="";
        for(int i=0;i<arr1.length;i++)
        {
            s1=s1+arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            s2=s2+arr2[i];
        }

        String s=s1+s2;
        int arr3[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr3[i]=Integer.valueOf(s.substring(i,i+1));
        }
        Arrays.sort(arr3);
        for(int i=0;i<arr3.length;i++)
        {
            arr[i]=arr3[i];
        }
        return arr;
    }
    public static int[] divide(int arr[],int start,int end)
    {
        if(start <end)
        {
            int mid=(start +end)/2;
            divide(arr,0,mid);
            int[] arr1=new int[mid+1];
            int[] arr2=new int[end-mid];
            for(int i=0;i<arr1.length;i++)
            {
                arr1[i]=arr[i];
            }
            for(int i=0;i<arr2.length;i++)
            {
                arr2[i]=arr[i+arr1.length];
            }
            arr=sort_and_merge(arr,arr1,arr2);

            return arr;
        }
        return arr;
    }
}
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={9,5,6,3,4,2,8,1,7};
        Sorting obj=new Sorting();
        obj.divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
