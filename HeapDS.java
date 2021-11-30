import java.util.*;
public class HeapDS
{
    void MaxHeap(int a[], int i, int n)
    {
        int j, temp;
        temp = a[i];
        j = 2*i;   
        while (j <= n)
        {
            if (j < n && a[j+1] > a[j])
            {
                j = j+1;   
            }
            if (temp > a[j])
            {
                break;  
            }
            else if (temp <= a[j])
            {
                a[j/2] = a[j];
                j = 2*j;
            }
        }
        a[j/2] = temp;
        return;
    }
    
    void MinHeap(int a[], int i, int n)
    {
        int j, temp;
        temp = a[i];
        j = 2*i;
            
        while (j <= n)
        {
            if (j < n && a[j+1] < a[j])
            {
                j = j+1;
            }
            if (temp < a[j])
            {
                break;
            }
            else if (temp >= a[j])
            {
                a[j/2] = a[j];
                j = 2*j;
            }
        }
        a[j/2] = temp;
        return;
    }
    void MaxHeapSort(int a[], int n)
    {
        int i, temp;
        for (i = n; i >= 2; i--)
        {
            temp = a[i];
            a[i] = a[1];
            a[1] = temp;       
            MaxHeap(a, 1, i - 1);
        }
    }

    void MinHeapSort(int a[], int n)
    {
        int i, temp;
        for (i = n; i >= 2; i--)
        {    
            temp = a[i];
            a[i] = a[1];
            a[1] = temp;    
            MinHeap(a, 1, i - 1);
        }
    }
    void Build_MaxHeap(int a[], int n)
    {
        int i;
        for(i = n/2; i >= 1; i--)
        {
            MaxHeap(a, i, n);
        }
    }
    void Build_MinHeap(int a[], int n)
    {
        int i;
        for(i = n/2; i >= 1; i--)
        {
            MinHeap(a, i, n);
        }
    }
    
    
	  public static void HeapDS(String[] args) 
    {
		    HeapDS m=new HeapDS();
	      Scanner s= new Scanner(System.in);

		    int n, i;
        System.out.print("\nHow Many Marks You Want to Insert: ");
        n=s.nextInt();
        n++;
        int arr[]=new int[n];
        for(i = 1; i < n; i++)
        {
            System.out.print("Enter The Marks:  "+i+": ");
            arr[i]=s.nextInt();
        }
        m.Build_MaxHeap(arr, n-1);
        m.MaxHeapSort(arr, n-1);


        int max,min;
        System.out.print("\nSort Data In ASC Order: ");

        for (i = 1; i < n; i++)
        {
            System.out.print("->"+arr[i]);  
        }        
        
        min=arr[1];
        m.Build_MinHeap(arr, n-1);
        m.MinHeapSort(arr, n-1);
        System.out.print("\nSort Data in DESC Order: ");
        max=arr[1];
        for (i = 1; i < n; i++)
        {
            System.out.print("->"+arr[i]);  
        }
        System.out.println("\nMaximum Marks : "+max+"\nMinimum marks : "+min);
	}
}
