package lithiumstudio.mf.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IdCountsState;

public class Paintings {
    private static int px(int i){
        return i*16;
    }
    public static void register() {
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0000"), new PaintingMotive(px(1),px(1)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0001"), new PaintingMotive(px(2),px(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0002"), new PaintingMotive(px(3),px(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0003"), new PaintingMotive(px(3),px(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0004"), new PaintingMotive(px(4),px(5)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0005"), new PaintingMotive(px(1),px(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0006"), new PaintingMotive(px(16),px(9)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0007"), new PaintingMotive(px(3),px(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0008"), new PaintingMotive(px(1),px(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0009"), new PaintingMotive(px(2),px(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0010"), new PaintingMotive(px(5),px(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0011"), new PaintingMotive(px(5),px(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0012"), new PaintingMotive(px(5),px(4)));
    }
}
