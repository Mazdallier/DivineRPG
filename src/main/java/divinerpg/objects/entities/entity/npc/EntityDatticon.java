package divinerpg.objects.entities.entity.npc;

import divinerpg.objects.entities.entity.EntityDivineVillager;
import divinerpg.proxy.GUIHandler;
import divinerpg.registry.BlockRegistry;
import divinerpg.registry.ItemRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityDatticon extends EntityDivineVillager {
    public EntityDatticon(World world) {
        super(world);
    }

    protected int getGuiId() {
        return GUIHandler.DATTICON_GUI_ID;
    }

    protected String[] getChatMessages() {
        return new String[] {
                "message.datticon.merik",
                "message.datticon.furnace",
                "message.datticon.science",
                "message.datticon.plugged",
                "message.datticon.redstone"
        };
    }

    public MerchantRecipeList getRecipeList() {
        MerchantRecipeList list = new MerchantRecipeList();
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 8), new ItemStack(BlockRegistry.starBridge, 16)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 3), new ItemStack(BlockRegistry.arcaniteTubes, 16)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 2), new ItemStack(BlockRegistry.moltenFurnace)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 3), new ItemStack(BlockRegistry.greenlightFurnace)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 4), new ItemStack(BlockRegistry.oceanfireFurnace)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 5), new ItemStack(BlockRegistry.moonlightFurnace)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 7), new ItemStack(BlockRegistry.whitefireFurnace)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 9), new ItemStack(BlockRegistry.demonFurnace)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 3), new ItemStack(BlockRegistry.elevantium, 9)));
        list.add(new MerchantRecipe(new ItemStack(ItemRegistry.arcanium, 3), new ItemStack(BlockRegistry.acceleron, 3)));
        return list;
    }
}