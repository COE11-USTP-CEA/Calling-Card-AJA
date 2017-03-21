package com.sample.spark.extend;
import com.sample.spark.extend.Info;

import java.util.ArrayList;

public class Cards {

	ArrayList<Info> details = new ArrayList<Info>();


	public ArrayList<Info> all(){
		return details;
	}


	public void add(Info i){
		details.add(i);
	}
	
	public Info updateItemByCode(String code, String name){
		for (Info i : details ) {
			if ( code.equals(i.code) ) {
				i.setName(name);
				return i;
			}
		};
		return null;
	
	}


	public Info deleteItemByCode(String code){
		for (Info i : details ) {
			if ( code.equals(i.code) ) {
				details.remove(i);
				return null;
			}
		};
		return null;
	}

	public Info findItemByCode(String code){
		for (Info i : details ) {
			if ( code.equals(i.code) ) {
				return i;
			}
		};
		return null;
	}

}
