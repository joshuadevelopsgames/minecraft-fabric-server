import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fgp(fgs b) implements fgs {
   public static final MapCodec<fgp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fgs.e.fieldOf("term").forGetter(fgp::c)).apply($$0, fgp::new));

   @Override
   public fgt b() {
      return fgu.a;
   }

   public boolean a(fdj $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(fdp $$0) {
      fgs.super.a($$0);
      this.b.a($$0);
   }

   public static fgs.a a(fgs.a $$0) {
      fgp $$1 = new fgp($$0.build());
      return () -> $$1;
   }

   public fgs c() {
      return this.b;
   }
}
