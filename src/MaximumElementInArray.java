public class MaximumElementInArray {

    int max(int A[]){
        int max=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max)
                max = A[i];
        }
        return max;

    }
    public static void main(String[] args){
        MaximumElementInArray mi = new MaximumElementInArray();
        int B[]= {4,5,7,8,9};
        System.out.println(mi.max(B));


    }
}
/*
The max method takes an integer array A as a parameter.
It initializes a variable max with the value of the first element in the array (A[0]).
It then iterates over each element in the array using a for loop.
Inside the loop, it compares each element (A[i]) with the current maximum value (max).
If the current element is greater than the current maximum, it updates the value of max to the current element.
After iterating over all the elements in the array, the method returns the maximum value stored in max.
In the main method, an instance of the MaximumElementInArray class is created.
An integer array B is declared and initialized with some values.
The max method is called on the instance of the class, passing the array B as an argument.
The maximum value returned by the max method is printed using System.out.println().
In this case, the code will output 9 since 9 is the maximum element in the array {4, 5, 7, 8, 9}.

 */

/*
alogirithm
Start by initializing a variable max with the value of the first element in the array.
Iterate over each element in the array.
For each element num in the array:
If num is greater than the current maximum (max), update the value of max to num.
After iterating over all the elements in the array, max will hold the maximum element.
Return the value of max as the maximum element in the array.
 */
