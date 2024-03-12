//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 31;
        int b = 101;
        int c = 49;
        if (n<b && n>c) {
            System.out.println("Число " + n + " міститься в проміжку (50;100)");
        } else{
            System.out.println("Число " + n + " не міститься в проміжку (50;100)");
        }

        int a =997 ;
        int q = a%10;
        int w = (a/10)%10;
        int e = a/100;
        if (q<w && w>e){
            System.out.println("Найбільше число = " + w);
        } else if (w<q && q>e) {
            System.out.println("Найбільше число = " + q);
        } else if (q<e && e>w) {
            System.out.println("Найбільше число = " + e);
        } else if (q==w && q>e) {
            System.out.println("Найбільше число = " + q);
        } else if (q==e && q>w) {
            System.out.println("Найбільше число = " + q);
        } else if (w==e && w>q) {
            System.out.println("Найбільше число = " + w);
        }


        String direction = "До низу";
        int floor = 4;
        if (direction=="До гори" && floor==1){
            System.out.println("Ви піднялись на 1 поверх");
        } else if (direction=="До гори" && floor==2) {
            System.out.println("Ви піднялись на 3 поверх");
        } else if (direction=="До гори" && floor==3) {
            System.out.println("Ви піднялись на 3 поверх");
        } else if (direction=="До гори" && floor==4) {
            System.out.println("Ви піднялись на 4 поверх");
        } else if (direction=="До гори" && floor==5) {
            System.out.println("Ви піднялись на 5 поверх");
        }else if (direction=="До гори" && floor==6) {
            System.out.println("Ви піднялись на 6 поверх");
        }else if (direction=="До гори" && floor==7) {
            System.out.println("Ви піднялись на 7 поверх");
        }else if (direction=="До гори" && floor==8) {
            System.out.println("Ви піднялись на 8 поверх");
        }else if (direction=="До гори" && floor==9) {
            System.out.println("Ви піднялись на 9 поверх");
        }else if (direction=="До низу" && floor==1) {
            System.out.println("Ви спустились на 1 поверх");
        }else if (direction=="До низу" && floor==2) {
            System.out.println("Ви спустились на 1 поверх");
        }else if (direction=="До низу" && floor==3) {
            System.out.println("Ви спустились на 3 поверх");
        }else if (direction=="До низу" && floor==4) {
            System.out.println("Ви спустились на 4 поверх");
        }else if (direction=="До низу" && floor==5) {
            System.out.println("Ви спустились на 5 поверх");
        }else if (direction=="До низу" && floor==6) {
            System.out.println("Ви спустились на 6 поверх");
        }else if (direction=="До низу" && floor==7) {
            System.out.println("Ви спустились на 7 поверх");
        }else if (direction=="До низу" && floor==8) {
            System.out.println("Ви спустились на 8 поверх");
        }else if (direction=="До низу" && floor==9) {
            System.out.println("Ви спустились на 9 поверх");
        }else {
            System.out.println("Ви вказали неіснуючий поверх!");
        }

        String option = "OK";
        switch(option){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невірне твердження");

        }
    }
}