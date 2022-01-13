import java.util.Random;
import java.util.Scanner;

public class mayintarlasi {
int rownumber,colnumber,size;
int[][] map;
int[][] board;
boolean game=true;
Random rand=new Random();
Scanner scan=new Scanner(System.in);
mayintarlasi(int rownumber,int colnumber){
	this.rownumber=rownumber;
	this.colnumber=colnumber;
	this.map=new int[rownumber][colnumber];
	this.board=new int[rownumber][colnumber];
	this.size=rownumber*colnumber;
}
public void run() {
	int row,col,success=0;
	preparegame();
	print(map);
	System.out.println("oyun basladi.. ");
	while(game) {
		print(board);
		System.out.print("setir: ");
		row=scan.nextInt();
		System.out.print("sutun: ");
		col=scan.nextInt();
		if(row< 0 || row>=rownumber) {
			System.out.println("gecersiz kordinat!!");
			continue;
		}
		if(col< 0 || col>=colnumber) {
			System.out.println("gecersiz kordinat!!");
			continue;
		}
		if(map[row][col] !=-1) {
			check(row,col);
			success++;
			if(success==(size-(size/4))) {
				System.out.println("basardinzi. Hec bir mayina basmadiniz.");
				break;
			}
		}else {
			game=false;
			System.out.println("game over! ");
		}
	}
}
public void check(int r,int c) {
	if(map[r][c]==0) {
		if((c<colnumber-1) && (map[r][c+1]==-1)) {
			board[r][c]++;
		}
		if((r<rownumber-1) && (map[r+1][c]==-1)) {
			board[r][c]++;
		}
		if((r>0) && (map[r-1][c]==-1)) {
			board[r][c]++;
		}
		if((c>0) && (map[r][c-1]==-1)) {
			board[r][c]++;
		}
		if(board[r][c]==0) {
			board[r][c]=-2;
		}
	}
	
}
public void preparegame(){
	int randrow,randcol,count=0;
	while (count !=(size/4)) {
		randrow=rand.nextInt(rownumber);
		randcol=rand.nextInt(colnumber);
		if(map[randrow][randcol] !=-1) {
			map[randrow][randcol] =-1;
			count++;
		}
	}
	
}
public void print(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]>=0)
				System.out.print(" ");
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
}
}
