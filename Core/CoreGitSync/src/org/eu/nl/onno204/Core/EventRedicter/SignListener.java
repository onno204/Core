package org.eu.nl.onno204.Core.EventRedicter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.eu.nl.onno204.Core.SmallEventListener.SignReplacer;

public class SignListener implements Listener {
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void BankListener(SignChangeEvent e) {
		SignReplacer.SignReplacerr(e);
	}
	
}
