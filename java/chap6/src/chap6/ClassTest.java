package chap6;
//교육생 정적 + 동적 
class Student2{
 String name; //필드 선언
 String company;
 String course;
 int edu;
 int add;
 int ret;
 Student2(String name, String company, String course, int edu, int add){   //생성자 객체 초기화
	  this.name = name;
	  this.company = company;
	  this.course = course;
	  this.edu = edu;
	  this.add = add;
	  
	 }
  int calc(){
	  //환급금 계산하다 
	  if (course.equals("자바프로그래밍")) {
		  ret = (int)(edu * 0.25) + add;
	  }else if(course.equals("JDBC프로그래밍")) {
		  ret = (int)(edu * 0.2) + add;
	  }else if(course.equals("JSP프로그래밍")) {
		  ret = (int)(edu * 0.15) + + add;
	  }else {
	   System.out.println("잘못 입력되었습니다.");
	   return 0;
	  }
	  return ret;
  }
}

public class ClassTest {
 public static void main(String[] args) {
  
  int a= Integer.parseInt(args[3]);
  int b= Integer.parseInt(args[4]);
  Student2 stu = new Student2
		  (args[0], args[1],
				  args[2].toUpperCase() ,a,b);
  
  int result = stu.calc();//호출 실행

  if(result == 0) {
	  return;
  }
  System.out.println("이름: " + stu.name);
  System.out.println("소속: " + stu.company);
  System.out.println("과목명: " + stu.course);
  System.out.println("교육비: " + stu.edu);
  System.out.println("부가금: " + stu.add);
  System.out.println("환급금: " + result);
}
}
