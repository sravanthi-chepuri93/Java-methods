public class Demo2 {
    static int max(byte x, byte y){
        return x>y?x:y;
    }
    static float max(float x,float y){
        return x>y?x:y;
    }
    public static void main(String[] args){
        max(2,4);
        byte a =7, b=9;
        System.out.println(max(7,9));
// here 7,9 are integer type parameters. not byte type. if you want call max method which having byte as parameters.

    }
}
