package com.toshiba.jdbc;

import java.util.Iterator;
import java.util.List;

public class DiplayRecords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiplayRecords dr = new DiplayRecords();
		List<POJOObject> list = SQLSatement.getResultSet();
		dr.display(list);
			}

	private void display(List<POJOObject> list) {
		// TODO Auto-generated method stub
		
		/*Iterator<POJOObject> it = list.iterator();
		while (it.hasNext()){
			POJOObject po = (POJOObject)it.next();
			System.out.print(po.getId()+"      ");
			System.out.print(po.getName());
			System.out.println(po.getCourse());
			}*/
		
			for (POJOObject pojo: list){
			System.out.print(pojo.getId()+"      ");
			System.out.print(pojo.getName());
			System.out.println(pojo.getCourse());
		}
		
	}

}
