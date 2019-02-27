package chap11;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		//현재 날짜와 시간 추출 방법
		//1. Date 클래스 사용
		
//		Date now = new Date();
//		System.out.println(now);
//		//Mon Jan 07 13:23:39 KST 2019
//		//toString을 오버라이딩 하고 있다.
//		//원래는 주소값이 나올 것.
//		
//		//1970.1.1.0.0.0 ~ ? : 1/1000초 단위
//		Date d3 = new Date(100000000000l);
//		System.out.println(d3);
//		
//		//사용 자제할 것. 구현상의 문제, 사용 문제점 발견, 이름 매개변수 사용 어려움
//		//자제 권고=Deprecated
//		Date d2 = new Date(2019, 1, 7);
//		System.out.println(d2);
		
		//2. Calendar 클래스 사용	
	
//		//위를 보완하기 위한 Calendar 클래스
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		//Calendar 클래스는 abstract이기 때문에 객체를 따로 만들지 않고 바로 클래스 이름.메소드 사용.
//		//그냥 외워라!..
		
		//연도, 월, 일, 시, 분, 초 원하는 것만 추출
		int year = cal.get(Calendar.YEAR);//연도 추출
		int month = cal.get(Calendar.MONTH)+1;//월 추출
		int day = cal.get(Calendar.DAY_OF_MONTH);//일 추출
		int hour = cal.get(Calendar.HOUR_OF_DAY);//시간 (24시간 형태)
		int minute = cal.get(Calendar.MINUTE);//분
		int second = cal.get(Calendar.SECOND);//초
		
		System.out.println("현재 시각은 "+year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분 "+second+"초");
		
		//오늘부터 100일 후
		//cal.set(Calendar.DAY_OF_YEAR, cal.get(Calendar.DAY_OF_YEAR)+100);//바꾸는 함수
		
		//3. java.text.SimpleDateFormat 클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy / MM / dd / HH:mm:ss - E");
		////연도: y, 월: M, 일: d, D, 시: h, H, 분: m, 초: s
		//DDD 일 년 중에 몇 번째 날인지 dd 월 중에 몇 번째 날인지
		//HH 24시간 hh 12시간
		
		//sdf.format(new Date());
		String datestr = sdf.format(cal.getTime());
		System.out.println(datestr);

		double d = 500 * Math.PI;
		System.out.println(d);//15.707963267948966
		DecimalFormat df = new DecimalFormat("###.00");//소수점 2자리
		String sd = df.format(d);//d에게 이 format을 적용해라~~
		System.out.println(sd);

	}
}
