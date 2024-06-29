import java.util.Scanner;
public class recursionExample {
    // static int findSum(int n){
    //     if(n==0){
    //         return n;
    //     }
    //     else{
    //         return n+ findSum(n-1);
    //     }


    // }

    // static int findFact(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }

    //     else {
    //         return n*findFact(n-1);
    //     }
    // }


    static int findFib(int n){
        if(n==0){
            return 0;
        }

        else if(n==1){
            return 1;
        }

        else
        return findFib(n-1)+findFib(n-2);
    }
    public static void main(String[] args){
        // int n=10, sum=0;
        // for(int i=1; i<=n; i++){
        //     sum+=i;
        // }
        // System.out.println("Sum upto "+n+" by iteration "+sum);

        // int s=findSum(n);
        // System.out.println("Sum by recursion: "+s);



        // int fact=1, n=5;
        // for(int i=1; i<=n; i++){
        //     fact*= i;
        // }
        // System.out.println("Fact by iteration: "+ fact);

        // int f= findFact(n);
        // System.out.println("fact by recursion: "+ f);


        int n=10;
        for(int i=0; i<=n; i++){
            System.out.print(findFib(i)+" ");
        }
        
    }
}
