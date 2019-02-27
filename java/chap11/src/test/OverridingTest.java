package test;

class MySum {
    int first;
    int second;
    //String s;
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

	public String toString() {
//		int a= first+second;
//		s=String.valueOf(first+second);
//		
//		return s;
		
		return String.valueOf(first+second);
	}

	public boolean equals(Object obj) {
		
		if(obj instanceof MySum) {
//			boolean result = s.equals(((MySum)obj).s);
//			return result;
			
//			String me = toString();
//			String other = obj.toString();
//			//String other = ((MySum)obj).toString();
//			//오버라이딩 된 메소드는 형변환 필요 없음.
//			return (me.equals(other));
			return (toString().equals(obj.toString()));
		}
		else {
			return false;
		}
	}

}

public class OverridingTest {

	public static void main(String[] args) {
		int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(j, i);

        System.out.println(ms1);//30
        System.out.println(ms2);//30

        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");

	}

}
