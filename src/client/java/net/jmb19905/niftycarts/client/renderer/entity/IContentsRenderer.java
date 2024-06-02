package net.jmb19905.niftycarts.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jmb19905.niftycarts.entity.AbstractCargoCart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

@FunctionalInterface
public interface IContentsRenderer {
    void render(final ICargoCartRenderer renderer, final AbstractCargoCart entity, final PoseStack stack, final MultiBufferSource source, final int packedLight, final NonNullList<ItemStack> cargo);
}
