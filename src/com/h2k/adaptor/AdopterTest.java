package com.h2k.adaptor;

public class AdopterTest {

	public static void main(String[] args) {
		SocketClassAdapterImpl socket = new SocketClassAdapterImpl();
		Volt three = socket.get3Volt();
		three.getVolts();

	}

}
