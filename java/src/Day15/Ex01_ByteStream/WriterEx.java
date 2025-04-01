package Day15.Ex01_ByteStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterEx {
	
	public static void main(String[] args) {
		// 파일경로
		String filePath = "sample.txt";
		
		try (
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			) 	{
			bw.write("Hello Java~! \n");
			bw.write("This is Bae Eun Ju \n");
			// \n 은 엔터(개행) 이스케이프 문자
			System.out.println("sample.txt 파일을 저장하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
