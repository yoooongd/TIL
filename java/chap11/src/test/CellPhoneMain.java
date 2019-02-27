package test;

class CellPhone {
	String model;//핸드폰 모델
	double battery;//남은 배터리 양
	
	CellPhone(String model){
		this.model=model;
	}
	void call(int time) throws IllegalArgumentException {
		double t;
		
		try {
			if(time<0) {
				throw new IllegalArgumentException("통화시간입력오류");
			}
			t=time*0.5;
			battery-=t;
			if(battery<0) {
				battery=0;
			}
			System.out.println("통화시간 시간: "+time);
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void charge(int time) throws IllegalArgumentException {
		
		try {
			System.out.println("충전시간: "+time);
			battery+=time*3;
			if(battery>100) {
				battery=100;
			}
			if(time>100) {
				throw new IllegalArgumentException("충전시간입력오류");
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
	
		}
	}

	void  printBattery() {
		System.out.println("남은 배터리량: "+battery);
	}
	boolean  isSame(CellPhone other) {
		return (model.equalsIgnoreCase(other.model));
	}
}

public class CellPhoneMain {

	public static void main(String[] args) {
		CellPhone myPhone = 
		new CellPhone("GALAXY-9");
				
		//charge, call 메소드 호출 포함하여 try-catch 블록 정의
		// throws 하고 있는 예외 처리한다.
		// 각 예외 발생시 어떤 메소드에서 어떤 원인으로 발생했는지
		// 출력한다


		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
				
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
				
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
				
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
				
		myPhone.call( -20 );  //통화시간입력오류
				
		CellPhone yourPhone = new CellPhone("galaxy-9");
				
		if( myPhone.isSame(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 

	}

}
