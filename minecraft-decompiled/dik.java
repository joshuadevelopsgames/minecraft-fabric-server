import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dik implements dih {
   final dhi d;
   final dhi e;
   final dhi f;
   final jl<dlk> g;
   @Nullable
   private dhl h;

   public dik(dhi $$0, dhi $$1, dhi $$2, jl<dlk> $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public dcv a(dii $$0, jn.a $$1) {
      return a($$1, $$0.d(), $$0.e(), this.g);
   }

   public static dcv a(jn.a $$0, dcv $$1, dcv $$2, jl<dlk> $$3) {
      Optional<jl<dli>> $$4 = dlj.a($$0, $$2);
      if ($$4.isPresent()) {
         dlg $$5 = $$1.a(kq.W);
         dlg $$6 = new dlg($$4.get(), $$3);
         if (Objects.equals($$5, $$6)) {
            return dcv.l;
         } else {
            dcv $$7 = $$1.c(1);
            $$7.b(kq.W, $$6);
            return $$7;
         }
      } else {
         return dcv.l;
      }
   }

   @Override
   public Optional<dhi> c() {
      return Optional.of(this.d);
   }

   @Override
   public dhi f() {
      return this.e;
   }

   @Override
   public Optional<dhi> k() {
      return Optional.of(this.f);
   }

   @Override
   public dhw<dik> a() {
      return dhw.u;
   }

   @Override
   public dhl ao_() {
      if (this.h == null) {
         this.h = dhl.b(List.of(this.d, this.e, this.f));
      }

      return this.h;
   }

   @Override
   public List<dis> g() {
      diy $$0 = this.e.c();
      diy $$1 = this.f.c();
      diy $$2 = this.d.c();
      return List.of(new djb($$2, $$0, $$1, new diy.g($$0, $$1, this.g), new diy.d(dcz.xV)));
   }

   public static class a implements dhw<dik> {
      private static final MapCodec<dik> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               dhi.d.fieldOf("template").forGetter($$0x -> $$0x.d),
               dhi.d.fieldOf("base").forGetter($$0x -> $$0x.e),
               dhi.d.fieldOf("addition").forGetter($$0x -> $$0x.f),
               dlk.c.fieldOf("pattern").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dik::new)
      );
      public static final zm<wx, dik> w = zm.a(dhi.a, $$0 -> $$0.d, dhi.a, $$0 -> $$0.e, dhi.a, $$0 -> $$0.f, dlk.d, $$0 -> $$0.g, dik::new);

      @Override
      public MapCodec<dik> a() {
         return x;
      }

      @Override
      public zm<wx, dik> b() {
         return w;
      }
   }
}
