package user11681.commandment.asm.mixin;

import net.minecraft.server.command.FillCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import user11681.commandment.config.CommandmentConfiguration;

@Mixin(FillCommand.class)
abstract class FillCommandMixin {
    @ModifyConstant(method = "execute",
                    constant = @Constant(intValue = 1 << 15))
    private static int modifyLimit(final int previousLimit) {
        return CommandmentConfiguration.instance.fill.limit;
    }
}
