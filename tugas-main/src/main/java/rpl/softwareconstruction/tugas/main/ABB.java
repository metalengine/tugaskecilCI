/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpl.softwareconstruction.tugas.main;
/**
 *
 * @author hastiie
 * akber
 */
public class ABB extends AB implements B {

	private int x;

	public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}

	public ABB(int x) {
		this.x = x;
		System.out.println("ctor-ABB (x = " + x + ")");
	}

	@Override
	public void v() {
		System.out.println("ABB.v()");
	}

	@Override
	public void f() {
		System.out.println("ABB.f()");
	}

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "" + x;
	}
}