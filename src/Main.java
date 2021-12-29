public class Main {
    public static void main(String[] args) {
        int account = 200;
        int replenishment = 1200;
        int bonus;
        if (replenishment>=1000){
             bonus = replenishment/100;
        }else {
            bonus = 0;}



               int balance = replenishment + account+ bonus;
        System.out.println("Ваш счет"+balance + "<Бонусные рубли" + bonus );
    }
}