import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dij implements dih {
   final Optional<dhi> d;
   final dhi e;
   final Optional<dhi> f;
   final dip g;
   @Nullable
   private dhl h;

   public dij(Optional<dhi> $$0, dhi $$1, Optional<dhi> $$2, dip $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public dcv a(dii $$0, jn.a $$1) {
      return this.g.a($$0.d());
   }

   @Override
   public Optional<dhi> c() {
      return this.d;
   }

   @Override
   public dhi f() {
      return this.e;
   }

   @Override
   public Optional<dhi> k() {
      return this.f;
   }

   @Override
   public dhw<dij> a() {
      return dhw.t;
   }

   @Override
   public dhl ao_() {
      if (this.h == null) {
         this.h = dhl.a(List.of(this.d, Optional.of(this.e), this.f));
      }

      return this.h;
   }

   @Override
   public List<dis> g() {
      return List.of(new djb(dhi.a(this.d), this.e.c(), dhi.a(this.f), this.g.a(), new diy.d(dcz.xV)));
   }

   public static class a implements dhw<dij> {
      private static final MapCodec<dij> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               dhi.d.optionalFieldOf("template").forGetter($$0x -> $$0x.d),
               dhi.d.fieldOf("base").forGetter($$0x -> $$0x.e),
               dhi.d.optionalFieldOf("addition").forGetter($$0x -> $$0x.f),
               dip.a.fieldOf("result").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dij::new)
      );
      public static final zm<wx, dij> w = zm.a(dhi.b, $$0 -> $$0.d, dhi.a, $$0 -> $$0.e, dhi.b, $$0 -> $$0.f, dip.b, $$0 -> $$0.g, dij::new);

      @Override
      public MapCodec<dij> a() {
         return x;
      }

      @Override
      public zm<wx, dij> b() {
         return w;
      }
   }
}
