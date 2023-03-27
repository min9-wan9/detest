package cau2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import cau1.Book;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static String inputScannerString() {
		String s=null;
		while(s==null) {
			try {
			try {
				s=sc.nextLine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("Vui lòng nhập lại kiểu chuỗi!");
			
		}
			finally {
				try {
					sc.nextLine();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return s;
	}
	public static void main(String[] args) {
		try {
			System.out.println("Nhập đường link file: ");
			String s= inputScannerString();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File f= new File("s");
		try {
			List<String> sach= Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
			System.out.println("Tổng số sách: "+sach.size());
			for (String thongTin : sach) {
				System.out.println(thongTin);
			}
			Collections.sort(sach, Comparator.comparing(o->o));
			System.out.println("Sau khi sắp xếp: ");
			for (String string : sach) {
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
