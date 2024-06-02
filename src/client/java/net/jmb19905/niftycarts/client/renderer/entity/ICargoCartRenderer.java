package net.jmb19905.niftycarts.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jmb19905.niftycarts.entity.AbstractCargoCart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;

public interface ICargoCartRenderer {

    void renderFlowers(final AbstractCargoCart entity, final PoseStack stack, final MultiBufferSource source, final int packedLight, final NonNullList<ItemStack> cargo);
    void renderWheel(final AbstractCargoCart entity, final PoseStack stack, final MultiBufferSource source, final int packedLight, final NonNullList<ItemStack> cargo);
    void renderSupplies(final AbstractCargoCart entity, final PoseStack stack, final MultiBufferSource source, final int packedLight, final NonNullList<ItemStack> cargo);
    void renderPaintings(final AbstractCargoCart entity, final PoseStack stack, final MultiBufferSource source, final int packedLight, final NonNullList<ItemStack> cargo);

}