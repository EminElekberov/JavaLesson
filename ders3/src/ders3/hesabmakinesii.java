package ders3;

public class hesabmakinesii {
	/*public int sayi1;
    public int sayi2;*/
	
	/*public int sayi1;
    public int sayi2;
    hesabmakinesii(int sayi1,int sayi2){
    	this.sayi1=sayi1;
    	this.sayi2=sayi2;
    }*/
	public int sayi1;
    public int sayi2;
    public String reng;
    hesabmakinesii(int sayi1,int sayi2,String reng){
    	this.sayi1=sayi1;
    	this.sayi2=sayi2;
    	this.reng=reng;
    }
    public int toplam() {
    	return this.sayi1+this.sayi2;
    }
    public int cixma() {
    	return this.sayi1-this.sayi2;
    }
    public int bolme() {
    	return this.sayi1/this.sayi2;
    }
    public int vurma() {
    	return this.sayi1*this.sayi2;
    }
	
}
