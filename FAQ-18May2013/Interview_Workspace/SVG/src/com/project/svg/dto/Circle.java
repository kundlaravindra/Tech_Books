/**
 * 
 */
package com.project.svg.dto;

/**
 * @author kumadeep
 *
 */
public class Circle implements Shape{

	private String id;
	
	private String cx;
	
	private String cy;
	
	private String r;
	
	private String style;
	
	private int index;
	
	public Circle() {
		this.id = "";
		this.cx = "";
		this.cy = "";
		this.r = "";
		this.style = "";
		this.index = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCx() {
		return cx;
	}

	public void setCx(String cx) {
		this.cx = cx;
	}

	public String getCy() {
		return cy;
	}

	public void setCy(String cy) {
		this.cy = cy;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	@Override
	public String toString() {
		return "id : " + this.id + " cx : " + this.cx + " cy : " + this.cy + " r : " + this.r + " style : " + this.style ;
	}
}
