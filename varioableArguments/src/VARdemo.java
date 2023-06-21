public class VARdemo {
    static void show(int ...A){
        for(int x:A){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        show(10,20);
        show(5,6,7,8,9);
        show();
        show(new int[]{4,5,6,7,12,5});// anonymus array which doesnot have any reference



    }
}
