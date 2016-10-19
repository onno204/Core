package org.eu.nl.onno204.Core.SmallEventListener.CustomCommands;

import org.bukkit.entity.Player;

public class CommandsMethods {
	
	public static void Support(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§cSuport menu: ");
		p.sendMessage(" ");
		p.sendMessage("§4Voor alle regels /rules");
		p.sendMessage("§6Voor alle staff /staff");
		p.sendMessage("§4Voor alle hulp met commands /commands OF /help");
		p.sendMessage("§6Skype support: Live:RealLandsServer");
		p.sendMessage("§6===================================================");
	}
	public static void Rules(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§cRules menu: ");
		p.sendMessage(" ");
		p.sendMessage("§21. Wees respectvol in de chat en voor de staff.");
		p.sendMessage("§42. Hacks / Mods waarmee je kan vliegen ofso zijn niet toegestaan.");
		p.sendMessage("§23. Wil je staff worden? Soliciteer via de e-mail en ga niet staff spammen.");
		p.sendMessage("§44. Als de staff zegt dat iets niet mag heeft hij gelijk!");
		p.sendMessage("§25. Spammen is niet toegestaan");
		p.sendMessage("§46. Reclame is niet toegestaan.");
		p.sendMessage("§27. Ja uhm. De standaard regeltjes");
		p.sendMessage("§48. Voor ideeën / Klachten ga naar onze skype/mails");
		p.sendMessage("");
		p.sendMessage("§2E-Mail: RealLandsServer@Hotmail.com");
		p.sendMessage("§4Skype: live:RealLandsServer");
		p.sendMessage("§6===================================================");
	}
	public static void Staff(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§cStaff menu: ");
		p.sendMessage("§2Owner: ");
		p.sendMessage("§a -henkdepotviss");
		p.sendMessage("§2Developer: ");
		p.sendMessage("§a -onno204");
		p.sendMessage("§2Admin: ");
		p.sendMessage("§a -Geen admins. Kijk ons BadAss server zijn");
		p.sendMessage("§2Moderator: ");
		p.sendMessage("§a -Geen Moderators. Moderators zijn sceer en hebben geen perms");
		p.sendMessage("§2Helper: ");
		p.sendMessage("§a -AstrumDeus");
		p.sendMessage("§a -ShanoPlays");
		p.sendMessage("§a -TjardoSwagNL");
		p.sendMessage("§a -TheThunder01");
		p.sendMessage("§2Proef-Helper: ");
		p.sendMessage("§a -Pitbullroy");
		p.sendMessage("§6===================================================");
	}
	public static void Commands(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§ccommands menu: ");
		p.sendMessage(" ");
		p.sendMessage("§3/Balance §f- Kijk hoeveel geld je hebt");
		p.sendMessage("§b/Balance <speler> §f- Kijk hoeveel geld iemand anders heeft. ");
		p.sendMessage("§3/Balancetop §f- Zie de top mensen met geld");
		p.sendMessage("§b/GetPos <Player> §f- Geeft je de coördinaten van iemand in de stad.");
		p.sendMessage("§3/helpop <reden> §f- Roep een staff naar je toe.");
		p.sendMessage("§b/list §f- Kijk wie er momenteel In de stad zijn.");
		p.sendMessage("§3/Mail §f- Het centrale mail centrum.");
		p.sendMessage("§b/Suicide §f- Pleeg zelf moord §4Letop! je spullen gaan dan weg!");
		p.sendMessage("§3/spawn §f-Je word naar de spawn ge tp'd.");
		p.sendMessage("§b/tpaccept §f- Accepteer een tp verzoek van een helper/mod.");
		p.sendMessage("§3/tpdeny §f- Weiger een tp verzoek van een hlper/mod.");
		p.sendMessage("§b/tptoggle §f- De staff kan geen tpa verzoeken meer versturen.");
		p.sendMessage("§b/hat §f- Draag een vrolijk hoedje.");
		p.sendMessage(" ");
		p.sendMessage("§6===================================================");
	}
	public static void BuilderCommands(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§ccommands menu: ");
		p.sendMessage(" ");
		p.sendMessage("§3/fly §f- Alleen /fly in je bouw area!!!");
		p.sendMessage("§b/speed §f- Verander je snelheid.");
		p.sendMessage("§3/craft §f- Crafting table");
		p.sendMessage("§b/Sethome §f-3Homes zordat je snel bij je bouwwerken kan zijn.");
		p.sendMessage("§3/Tpa §f- Stuur een tp verzoek naar iemand.");
		p.sendMessage("§b/TpaHere §f- Stuur een verzoek om iemand naar jou te tp'en.");
		p.sendMessage("§3//help §f- WorldEdit help menu!");
		p.sendMessage("§b/Clear §f- Clear je inventory");
		p.sendMessage(" ");
		p.sendMessage("§6===================================================");
	}
	public static void HelperCommands(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§cHelper Commands menu: ");
		p.sendMessage(" ");
		p.sendMessage("§3/tpa §f- Stuur een tp verzoek.");
		p.sendMessage("§b/tpahere §f- Stuur een tp verzoek om iemand naar jou te tp'n. ");
		p.sendMessage("§3/rlc §f- Toegang tot de RealLandsCore command. ");
		p.sendMessage("§b/afk §f- Ga AFK derpen.");
		p.sendMessage("§3/msg §f- Stuur een prive berichtje ipv /tell");
		p.sendMessage("§b/invsee §f- Zie de spullen die iemand bij heeft.");
		p.sendMessage("§3/mute <player> §f- Mute een speler voor de hele server.");
		p.sendMessage("§b/vanish §f- Word onzichtbaar voor normale spelers.");
		p.sendMessage("§3/chc list §f- De commands van Chat Control.");
		p.sendMessage(" ");
		p.sendMessage("§6===================================================");
	}
	public static void ModeratorCommands(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§cModerator Commands menu: §lVoor meer info: /HelperCommands");
		p.sendMessage(" ");
		p.sendMessage("§b/time set §f- Verander de wereld tijd.");
		p.sendMessage("§3/Sun §f- Maak het weer een zonnig weertje.");
		p.sendMessage("§b/craft §f- Open een crafting bench(Niet datje het nodig hebt.)");
		p.sendMessage("§3/mail sendall §f- Stuur een mailtje naar iedereen op de server.");
		p.sendMessage("§b/chc list §f- De chat control Command");
		p.sendMessage("§3/invsee §f- Rechten om te veranderen");
		p.sendMessage("§b/kick <speler> §f- Kick een speler.");
		p.sendMessage("§3/spawn <speler> §f- Teleporteer een speler naar de spawn.");
		p.sendMessage("§b/tempban <player> <time> <reden> §f-Tempban iemand.");
		p.sendMessage(" ");
		p.sendMessage("§6===================================================");
	}

	public static void AdminCommands(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§cModerator Commands menu: §lVoor meer info: /ModeratorCommands");
		p.sendMessage(" ");
		p.sendMessage("§b/speed §f- Verander je speed.");
		p.sendMessage("§3/warp §f-Teleporteer naar een warp.");
		p.sendMessage("§b/setwarp §f- Stel een warp in.");
		p.sendMessage("§3/tpo §f- negeer de tptoggle.");
		p.sendMessage("§b/tpohere §f- negeer de tptoggle.");
		p.sendMessage("§3/tpall §f- Tp de HELE server naar je toe.");
		p.sendMessage("§b/home <speler>:home §f- Tp naar een speler zijn home.");
		p.sendMessage("§3/delhome <speler>:home §f- Verwijder een speler zijn home.");
		p.sendMessage("§b/unban(ip) §f- Unban iemand / ip.");
		p.sendMessage("§3/socialspy §f- Zie de /tell berichten.");
		p.sendMessage("§b/kill §f- Vermoord iemand. MOORDENAAR!");
		p.sendMessage("§3/echest §f- Kijk in iemand zijn enderchest.");
		p.sendMessage("§b/seen §f- Kijk waarom iemand gebanned is of wanneer voor het laatste gejoined.");
		p.sendMessage("§3/god §f- Ja uhm. Goden gaan gewoon niet dood!");
		p.sendMessage("§b/fly §f- <speler> Zet iemand anders zijn fly aan.");
		p.sendMessage(" ");
		p.sendMessage("§6===================================================");
	}
	public static void YoutubeCommands(Player p){
		p.sendMessage("§6===================================================");
		p.sendMessage("§ccommands menu: ");
		p.sendMessage(" ");
		p.sendMessage("§4/Hat §f- Zet een mutsje op je koppie.");
		p.sendMessage("§f/tpa §4- Wees cool en teleporteer");
		p.sendMessage("§4/mail sendall §f- Stuur mailtje naar de hele server (Live stream bvb)");
		p.sendMessage("§f/tell §4- Jij kan lekker wel /tell");
		p.sendMessage("§4/fly §f-Voel je groter dan iedereen en ga vliegen.");
		p.sendMessage(" ");
		p.sendMessage("§6===================================================");
	}
	
	
	
}
