import javax.annotation.Nullable;

public class cry extends crc implements cri, cud {
   private static final alh<Boolean> a = all.a(cry.class, alj.k);
   private static final int b = 5;
   private static final int e = 300;
   private final bxr ck = new bxr(5);

   public cry(bzv<? extends cry> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cgp<>(this, csz.class, 8.0F, 1.0, 1.2));
      this.ch.a(2, new cwk.a(this, 10.0F));
      this.ch.a(3, new cij<>(this, 1.0, 8.0F));
      this.ch.a(8, new cif(this, 0.6));
      this.ch.a(9, new chq(this, cut.class, 15.0F, 1.0F));
      this.ch.a(10, new chq(this, cao.class, 15.0F));
      this.ci.a(1, new cja(this, cwk.class).a());
      this.ci.a(2, new cjb<>(this, cut.class, true));
      this.ci.a(3, new cjb<>(this, cua.class, false));
      this.ci.a(3, new cjb<>(this, cmv.class, true));
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.w, 0.35F).a(cbs.t, 24.0).a(cbs.c, 5.0).a(cbs.n, 32.0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(ddq $$0) {
      return $$0 == dcz.xA;
   }

   public boolean t() {
      return this.ay.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.ay.a(a, $$0);
   }

   @Override
   public void a() {
      this.bz = 0;
   }

   @Override
   public bae<dcr> ad() {
      return azx.ca;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public crc.a l() {
      if (this.t()) {
         return crc.a.f;
      } else if (this.b(dcz.xA)) {
         return crc.a.e;
      } else {
         return this.gy() ? crc.a.b : crc.a.h;
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a_($$0);
      this.a_(true);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return 0.0F;
   }

   @Override
   public int gk() {
      return 1;
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      this.a(bzw.a, new dcv(dcz.xA));
   }

   @Override
   protected void b(dnl $$0, bck $$1, bxh $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         dcv $$3 = this.fh();
         if ($$3.a(dcz.xA)) {
            djk.a($$3, $$0.K_(), dkw.b, $$2, $$1);
         }
      }
   }

   @Override
   protected ayy p() {
      return ayz.vj;
   }

   @Override
   protected ayy f_() {
      return ayz.vl;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.vm;
   }

   @Override
   public void a(cam $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bxr n() {
      return this.ck;
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      dcv $$2 = $$1.e();
      if ($$2.h() instanceof dbb) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         dcv $$3 = this.ck.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.M());
         }
      }
   }

   private boolean i(dcv $$0) {
      return this.gX() && $$0.a(dcz.ws);
   }

   @Override
   public cbd a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ck.b() ? cbd.a(this.ck, $$1) : super.a_($$0);
   }

   @Override
   public void a(aub $$0, int $$1, boolean $$2) {
      cwj $$3 = this.gU();
      boolean $$4 = this.ar.i() <= $$3.s();
      if ($$4) {
         dcv $$5 = new dcv(dcz.xA);
         amd<dkq> $$6;
         if ($$1 > $$3.a(bxg.c)) {
            $$6 = dkw.d;
         } else if ($$1 > $$3.a(bxg.b)) {
            $$6 = dkw.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            djk.a($$5, $$0.K_(), $$6, $$0.d_(this.dx()), this.ec());
            this.a(bzw.a, $$5);
         }
      }
   }

   @Override
   public ayy ag_() {
      return ayz.vk;
   }
}
