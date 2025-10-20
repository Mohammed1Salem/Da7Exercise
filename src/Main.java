import java.util.ArrayList;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> n = new ArrayList<>();

        c.add('!');
        c.add('@');
        c.add('#');
        c.add('%');
        c.add('$');
        c.add('^');
        c.add('&');
        c.add('*');
        c.add('(');
        c.add(')');
        c.add('+');
        c.add('=');
        c.add('-');
        c.add('_');
        c.add('.');
        c.add(',');
        c.add('/');
        c.add('<');
        c.add('>');
        c.add('?');
        c.add(' ');

        n.add('1');
        n.add('2');
        n.add('3');
        n.add('4');
        n.add('5');
        n.add('6');
        n.add('7');
        n.add('8');
        n.add('9');
        n.add('0');
        System.out.println(smallest(1,3,2));
        System.out.println(check(-1));
        System.out.println(isVal("Hello My name412",c,n));
    }

    //1 - Write a Java method to find the smallest number among three
    //numbers.

    static int smallest(int a,int b,int c){
        if(a < b && a < c){
            return a;
        }else if(b < a && b < c){
            return b;
        }else if(c < a && c < b){
            return c;
        }
        return a;
    }
    //2 - Write a Java method that check if the entered number is negative or
    //positive or zero.

    static String  check(int a){
        if(a > 0){
            return "is Positive";
        }else if (a<0){
            return "is Negative";
        }else return "is Zero";
    }
    //3 - Write a Java method to check whether a string is a valid password.
    //Password rules:

    static String isVal(String p,ArrayList<Character> charAr,ArrayList<Character> numAr){

        int counter = 0;
        if(p.length()-1 < 10){
            return "Not valid password";
        }
        for (int i = 0; i < p.length();i++){
            for(char c: charAr){
                if(p.charAt(i) == c){
                    return "Not valid password";
                }
            }
            for(char n: numAr){
                if(p.charAt(i) == n){
                    counter++;
                }
            }
        }
        if(counter < 2){
            return "Not valid password";
        }
        return "Is valid: "+p;
    }
}