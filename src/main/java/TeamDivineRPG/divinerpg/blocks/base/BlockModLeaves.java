package TeamDivineRPG.divinerpg.blocks.base;

import TeamDivineRPG.divinerpg.DivineRPG;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockModLeaves extends LeavesBlock {

    public BlockModLeaves(String name, MaterialColor color, float hardness){
        super(Block.Properties.create(Material.LEAVES, color).notSolid().func_235861_h_().hardnessAndResistance(1, 3.0F).sound(SoundType.PLANT));
        setRegistryName(DivineRPG.MODID, name);
    }
}
