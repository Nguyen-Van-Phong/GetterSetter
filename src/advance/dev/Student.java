package advance.dev;
import java.util.Scanner;

public class Student {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int old;
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	float toan;
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	float ly;
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	float hoa;
	public int dtb;
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	public float dtb() {
		
		return (toan + ly + hoa) /3; 
		
	}


}
