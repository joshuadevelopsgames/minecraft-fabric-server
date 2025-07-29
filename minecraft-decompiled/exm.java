import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exm extends evi {
   private static final float h = 0.3F;
   private static final float i = 0.07F;
   private static final float j = 0.2F;
   private final exm.b k;
   private final exm.a l;

   public exm(ezb $$0, jb $$1, exm.b $$2, exm.a $$3, ame $$4, eza $$5, dwu $$6, dvd $$7, jb $$8) {
      super(evp.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.k = $$2;
      this.l = $$3;
   }

   public exm(ezb $$0, ui $$1) {
      super(evp.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.k = $$1.<exm.b>a("VerticalPlacement", exm.b.g).orElseThrow();
      this.l = $$1.<exm.a>a("Properties", exm.a.a).orElseThrow();
   }

   @Override
   protected void a(evo $$0, ui $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", dwu.h, this.c.d());
      $$1.a("Mirror", dvd.e, this.c.c());
      $$1.a("VerticalPlacement", exm.b.g, this.k);
      $$1.a("Properties", exm.a.a, this.l);
   }

   private static eyw a(ezb $$0, ui $$1, ame $$2) {
      eza $$3 = $$0.a($$2);
      jb $$4 = new jb($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         $$1.<dvd>a("Mirror", dvd.e).orElseThrow(),
         $$1.<dwu>a("Rotation", dwu.h).orElseThrow(),
         $$1.<exm.b>a("VerticalPlacement", exm.b.g).orElseThrow(),
         $$4,
         (exm.a)exm.a.a.parse(new Dynamic(uw.a, $$1.a("Properties"))).getPartialOrThrow()
      );
   }

   private static eyw a(dvd $$0, dwu $$1, exm.b $$2, jb $$3, exm.a $$4) {
      eyb $$5 = $$4.d ? eyb.b : eyb.d;
      List<eyp> $$6 = Lists.newArrayList();
      $$6.add(a(dqb.cr, 0.3F, dqb.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dqb.em, 0.07F, dqb.lp));
      }

      eyw $$7 = new eyw().a($$1).a($$0).a($$3).a($$5).a(new eyt($$6)).a(new eya($$4.c)).a(new eyq(azo.bT)).a(new eyi());
      if ($$4.g) {
         $$7.a(exz.b);
      }

      return $$7;
   }

   private static eyp a(exm.b $$0, exm.a $$1) {
      if ($$0 == exm.b.c) {
         return a(dqb.K, dqb.lp);
      } else {
         return $$1.b ? a(dqb.K, dqb.em) : a(dqb.K, 0.2F, dqb.lp);
      }
   }

   @Override
   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
      euq $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.l.f || this.l.e) {
            jb.a(this.f()).forEach($$2x -> {
               if (this.l.f) {
                  this.a($$3, (dmv)$$0, $$2x);
               }

               if (this.l.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, jb $$1, dnl $$2, bck $$3, euq $$4) {
   }

   private void a(bck $$0, dmv $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2);
      if (!$$3.l() && !$$3.a(dqb.fx)) {
         jh $$4 = a($$0);
         jb $$5 = $$2.a($$4);
         eeb $$6 = $$1.a_($$5);
         if ($$6.l()) {
            if (dpz.a($$3.g($$1, $$2), $$4)) {
               ees $$7 = dzm.a($$4.g());
               $$1.a($$5, dqb.fx.m().b($$7, true), 3);
            }
         }
      }
   }

   private void b(bck $$0, dmv $$1, jb $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dqb.em) && $$1.a_($$2.d()).l()) {
         $$1.a($$2.d(), dqb.aN.m().b(duq.c, true), 3);
      }
   }

   private void a(bck $$0, dmv $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            jb $$4 = new jb($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dqb.em)) {
               this.c($$0, $$1, $$4.e());
            }
         }
      }
   }

   private void c(bck $$0, dmv $$1, jb $$2) {
      jb.a $$3 = $$2.k();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jh.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(bck $$0, dmv $$1) {
      boolean $$2 = this.k == exm.b.a || this.k == exm.b.c;
      jb $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      jb.a $$11 = jb.c.k();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < $$16) {
                  int $$17 = a($$1, $$12, $$13, this.k);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.i(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.i()) <= 3 && this.a($$1, $$11)) {
                     this.d($$0, $$1, $$11);
                     if (this.l.e) {
                        this.b($$0, $$1, $$11);
                     }

                     this.c($$0, $$1, $$11.e());
                  }
               }
            }
         }
      }
   }

   private boolean a(dmv $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return !$$2.a(dqb.a) && !$$2.a(dqb.cy) && !$$2.a(azo.bT) && (this.k == exm.b.f || !$$2.a(dqb.K));
   }

   private void d(bck $$0, dmv $$1, jb $$2) {
      if (!this.l.b && $$0.i() < 0.07F) {
         $$1.a($$2, dqb.lp.m(), 3);
      } else {
         $$1.a($$2, dqb.em.m(), 3);
      }
   }

   private static int a(dmv $$0, int $$1, int $$2, exm.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static eka.a a(exm.b $$0) {
      return $$0 == exm.b.c ? eka.a.c : eka.a.a;
   }

   private static eyp a(dpz $$0, float $$1, dpz $$2) {
      return new eyp(new eyr($$0, $$1), exx.b, $$2.m());
   }

   private static eyp a(dpz $$0, dpz $$1) {
      return new eyp(new eyc($$0), exx.b, $$1.m());
   }

   public static class a {
      public static final Codec<exm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
               Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
               Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
               Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, exm.a::new)
      );
      public boolean b;
      public float c;
      public boolean d;
      public boolean e;
      public boolean f;
      public boolean g;

      public a() {
      }

      public a(boolean $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }
   }

   public static enum b implements bda {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final Codec<exm.b> g = bda.a(exm.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
