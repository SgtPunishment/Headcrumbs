package ganymedes01.headcrumbs.entity.vip;

import ganymedes01.headcrumbs.entity.EntityCelebrity;
import ganymedes01.headcrumbs.entity.VIPHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class vasili02 extends VIPHandler {

	@Override
	public void onSpawn(EntityCelebrity entity) {
		if (entity.getHeldItem() == null)
			entity.setCurrentItemOrArmor(0, new ItemStack(Items.stone_hoe));
	}
}