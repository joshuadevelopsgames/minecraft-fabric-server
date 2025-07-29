import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxb(jp<euy> c) implements cwx {
   public static final MapCodec<cxb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ka.a(mn.bj).fieldOf("structures").forGetter(cxb::b)).apply($$0, cxb::new));

   public boolean a(cwz $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<cxb> a() {
      return a;
   }

   public jp<euy> b() {
      return this.c;
   }
}
