package com.sample.spark.extend;
import java.util.*;;

import com.sample.spark.extend.cards;

public class info{
	String name;
	String address;
	String companyname;
	String contact;
	String email;
	String id;
	String month;
	int date;
	

public void setname(String n){
	name = n;
}
public void setid(String i){
	id = i;
	}
public void setaddress(String a){
	address = a;
}
public void setcompanyname(String cn){
	companyname = cn;
	}
public void setcontact(String c){
	contact = c;
}
public void setemail(String e){
	email = e;
}
public void setdate(){
	Calendar cal = Calendar.getInstance();
    date = cal.get(Calendar.DAY_OF_MONTH);
}
public void setmonth(){
	Calendar cal = Calendar.getInstance(    );
    int m = cal.get(Calendar.MONTH);
    String[] months= {"JAN","FEB","MAR","APR","MAY","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    month = months[m];
	}
public String getname(){
	return name;
	}
public String getaddress(){
	return address;
}
public String getcompanyname(){
	return companyname;
	}
public String getcontact(){
	return contact;
}
public String getemail(){
	return email;
}
public String getid(){
	return id;
}
public int getdate(){
	return date;
	}
public String getmonth(){
	return month;
}
public info(String i, String n, String a, String cn, String c, String e, int d, String m){
	id = i;
	name = n;
	address = a;
	companyname = cn;
	contact = c;
	email = e;
	date = d;
	month = m;
	}
}