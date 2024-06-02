package net.jmb19905.niftycarts.client.renderer.entity.model;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public interface IFlowerCargoModel {

    ModelPart getFlowerBasket();

    RenderType renderType(ResourceLocation resourceLocation);

}
