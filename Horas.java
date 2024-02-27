import java.util.Scanner;
public class Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sec=0,min=0,hrs=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los segundos:");
        sec = sc.nextInt();
        int inicio=sec;
        do{
            if (sec>3600) {
                sec-=3600;
                hrs++;
            }else if (sec>=60) {
                sec-=60;
                min++;
            }else if (sec<60){
                break;
            }
        }while(sec>60);
        System.out.printf("%d segundos son %d horas %d minutos %d segundos",inicio,hrs,min,sec);
	}

}