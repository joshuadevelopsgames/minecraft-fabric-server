import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fgx(fho b) implements fgs {
   public static final MapCodec<fgx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fhp.a.fieldOf("chance").forGetter(fgx::c)).apply($$0, fgx::new));

   @Override
   public fgt b() {
      return fgu.d;
   }

   public boolean a(fdj $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fgs.a a(float $$0) {
      return () -> new fgx(fhl.a($$0));
   }

   public static fgs.a a(fho $$0) {
      return () -> new fgx($$0);
   }

   public fho c() {
      return this.b;
   }
}
