package me.kusky;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BlockEffects implements Listener {
	
	@EventHandler
	public void onBEffectsI(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if ((p.getLocation().getBlock().getType() == Material.ICE)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 1));
		}
	}
	
	@EventHandler
	public void onBEffectsS(PlayerMoveEvent e1) {
		Player p = e1.getPlayer();
		if ((p.getLocation().getBlock().getType() == Material.SOUL_SAND)) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
		}
	}
	
}