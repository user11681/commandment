package user11681.commandment.asm.mixin;

import java.util.Collection;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.EnchantCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import user11681.commandment.config.CommandmentConfiguration;

@Mixin(EnchantCommand.class)
abstract class EnchantCommandMixin {
    @Redirect(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;getMaxLevel()I"))
    private static int modifyLimit(final Enchantment enchantment) {
        return CommandmentConfiguration.instance.enchant.limit;
    }

    @Redirect(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;isAcceptableItem(Lnet/minecraft/item/ItemStack;)Z"))
    private static boolean disableAcceptabilityCheck(final Enchantment enchantment, final ItemStack stack) {
        return !CommandmentConfiguration.instance.enchant.acceptabilityCheck;
    }

    @Redirect(method = "execute", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentHelper;isCompatible(Ljava/util/Collection;Lnet/minecraft/enchantment/Enchantment;)Z"))
    private static boolean disableCompatibilityCheck(final Collection<Enchantment> collection, final Enchantment enchantment) {
        return !CommandmentConfiguration.instance.enchant.compatibilityCheck;
    }
}
