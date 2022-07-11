package lithiumstudio.mf.painting;

import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IdCountsState;

public class Paintings {
    private static int chunk(int i){
        return i*16;
    }
    public static void register() {
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0000"), new PaintingMotive(chunk(1),chunk(1)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0001"), new PaintingMotive(chunk(2),chunk(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0002"), new PaintingMotive(chunk(3),chunk(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0003"), new PaintingMotive(chunk(3),chunk(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0004"), new PaintingMotive(chunk(4),chunk(5)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0005"), new PaintingMotive(chunk(1),chunk(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0006"), new PaintingMotive(chunk(16),chunk(9)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0007"), new PaintingMotive(chunk(3),chunk(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0008"), new PaintingMotive(chunk(1),chunk(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0009"), new PaintingMotive(chunk(2),chunk(2)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0010"), new PaintingMotive(chunk(5),chunk(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0011"), new PaintingMotive(chunk(5),chunk(4)));
        Registry.register(Registry.PAINTING_MOTIVE, new Identifier("mf","img_0012"), new PaintingMotive(chunk(5),chunk(4)));
    }
}
