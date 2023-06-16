public class MethodIntro {
     int max(int x, int y){
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args){
        int a=10, b=5;
       // System.out.println(max(a,b));
        MethodIntro me = new MethodIntro();
       System.out.println(me.max(a,b));

    }
}
