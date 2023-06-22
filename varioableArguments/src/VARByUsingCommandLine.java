public class VARByUsingCommandLine {
    public static void main(String[] args){
        args = new String[]{"2", "3", "4", "7.5"};
        double sum =0;
        for (int i=0; i<args.length;i++){
            sum = sum+Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
