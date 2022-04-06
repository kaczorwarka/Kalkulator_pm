package kalkulator;

public class Kal {
    static double suma(double x, double y){
        return  x + y;
    }
    static double roznica(double x, double y){
        return x - y;
    }
    static double mult(double x, double y){
        return x * y;
    }
    static double dziel(double x, double y){
        if(y==0){
            System.out.println("NIE DZIEL PRZEZ 0 !!!!");
            return x;
        }
        else{
            return x/y;
        }
    }
    static double reszta(double x, double y){
        if(y==0){
            System.out.println("NIE DZIEL PRZEZ 0 !!!!");
            return x;
        }
        else{
            return x%y;
        }
    }
    static double pierwiastek(double x){
        if(x < 0){
            System.out.println("Liczba pod pierwiastkiem musi byc dodatnia");
            return x;
        }
        else{
            return Math.sqrt(x);
        }
    }

}
