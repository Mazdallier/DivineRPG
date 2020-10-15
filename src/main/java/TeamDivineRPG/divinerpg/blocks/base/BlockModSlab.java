package TeamDivineRPG.divinerpg.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;

public class BlockModSlab extends SlabBlock {
    public BlockModSlab(String name, Block base, float hardness) {
        super(Block.Properties.create(base.getDefaultState().getMaterial(), base.getDefaultState().getMaterial().getColor())
                .func_235861_h_()
                .hardnessAndResistance(hardness, 3.0F)
                .sound(base.getDefaultState().getSoundType()));
        setRegistryName(name);
    }
}