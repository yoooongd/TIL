package chap5;

public class SortTest {

	public static void main(String[] args) {
		//명령 라인 정수 입력 (개수는 5-10)
		//입력 정수 배열 저장.
		//배열 오름차순 정렬 결과 출력
		//예시)
		//정렬 이전: 11 78 2 67 34 55
		//정렬 이후: 2 11 34 55 67 78
		
		System.out.println("입력변수의 갯수: "+args.length);
		
		System.out.println("정렬 이전");
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}

		int conv[]=new int[args.length];
		
		for(int i=0; i<args.length; i++) {
			conv[i] += Integer.parseInt(args[i]);
		}
		
		System.out.println("\n정렬 이전(정수로 전환)");
		for(int i=0; i<conv.length; i++) {
			System.out.print(conv[i]+" ");
		}
//		System.out.println();
//		System.out.println(conv[0]+conv[1]);
		
		System.out.println("\n정렬(오름차순) 이후");
		for(int i=0; i<conv.length;i++) {
			for(int j=i+1; j<conv.length; j++) {
				if(conv[i]>conv[j]) {
					int temp=conv[i];
					conv[i]=conv[j];
					conv[j]=temp;
				}
			}
			System.out.print(conv[i]+" ");
		}
	}
}
