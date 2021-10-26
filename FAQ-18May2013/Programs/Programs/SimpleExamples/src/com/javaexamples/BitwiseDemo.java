package com.javaexamples;
public class BitwiseDemo {

    static final int VISIBLE = 1;
    static final int DRAGGABLE = 2;
    static final int SELECTABLE = 4;
    static final int EDITABLE = 8;

    public static void main(String[] args)
    {
        int flags = 0;
        /* int a = 0;
        a = a | 5;
        a = a | 8;
        System.out.println(a & 4);
        if ((a & 5)== 5) {
        	if (( a & 8) == 8) {
        		System.out.println("hiiiiiii");
        	}
        }*/
        flags = flags | VISIBLE;
        flags = flags | DRAGGABLE;

        if ((flags & VISIBLE) == VISIBLE) {
            if ((flags & DRAGGABLE) == DRAGGABLE) {
                 System.out.println("Flags are Visible and Draggable.");
            }
        }

        flags = flags | EDITABLE;

        if ((flags & EDITABLE) == EDITABLE) {
	    System.out.println("Flags are now also Editable.");
        }
    }
}

