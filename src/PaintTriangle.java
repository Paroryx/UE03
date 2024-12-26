public class PaintTriangle {
    public static void main(String[] args) {
        Out.print("How many lines should the triangle span? ");
        int nLines = In.readInt();
        for (int curLines = 0; curLines < nLines-1; curLines++) {
            for (int i = nLines-1; i > curLines; i--) {
                Out.print(" ");
            }
            Out.print("/");
            for (int i = 0; i < curLines; i++) {
                Out.print("  ");
            }
            Out.print("\\");
            Out.println();
        }
        Out.print("/");
        for (int i = 0; i < 2*(nLines-1); i++) {
             Out.print("_");
        }
        Out.print("\\");
    }
}
