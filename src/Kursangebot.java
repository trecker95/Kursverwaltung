import java.util.ArrayList;


public class Kursangebot {
	private Dozent dozent;
	private Kursinformation kursinformation;
	private ArrayList<Student> teilnehmer;
	public Kursangebot(Dozent dozent, Kursinformation kursinformation) {
		super();
		this.dozent = dozent;
		this.kursinformation = kursinformation;
		this.teilnehmer = new ArrayList<Student>();
	}
	@Override
	public String toString() {
		return "Kursangebot [dozent=" + dozent + ", kursinformation="
				+ kursinformation + "]";
	}
	public void addStudent(Student student){
		teilnehmer.add(student);
	}
	public boolean isVoll(){
		return teilnehmer.size() >= kursinformation.getHoechstzahl();
	}
	public static void main(String[] args){
		Dozent dozent = new Dozent("Plaﬂ");
		Kursinformation kursinformation = new Kursinformation("Software Engineering", 4, 5, 50);
		Kursangebot se = new Kursangebot(dozent, kursinformation);
		System.out.println(se);
	}
}
