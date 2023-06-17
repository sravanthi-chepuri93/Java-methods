public class methodPractice {

    static void update(int X[],int index,int value){
        X[index]= value;
    }
    static void update2(int x, int value){
        x=value;
    }

    static int update3(int y, int value){
        y=value;
        return y;
    }
    static String name(String name){
        return name;
    }
    public static void main(String[] args){
        int A[] = { 2,4,6,8,10};
        //update(A,1,11);
//        for(int x: A){
//            System.out.println(x);
//        }
        int x= 10;
        update2(x, 20);
        System.out.println(x);
        int y=9;
        y=update3(y,18);
        System.out.println(y);
       String name = name("sravanthi");
       System.out.println(name);



    }
}
