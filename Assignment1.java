import java.io.PrintStream;

public class Assignment1 {


    public static void main(String[] args){
        // Printing Stars in "E" shape
        for(int i=1; i<=7; i++){
             if(i==1 || i==4 || i==7){
                 for(int j=1; j<=7; j++) {
                     System.out.print("*");
                 }
             }else{
                 System.out.print("*");
             }

            System.out.println();
        }


        // printing stars in "T" shape
        for(int i=1; i<=7; i++){
            for(int j=1; j<=9; j++){
                if(i==1) {
                    System.out.print("*");
                }
               if(i>=2 && j==2){
                    System.out.print("*");
                }
            }
            System.out.println();
        }





    }
}
