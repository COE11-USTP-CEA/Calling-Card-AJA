package com.sample.spark.extend;
import java.util.*;
import com.sample.spark.extend.*;

public class cards{
		ArrayList<info> listofcards = new ArrayList();
		ArrayList<info> temp = new ArrayList();

		public  int count(String c){
			int counter = 0;
			for(info i : listofcards){
				if((c.equalsIgnoreCase(i.id))||(c.equalsIgnoreCase(i.name))||(c.equalsIgnoreCase(i.address))||(c.equalsIgnoreCase(i.companyname))||(c.equalsIgnoreCase(i.contact))||(c.equalsIgnoreCase(i.email))){
					counter += 1;
				}
			}
			return counter;
		}
		public ArrayList<info> search(String c){
			temp.clear();
			for(info i : listofcards){
				if((c.equalsIgnoreCase(i.id))||(c.equalsIgnoreCase(i.name))||(c.equalsIgnoreCase(i.address))||(c.equalsIgnoreCase(i.companyname))||(c.equalsIgnoreCase(i.contact))||(c.equalsIgnoreCase(i.email))){
					temp.add(i);	
				}
			}
			return temp;
		}
		public ArrayList<info> all(){
			return listofcards;
		}
		public void add(info info){
			listofcards.add(info);
		}
		public info updatebyid(String id, String name, String address, String companyname, String contact,String email){
		for (info i : listofcards ) {
			if ( id.equals(i.id) ) {
				i.setname(name);
				i.setid(id);
				i.setaddress(address);
				i.setcompanyname(companyname);
				i.setcontact(contact);
				i.setemail(email);
				return i;
			}
		}
		return null;
	}
		public boolean testif(String t){
			boolean test = false;
			for(info i : listofcards){
				if(t.equals(i.id)){
					test = true;
				}
			}
			return test;
		}
		public info deletebyid(String id){
			for (info i : listofcards ) {
				if ( id.equals(i.id) ) {
					listofcards.remove(i);
					return i;
				}
			}
			return null;
		}
		public info showbyid(String id){
			for (info i : listofcards ) {
				if ( id.equals(i.id) ) {
					return i;
				}
			}
			return null;
		}
		public String getSaltString() {
			String dummy = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < 4) {
				int index = (int) (rnd.nextFloat() * dummy.length());
				salt.append(dummy.charAt(index));
			}
			String saltStr = salt.toString();
			return saltStr;
		}
	//	info t0 = new info("name","address","companyname","contact","email");
		
	//	listofcards.add(t0);

	//	display();
		
		//List<info> founditems = new ArrayList();
	/*	public static void display(){
			for(info x: listofcards){
			System.out.print(x.Getname());
			System.out.print("\t" + x.Getaddress());
			System.out.print("\t" + x.Getcompanyname()+ "\n");
			System.out.print("\t" + x.Getcontact());
			System.out.print("\t" + x.Getemail());
			}
	*/	}
	