/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl.softwareconstruction.tugas.main;
/**
 * Kelas ABB adalah anak dari kelas AB yang mengimplementasi interface B
 * @author hastiie
 * akber
 */
public class ABB extends AB implements B {
        /*
    deklarasi variabel x yang bersifat private
    */
	private int x;
/*
        Konstruktor kelas ABB yang berparameter kosong yang mengnisialisasi x dengan nilai 0 dan mencetak string "ctor-ABB"
        */
	public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}
/*
        Konstruktor kelas ABB yang berparameter x yang mengnisialisasi x dengan nilai x dan mencetak string "ctor-ABB (x = <nilai x> )"
        */
	public ABB(int x) {
		this.x = x;
		System.out.println("ctor-ABB (x = " + x + ")");
	}
        /*
        * prosedur v adalah overide procedure dari kelas AB yang mencetak string "ABB.v()"
        */
	@Override
	public void v() {
		System.out.println("ABB.v()");
	}
        /*
        * prosedur f adalah overide procedure dari kelas AB yang mencetak string "ABB.f()"
        */
	@Override
	public void f() {
		System.out.println("ABB.f()");
	}
        /*
        * fungsi getX adalah fungsi yang mengembalikan nilai x
        */
	public int getX() {
		return x;
	}
        /*
        * fungsi getX adalah fungsi yang mengembalikan nilai x dalam bentuk string
        */
	@Override
	public String toString() {
		return "" + x;
	}
}