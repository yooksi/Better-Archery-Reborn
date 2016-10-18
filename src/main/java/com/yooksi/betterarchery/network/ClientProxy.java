package com.yooksi.betterarchery.network;

import com.yooksi.betterarchery.common.CommonProxy;
import com.yooksi.betterarchery.init.ModItems;
import com.yooksi.betterarchery.item.ArchersBow;
import com.yooksi.betterarchery.item.BowItemParts;
import com.yooksi.betterarchery.item.ItemSubtype;
import com.yooksi.betterarchery.item.TreeResinLiquid;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	@Override
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);

		ModelLoader.setCustomModelResourceLocation(ModItems.SIMPLE_BOW_PLAIN, 0, ModItems.SIMPLE_BOW_PLAIN.getModelResourceLocation());
		ModelLoader.setCustomModelResourceLocation(ModItems.SIMPLE_BOW_LEATHER_GRIP, 0, ModItems.SIMPLE_BOW_LEATHER_GRIP.getModelResourceLocation());
		ModelLoader.setCustomModelResourceLocation(ModItems.SIMPLE_BOW_WOOLEN_GRIP, 0, ModItems.SIMPLE_BOW_WOOLEN_GRIP.getModelResourceLocation());
		
		ModelLoader.setCustomModelResourceLocation(ModItems.RECURVE_BOW_PLAIN, 0, ModItems.RECURVE_BOW_PLAIN.getModelResourceLocation());
		ModelLoader.setCustomModelResourceLocation(ModItems.RECURVE_BOW_LEATHER_GRIP, 0, ModItems.RECURVE_BOW_LEATHER_GRIP.getModelResourceLocation());
		ModelLoader.setCustomModelResourceLocation(ModItems.RECURVE_BOW_WOOLEN_GRIP, 0, ModItems.RECURVE_BOW_WOOLEN_GRIP.getModelResourceLocation());
		
		setCustomModelResourceLocationForItemSubtypes(ModItems.BOW_ITEM_PART_BODY, BowItemParts.ItemPartType.values());
		setCustomModelResourceLocationForItemSubtypes(ModItems.TREE_RESIN_LIQUID, TreeResinLiquid.ResinLiquidType.values());	
	
		ModelLoader.setCustomModelResourceLocation(ModItems.TREE_RESIN_GLUE, 0, new ModelResourceLocation(ModItems.TREE_RESIN_GLUE.getRegistryName().toString()));
	}
	
	private void setCustomModelResourceLocationForItemSubtypes(net.minecraft.item.Item item, final Enum<? extends ItemSubtype>[] subtypes)
	{
		for (int i = 0; i < subtypes.length; i++)
		{
			ItemSubtype type = (ItemSubtype) subtypes[i];
			ModelLoader.setCustomModelResourceLocation(item, type.getTypeMetadata(), type.getModelResourceLocation());
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		this.registerColorHandlers();
	}
	
	@SideOnly(Side.CLIENT)
	private void registerColorHandlers()
	{
		ArchersBow.ColorHandler.registerColorHandler();
	}
}