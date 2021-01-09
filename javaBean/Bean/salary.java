package Bean;

public class salary {
	private String number;
	private String name;
	private int basicwage;
	private int jiaban;
	private int night;
	private int late;
	private int isfa;
	private double total;
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getIsfa() {
		return isfa;
	}
	public void setIsfa(int isfa) {
		this.isfa=isfa;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicwage() {
		return basicwage;
	}
	public void setBasicwage(int basicwage) {
		this.basicwage = basicwage;
	}
	public int getJiaban() {
		return jiaban;
	}
	public void setJiaban(int jiaban) {
		this.jiaban = jiaban;
	}
	public int getNight() {
		return night;
	}
	public void setNight(int night) {
		this.night = night;
	}
	public int getLate() {
		return late;
	}
	public void setLate(int late) {
		this.late = late;
	}
	
}
