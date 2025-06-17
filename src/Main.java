public class Main {
    public static void main(String[] args) {
        System.out.println("привет, мир");
//Задача 1
for (int i = 0; i <= 10; i = i + 1) {
    System.out.println(i);
        }
//Задача 2
        for (int a =10; a >= 0; a = a - 1) {
            System.out.println(a);
        }
//Задача 3
for (int b = 0; b <= 17; b = b + 2) {
    System.out.println(b);
}
//Задача 4
        for (int c=10; c >=-10; c = c - 1) {
            System.out.println(c);
        }
//Задача 5
for (int d = 1904; d <= 2096; d = d + 4) {
    System.out.println(+d +" год является високосным");
}
//Задача 6
for (int e = 7; e <= 98; e = e + 7) {
    System.out.println(e);
}
//Задача 7
int salary = 29000;
int total = 0;
for (int f = 1; f < 12; f ++) {
    total = total + salary;
    System.out.println("Месяц "+ f +", сумма накоплений равна "+ total +" рублей");
}
//Задача 8
int zp = 29000;
int tota = 0;
for (int y = 1; y < 12; y++ ) {
    tota = tota + tota/100;
    tota = tota + zp;
    System.out.println("Месяц " + y + ", сумма накоплений равна " +tota+" рублей");
}
//Задача 10
for (int x = 1; x <= 10; x = x + 1) {
    System.out.println("2*" + x + "=" + 2 * x);
}
    }
}
