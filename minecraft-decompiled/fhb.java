import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fhb(fho b, fdi c) implements fgs {
   public static final MapCodec<fhb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fhp.a.fieldOf("value").forGetter(fhb::c), fdi.a.fieldOf("range").forGetter(fhb::d)).apply($$0, fhb::new)
   );

   @Override
   public fgt b() {
      return fgu.r;
   }

   @Override
   public Set<bdn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(fdj $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fgs.a a(fho $$0, fdi $$1) {
      return () -> new fhb($$0, $$1);
   }

   public fho c() {
      return this.b;
   }

   public fdi d() {
      return this.c;
   }
}
