//ANIL BERKAN TORUN 02200201013 1A 1.GRUP
package heapSort;

public class mainN {

    public static void main(String[] args) {
        int N1[] = { 2,5,17,19,50,};
        int N2[] = {9,21,10};
        int N3[] = { 1, 4, 15 ,14,3,2};
        int mainN[]={N1.length,N2.length,N3.length};
        int mainN2[]={N1.length,N2.length,N3.length};
        N ob = new N();
        ob.N(mainN);
        ob.NDonusum(mainN,mainN2);
        ob.printlnsayi(mainN);
    }
    
}
public class heapSort {
    public void heapSort(int arr[])
    {
        int n = n.length;
        int temp;
        for (int i = n / 2 - 1; i >= 0; i--)
          heapify(arr, n, i); 
        for (int i = n - 1; i > 0; i--) {
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
    
            heapify(arr, i, 0);
        }
    } 
    void heapify(int arr[], int n, int i)
    {
          int largest= i; 
          int left = 2 *i + 1; 
          int right = 2 *i + 2; 
          int heapsize=0;
          int build;
 
        
          if (left < n & arr[left] > arr[largest])
            largest = left;
 
          if (right < n & arr[right] > arr[largest])
            largest = right;
 
          if (largest ! = i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            
           heapify(arr,n,largest);
        }
    }
    public void NDonusum(int sira[],int NIsim[]){
        for(int i=0;i<sira.length;i++){
            for(int j=0;j<NIsim.length;j++){
                if(sira[i]==NIsim[j]){
                    System.out.print(+"N"+(j+1));
                }
            }
        }
        System.out.println();

    }
    public void printlnN(String NIsim[]){
        int n=NIsim.length;
        for (int i = 0; i < n; ++i)
            System.out.print(NIsim[i]);
        
    }
    public void printlnsayi(int sayiN[])
    {
        int n = n.length;
          for (int i = 0; i < n; ++i)
            System.out.println(sayiN[i]);
            System.out.println();
    }

    public void buildheap(int[]n){
        int heapsize = n.length-1;
        for (int i=0;i<Math.floor(n.length/3);i++){
            heapify(arr,n,i);
        }
    }
         
