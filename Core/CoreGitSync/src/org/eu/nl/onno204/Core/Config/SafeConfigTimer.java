package org.eu.nl.onno204.Core.Config;

import java.util.TimerTask;

public class SafeConfigTimer extends TimerTask {
	
	public void run() { 
		org.eu.nl.onno204.Core.Config.TxTWriter.SaveWriters();
		org.eu.nl.onno204.Core.Config.Setup.SafeConfigs();
	}
}
