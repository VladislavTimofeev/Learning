public class reloc {
    public static void main (String[] args){
        double a=1;
        double b=5;
        double c=4;
        int g=2; // Степень равная двум
        int k=-2; //Степень равная минус два
        int h=3; //Степень равная три
        /* после объявления переменных,
        я ввел еще несколько, которые обозначают определенные действия*/
        double q=(b+Math.sqrt(Math.pow(b,g)+4*a*c));//Числитель дроби
        double w=q/2*a;//Числитель разделил на знамнатель
        double o=w-Math.pow(a,h)*c+Math.pow(b,k);//Нахождение полного решения примера
        System.out.println(o);

    }
}
