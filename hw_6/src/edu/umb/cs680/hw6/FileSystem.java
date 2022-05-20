package edu.umb.cs680.hw6;

import java.util.*;

public class FileSystem
{
	private static FileSystem instance = null;
	private LinkedList<Directory> rootDirs;
	
	private FileSystem() 
	{
		this.rootDirs = new LinkedList<>();
	}
	public static FileSystem getFileSystem() 
	{
		if (instance == null) 
		{
			instance = new FileSystem();
		}
		return instance;
	}
	public LinkedList<Directory> getRootDirs()
	{
		return rootDirs;
	}
	public void appendRootDir(Directory root) 
	{
		rootDirs.add(root);
	}
	public static void main(String[]args) 
	{
		System.out.println("FileSystem Class Successfully Executed");
	}
}