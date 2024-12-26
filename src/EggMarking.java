public class EggMarking {
    public static void main(String[] args) {
        String grade = "";
        String origin = "";
        Out.print("Please enter an egg marking code of Javaland:\t");
        int code = In.readInt();
        if(code >=100 && code <=399){
            int gradeCode = code/100%10;
            int originCode = code/10%10;
            int importedCode = code%10;
            switch(gradeCode){
                case 1:
                    grade = "organic";
                    break;
                case 2:
                    grade = "free-range";
                    break;
                case 3:
                    grade = "barn";
                    break;
                default:
                    grade = "invalid";
                    break;
            }
            switch (originCode) {
                case 1:
                    origin = "Floatingen";
                    break;
                case 2,3,4:
                    origin = "Eggseption";
                    break;
                case 5:
                    origin = "Mainheim";
                    break;
                case 6,7:
                    origin = "Klammer an der Schleife";
                    break;
                case 8,9:
                    origin = "Inthausen";
                    break;
                default:
                    origin = "imported from ";
                    switch (importedCode) {
                        case 1,2:
                            origin += "Afreika";
                            break;
                        case 3,4:
                            origin += "Australeien";
                            break;
                        case 5,6:
                            origin += "Ameirika";
                            break;
                        case 7,8:
                            origin += "Eiropa";
                            break;
                        case 9:
                            origin += "Aseien";
                            break;
                        default:
                            origin += "unknown continent";
                            break;
                    }
                    break;
            }
        }else{
            Out.println("Invalid egg marking");
            return;
        }
        String result = String.format("Grade: %s\nOrigin: %s",grade,origin);
        Out.println(result);
    }
}
