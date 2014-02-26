/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl.softwareconstruction.tugas.main;

/**
 * Kelas AB adalah parent dari kelas ABB dan anak dari kelas A yang mengimplementasi interface B dan C
 * 
 * @author Rian
 * @author hastiie
 */
public class AB extends A implements B, C {

        /*
        * Konstruktor AB mencetak string "ctor-AB"
        */
        public AB() {
		System.out.println("ctor-AB");
	}
        /*
        * prosedur f adalah overide procedure dari kelas A yang mencetak string "AB.f()"
        */
	@Override
	public void f() {
		System.out.println("AB.f()");
	}
        /*
        * prosedur v adalah overide procedure dari interface B yang mencetak string "AB.v()"
        */	
	@Override
	public void v() {
		System.out.println("AB.v()");
	}
        /*
        * prosedur g adalah overide procedure dari interface C yang mencetak string "AB.g()"
        */
	@Override
	public void g() {
		System.out.println("AB.g()");
	}
	
}