package chap18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInTest2 {
public static void main(String[] args) {
//src/chap18/FileInTest2.java copy.txt
	FileReader fr = null;
	FileWriter fw = null;
		try {
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1]);

			int result = 0;
			int num = 1;
			fw.write((num++)+" : ");
			while((result=fr.read()) != -1) {
				fw.write(result);
				if(result==10) {
					//엔터키, 줄바꿈, 라인 번호 (엔터키의 값이 10이기때문)
					//enter = \r(13)+\n(10)
					fw.write((num++)+" : ");
				}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {	
			try {
			fr.close();
			fw.close();
			}catch(IOException e) {
				
			}
		}
}
}
