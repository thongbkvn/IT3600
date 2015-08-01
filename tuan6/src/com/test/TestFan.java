//package com.test;
import com.bean.Fan;
import com.bean.ElectricFan;

public class TestFan {
    public static void main(String args[]) {
	Fan fan1 = new Fan();
	fan1.show();
	Fan fan2 = new Fan(20, true, 30, "Yellow");
	fan2.show();
	
	ElectricFan eFan = new ElectricFan(10, true, 20, "Red", 220);
	eFan.show();
	eFan.changeSpeed(20);
	eFan.show();
    }
}
