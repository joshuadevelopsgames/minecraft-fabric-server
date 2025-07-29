import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drj extends dpl implements dtm {
   public static final MapCodec<drj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, drj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final eez<jh> b = dsd.a;
   public static final ees c = eer.f;
   private final boolean e;

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(boolean $$0, eea.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jh.c).b(c, false));
      this.e = $$0;
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      ebk $$2 = new ebk($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof ebk $$7) {
            this.a($$1, $$2, $$7, $$1.E($$2));
         }
      }
   }

   private void a(dmu $$0, jb $$1, ebk $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.u() == ebk.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.c_($$2) instanceof ebk $$5) {
         dlt $$6 = $$5.a();
         boolean $$7 = !bdb.b($$6.m());
         ebk.a $$8 = $$5.u();
         boolean $$9 = $$5.j();
         if ($$8 == ebk.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.v()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == ebk.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.v()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(eeb $$0, aub $$1, jb $$2, dlt $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      eaz $$5 = $$1.c_($$2);
      if ($$5 instanceof ebk && $$3.gQ()) {
         $$3.a((ebk)$$5);
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      eaz $$3 = $$1.c_($$2);
      return $$3 instanceof ebk ? ((ebk)$$3).a().k() : 0;
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      if ($$0.c_($$1) instanceof ebk $$6) {
         dlt $$8 = $$6.a();
         if ($$0 instanceof aub $$9) {
            if (!$$4.c(kq.aa)) {
               $$8.a($$9.P().c(dmq.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.E($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(aub $$0, jb $$1, jh $$2) {
      jb.a $$3 = $$1.k();
      dmq $$4 = $$0.P();
      int $$5 = $$4.d(dmq.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         eeb $$6 = $$0.a_($$3);
         dpz $$7 = $$6.b();
         if (!$$6.a(dqb.ln) || !($$0.c_($$3) instanceof ebk $$9) || $$9.u() != ebk.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dlt $$10 = $$9.a();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.b($$3, $$7);
            } else if ($$9.v()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.d(dmq.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
