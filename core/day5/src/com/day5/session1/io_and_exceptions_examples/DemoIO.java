package com.day5.session1.io_and_exceptions_examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class DemoIO {

	public static void main(String[] args) throws IOException {
		Set<String>words=new LinkedHashSet<String>();
		
		//print all unique char, collection api : HashSet
		BufferedReader br=new BufferedReader(new FileReader( new File("story.txt")));
		String line=null;
		while((line=br.readLine())!=null) {
			String []tokens= line.split(" ");
			for(String token: tokens) {
				words.add(token.toLowerCase());
			}
		}
		
		//now print all the unique words from the file
		for(String word: words) {
			System.out.println(word);
		}
	}
}
