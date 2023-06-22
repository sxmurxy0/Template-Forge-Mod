package dev.sxmurxy.template;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid = TemplateMod.MOD_ID, name = TemplateMod.MOD_NAME, version = TemplateMod.VERSION)
public class TemplateMod {

	public static final String MOD_ID = "template";
	public static final String MOD_NAME = "Template";
	public static final String VERSION = "1.0";

	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {

	}

	@SubscribeEvent
	public void onTick(TickEvent.ClientTickEvent event) {
		
	}

}
