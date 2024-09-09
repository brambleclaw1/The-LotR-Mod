
package net.mcreator.thehobbitmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MallornPressurePlateBlock extends PressurePlateBlock {
	public MallornPressurePlateBlock() {
		super(Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f, 3f).forceSolidOn(), BlockSetType.OAK);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}