public class TaxCalculation{
    public static void main(String[] args){
        Out.print("Please enter the annual income:\t");
        double annInc = In.readDouble();
        double annTax = 0;
        if(In.done() && annInc > 0){
            annInc-=20.000;
            if(annInc>0){
                if(annInc-20.000>0){
                    annTax += 20.000*0.2;
                    annInc = annInc-20.000;
                    if(annInc-20.000>0){
                        annTax += 20.000*0.4;
                        annInc = annInc-20.000;
                        annTax += annInc*0.5;
                    }else{
                        annTax += annInc*0.4; 
                    }
                }else{
                    annTax += annInc*0.2;
                }
            }
        }else{
            Out.println("Invalid income");
            return;
        }
        Out.println("The annual tax is "+String.format("%.3f JD",annTax));
    }
}