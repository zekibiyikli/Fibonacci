import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int deger;
		float S1=0;
		float S2=1;
		float toplam=0;
		System.out.print("Kaçýncý deðeri istiyorsunuz: ");
		deger=input.nextInt();
		
		if(deger==0){
			toplam=0;
		}
		else if(deger==1){
			toplam=1;
		}
		else{
		for(int i=0;i<deger-1;i++){
			toplam=S1+S2;
			S1=S2;
			S2=toplam;
		}
		}
		System.out.println("toplam : " +toplam);
		
	}

}
