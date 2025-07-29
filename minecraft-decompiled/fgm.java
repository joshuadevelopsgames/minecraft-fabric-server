import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fgm(boolean b) implements fgs {
   public static final MapCodec<fgm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fgm::e)).apply($$0, fgm::new));

   public boolean a(fdj $$0) {
      return $$0.b(fgd.l) == this.b;
   }

   @Override
   public fgt b() {
      return fgu.s;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.l);
   }

   public static fgs.a c() {
      return () -> new fgm(true);
   }

   public static fgs.a d() {
      return () -> new fgm(false);
   }

   public boolean e() {
      return this.b;
   }
}
