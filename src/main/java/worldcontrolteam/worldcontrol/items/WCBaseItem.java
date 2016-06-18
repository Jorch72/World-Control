package worldcontrolteam.worldcontrol.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import worldcontrolteam.worldcontrol.WorldControl;

public class WCBaseItem extends Item {
	public WCBaseItem(String name){
		this.setCreativeTab(WorldControl.TAB);
		this.setRegistryName("worldcontrol." + name);
		this.setUnlocalizedName("worldcontrol." + name);
		
		GameRegistry.register(this);
		
		if(WorldControl.side == Side.CLIENT)
			ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation("worldcontrol:" + name, "inventory"));
	}
}
