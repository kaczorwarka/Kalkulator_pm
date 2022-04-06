package kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Dostepne operacje");
        System.out.println("[+] - dodanie liczby do aktualnego wyniku");
        System.out.println("[-] - odejmowanie liczby od aktualnego wyniku");
        System.out.println("[*] - pomnożenie aktualnego wyniku przez liczbę");
        System.out.println("[/] - podzielenie aktualnego wyniku przez podaną liczbę");
        System.out.println("[%] - wyznaczenie reszty z dzielenia aktualnego wyniu i podanej liczby");
        System.out.println("[s] - spierwiastkowanie aktualnego wyniku");
        System.out.println("[E] - wyjście z programu");
        System.out.println("[C] - wyczyszczenie aktualnego wyniku");
        System.out.println("[M+] - dodanie aktualnego wyniku");
        System.out.println("[M-] - odejmowanie aktualnego wyniku od pameci");
        System.out.println("[M*] - pomnożenie pamieci przez akturalny wynik");
        System.out.println("[M/] - podzielenie pamieci przez aktualny");
        System.out.println("[M%] - wyznaczenie reszty z dzielenia pamieci");
        System.out.println("[Ms] - spierwiastkowanie pamieci");
        System.out.println("[MR] - wypisaie stanu pamieci");
        System.out.println("[MC] - wyczyszczenie aktualnego wyniku");
        double wynik = 0;
        double pamiec = 0;
        String wybor;
        double liczba;
        boolean zgodnosc = true;
        Scanner scan = new Scanner(System.in);
        System.out.println(wynik);
        wybor = scan.next();
        while (zgodnosc){

            if(wybor.charAt(0) > 47 && wybor.charAt(0) < 58){
                wynik = Double.parseDouble(wybor);
                System.out.println(wynik);
                wybor = scan.next();
            }
            else {
                switch (wybor) {
                    case "+":
                        wybor = scan.next();
                        if(wybor.charAt(0) > 47 && wybor.charAt(0) < 58){
                            liczba = Double.parseDouble(wybor);
                            wynik = Kal.suma(wynik, liczba);
                            System.out.println(wynik);
                            wybor = scan.next();
                            break;
                        }
                        else{
                            break;
                        }
                    case "-":
                        wybor = scan.next();
                        if(wybor.charAt(0) > 47 && wybor.charAt(0) < 58){
                            liczba = Double.parseDouble(wybor);
                            wynik = Kal.roznica(wynik, liczba);
                            System.out.println(wynik);
                            wybor = scan.next();
                            break;
                        }
                        else{
                            break;
                        }
                    case "*":
                        wybor = scan.next();
                        if(wybor.charAt(0) > 47 && wybor.charAt(0) < 58){
                            liczba = Double.parseDouble(wybor);
                            wynik = Kal.mult(wynik, liczba);
                            System.out.println(wynik);
                            wybor = scan.next();
                            break;
                        }
                        else{
                            break;
                        }
                    case "/":
                        wybor = scan.next();
                        if(wybor.charAt(0) > 47 && wybor.charAt(0) < 58){
                            liczba = Double.parseDouble(wybor);
                            wynik = Kal.dziel(wynik, liczba);
                            System.out.println(wynik);
                            wybor = scan.next();
                            break;
                        }
                        else{
                            break;
                        }
                    case "%":
                        wybor = scan.next();
                        if(wybor.charAt(0) > 47 && wybor.charAt(0) < 58){
                            liczba = Double.parseDouble(wybor);
                            wynik = Kal.reszta(wynik, liczba);
                            System.out.println(wynik);
                            wybor = scan.next();
                            break;
                        }
                        else{
                            break;
                        }
                    case "s":
                        wynik = Kal.pierwiastek(wynik);
                        System.out.println(wynik);
                        wybor = scan.next();
                        break;
                    case "C":
                        wynik = 0;
                        System.out.println(wynik);
                        wybor = scan.next();
                        break;
                    case "E":
                        zgodnosc = false;
                        break;
                    case "M+":
                        pamiec = Kal.suma(pamiec, wynik);
                        wybor = scan.next();
                        break;
                    case "M-":
                        pamiec = Kal.roznica(pamiec, wynik);
                        wybor = scan.next();
                        break;
                    case "M*":
                        pamiec = Kal.mult(pamiec, wynik);
                        wybor = scan.next();
                        break;
                    case "M/":
                        pamiec = Kal.dziel(pamiec, wynik);
                        wybor = scan.next();
                        break;
                    case "M%":
                        pamiec = Kal.reszta(pamiec, wynik);
                        wybor = scan.next();
                        break;
                    case "Ms":
                        pamiec = Kal.pierwiastek(pamiec);
                        wybor = scan.next();
                        break;
                    case "MR":
                        wynik = pamiec;
                        System.out.println(wynik);
                        wybor = scan.next();
                        break;
                    case "MC":
                        pamiec = 0;
                        wybor = scan.next();
                        break;
                }
            }
        }
    }
}
