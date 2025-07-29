import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ecl extends eaz implements ejd.b<ejk.b>, ejk {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int e = 40;
   private static final int f = 90;
   private static final Int2ObjectMap<ayy> j = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ayz.Du);
      $$0.put(2, ayz.Dv);
      $$0.put(3, ayz.Dw);
      $$0.put(4, ayz.Dt);
   });
   private static final int k = 0;
   private int l = 0;
   private final ejk.d m = new ecl.a();
   private ejk.a q = new ejk.a();
   private final ejk.b r = new ejk.b(this);

   public ecl(jb $$0, eeb $$1) {
      super(ebb.M, $$0, $$1);
   }

   @Override
   public ejk.a gI() {
      return this.q;
   }

   @Override
   public ejk.d gJ() {
      return this.m;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.l = $$0.a("warning_level", 0);
      this.q = $$0.<ejk.a>a("listener", ejk.a.a).orElseGet(ejk.a::new);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("warning_level", this.l);
      $$0.a("listener", ejk.a.a, this.q);
   }

   @Nullable
   public static auc a(@Nullable bzm $$0) {
      if ($$0 instanceof auc $$1) {
         return $$1;
      } else if ($$0 != null && $$0.cY() instanceof auc $$2) {
         return $$2;
      } else if ($$0 instanceof cvo $$3 && $$3.ah_() instanceof auc $$4) {
         return $$4;
      } else {
         return $$0 instanceof cqz $$5 && $$5.ah_() instanceof auc $$6 ? $$6 : null;
      }
   }

   public void a(aub $$0, @Nullable auc $$1) {
      if ($$1 != null) {
         eeb $$2 = this.m();
         if (!$$2.c(dxc.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bzm)$$1);
            }
         }
      }
   }

   private boolean b(aub $$0, auc $$1) {
      OptionalInt $$2 = cty.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aub $$0, @Nullable bzm $$1) {
      jb $$2 = this.aA_();
      eeb $$3 = this.m();
      $$0.a($$2, $$3.b(dxc.b, true), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ejb.N, $$2, ejb.a.a($$1));
   }

   private boolean b(aub $$0) {
      return this.m().c(dxc.d) && $$0.an() != bxg.a && $$0.P().c(dmq.O);
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      if ($$1.c(dxc.b) && this.n instanceof aub $$2) {
         this.a($$2);
      }
   }

   public void a(aub $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dmu)$$0);
         }

         ctw.a($$0, fis.b(this.aA_()), null, 40);
      }
   }

   private void b(dmu $$0) {
      ayy $$1 = (ayy)j.get(this.l);
      if ($$1 != null) {
         jb $$2 = this.aA_();
         int $$3 = $$2.u() + bcb.b($$0.A, -10, 10);
         int $$4 = $$2.v() + bcb.b($$0.A, -10, 10);
         int $$5 = $$2.w() + bcb.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aza.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aub $$0) {
      return this.l < 4 ? false : bcw.a(bzv.bI, bzu.k, $$0, this.aA_(), 20, 5, 6, bcw.a.b, false).isPresent();
   }

   public ejk.b a() {
      return this.r;
   }

   class a implements ejk.d {
      private static final int b = 8;
      private final ejf c = new eix(ecl.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ejf b() {
         return this.c;
      }

      @Override
      public bae<ejb> c() {
         return azv.c;
      }

      @Override
      public boolean a(aub $$0, jb $$1, jl<ejb> $$2, ejb.a $$3) {
         return !ecl.this.m().c(dxc.b) && ecl.a($$3.a()) != null;
      }

      @Override
      public void a(aub $$0, jb $$1, jl<ejb> $$2, @Nullable bzm $$3, @Nullable bzm $$4, float $$5) {
         ecl.this.a($$0, ecl.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         ecl.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
