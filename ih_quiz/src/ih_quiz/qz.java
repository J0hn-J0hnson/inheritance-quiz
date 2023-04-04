package ih_quiz;

import java.util.*;

class Person{
	protected String name;
	protected String born_data;
	void pv() {
		System.out.println("name = " + name + "\nborn_data = " + born_data + "\n");
	}
	Person(String name, String born_data){
		this.name = name;
		this.born_data = born_data;
	}
	
	public void sleep() {
		System.out.println("zzzzz\n");
		
	}
	
	void pv_all() {
		pv();
		sleep();
	}
}

class Mahasiswa extends Person{
	
	private int student_id;
	private int point;
	void pv() {
		super.pv();
		System.out.println("code dosen = " + student_id + "\npoint = " + point + "\n");
	}
	Mahasiswa(String name, String born_data, int student_id, int point){
		super(name, born_data);
		this.student_id = student_id;
		this.point  = point;
	}
	public void helpingDosen() {
		this.point += 10;
		
	}
	void pv_all() {
		pv();
		helpingDosen();
		pv();
		sleep();
	}
}

class Dosen extends Person{
	private int code_dosen;
	private int point;
	
	void pv() {
		super.pv();
		System.out.println("code dosen = " + code_dosen + "\npoint = " + point + "\n");
	}
	Dosen(String name, String born_data, int code_dosen, int point){
		super(name, born_data);
		this.code_dosen = code_dosen;
		this.point  = point;
	}
	
	public void selfDev() {
		point++;
		
	}
	public void teach() {
		point += 2;
	}
	
	public void p2m() {
		point --;
	}
	
	public void research() {
		point += 20;		
	}
	
	public void otherWorks() {
		point += 2;
	}
	
	void pv_all() {
		pv();
		selfDev();
		pv();
		teach();
		pv();
		p2m();
		pv();
		research();
		pv();
		otherWorks();
		pv();
		sleep();
		
	}
	
}


public class qz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 = person / 2 = mahasiswa / 3 = dosen");
		int c1 = sc.nextInt();
		if(c1 == 1) {
			Person p = new Person("jim" , "2/3/2001");
			p.pv_all();
 		}else if(c1 == 2) {
 			Mahasiswa m = new Mahasiswa("tom" , "2/2/2001", 1, 10);
 			m.pv_all();
 		}else if(c1 == 3) {
 			Dosen d  = new Dosen("kim" , "2/2/1990", 2, 100);
 			d.pv_all();
 		}else {
 			System.out.println("input error");
 		}
		
	}

}
