package com.paper1;

public class StaticCall {
static int sid;
StaticCall(int a){
	sid = a;
}
public void setSid(int sid){
	this.sid = sid;
}
public int getSid(){
	return sid;
}
}
