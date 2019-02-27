package chap5;

public class ArrayTest3 {

	public static void main(String[] args) {
		int scores[] = new int[5]; //정적인 길이(길이 변경x)
		for(int i=0; i<scores.length;i++) {
			scores[i]=(i+1)*10;
			System.out.print(scores[i]+" ");
		}
		//이전 저장 배열 내용 삭제 이전 복사
		int scores2[] = new int[10];
		//System.arraycopy(어디서, 몇 번 인덱스부터?, 어디로, 몇 번 인덱스로, 몇 개);
		System.arraycopy(scores, 0, scores2, 5, scores.length);
		System.out.println("\n아래는 scores2");
		for(int i=0; i<scores2.length;i++) {
			System.out.print(scores2[i]+" ");
		}
		System.out.println("\n향상된 for문");
		//for(데이터 타입 변수:배열)
		for(int sc : scores2) {
			System.out.print(sc+" ");//여기선 sc는 인덱스가 아님.
		}
	}
}
