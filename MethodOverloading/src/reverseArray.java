public class reverseArray {
    static int[] revArr(int A[]){
        int B[] = new int[5];
        for(int i =A.length-1, j=0;i>=0;i--,j++){
            B[j] = A[i];
        }
        return B;

    }
    public static void main(String[] args){
        int A[] = { 3,4,5,6,7};

        int[] B = revArr(A);
        for(int x : B){
            System.out.print(x+",");
        }

    }
}
/*
The method revArr is defined with a single parameter A, which represents the integer array.
Inside the method, a new integer array B is created with a length of 5 using the new keyword.
A for loop is used to iterate over the elements of the array A in reverse order. The loop starts from the last index
(A.length - 1) and decrements i until it reaches 0. Additionally, a variable j is used to track the index of the new array B.
Inside the loop, each element A[i] is assigned to the corresponding index j in the array B.
After the loop finishes, the array B is returned.
In the main method, an integer array A is declared and initialized with the values {3, 4, 5, 6, 7}.
The revArr method is called, passing the array A as an argument. The returned array B is assigned to int[] B.
Another for-each loop is used to iterate over the elements of the array B.
Inside the loop, each element x is printed using System.out.print, followed by a comma.
When you run this code, the output will be: "7,6,5,4,3,". This indicates that the elements of the original array A
have been reversed and stored in the new array B, which is then printed in reverse order.

 */

