package test;

public class Test2 {

	public static void main(String[] args) {
		int cntOfBooks = 97;//main 블럭에서 선언
		int cntOfStu = 12;
		
		String result ="";
		
		// cf) boolean? true 1문장 : false 1문장

		if(cntOfBooks>cntOfStu)
		{
			int a = cntOfBooks / cntOfStu; //지역변수
			int k = cntOfBooks % cntOfStu; //if 블럭 안에서만 사용된다.
			
			result= "1명의 학생 당: "+a+"권씩 가질 수 있습니다.\n"+"남아있는 책은 "+k+"권 입니다.";
			//System.out.println("1명의 학생 당: "+a+"권씩 가질 수 있습니다.");
			//System.out.println("남아있는 책은 "+k+"권 입니다.");
		}
		else
		{
			result="나눌 수 없습니다.";
			//System.out.println("나눌 수 없습니다.");
		}
		System.out.println(result);
	}

}
