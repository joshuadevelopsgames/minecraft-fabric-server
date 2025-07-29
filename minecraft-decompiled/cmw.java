import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cmw extends cly implements cbc {
   private static final alh<Integer> ck = all.a(cmw.class, alj.b);
   private static final int cl = 1024;
   private static final String cm = "stew_effects";
   @Nullable
   private dfx co;
   @Nullable
   private UUID cp;

   public cmw(bzv<? extends cmw> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return $$1.a_($$0.e()).a(dqb.fE) ? 10.0F : $$1.y($$0);
   }

   public static boolean c(bzv<cmw> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cf) && a($$1, $$3);
   }

   @Override
   public void a(aub $$0, cal $$1) {
      UUID $$2 = $$1.cK();
      if (!$$2.equals(this.cp)) {
         this.a(this.n() == cmw.a.a ? cmw.a.b : cmw.a.a);
         this.cp = $$2;
         this.a(ayz.pY, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, cmw.a.c.h);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.py) && !this.g_()) {
         boolean $$3 = false;
         dcv $$4;
         if (this.co != null) {
            $$3 = true;
            $$4 = new dcv(dcz.xB);
            $$4.b(kq.T, this.co);
            this.co = null;
         } else {
            $$4 = new dcv(dcz.qw);
         }

         dcv $$6 = dcy.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         ayy $$7;
         if ($$3) {
            $$7 = ayz.qb;
         } else {
            $$7 = ayz.qa;
         }

         this.a($$7, 1.0F, 1.0F);
         return bxj.a;
      } else if ($$2.a(dcz.tu) && this.a()) {
         if (this.ai() instanceof aub $$9) {
            this.a($$9, aza.h, $$2);
            this.a(ejb.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bxj.a;
      } else if (this.n() == cmw.a.b) {
         Optional<dfx> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.co != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.ai().a(me.ah, this.dC() + this.ar.j() / 2.0, this.e(0.5), this.dI() + this.ar.j() / 2.0, 0.0, this.ar.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.ai().a(me.p, this.dC() + this.ar.j() / 2.0, this.e(0.5), this.dI() + this.ar.j() / 2.0, 0.0, this.ar.j() / 5.0, 0.0);
               }

               this.co = $$10.get();
               this.a(ayz.pZ, 2.0F, 1.0F);
            }

            return bxj.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aub $$0, aza $$1, dcv $$2) {
      $$0.a(null, this, ayz.qc, $$1, 1.0F, 1.0F);
      this.a(bzv.D, bzg.a(this, false, false), $$2x -> {
         $$0.a(me.w, this.dC(), this.e(0.5), this.dI(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, fdf.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cqz(this.ai(), this.dC(), this.e(1.0), this.dI(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bO() && !this.g_();
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Type", cmw.a.d, this.n());
      $$0.b("stew_effects", dfx.c, this.co);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cmw.a>a("Type", cmw.a.d).orElse(cmw.a.c));
      this.co = $$0.<dfx>a("stew_effects", dfx.c).orElse(null);
   }

   private Optional<dfx> j(dcv $$0) {
      dym $$1 = dym.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(cmw.a $$0) {
      this.ay.a(ck, $$0.h);
   }

   public cmw.a n() {
      return cmw.a.a(this.ay.a(ck));
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aF ? c((kp<T>)$$0, this.n()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aF);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aF) {
         this.a(c(kq.aF, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cmw b(aub $$0, bzc $$1) {
      cmw $$2 = bzv.aG.a($$0, bzu.e);
      if ($$2 != null) {
         $$2.a(this.a((cmw)$$1));
      }

      return $$2;
   }

   private cmw.a a(cmw $$0) {
      cmw.a $$1 = this.n();
      cmw.a $$2 = $$0.n();
      cmw.a $$3;
      if ($$1 == $$2 && this.ar.a(1024) == 0) {
         $$3 = $$1 == cmw.a.b ? cmw.a.a : cmw.a.b;
      } else {
         $$3 = this.ar.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bda {
      a("red", 0, dqb.cq.m()),
      b("brown", 1, dqb.cp.m());

      public static final cmw.a c = a;
      public static final Codec<cmw.a> d = bda.a(cmw.a::values);
      private static final IntFunction<cmw.a> f = baq.a(cmw.a::b, values(), baq.a.c);
      public static final zm<ByteBuf, cmw.a> e = zk.a(f, cmw.a::b);
      private final String g;
      final int h;
      private final eeb i;

      private a(final String $$0, final int $$1, final eeb $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public eeb a() {
         return this.i;
      }

      @Override
      public String c() {
         return this.g;
      }

      private int b() {
         return this.h;
      }

      static cmw.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
