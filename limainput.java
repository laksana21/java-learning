Inport.java.io.BufferedReader;
Inport.java.io.InputStreamReader;
Inport.java.io.EOExeption;

public class limainput
    {
        public static void main(String[]args){
            string nilai1="";
            string nilai2="";
            string nilai3="";
            string nilai4="";
            string nilai5="";
            
            int rata = 0;
            BufferedReader dataIn= new bufferedReader(new InputStreamReader(System.in));
            System.out.print("masukan sisi:");
            try{
                System.out.printIn("input nilai 1 = ");
                nilai1 = dataIn.readline();
                System.out.printIn("input nilai 1 = ");
                nilai2 = dataIn.readline();
                System.out.printIn("input nilai 1 = ");
                nilai3 = dataIn.readline();
                System.out.printIn("input nilai 1 = ");
                nilai4 = dataIn.readline();
                System.out.printIn("input nilai 1 = ");
                nilai5 = dataIn.readline();
            }cacth(IOException ex){
                System.out.printIn("Error!");
            }
            rata = (integer.parseIn (nilai1)+ integer.parseIn (nilai2) + integer.parseIn (nilai3) +integer.parseIn (nilai4) +integer.parseIn (nilai5)/5)
            system.out.printIn("ratarata sama sengan "+ rata);
        }
    }
