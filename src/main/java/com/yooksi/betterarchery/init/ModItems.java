package com.yooksi.betterarchery.init;

import com.yooksi.betterarchery.item.*;
import com.yooksi.betterarchery.item.ArchersBow.BowItemVariant;

/** 
 *  All custom items are initialized and stored here. <br>
 *  <i>Except bow parts, which are initialized and stored in item.BowParts.<i> 
 */
public class ModItems 
{
	public static final SimpleBow SIMPLE_BOW_PLAIN;
	public static final SimpleBow SIMPLE_BOW_LEATHER_GRIP;
	public static final SimpleBow SIMPLE_BOW_WOOLEN_GRIP;
	
	public static final RecurveBow RECURVE_BOW_PLAIN;
	public static final RecurveBow RECURVE_BOW_LEATHER_GRIP;
    public static final RecurveBow RECURVE_BOW_WOOLEN_GRIP;
	
	public static final BowItemParts BOW_ITEM_PART_BODY;
	public static final BowItemString BOW_STRING_ITEM;
	
	public static final TreeResinLiquid TREE_RESIN_LIQUID;
	public static final TreeResinGlue TREE_RESIN_GLUE;
	
	static
	{
		SIMPLE_BOW_PLAIN = ArchersBow.initNewBowType(new SimpleBow(BowItemVariant.SIMPLE_BOW_PLAIN));
		SIMPLE_BOW_LEATHER_GRIP = ArchersBow.initNewBowType(new SimpleBow(BowItemVariant.SIMPLE_BOW_LEATHER_GRIP));
		SIMPLE_BOW_WOOLEN_GRIP = ArchersBow.initNewBowType(new SimpleBow(BowItemVariant.SIMPLE_BOW_WOOLEN_GRIP));
		
		RECURVE_BOW_PLAIN = ArchersBow.initNewBowType(new RecurveBow(BowItemVariant.RECURVE_BOW_PLAIN));
		RECURVE_BOW_LEATHER_GRIP = ArchersBow.initNewBowType(new RecurveBow(BowItemVariant.RECURVE_BOW_LEATHER_GRIP));
		RECURVE_BOW_WOOLEN_GRIP = ArchersBow.initNewBowType(new RecurveBow(BowItemVariant.RECURVE_BOW_WOOLEN_GRIP));
		
		BOW_ITEM_PART_BODY = new BowItemParts();  // initialize after all bow items
		BOW_STRING_ITEM = new BowItemString();
		
		TREE_RESIN_LIQUID = new TreeResinLiquid();
		TREE_RESIN_GLUE = new TreeResinGlue();
	}
}