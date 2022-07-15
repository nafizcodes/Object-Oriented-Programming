

class Overloading {

    public int max(int a, int b, int c){

        int Max_value = Math.max(a, Math.max(b, c));

        return Max_value;
    }

    public int max (char a, int b){
        int converted = a - '0';      //conversion

        int Max_value = Math.max(converted, b);

        return Max_value;
    }

    public int max (String str, int a){
        int i = Integer.parseInt(str);

        int Max_value = Math.max(i,a);

        return Max_value;
    }

}


public class OverloadingTest {
    public static void main(String args[]){

    Overloading overload = new Overloading();

    System.out.println("Max among (50,20,5) is " + overload.max(50,20,5));
    System.out.println("Max among ('300', 400) is " + overload.max("300", 400));
    System.out.println("Max among ('a', 50) is " + overload.max('a', 50));
    System.out.println("Max among ('30', 10) is " + overload.max("30", 10));
    System.out.println("Max among ('x', 90) is " + overload.max('x', 90));
    System.out.println("Max among (20, 40, 10) is " + overload.max(20, 40, 10));

    }
}
