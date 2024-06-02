package net.jmb19905.niftycarts.client.renderer.entity;

import net.jmb19905.niftycarts.NiftyCarts;
import net.jmb19905.niftycarts.NiftyCartsConfig;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

enum Contents {
    FLOWERS(s -> s.getItem() instanceof BlockItem && s.is(ItemTags.FLOWERS) && NiftyCartsConfig.getClient().renderSupplyFlowers.get(), ICargoCartRenderer::renderFlowers),
    PAINTINGS(s -> s.getItem() == Items.PAINTING && NiftyCartsConfig.getClient().renderSupplyPaintings.get(), ICargoCartRenderer::renderPaintings),
    WHEEL(s -> s.getItem() == NiftyCarts.WHEEL && NiftyCartsConfig.getClient().renderSupplyWheel.get(), ICargoCartRenderer::renderWheel),
    SUPPLIES(s -> NiftyCartsConfig.getClient().renderSupplies.get(), ICargoCartRenderer::renderSupplies),
    NONE(s -> true, null);

    private final Predicate<? super ItemStack> predicate;
    private final IContentsRenderer renderer;

    Contents(final Predicate<? super ItemStack> predicate, @Nullable final IContentsRenderer renderer) {
        this.predicate = predicate;
        this.renderer = renderer;
    }

    public Predicate<? super ItemStack> getPredicate() {
        return predicate;
    }

    public IContentsRenderer getRenderer() {
        return renderer;
    }
}