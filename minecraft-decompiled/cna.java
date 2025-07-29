import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cna extends cmd implements caj {
   private static final alh<Integer> ck = all.a(cna.class, alj.b);
   private static final alh<jl<cnb>> cl = all.a(cna.class, alj.D);
   private final cai cm = new cai(this.ay, ck);

   public cna(bzv<? extends cna> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cib(this, 1.25));
      this.ch.a(3, new cgu(this, 1.0));
      this.ch.a(4, new ciq(this, 1.2, $$0 -> $$0.a(dcz.oR), false));
      this.ch.a(4, new ciq(this, 1.2, $$0 -> $$0.a(azx.aQ), false));
      this.ch.a(5, new chh(this, 1.1));
      this.ch.a(6, new civ(this, 1.0));
      this.ch.a(7, new chq(this, cut.class, 6.0F));
      this.ch.a(8, new cid(this));
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 10.0).a(cbs.w, 0.25);
   }

   @Nullable
   @Override
   public cam cY() {
      return (cam)(this.gm() && this.db() instanceof cut $$0 && $$0.b(dcz.oR) ? $$0 : super.cY());
   }

   @Override
   public void a(alh<?> $$0) {
      if (ck.equals($$0) && this.ai().C) {
         this.cm.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, cxc.a(this.eb(), cnc.d));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      cxc.a($$0, this.n());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      cxc.a($$0, mn.bf).ifPresent(this::b);
   }

   @Override
   protected ayy p() {
      return ayz.uO;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.uQ;
   }

   @Override
   protected ayy f_() {
      return ayz.uP;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.uS, 0.15F, 1.0F);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.gm() && !this.cd() && !$$0.gh()) {
         if (!this.ai().C) {
            $$0.o(this);
         }

         return bxj.a;
      } else {
         bxj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            dcv $$4 = $$0.b($$1);
            return (bxj)(this.a($$4, bzw.h) ? $$4.a($$0, this, $$1) : bxj.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bzw $$0) {
      return $$0 != bzw.h ? super.e($$0) : this.bO() && !this.g_();
   }

   @Override
   protected boolean f(bzw $$0) {
      return $$0 == bzw.h || super.f($$0);
   }

   @Override
   protected jl<ayy> a(bzw $$0, dcv $$1, dle $$2) {
      return (jl<ayy>)($$0 == bzw.h ? ayz.uR : super.a($$0, $$1, $$2));
   }

   @Override
   public fis b(cam $$0) {
      jh $$1 = this.cT();
      if ($$1.o() == jh.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cxm.a($$1);
         jb $$3 = this.dx();
         jb.a $$4 = new jb.a();
         UnmodifiableIterator var6 = $$0.fV().iterator();

         while (var6.hasNext()) {
            cay $$5 = (cay)var6.next();
            fin $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.ai().j($$4);
               if (cxm.a($$8)) {
                  fis $$9 = fis.a($$4, $$8);
                  if (cxm.a(this.ai(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(aub $$0, cal $$1) {
      if ($$0.an() != bxg.a) {
         csq $$2 = this.a(bzv.bT, bzg.a(this, false, true), $$0x -> {
            if (this.fh().f()) {
               $$0x.a(bzw.a, new dcv(dcz.qb));
            }

            $$0x.gp();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cut $$0, fis $$1) {
      super.a($$0, $$1);
      this.b($$0.dP(), $$0.dR() * 0.5F);
      this.aa = this.br = this.bt = this.dP();
      this.cm.b();
   }

   @Override
   protected fis b(cut $$0, fis $$1) {
      return new fis(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cut $$0) {
      return (float)(this.i(cbs.w) * 0.225 * this.cm.c());
   }

   @Override
   public boolean a() {
      return this.cm.a(this.ec());
   }

   @Nullable
   public cna b(aub $$0, bzc $$1) {
      cna $$2 = bzv.aS.a($$0, bzu.e);
      if ($$2 != null && $$1 instanceof cna $$3) {
         $$2.b(this.ar.h() ? this.n() : $$3.n());
      }

      return $$2;
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aQ);
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.6F * this.cW(), this.ds() * 0.4F);
   }

   private void b(jl<cnb> $$0) {
      this.ay.a(cl, $$0);
   }

   public jl<cnb> n() {
      return this.ay.a(cl);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aH ? c((kp<T>)$$0, this.n()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aH);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aH) {
         this.b(c(kq.aH, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cxc.a(cwz.a($$0, this.dx()), mn.bf).ifPresent(this::b);
      return super.a($$0, $$1, $$2, $$3);
   }
}
