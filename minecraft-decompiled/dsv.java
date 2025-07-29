import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsv extends dtg {
   public static final MapCodec<dsv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dsv::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dsv.a f;

   @Override
   public MapCodec<? extends dsv> a() {
      return a;
   }

   public dsv(dsv.a $$0, eea.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dsv(boolean $$0, eea.d $$1) {
      super(dsv.a.a($$0).d, dsv.a.a($$0).e, $$1);
      this.f = dsv.a.a($$0);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         eeb $$4 = $$1.a_($$2.e());
         if ($$4.a(dqb.uf)) {
            $$1.a($$2.u(), $$2.v(), $$2.w(), ayz.jt, aza.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, aza.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, aza.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$1.G_().j()) {
         return false;
      } else if (drv.a($$1) == this.f.c) {
         return false;
      } else {
         dsv.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(ejb.c, $$2, ejb.a.a($$0));
         $$4.a($$1, $$2, $$3);
         jb.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            eeb $$5 = $$1.a_($$4x);
            if ($$5 == $$0) {
               double $$6 = Math.sqrt($$2.j($$4x));
               int $$7 = $$3.a((int)($$6 * 5.0), (int)($$6 * 10.0));
               $$1.a($$4x, $$0.b(), $$7);
            }
         });
         return true;
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!$$1.B_() && $$1.an() != bxg.a && $$3 instanceof cme $$5 && cme.c($$0) && !$$5.d(bys.s)) {
         $$5.a(this.b());
      }
   }

   @Override
   public byq b() {
      return new byq(bys.s, 25);
   }

   public static enum a {
      a(true, bys.o, 11.0F, ayz.jp, ayz.jq, 16545810),
      b(false, bys.i, 7.0F, ayz.jr, ayz.js, 6250335);

      final boolean c;
      final jl<byo> d;
      final float e;
      final ayy f;
      final ayy g;
      private final int h;

      private a(final boolean $$0, final jl<byo> $$1, final float $$2, final ayy $$3, final ayy $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dpz a() {
         return this.c ? dqb.ui : dqb.uj;
      }

      public eeb b() {
         return this.a().m();
      }

      public dsv.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dsv.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(aub $$0, jb $$1, bck $$2) {
         fis $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fis $$5 = new fis($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fis $$6 = $$3.e($$5.c($$4));
         mj $$7 = new mj($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public ayy e() {
         return this.f;
      }
   }
}
