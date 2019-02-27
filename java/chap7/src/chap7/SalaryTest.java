package chap7;

class Employee{
	int id;
	String name;
	int money;
	int bonus;
	int total;
	Employee(){}
	Employee(int id, String name, int money, int bonus){
		this.id=id;
		this.name=name;
		this.money=money;
		this.bonus=bonus;
	}
	void cal() {
		total=money+bonus;
	}
}

class Manager extends Employee{
	int bonus2;//간부수당
	
	Manager(int id, String name, int money, int bonus, int bonus2){
		super(id, name, money, bonus);
		this.bonus2=bonus2;
	}
	
	void cal() {
		super.cal();
		total += bonus2;
		//total=money+bonus+bonus2; //같은 의미임.
	}
}
class Engineer extends Employee{
	int bonus3;//자격수당
	int bonus4;//기술수당
	
	Engineer(int id, String name, int money, int bonus, int bonus3, int bonus4){
		super(id, name, money, bonus);
		this.bonus3=bonus3;
		this.bonus4=bonus4;
	}
	void cal() {
		super.cal();
		total+=bonus3+bonus4;
	}
}


class Secretary extends Employee{
	int bonusS;
	
	Secretary(int id, String name, int money, int bonus, int bonusS){
		super(id, name, money, bonus);
		this.bonusS=bonusS;
	}
	void cal() {
		super.cal();
		total+=bonusS;
	}
}
public class SalaryTest {

	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager (2000,"김간부",20000,10000,10000);
		e[2] = new Engineer (3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		
		System.out.println("사번:이름:본봉:총급여");
		for(int i=0; i<e.length; i++) {
			e[i].cal();
			System.out.println(e[i].id+":"+e[i].name+":"+e[i].money+":"+e[i].total);
			if(e[i] instanceof Secretary) {
				System.out.println(((Secretary)e[i]).bonusS);
			}
			//객체=object=instance
			//참조타입에만 사용함 instanceof
			//e[i]가 Secretary의 객체입니까?를 의미
			
			//만약 System.out.println(((Secretary)e[i]).bonusS);
			//만 들어간다면 ((Secretary)e[0]).bonusS
			//에서 오류가 발생하게 되는데
			//그 이유는 형 변환이 잘못되었기 때문이다. "Employee -> Secretary" : 형 변환 불가능.
		}
		//System.out.println(((Secretary)e[3]).bonusS);
		//비서의 수당만 출력하는 방법.
		//절대 e[3].bonusS만으로는 불가(error)
		//형변환을 해줘야 한다.
	}

}
