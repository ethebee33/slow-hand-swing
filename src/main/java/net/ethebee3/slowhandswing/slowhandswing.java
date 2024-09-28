package net.ethebee3.slowhandswing;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class slowhandswing implements ModInitializer {

    public static MinecraftClient mc = MinecraftClient.getInstance();
    private static final KeyBinding toggleSlowSwing = new KeyBinding("slow-hand-swing.toggle", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_F10, "slow-hand-swing");
    private static boolean isEnabled = true;

    public static void onTick() {
        if (toggleSlowSwing.isPressed()) {
            if (isEnabled) {
                isEnabled = false;
            }else{
                isEnabled = true;
            }
        }
    }

    @Override
    public void onInitialize() {
        KeyBindingHelper.registerKeyBinding(toggleSlowSwing);
    }


}
