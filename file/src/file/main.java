package file;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("kod.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		String val="kodlama vakti";
		FileWriter fWritter=new FileWriter(file,false);
		BufferedWriter bWriter=new BufferedWriter(fWritter);
		bWriter.write(val);
		bWriter.write("\neminelekberov");
		bWriter.close();
		
		
		FileReader fReader=new FileReader(file);
		String line;
		BufferedReader bReader=new BufferedReader(fReader);
		while((line=bReader.readLine())!=null) {
			System.out.println(line);
		}
		bReader.close();
	}

}
