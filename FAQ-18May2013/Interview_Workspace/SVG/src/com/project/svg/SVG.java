package com.project.svg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.project.svg.dto.Circle;


public class SVG {
	
	private String strSVGContent;
	
	public static String STARTSWITH="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
	public static String STARTSVGTAG="<svg";
	public static String ENDSVGTAG="</svg>";
	public static String START_RECT_TAG="<rect";
	public static String END_RECT_TAG="</svg>";
	public static String START_CIRCLE_TAG="<circle";
	public static String END_CIRCLE_TAG="</circle>";
	
	
	public SVG() {
		this.strSVGContent = "";
	}
	
	
	public boolean read(String fileName) {
		
		BufferedReader br = null;

		this.strSVGContent="";
		try {
				String readFile;
				br = new BufferedReader(new FileReader("D:\\testing.txt"));
				while ((readFile = br.readLine()) != null) {
					this.strSVGContent=this.strSVGContent + " " + readFile;
				}
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
		
		return readSVGContent(this.strSVGContent);
	}	
	
	public void write(String fileName) {
		
		return ;
		
	}	
	public String query(String command) {
		
		return null;
	}	
	
	private boolean readSVGContent(String svgContent){
	
		if(svgContent.startsWith(STARTSWITH)){
			
			System.out.println(svgContent.substring(svgContent.indexOf(STARTSWITH)+STARTSWITH.length(), svgContent.indexOf(STARTSWITH)+STARTSWITH.length()+STARTSVGTAG.length()));
			String svgStartTag=svgContent.substring(svgContent.indexOf(STARTSWITH)+STARTSWITH.length(), svgContent.indexOf(STARTSWITH)+STARTSWITH.length()+STARTSVGTAG.length());
			if(svgStartTag.equalsIgnoreCase(STARTSVGTAG)){
				System.out.println();
			}
		}
		splitBetTags(svgContent);
		return false;
	}
	
	private void splitBetTags(String svgContent){
		
		String svgStartToEnd = svgContent.substring(svgContent.indexOf(STARTSWITH)+STARTSWITH.length(),
				svgContent.length() - ENDSVGTAG.length());
		System.out.println("svgStartToEnd : " + svgStartToEnd);
		
		String[] tags = svgStartToEnd.split("/>");
		
		System.out.println("tags : " + tags.length);
		for(String str : tags){
			if(str.contains("> <")){
				str = str.substring(str.indexOf("> <") + "> <".length()-1, str.length());
			}
			getShapes(str);
			System.out.println(str);
		}
		
	}
	
	private void getShapes(String strShape){
			//System.out.println("Shapes : " + strShape);
			Circle circle;
			if(strShape.trim().startsWith("<circle")){
				strShape = strShape.substring(START_CIRCLE_TAG.length()+1,strShape.length());
				System.out.println(strShape);
				circle = new Circle();
				
			}else if(strShape.trim().startsWith("<rect")){
				strShape = strShape.substring(START_RECT_TAG.length()+1,strShape.length());
				System.out.println(strShape);
				circle = new Circle();
			}
		
	}
}