package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Student arr [] = new Student[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nhap vao 5 nguoi");
			arr[i] = new Student();
			System.out.println("nhap ten");
			
			arr[i].setName(sc.nextLine()); 
			System.out.println("toan");
			arr[i].setToan(sc.nextFloat());
			
			System.out.println("ly");
			arr[i].setLy(sc.nextFloat());
			
			System.out.println("nhap diem hoa");
			arr[i].setHoa(sc.nextFloat());
			sc.nextLine();
		 	
		}
			//in danh sach sih vien
			for (int i = 0; i < arr.length; i++) {
				System.out.format("Name:%s -old:%d- dtb:%.2f",arr[i].getName(),arr[i].getOld());
				
			}
			//tim diem tb cao nhat
			float dtb = arr[0].dtb();
			for (int i = 0; i < arr.length; i++) {
				if(dtb<arr[i].dtb())
					dtb = arr[i].dtb();
				//in danh sach sinh vien co dtb cao nhat
				Print(arr);
				//sap xep
				for (int j = 0; j < arr.length; j++) {
					if(arr[i].dtb() < arr[j].dtb()) {
						Student sv = arr[i];
						arr[i] = arr[j];
						arr[j] = sv;
			}
			
		}
			

}
	}

	private static void Print(Student[] arr) {
		// TODO Auto-generated method stub
		
	}
	
}