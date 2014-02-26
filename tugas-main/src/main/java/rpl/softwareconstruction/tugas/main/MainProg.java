/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl.softwareconstruction.tugas.main;

import java.util.Vector;

/**
 * Kelas ini adalah kelas yang menguji kelas-kelas lainnya
 * @author Rian Andrian
 * @author Rickard Elsen
 */
public class MainProg implements X{
    /*
    * Method utama yang dipanggil
    * Menginisialisasi kelas ABB,P,dan Q
    * membuat vektor berukuran 10, mengisi vektor sesuai indeks dan mencetak ke layar
    */
	public static void main(String[] args) {
		int N = 10;
		ABB a = new ABB();
		
		MainProg mainProg = new MainProg();
		ABB a2 = new ABB(mainProg.w());
		
		Q q = new Q();
		
		a.f();
		Vector<Integer> v = new Vector<Integer>(N);
		v.add(a.getX());
		v.add(a2.getX());
		System.out.println("Isi Vector:");
		for (Integer i: v) {
			System.out.println(i);
		}
	}

	@Override
	public int w() {
		return 2;
	}    
}
