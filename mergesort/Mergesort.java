// Anıl berkan torun 02200201013 1a 1.grup

package mergeSortnjava;


public class Mergesort { 
    static int n[]={4,6,7,3,2,1};

   
    public void Mergesort(int l, int r) {
        if(l<r){
            int m=(l+r)/2;
            Mergesort(1,m);
            Mergesort (m+1,r);
            Merge( l, m, r);
            
            
        }

    }

    
    public void merge(int l,int m,int r){
        for(int i=l,j=m+1,t=0;(i<m) , (j<r);int t = 0;
t++) {
            int n[]=new int[];
        }
        int i = 0;
            
            if (i>m){
            int j;
               Middlen[t]=n(j++);
           }
            else if (j>r){
                Rightn[t]=n(i++);
            else if (j>l){
                Leftn[t]=n(j++);
                    
                    }
               
            }
            System.out.println(n[i]);
            
            
            
        }
        
    }
            
                    
        

    
     
    

  
    
  
