import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dio implements dhb {
   final String d;
   final dgz e;
   final dhi f;
   final dhi g;
   final dip h;
   @Nullable
   private dhl i;

   public dio(String $$0, dgz $$1, dhi $$2, dhi $$3, dip $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public boolean a(dha $$0, dmu $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dcv $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (!$$2 && this.f.a($$5)) {
                  if (this.h.b($$5)) {
                     return false;
                  }

                  $$2 = true;
               } else {
                  if ($$3 || !this.g.a($$5)) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public dcv a(dha $$0, jn.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         dcv $$3 = $$0.a($$2);
         if (!$$3.f() && this.f.a($$3)) {
            return this.h.a($$3);
         }
      }

      return dcv.l;
   }

   @Override
   public List<dis> g() {
      return List.of(new dix(List.of(this.f.c(), this.g.c()), this.h.a(), new diy.d(dcz.fi)));
   }

   @Override
   public dhw<dio> a() {
      return dhw.m;
   }

   @Override
   public String j() {
      return this.d;
   }

   @Override
   public dhl ao_() {
      if (this.i == null) {
         this.i = dhl.b(List.of(this.f, this.g));
      }

      return this.i;
   }

   @Override
   public dgz c() {
      return this.e;
   }

   public static class a implements dhw<dio> {
      private static final MapCodec<dio> x = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.d),
               dgz.e.fieldOf("category").orElse(dgz.d).forGetter($$0x -> $$0x.e),
               dhi.d.fieldOf("input").forGetter($$0x -> $$0x.f),
               dhi.d.fieldOf("material").forGetter($$0x -> $$0x.g),
               dip.a.fieldOf("result").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dio::new)
      );
      public static final zm<wx, dio> w = zm.a(zk.p, $$0 -> $$0.d, dgz.g, $$0 -> $$0.e, dhi.a, $$0 -> $$0.f, dhi.a, $$0 -> $$0.g, dip.b, $$0 -> $$0.h, dio::new);

      @Override
      public MapCodec<dio> a() {
         return x;
      }

      @Override
      public zm<wx, dio> b() {
         return w;
      }
   }
}
