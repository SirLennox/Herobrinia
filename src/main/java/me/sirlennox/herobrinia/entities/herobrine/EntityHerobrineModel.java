package me.sirlennox.herobrinia.entities.herobrine;

import com.google.common.collect.Lists;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;

import java.util.List;
import java.util.Random;

@Environment(EnvType.CLIENT)
public class EntityHerobrineModel extends BipedEntityModel<EntityHerobrine> {
    private List<ModelPart> parts = Lists.newArrayList();
    public final ModelPart leftSleeve;
    //public final ModelPart leftLeg;
   // public final ModelPart leftArm;
    public final ModelPart rightSleeve;
    public final ModelPart leftPantLeg;
    public final ModelPart rightPantLeg;
    public final ModelPart jacket;

    public EntityHerobrineModel(float scale) {
        super(RenderLayer::getEntityTranslucent, scale, 0.0F, 64, 64);

        this.leftArm = new ModelPart(this, 32, 48);
            this.leftArm.addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, scale);
            this.leftArm.setPivot(5.0F, 2.0F, 0.0F);
            this.leftSleeve = new ModelPart(this, 48, 48);
            this.leftSleeve.addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, scale + 0.25F);
            this.leftSleeve.setPivot(5.0F, 2.0F, 0.0F);
            this.rightSleeve = new ModelPart(this, 40, 32);
            this.rightSleeve.addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, scale + 0.25F);
            this.rightSleeve.setPivot(-5.0F, 2.0F, 10.0F);


        this.leftLeg = new ModelPart(this, 16, 48);
        this.leftLeg.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, scale);
        this.leftLeg.setPivot(1.9F, 12.0F, 0.0F);
        this.leftPantLeg = new ModelPart(this, 0, 48);
        this.leftPantLeg.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, scale + 0.25F);
        this.leftPantLeg.setPivot(1.9F, 12.0F, 0.0F);
        this.rightPantLeg = new ModelPart(this, 0, 32);
        this.rightPantLeg.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, scale + 0.25F);
        this.rightPantLeg.setPivot(-1.9F, 12.0F, 0.0F);
        this.jacket = new ModelPart(this, 16, 32);
        this.jacket.addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, scale + 0.25F);
        this.jacket.setPivot(0.0F, 0.0F, 0.0F);

    }
    public void setAngles(EntityHerobrine livingEntity, float f, float g, float h, float i, float j) {
        super.setAngles(livingEntity, f, g, h, i, j);
        this.leftPantLeg.copyPositionAndRotation(this.leftLeg);
        this.rightPantLeg.copyPositionAndRotation(this.rightLeg);
        this.leftSleeve.copyPositionAndRotation(this.leftArm);
        this.rightSleeve.copyPositionAndRotation(this.rightArm);
        this.jacket.copyPositionAndRotation(this.torso);

    }

    public void setVisible(boolean visible) {
        super.setVisible(visible);
        this.leftSleeve.visible = visible;
        this.rightSleeve.visible = visible;
        this.leftPantLeg.visible = visible;
        this.rightPantLeg.visible = visible;
        this.jacket.visible = visible;
    }

    public void setArmAngle(Arm arm, MatrixStack matrices) {
        ModelPart modelPart = this.getArm(arm);
        modelPart.rotate(matrices);
    }


    public ModelPart getRandomPart(Random random) {
        return this.parts.get(random.nextInt(this.parts.size()));
    }

    public void accept(ModelPart modelPart) {
        if (this.parts == null) {
            this.parts = Lists.newArrayList();
        }

        this.parts.add(modelPart);
    }

/*    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0, 1.125, 0);

        leftArm.render(matrices, vertices, light, overlay);
        leftLeg.render(matrices, vertices, light, overlay);
        leftPantLeg.render(matrices, vertices, light, overlay);
        leftSleeve.render(matrices, vertices, light, overlay);
        rightPantLeg.render(matrices, vertices, light, overlay);
        rightSleeve.render(matrices, vertices, light, overlay);

    }*/

}
