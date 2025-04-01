package Day15.Ex01_ByteStream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyEx {
	
	public static void main(String[] args) {
		
		try (
			FileReader fr = new FileReader("sample.txt");
			FileWriter fw = new FileWriter("sample2.txt");
	) {
			int data = 0;
			// 파일 입력
			while ((data = fr.read() ) != -1) {
				fw.write(data);
			}
			System.out.println("파일이 복사이 복사되었습니다.");
			System.out.println("sample.txt -> sample2.txt");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
}
