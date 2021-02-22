package me.kusky;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getLogger().info("BlockEffects foi ativado");
		onREvent();
	}
	@Override
	public void onDisable() {
		getLogger().info("BlockEffects foi desativado");
	}
	public void onREvent() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BlockEffects(), this);
	}
}
