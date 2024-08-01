// public class QuickSort {
//     public static void main(String[] args) {
//         int[] arr= {2,5,8,0,6,1,3};
//         System.out.println("Before:");
//         for(int a: arr){
//             System.out.print(a+" ");
//         }
//         System.out.println();

//         quickSort(arr, 0, arr.length-1);

//         System.out.println("After:");
//         for(int a: arr){
//             System.out.print(a+" ");
//         }
//     }   
    
//     public static void quickSort(int[] arr, int l, int r){
//         if(l< r){
//             int p= partition(arr, l, r);
//             quickSort(arr, l, p-1);
//             quickSort(arr, p+1, r);
//         }
//     }

//     public static int partition(int[] arr, int l, int r){
//         int pi= arr[l];
//         int s=l;
//         int e=r;
        
//         while(s<e){
//             while (s <= e && arr[s] <= pi){
//                 s++;
//             }
//             while (s <= e && arr[e] > pi){
//                 e--;
//             }

//             if(s<e){
//                 int temp= arr[s];
//                 arr[s]= arr[e];
//                 arr[e]= temp;
//             } 
//         }

//         int temp = arr[e];
//         arr[e] = arr[l];
//         arr[l] = temp;

//         return e;

//     }
// }


class QuickSort {
public static void main(String[] args){
    int[] arr= {23,52,12,26,87,15};
    quickSort(arr,0,arr.length-1);
    for(int a: arr){
        System.out.print(a+" ");
    }
}

public static void quickSort(int[] arr, int l, int r){
    if(l<r){
        int p= partition(arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
    }
}

public static int partition(int[] arr, int l, int r){
    int pi= arr[l];
    int s=l+1;
    int e=r;


    while(s<=e){
        while(s<=e && arr[s]<=pi){
            s++;
        }

        while(s<=e && arr[e]>pi){
            e--;
        }

        if(s<e){
         int temp= arr[s];
         arr[s]= arr[e];
         arr[e]= temp;
        }
    }

    int temp= arr[l];
    arr[l]= arr[e];
    arr[e]= temp;

    return e;
}
}