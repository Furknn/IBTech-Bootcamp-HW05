package com.bootcamphw.hw03.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;

public class StreamUtils {
	public static String read(InputStream in) throws Exception{
		var reader=new BufferedReader(new InputStreamReader(in,"utf-8"));
		String line;
		var builder = new StringBuilder();
		while((line=reader.readLine())!=null) {
			builder.append(line).append("\r\n");
		}
		reader.close();
		var text=builder.toString();		
		return text;
	}
	
	public static String get(String address) throws Exception{
		var url=new URL(address);
		var conn=url.openConnection();
		var in = conn.getInputStream();
		return read(in);
		
	}
	
	public static void write(OutputStream outputStream,String output) throws UnsupportedEncodingException, IOException {
		var writer=new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));
		writer.write(output);
		writer.flush();
		outputStream.flush();
		outputStream.close();
		writer.close();
		
		
	}
	
	public static String post(String address, String output) throws Exception {
		var url=new URL(address);
		var conn=url.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);
		write(conn.getOutputStream(),output);
		var input=read(conn.getInputStream());
		return input;
	}
}
