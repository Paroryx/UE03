public class DigitSum {
    public static void main(String[] args) {
        int num = In.readInt();
        int totalsum = 0;
        if(!In.done()){
            Out.println("empty sequence");
        }else{
            String number = "";
            int sum = 0;
            if(num > 0){
                number += num;
                while(num%10>0){
                    sum+=num%10;
                    num/=10;
                }
                //num%10 <= 0
                totalsum += sum;
                Out.println("Digit sum of "+number+" = "+sum);
            }else{
                In.close();
            }
            while(In.done()){
                sum = 0;
                number = "";
                num = In.readInt();
                if(num > 0){
                    number += num;
                    while(num%10>0){
                        sum+=num%10;
                        num/=10;
                    }
                    //num%10 <= 0
                    totalsum += sum;
                    Out.println("Digit sum of "+number+" = "+sum);
                }else{
                    In.close();
                }
            }
            // In.done() == false
            Out.println(String.format("Total sum of all digit sums = %s",totalsum));
        }
    }
}