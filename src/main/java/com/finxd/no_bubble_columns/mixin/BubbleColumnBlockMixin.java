package com.finxd.no_bubble_columns.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.MagmaBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BubbleColumnBlock.class)

public class BubbleColumnBlockMixin {

    //stops bubble columns from forming
    @Inject(method = "updateColumn*", at = @At("HEAD"), cancellable = true)
    private static void updateColumn(LevelAccessor p_152708_, BlockPos p_152709_, BlockState p_152710_, CallbackInfo ci) {
        ci.cancel();
    }
}
