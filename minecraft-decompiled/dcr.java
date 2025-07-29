import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dcr implements cya, dmt {
   public static final Codec<jl<dcr>> e = mm.g
      .r()
      .validate($$0 -> $$0.a(dcz.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final zm<wx, jl<dcr>> f = zk.b(mn.N);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dpz, dcr> g = Maps.newHashMap();
   public static final ame h = ame.b("base_attack_damage");
   public static final ame i = ame.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final jl.c<dcr> b = mm.g.f(this);
   private final kn c;
   @Nullable
   private final dcr d;
   protected final String n;
   private final cyd o;

   public static int a(dcr $$0) {
      return $$0 == null ? 0 : mm.g.a($$0);
   }

   public static dcr b(int $$0) {
      return mm.g.a($$0);
   }

   @Deprecated
   public static dcr a(dpz $$0) {
      return g.getOrDefault($$0, dcz.a);
   }

   public dcr(dcr.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(xo.c(this.n), $$0.e());
      this.d = $$0.d;
      this.o = $$0.e;
      if (ac.aZ) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jl.c<dcr> e() {
      return this.b;
   }

   public kn f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kq.c, 1);
   }

   public void a(dmu $$0, cam $$1, dcv $$2, int $$3) {
   }

   public void a(cqz $$0) {
   }

   public void l(dcv $$0) {
   }

   public boolean a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cam $$4) {
      dfy $$5 = $$0.a(kq.A);
      return $$5 != null && !$$5.d() ? !($$4 instanceof cut $$6 && $$6.gt().d) : true;
   }

   @Override
   public dcr h() {
      return this;
   }

   public bxj a(dgq $$0) {
      return bxj.e;
   }

   public float a(dcv $$0, eeb $$1) {
      dfy $$2 = $$0.a(kq.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      dfa $$4 = $$3.a(kq.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dle $$5 = $$3.a(kq.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dew $$6 = $$3.a(kq.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bxj.c;
            } else {
               return bxj.e;
            }
         }
      }
   }

   public dcv a(dcv $$0, dmu $$1, cam $$2) {
      dfa $$3 = $$0.a(kq.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(dcv $$0) {
      return $$0.n();
   }

   public int e(dcv $$0) {
      return bcb.a(Math.round(13.0F - $$0.o() * 13.0F / $$0.p()), 0, 13);
   }

   public int f(dcv $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - $$0.o()) / $$1);
      return bcb.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(dcv $$0, dak $$1, cyw $$2, cut $$3) {
      return false;
   }

   public boolean a(dcv $$0, dcv $$1, dak $$2, cyw $$3, cut $$4, cbd $$5) {
      return false;
   }

   public float a(bzm $$0, float $$1, byb $$2) {
      return 0.0F;
   }

   @Nullable
   public byb a(cam $$0) {
      return null;
   }

   public void a(dcv $$0, cam $$1, cam $$2) {
   }

   public void b(dcv $$0, cam $$1, cam $$2) {
   }

   public boolean a(dcv $$0, dmu $$1, eeb $$2, jb $$3, cam $$4) {
      dfy $$5 = $$0.a(kq.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bzw.a);
         }

         return true;
      }
   }

   public boolean b(dcv $$0, eeb $$1) {
      dfy $$2 = $$0.a(kq.A);
      return $$2 != null && $$2.b($$1);
   }

   public bxj a(dcv $$0, cut $$1, cam $$2, bxi $$3) {
      return bxj.e;
   }

   @Override
   public String toString() {
      return mm.g.e(this).g();
   }

   public final dcv i() {
      return this.d == null ? dcv.l : new dcv(this.d);
   }

   public void a(dcv $$0, aub $$1, bzm $$2, @Nullable bzw $$3) {
   }

   public void c(dcv $$0, cut $$1) {
      this.a($$0, $$1.ai());
   }

   public void a(dcv $$0, dmu $$1) {
   }

   public dcx b(dcv $$0) {
      dfa $$1 = $$0.a(kq.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dew $$2 = $$0.a(kq.I);
         return $$2 != null ? dcx.d : dcx.a;
      }
   }

   public int a(dcv $$0, cam $$1) {
      dfa $$2 = $$0.a(kq.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dew $$3 = $$0.a(kq.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(dcv $$0, dmu $$1, cam $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(dcv $$0, dcr.b $$1, dfz $$2, Consumer<xo> $$3, dek $$4) {
   }

   public Optional<dau> k(dcv $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final xo l() {
      return this.c.a(kq.h, xn.a);
   }

   public xo a(dcv $$0) {
      return $$0.a().a(kq.h, xn.a);
   }

   public boolean d_(dcv $$0) {
      return $$0.F();
   }

   protected static fio a(dmu $$0, cut $$1, dmb.b $$2) {
      fis $$3 = $$1.bI();
      fis $$4 = $$3.e($$1.d($$1.dR(), $$1.dP()).c($$1.gV()));
      return $$0.a(new dmb($$3, $$4, dmb.a.b, $$2, $$1));
   }

   public boolean e_(dcv $$0) {
      return false;
   }

   public dcv m() {
      return new dcv(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cyd k() {
      return this.o;
   }

   public boolean a(dcv $$0, @Nullable cut $$1) {
      return false;
   }

   public static class a {
      private static final alw<dcr, String> a = $$0 -> ag.a("block", $$0.a());
      private static final alw<dcr, String> b = $$0 -> ag.a("item", $$0.a());
      private final kn.a c = kn.a().a(kq.aT);
      @Nullable
      dcr d;
      cyd e = cyf.g;
      @Nullable
      private amd<dcr> f;
      private alw<dcr, String> g = b;
      private alw<dcr, ame> h = amd::a;

      public dcr.a a(cyj $$0) {
         return this.a($$0, dfc.a);
      }

      public dcr.a a(cyj $$0, dfa $$1) {
         return this.a(kq.v, $$0).a(kq.w, $$1);
      }

      public dcr.a a(dcr $$0) {
         return this.a(kq.x, new dgc(new dcv($$0)));
      }

      public dcr.a a(float $$0) {
         return this.a(kq.y, new dgb($$0));
      }

      public dcr.a a(int $$0) {
         return this.a(kq.c, $$0);
      }

      public dcr.a b(int $$0) {
         this.a(kq.d, $$0);
         this.a(kq.c, 1);
         this.a(kq.e, 0);
         return this;
      }

      public dcr.a b(dcr $$0) {
         this.d = $$0;
         return this;
      }

      public dcr.a a(ddr $$0) {
         return this.a(kq.k, $$0);
      }

      public dcr.a a() {
         return this.a(kq.z, new dff(azp.i));
      }

      public dcr.a a(amd<ddb> $$0) {
         return this.a(kq.ae, new dda(new dbw<>($$0)));
      }

      public dcr.a c(int $$0) {
         return this.a(kq.C, new djg($$0));
      }

      public dcr.a c(dcr $$0) {
         return this.a(kq.E, new djq(jp.a($$0.e())));
      }

      public dcr.a a(bae<dcr> $$0) {
         jm<dcr> $$1 = mm.a(mm.g);
         return this.a(kq.E, new djq($$1.b($$0)));
      }

      public dcr.a a(bzw $$0) {
         return this.a(kq.D, dle.a($$0).a());
      }

      public dcr.a b(bzw $$0) {
         return this.a(kq.D, dle.a($$0).b(false).a());
      }

      public dcr.a a(dej $$0, bae<dpz> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public dcr.a a(dej $$0, float $$1, float $$2) {
         return this.a($$0, azo.bG, $$1, $$2, 0.0F);
      }

      public dcr.a b(dej $$0, float $$1, float $$2) {
         return this.a($$0, azo.bE, $$1, $$2, 5.0F);
      }

      public dcr.a c(dej $$0, float $$1, float $$2) {
         return this.a($$0, azo.bF, $$1, $$2, 0.0F);
      }

      public dcr.a d(dej $$0, float $$1, float $$2) {
         return this.a($$0, azo.bH, $$1, $$2, 0.0F);
      }

      public dcr.a e(dej $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public dcr.a a(dkz $$0, dlb $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kq.D, dle.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public dcr.a a(dkz $$0) {
         return this.b(dlb.e.a($$0.a()))
            .a($$0.a(dlb.e))
            .a($$0.g())
            .a(kq.D, dle.a(bzw.g).a($$0.d()).a($$0.h()).a(jp.a(bzv.bO.r())).e(true).b(mm.b.e(ayz.az)).a())
            .a(kq.au, ayz.El)
            .a(1);
      }

      public dcr.a b(dkz $$0) {
         jm<bzv<?>> $$1 = mm.a(mm.f);
         return this.a($$0.a(dlb.e)).a(kq.D, dle.a(bzw.g).a(ayz.nF).a($$0.h()).a($$1.b(azs.L)).c(false).e(true).b(ayz.nG).a()).a(1);
      }

      public dcr.a b(amd<dli> $$0) {
         return this.a(kq.ac, new dfu($$0));
      }

      public dcr.a a(cyb... $$0) {
         this.e = cyf.e.a($$0);
         return this;
      }

      public dcr.a c(amd<dcr> $$0) {
         this.f = $$0;
         return this;
      }

      public dcr.a a(String $$0) {
         this.g = alw.fixed($$0);
         return this;
      }

      public dcr.a b() {
         this.g = a;
         return this;
      }

      public dcr.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public ame e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> dcr.a a(kp<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public dcr.a a(dfm $$0) {
         return this.a(kq.o, $$0);
      }

      kn a(xo $$0, ame $$1) {
         kn $$2 = this.c.a(kq.h, $$0).a(kq.i, $$1).a();
         if ($$2.c(kq.e) && $$2.a(kq.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      dcr.b a = new dcr.b() {
         @Nullable
         @Override
         public jn.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public fcg a(fce $$0) {
            return null;
         }
      };

      @Nullable
      jn.a a();

      float b();

      @Nullable
      fcg a(fce var1);

      static dcr.b a(@Nullable final dmu $$0) {
         return $$0 == null ? a : new dcr.b() {
            @Override
            public jn.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.v().f();
            }

            @Override
            public fcg a(fce $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static dcr.b a(final jn.a $$0) {
         return new dcr.b() {
            @Override
            public jn.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public fcg a(fce $$0x) {
               return null;
            }
         };
      }
   }
}
