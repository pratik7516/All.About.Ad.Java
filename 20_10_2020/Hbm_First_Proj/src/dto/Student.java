package dto;

public class Student {
	private int rno;
	private String studentName;
	private float fee;
	public Student() {
	}
	public Student(int rno, String studentName, float fee) {
		super();
		this.rno = rno;
		this.studentName = studentName;
		this.fee = fee;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return rno + " " + studentName + " " + fee;
	}
	
}
