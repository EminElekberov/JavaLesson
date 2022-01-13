package ders3;

import java.util.Scanner;

public class notortalamss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quiz,vize,son;
		double ortalama;
		Scanner input=new Scanner(System.in);
		System.out.print("quiz notunu girin: ");
		quiz=input.nextInt();
		System.out.print("vize notunu girin: ");
		vize=input.nextInt();
		System.out.print("son notunu girin: ");
		son=input.nextInt();
		ortalama=(quiz*0.2)+(vize*0.35)+(son*0.45);
		System.out.print("not ortalamaniz : "+ortalama);
		String sonuc= (ortalama >= 50) ? "gecdinziz" : "qaldiniz";
		System.out.print("cavab : "+sonuc);
	}

}
