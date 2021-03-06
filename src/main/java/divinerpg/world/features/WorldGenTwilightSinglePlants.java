package divinerpg.world.features;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenTwilightSinglePlants extends WorldGenerator {
    private final Block plantBlock;
    private final Block grassBlock;

    public WorldGenTwilightSinglePlants(Block plantBlock, Block grassBlock) {
        this.plantBlock = plantBlock;
        this.grassBlock = grassBlock;
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos pos) {
        for (int i = 0; i < 128; ++i) {
            BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4),
                    rand.nextInt(8) - rand.nextInt(8));
            if (worldIn.getBlockState(blockpos.down()).getBlock() == this.grassBlock && worldIn.isAirBlock(blockpos)) {
                worldIn.setBlockState(blockpos, plantBlock.getDefaultState());
            }
        }
        return true;
    }
}
