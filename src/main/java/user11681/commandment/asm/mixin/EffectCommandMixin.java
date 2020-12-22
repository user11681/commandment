package user11681.commandment.asm.mixin;

import net.minecraft.server.command.EffectCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import user11681.commandment.config.CommandmentConfiguration;

@Mixin(EffectCommand.class)
abstract class EffectCommandMixin {
    @ModifyConstant(method = "register",
                    constant = @Constant(intValue = 1000000))
    private static int modifyDurationLimit(int original) {
        return CommandmentConfiguration.instance.effect.durationLimit;
    }

    @ModifyConstant(method = "register",
                    constant = @Constant(intValue = 255))
    private static int modifyAmplifierLimit(int original) {
        return CommandmentConfiguration.instance.effect.amplifierLimit;
    }
}
