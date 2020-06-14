package main.java.master.clazz.faltdor.advance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;

public class PrimeChecker {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++){
                if(set.contains(methods[i].getName())){
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload){
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class Prime{
    public void checkPrime(int... numbers) {
        for (int number: numbers){
            BigInteger bigInteger =  BigInteger.valueOf(number);
            //if(bigInteger.isProbablePrime(number)){
            if(isPrime(number)){
                System.out.print(new StringBuilder().append(number).append(" "));
            }
        }
        System.out.println();
    }
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {     // account for even numbers now, so that we can do i+=2 in loop below
            return true;
        } else if (n % 2 == 0) { // account for even numbers now, so that we can do i+=2 in loop below
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) { // skips even numbers for faster results
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
