//1번째 - input.log파일 입력받아서 데이터받은후
//2번째 - 데이터를 분석 파일에 OOO문자가들어가면 (if문써서) 출력하는데 그걸 output.log에저장
//1. 최다호출 APIKEY
//2. 상태코드 별 횟수
//10 : 66
//200 : 3785
//404 : 105
//3. (호출 횟수 기준) 상위 3개의 API ServiceID와 각각의 요청 후
//상위 3개의 API ServiceID와 각각의 요청 수
//blog : 1224
//vdip : 871
//image : 705
//4. 피크 시간대
//2009-06-10 08:51
//5. 웹 브라우저 별 사용 비율
//IE : 79.1%
//Firefox : 9.4%
//Safari : 3.1%
//Chrome : 7.2%
//Opera : 1.2%
//을 파일로 출력하는 프로그램을 구현해보세요.

package com.baron.log_analysor;

import java.io.*;
import java.util.*;


public class logAnalysor {

	public static void main(String[] args) {

		int k=0;
		
		try {

			String fileName = "intput.log";
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}





//------------------------------------------------------------------

//public class logAnalysor {
//
//	public static void main(String[] args) {
//		
//		Scanner read = new Scanner(System.in);	
//
//		System.out.printf("로그 분석기 입니다. ");
//	//	String adress = read.next(); 
//
//		String pathname = "C:\\Temp\\intput.log";
//		File file = new File(pathname);
//		
//		FileReader fr = null;
//		BufferedReader br = null;
//		
//		try{
//			fr = new FileReader(file);
//			br = new BufferedReader(fr);
//
//			String str="";
//			while((str = br.readLine()) != null){
//				System.out.print(str);
//			}
//			br.close();		
//		} catch(IOException e){
//			System.out.println("입출력 오류");
//		}		
//	}
//}

//-------------------------------------------------------
//import java.io.*;
//import java.util.ArrayList;
//
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//
//public class Diff {
//    public static void main(String args[]) {
//        ArrayList list = new ArrayList();
//     try {
//            BufferedReader br = new BufferedReader(new FileReader("./a.txt"));
//            String line = null;
//while ((line = br.readLine()) != null) {
//             if(line.contains("<title>")){
//              list.add(line);
//             }
//             else if(line.contains("<content>")){
//              list.add(line);
//             }
//            }
//        } catch (FileNotFoundException fnfe) {
//            System.out.println("not found file");
//        } catch (IOException ioe) {
//            System.out.println("error file");
//        }
//        for(int i = 0; i<list.size();i++){
//         System.out.println(list.get(i));
//         }
//        }
//}
//
//
//이렇게하면 되겠지요 <title>이랑 <content>를 포함안시키려면 add()할때 단어를 제거하고 add()하면 되겠지요


