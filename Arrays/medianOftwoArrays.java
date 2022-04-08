//Considering all arrays are sorted

public class medianOftwoArrays {
    public static void main(String [] args){
        int arr1[]={1,12,15,26,38};
        int arr2[]={2,13,17,30,45};
        int n1=arr1.length,n2=arr2.length;
        if(n1==n2){
            System.out.println("Both Arrays are equal");
            getEqualMedian(arr1,arr2,n1);
        } else{
            System.out.println("Both Arrays are not equal");
            getnotEqualMedian(arr1,arr2,n1,n2);
        }
    }

    static void getEqualMedian(int arr1[],int arr2[],int n1){
        int i=0,j=0; //i will handle arr1 and j will handle arr2
        int count;
        int m1=-1,m2=-1; //m1 and m2 will return median values

        //Since there are 2n1 elements, the medians will be at n and n-1 after merging both arrays
        for(count=0;count<=n1;count++){
            if(i==n1){ //To handle if all elements of arr1 are smaller than the smallest element of arr2
                m1=m2;
                m2=arr2[0];
                break;
            }

            if(j==n1){ //To handle if all elements of of arr2 are smaller than the smallest element of arr1
                m1=m2;
                m2=arr1[0];
                break;
            }
            //Equal signs if two arrays have some equal elements

            if(arr1[i]<=arr2[j]){
                //Storing previous median
                m1=m2;
                m2=arr1[i];
                i++;
            }else{
                //Storing Previous Median
                m1=m2;
                m2=arr2[j];
                j++;
            }

        }
        System.out.println("The median is " +m1+m2);

    }

    static void getnotEqualMedian(int arr1[],int arr2[],int n1,int n2){
        int i=0,j=0; //i will handle current index of arr1 and j will handle current index of arr2
        int count;
        int m1=-1,m2=-1; //m1 and m2 will return median values
        //since there are n1+n2 elements , there will be two cases, if n1+n2 is odd then median will be (n1+n2)/2

        if((n1+n2)%2==1){
            for(count=0;count<=(n1+n2)/2;count++){
                if(i!=n1 && j!=n2 ){
                    m1=(arr1[i]>arr2[j])?arr2[j++]:arr1[i++];
                }
                else if(i<n1){
                    m1=arr1[i++];
                }else{
                    m2=arr2[j++];
                }

            }
            System.out.println("The Median is " +m1);
           // return m1;

        }

        else{
            for(count=0;count<=(n1+n2)/2;count++){
                m2=m1;
                if(i!=n1 && j!=n2){
                    m1=(arr1[i]>arr2[j])?arr2[j++]:arr1[i++];
                }else if(i<n1){
                    m1=arr1[i++];
                }
                else{
                    m1=arr2[j++];   
                }
                
            }
            System.out.println("The Median is " +(m1+m2/2));
            //return (m1+m2)/2;
        }


    }
    
}
