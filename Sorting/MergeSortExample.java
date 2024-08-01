// package Sorting;
// public class MergeSortExample{
//     public static void main(String[] args) {
//         int[] arr= {4,6,3,7,9,2,1};
//         System.out.println("Before merge sort:");
//         for(int a: arr){
//             System.out.print(a+" ");
//         }
//         System.out.println();
//         mergeSort(arr, 0, arr.length-1);

//         System.out.println("After merge sort:");
//         for(int a: arr){
//             System.out.print(a+" ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int[] arr, int l, int r){
//         if(l<r){
//             int mid= l+(r-l)/2;
//             mergeSort(arr, l, mid);
//             mergeSort(arr, mid+1, r);
//             merge(arr,l,mid,r);
//         }
//     }

//     public static void merge(int[] arr, int l, int mid, int r){
//         int n1= mid-l+1;
//         int n2= r-mid;

//         int[] lArray= new int[n1];
//         int[] rArray= new int[n2];

//         for(int i=0; i<n1; i++){
//             lArray[i]= arr[l+i];
//         }

//         for(int i=0; i<n2; i++){
//             rArray[i]= arr[mid+1+i];
//         }

//         int i=0; 
//         int j=0; 
//         int k=l;

//         while(i<n1 && j<n2){
//             if(lArray[i]<rArray[j]){
//                 arr[k++]= lArray[i++];
//             }
//             else{
//                 arr[k++]= rArray[j++];
//             }
//         }

//         while(i<n1){
//             arr[k++]= lArray[i++];
//         }

//         while(j<n2){
//             arr[k++]= rArray[j++];
//         }
//     }
// }




class MergeSortExample {
    public static void main(String[] args) {
        int[] arr= {23,65,34,98,1,87,32,7};
        mergeSort(arr, 0, arr.length-1);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid= l+(r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r){
        int n1= mid-l+1;
        int n2= r-mid;

        int[] lArray= new int[n1];
        int[] rArray= new int[n2];

        for(int i=0; i<n1; i++){
            lArray[i]= arr[l+i];
        }

        for(int i=0; i<n2; i++){
            rArray[i]= arr[mid+1+i];
        }

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(lArray[i]<rArray[j])
            arr[k++]= lArray[i++];

            else
            arr[k++]= rArray[j++];
        }


        while(i<n1){
            arr[k++]= lArray[i++];
        }

        while(j<n2){
            arr[k++]=rArray[j++];
        }
    }
}