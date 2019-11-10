import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TZ2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write first number: ");
         int x = Integer.parseInt(reader.readLine());
        System.out.print("Write second number: ");
         int y = Integer.parseInt(reader.readLine());
        if (x>0 && y>0)

        {
            int nodd = nod(x,y);
            int nokk = nok(x,y);
            System.out.println("NOK: "+nokk + ", " + "NOD: "+nodd );
        }

        else{

            System.out.println("ERROR!");
        }
    }

    private static int nod(int x, int y){
        int tmp = x%y;
        x=y;
        y=tmp;
        if (tmp>0){
            return nod (x,y);
        }
        else {
            return x;
        }
    }

    private static int nok(int x, int y){
        return x*(y/nod(x,y));
    }
}
