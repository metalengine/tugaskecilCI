/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl.softwareconstruction.tugas.main;

/**
 *
 * @author hastiie
 */
public class AB extends A implements B, C {

	public AB() {
		System.out.println("ctor-AB");
	}

	@Override
	public void f() {
		System.out.println("AB.f()");
	}
	
	@Override
	public void v() {
		System.out.println("AB.v()");
	}

	@Override
	public void g() {
		System.out.println("AB.g()");
	}
	
}