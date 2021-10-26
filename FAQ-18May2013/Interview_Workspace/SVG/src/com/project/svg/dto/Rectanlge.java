/**
 * 
 */
package com.project.svg.dto;

/**
 * @author kumadeep
 *
 */
public class Rectanlge implements Shape{

	String id;
	String y;
	String x;
	String height;
	String width;
	String style;
	int index;
	
	public Rectanlge() {
		this.id = "";
		this.x = "";
		this.y = "";
		this.height = "";
		this.width = "";
		this.style = "";
		this.index = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	@Override
	public String toString() {
		return "id : " + this.id + " x : " + this.x + " y : " + this.y + " height : " + this.height + " width : " + this.width + " style : " + this.style ;
	}
}
