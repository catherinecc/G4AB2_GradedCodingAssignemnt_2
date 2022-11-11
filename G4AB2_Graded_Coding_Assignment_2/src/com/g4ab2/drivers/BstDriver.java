package com.g4ab2.drivers;

import com.g4ab2.service.Bst;

public class BstDriver {
	public static void main(String[] args) {
		Bst bst = new Bst();
		bst.insert(50);
		bst.insert(30);
		bst.insert(60);
		bst.insert(10);
		bst.insert(55);

		bst.printRightSkewedTree();

	}

}
