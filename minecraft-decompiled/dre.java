import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dre extends dpl {
   public static final MapCodec<dre> a = b(dre::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<ees> c = List.of(eer.bt, eer.bu, eer.bv, eer.bw, eer.bx, eer.by);

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(eea.d $$0) {
      super($$0);
      eeb $$1 = this.C.b().b(dub.f, jh.c);

      for (ees $$2 : c) {
         $$1 = $$1.b($$2, false);
      }

      this.l($$1);
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$2.c_($$3) instanceof ebj $$7) {
         if (!$$0.a(azx.bg)) {
            return bxj.f;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bxj.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bxj.f;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bxj.a;
            }
         }
      } else {
         return bxj.e;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.c_($$2) instanceof ebj $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bxj.e;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bxj.c;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bxj.a;
         }
      } else {
         return bxj.e;
      }
   }

   private OptionalInt a(fio $$0, eeb $$1) {
      return a($$0, $$1.c(dub.f)).map($$0x -> {
         int $$1x = $$0x.k >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.j);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<fir> a(fio $$0, jh $$1) {
      jh $$2 = $$0.c();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         jb $$3 = $$0.b().a($$2);
         fis $$4 = $$0.g().a($$3.u(), $$3.v(), $$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new fir((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new fir((float)$$5, (float)$$6));
            case e -> Optional.of(new fir((float)$$7, (float)$$6));
            case f -> Optional.of(new fir((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(float $$0) {
      float $$1 = 0.0625F;
      float $$2 = 0.375F;
      if ($$0 < 0.375F) {
         return 0;
      } else {
         float $$3 = 0.6875F;
         return $$0 < 0.6875F ? 1 : 2;
      }
   }

   private static void a(dmu $$0, jb $$1, cut $$2, ebj $$3, dcv $$4, int $$5) {
      if (!$$0.C) {
         $$2.b(azj.c.b($$4.h()));
         ayy $$6 = $$4.a(dcz.vY) ? ayz.fe : ayz.fd;
         $$3.a($$5, $$4.b(1, $$2));
         $$0.a(null, $$1, $$6, aza.e, 1.0F, 1.0F);
      }
   }

   private static void a(dmu $$0, jb $$1, cut $$2, ebj $$3, int $$4) {
      if (!$$0.C) {
         dcv $$5 = $$3.a($$4, 1);
         ayy $$6 = $$5.a(dcz.vY) ? ayz.fh : ayz.fg;
         $$0.a(null, $$1, $$6, aza.e, 1.0F, 1.0F);
         if (!$$2.gs().g($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, ejb.c, $$1);
      }
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebj($$0, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(dub.f);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(dub.f, $$0.g().g());
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(dub.f, $$1.a($$0.c(dub.f)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(dub.f)));
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      if ($$1.B_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof ebj $$3 ? $$3.j() + 1 : 0;
      }
   }
}
