import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class axn {
   private static final Codec<axn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(bcm.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, axn::new)
   );
   public static final awo<axn> a = new awo<>("filter", b);
   private final List<bcm> c;

   public axn(List<bcm> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
