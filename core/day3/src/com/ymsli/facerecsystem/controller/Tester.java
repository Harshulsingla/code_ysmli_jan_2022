package com.ymsli.facerecsystem.controller;

import com.ymsli.facerecsystem.db.Face;

public class Tester {

	public static void main(String[] args) {
		Face face =new Face();
		face.saveFacePixcelsOnDB();
		
		com.ymsli.facerecsystem.ui.Face face2=new com.ymsli.facerecsystem.ui.Face();
		face2.printFaceOnUi();
	}
}
