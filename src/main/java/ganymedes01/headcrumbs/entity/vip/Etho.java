package ganymedes01.headcrumbs.entity.vip;

import ganymedes01.headcrumbs.entity.EntityHuman;
import ganymedes01.headcrumbs.entity.VIPHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Etho extends VIPHandler {

	@Override
	protected ItemStack getItem(EntityHuman entity) {
		return new ItemStack(Blocks.redstone_torch);
	}

	@Override
	public void onSpawn(EntityHuman entity) {
		ItemStack axe = new ItemStack(Items.iron_axe);
		axe.setStackDisplayName("Treetho's Choppa");
		entity.setCurrentItemOrArmor(0, axe);
	}
}