package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
        public boolean equal(String1 s) {
	    if (str().length == s.length){
            for(i == 0 ; i <= s.length ; i++){
                if(str[i] != s[i] ){
                    retrun false ;
                }

            }

        } else {
            retrun false ;
        }
        retrun true ; 
    }
    public void reverse() {
        String temp = str[0];
        for( i = 0 , j = str().length -1  ; i < str().length ; i++ , j--) {
            str[i] = str[j] ;
        }
        str[str().length-1] = temp ; 
    }
}
}
