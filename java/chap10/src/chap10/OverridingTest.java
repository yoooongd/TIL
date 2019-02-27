package chap10;

class OverridingTest {
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);//10
        MySum ms2 = new MySum(j, i);//20
        
        System.out.println(ms1);//30
        System.out.println(ms2);//30
	
        if(ms1.equals(ms2))
            System.out.println
("ms1과 ms2의 합계는 동일합니다.");
    }
}

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

    /* 조건1 */
    public String toString() {
    	//String<-int
    	return String.valueOf(first + second);
    }
    /* 조건2 */
    public boolean equals(Object obj) {
    	if(obj instanceof MySum) {
    		return toString().equals(obj.toString());
     	}
    	else {
    		return false;
    	}
    }
}
/*
<출력결과>
30
30
ms1과 ms2의 합계는 동일합니다.
*/