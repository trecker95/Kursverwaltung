
public class Kursinformation {
	private String beschreibung;
	private int semester;
	private int mindestzahl;
	private int hoechstzahl;
	public Kursinformation(String beschreibung, int semester, int mindestzahl,
			int hoechstzahl) {
		super();
		this.beschreibung = beschreibung;
		this.semester = semester;
		this.mindestzahl = mindestzahl;
		this.hoechstzahl = hoechstzahl;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public int getSemester() {
		return semester;
	}
	public int getMindestzahl() {
		return mindestzahl;
	}
	public int getHoechstzahl() {
		return hoechstzahl;
	}
	@Override
	public String toString() {
		return "Kursinformation [beschreibung=" + beschreibung + ", semester="
				+ semester + ", mindestzahl=" + mindestzahl + ", hoechstzahl="
				+ hoechstzahl + "]";
	}
	public static void main(String[] args){
		Kursinformation se = new Kursinformation("Software Engineering", 4, 5, 50);
		System.out.println(se);
	}
}
