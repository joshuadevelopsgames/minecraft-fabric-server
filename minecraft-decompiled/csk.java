import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class csk extends crc {
   private static final String a = "Johnny";
   static final Predicate<bxg> b = $$0 -> $$0 == bxg.c || $$0 == bxg.d;
   private static final boolean e = false;
   boolean f = false;

   public csk(bzv<? extends csk> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cgp<>(this, csz.class, 8.0F, 1.0, 1.2));
      this.ch.a(2, new csk.a(this));
      this.ch.a(3, new crc.b(this));
      this.ch.a(4, new cwk.a(this, 10.0F));
      this.ch.a(5, new chs(this, 1.0, false));
      this.ci.a(1, new cja(this, cwk.class).a());
      this.ci.a(2, new cjb<>(this, cut.class, true));
      this.ci.a(3, new cjb<>(this, cua.class, true));
      this.ci.a(3, new cjb<>(this, cmv.class, true));
      this.ci.a(4, new csk.b(this));
      this.ch.a(8, new cif(this, 0.6));
      this.ch.a(9, new chq(this, cut.class, 3.0F, 1.0F));
      this.ch.a(10, new chq(this, cao.class, 8.0F));
   }

   @Override
   protected void a(aub $$0) {
      if (!this.gw() && clh.a(this)) {
         boolean $$1 = $$0.e(this.dx());
         this.S().d($$1);
      }

      super.a($$0);
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.w, 0.35F).a(cbs.n, 12.0).a(cbs.t, 24.0).a(cbs.c, 5.0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (this.f) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public crc.a l() {
      if (this.gy()) {
         return crc.a.b;
      } else {
         return this.gZ() ? crc.a.g : crc.a.a;
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.f = $$0.a("Johnny", false);
   }

   @Override
   public ayy ag_() {
      return ayz.CQ;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cbe $$4 = super.a($$0, $$1, $$2, $$3);
      this.S().d(true);
      bck $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      if (this.gU() == null) {
         this.a(bzw.a, new dcv(dcz.qj));
      }
   }

   @Override
   public void b(@Nullable xo $$0) {
      super.b($$0);
      if (!this.f && $$0 != null && $$0.getString().equals("Johnny")) {
         this.f = true;
      }
   }

   @Override
   protected ayy p() {
      return ayz.CP;
   }

   @Override
   protected ayy f_() {
      return ayz.CR;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.CS;
   }

   @Override
   public void a(aub $$0, int $$1, boolean $$2) {
      dcv $$3 = new dcv(dcz.qj);
      cwj $$4 = this.gU();
      boolean $$5 = this.ar.i() <= $$4.s();
      if ($$5) {
         amd<dkq> $$6 = $$1 > $$4.a(bxg.c) ? dkw.f : dkw.e;
         djk.a($$3, $$0.K_(), $$6, $$0.d_(this.dx()), this.ar);
      }

      this.a(bzw.a, $$3);
   }

   static class a extends cgs {
      public a(cao $$0) {
         super($$0, 6, csk.b);
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean c() {
         csk $$0 = (csk)this.d;
         return $$0.gX() && super.c();
      }

      @Override
      public boolean b() {
         csk $$0 = (csk)this.d;
         return $$0.gX() && $$0.ar.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cjb<cam> {
      public b(csk $$0) {
         super($$0, cam.class, 0, true, true, ($$0x, $$1) -> $$0x.fT());
      }

      @Override
      public boolean b() {
         return ((csk)this.e).f && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
