
package edu.illinois.starts.helpers;

import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class pathParser{
	

	public static void main(String[] args){
		doSlice("file://zhenming/research/sth/org/apache/sth.class");
//		for(int i=0;i  < res.length; i++){
//			System.out.println(res[i]);
//		}


	}

	public static String doSlice(String path){
		String pattern = "org.*";
		Pattern r = Pattern.compile(pattern);
		Matcher  m = r.matcher(path);
		if(m.find()){
//			System.out.println(m.group(0));
			String res = m.group(0).replaceAll(".class","").replaceAll("/",".");
			System.out.println(res);
			return res;
		}
		return "NULL";
	}


}

