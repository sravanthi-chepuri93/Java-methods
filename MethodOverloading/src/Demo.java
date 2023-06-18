public class Demo {
    static int max(int x, int y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        return x>y?x:y;
    }
    public static void main(String[] args){
        System.out.println(max(2,4));
       System.out.println(max(3.5f,8.6f));

    }
}
