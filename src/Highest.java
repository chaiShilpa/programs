import java.util.HashMap;
import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        //for(int i=0;i<num.)
        HashMap map=new HashMap();
        map.put("ABC",10);
        map.put("DEF",20);
        map.put("XYZ",30);
        System.out.println(map);
        for(int i=0;i<=map.size();i++){
            if(map.values(i)>map.get(i)){
                System.out.println(map);

            }
        }




    }


}
