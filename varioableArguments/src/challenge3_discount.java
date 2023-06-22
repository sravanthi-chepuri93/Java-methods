public class challenge3_discount {
     static double discount(double ...priceList){
         double totalPrice = 0;
         for(int i=0;i<priceList.length;i++){
             totalPrice = totalPrice + priceList[i];
         }
         System.out.println("Total price is "+totalPrice);
         if(totalPrice<500)
            return totalPrice *0.10;
         else if(totalPrice>500 && totalPrice<1000)
             return totalPrice*0.15;
         else
             return totalPrice * 0.20;
     }

    public static void main(String[] args){

         System.out.println("discounted price is "+discount(40,60,700,80,90));

    }
}
