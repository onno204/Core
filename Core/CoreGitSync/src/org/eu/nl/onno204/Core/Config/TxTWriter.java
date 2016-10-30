
package org.eu.nl.onno204.Core.Config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

import org.eu.nl.onno204.Core.Main.Holder;
import org.eu.nl.onno204.Core.Main.Messages;

public class TxTWriter {
	
	public static HashMap<String, File> Files = new HashMap<String, File>();
	public static Writer LogInAndOutLogger;
	public static Writer CommandLogger;
	
	
	public static void Load(){
		AddFilesToList();
		CreateFiles();
		StartWriters();
	}
	
	
	public static void AddFilesToList(){
		Files.put( "LogInAndOutLogger", new File(Holder.pl.getDataFolder(), "LogInAndOutLogger.txt") );
		Files.put( "CommandLogger", new File(Holder.pl.getDataFolder(), "CommandLogger.txt") );
	}

	
	public static void CreateFiles(){
		for (File file : Files.values()){
			try { 
				if (file.createNewFile()) { Holder.Console.sendMessage(Messages.title.GetString() + "File '" + file.getName() + "' is created!");} 
			} catch (IOException e) { e.printStackTrace();  }
		}
	}
	

	
	public static void StartWriters(){
		Holder.Console.sendMessage(Messages.title.GetString() + "Loading Loggers...");
		for (String s : Files.keySet()){
			if(s.equalsIgnoreCase("LogInAndOutLogger")){
				try { 
					LogInAndOutLogger = new BufferedWriter(new FileWriter(Files.get(s), true) );
				} catch (IOException e) { e.printStackTrace(); }
				Holder.Console.sendMessage(Messages.title.GetString() + "Loaded LogInAndOutLogger.");
			}else if(s.equalsIgnoreCase("CommandLogger")){
				try { 
					CommandLogger = new BufferedWriter(new FileWriter(Files.get(s), true) );
				} catch (IOException e) { e.printStackTrace(); }
				Holder.Console.sendMessage(Messages.title.GetString() + "Loaded CommandLogger.");
			}
		}
		Holder.Console.sendMessage(Messages.title.GetString() + "Loaded Loggers...");
	}
	
	public static void SaveWriters(){
		Holder.Console.sendMessage(Messages.title.GetString() + "Saving Loggers...");
		for (String s : Files.keySet()){
			if(s.equalsIgnoreCase("LogInAndOutLogger")){
				try {
					LogInAndOutLogger.close();
				} catch (IOException e) { e.printStackTrace(); }
				Holder.Console.sendMessage(Messages.title.GetString() + "Saved LogInAndOutLogger.");
			}else if(s.equalsIgnoreCase("CommandLogger")){
				try { 
					CommandLogger.close();
				} catch (IOException e) { e.printStackTrace(); }
				Holder.Console.sendMessage(Messages.title.GetString() + "Saved CommandLogger.");
			}
		}
		StartWriters();
		Holder.Console.sendMessage(Messages.title.GetString() + "Saved Loggers...");
	}
	
	public static void ExitSaveWriters(){
		Holder.Console.sendMessage(Messages.title.GetString() + "Saving Loggers...");
		for (String s : Files.keySet()){
			if(s.equalsIgnoreCase("LogInAndOutLogger")){
				try {
					LogInAndOutLogger.close();
				} catch (IOException e) { e.printStackTrace(); }
				Holder.Console.sendMessage(Messages.title.GetString() + "Saved LogInAndOutLogger.");
			}else if(s.equalsIgnoreCase("CommandLogger")){
				try { 
					CommandLogger.close();
				} catch (IOException e) { e.printStackTrace(); }
				Holder.Console.sendMessage(Messages.title.GetString() + "Saved CommandLogger.");
			}
		}
		Holder.Console.sendMessage(Messages.title.GetString() + "Saved Loggers...");
	}
	
	
}
