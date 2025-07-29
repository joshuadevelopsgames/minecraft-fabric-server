import javax.annotation.Nullable;

public class hjn extends hfg<gwf, hmc, gop> {
   public hjn(hee.a $$0, boolean $$1) {
      super($$0, new gop($$0.a($$1 ? gqm.cE : gqm.cy), $$1), 0.5F);
      this.a(new hii<>(this, new gnw($$0.a($$1 ? gqm.cF : gqm.cC)), new gnw($$0.a($$1 ? gqm.cG : gqm.cD)), $$0.h()));
      this.a(new his<>(this));
      this.a(new hhp<>(this, $$0));
      this.a(new hhz(this, $$0.f()));
      this.a(new hht(this, $$0.f(), $$0.g()));
      this.a(new hhy<>(this, $$0.f()));
      this.a(new hjg<>(this, $$0.f(), $$0.h()));
      this.a(new hiq(this, $$0.f()));
      this.a(new hjc(this, $$0.f()));
      this.a(new hhq<>(this, $$0));
   }

   protected boolean a(hmc $$0) {
      return !$$0.m;
   }

   public fis b(hmc $$0) {
      fis $$1 = super.a($$0);
      return $$0.Q ? $$1.b(0.0, $$0.ai * -2.0F / 16.0, 0.0) : $$1;
   }

   private static gnx.a a(gwf $$0, cad $$1) {
      dcv $$2 = $$0.b(bxi.a);
      dcv $$3 = $$0.b(bxi.b);
      gnx.a $$4 = a($$0, $$2, bxi.a);
      gnx.a $$5 = a($$0, $$3, bxi.b);
      if ($$4.a()) {
         $$5 = $$3.f() ? gnx.a.a : gnx.a.b;
      }

      return $$0.fF() == $$1 ? $$4 : $$5;
   }

   private static gnx.a a(cut $$0, dcv $$1, bxi $$2) {
      if ($$1.f()) {
         return gnx.a.a;
      } else if (!$$0.be && $$1.a(dcz.xA) && dbo.g($$1)) {
         return gnx.a.g;
      } else {
         if ($$0.fH() == $$2 && $$0.fJ() > 0) {
            dcx $$3 = $$1.w();
            if ($$3 == dcx.d) {
               return gnx.a.c;
            }

            if ($$3 == dcx.e) {
               return gnx.a.d;
            }

            if ($$3 == dcx.f) {
               return gnx.a.e;
            }

            if ($$3 == dcx.g) {
               return gnx.a.f;
            }

            if ($$3 == dcx.h) {
               return gnx.a.h;
            }

            if ($$3 == dcx.i) {
               return gnx.a.i;
            }

            if ($$3 == dcx.j) {
               return gnx.a.j;
            }
         }

         return gnx.a.b;
      }
   }

   public ame c(hmc $$0) {
      return $$0.a.a();
   }

   protected void a(hmc $$0, fod $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   protected void a(hmc $$0, xo $$1, fod $$2, gxn $$3, int $$4) {
      $$2.a();
      if ($$0.aG != null) {
         super.a($$0, $$0.aG, $$2, $$3, $$4);
         $$2.a(0.0F, 9.0F * 1.15F * 0.025F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
      $$2.b();
   }

   public hmc b() {
      return new hmc();
   }

   public void a(gwf $$0, hmc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hew.a($$0, $$1, $$2, this.i);
      $$1.h = a($$0, cad.a);
      $$1.f = a($$0, cad.b);
      $$1.a = $$0.c();
      $$1.j = $$0.fc();
      $$1.k = $$0.fd();
      $$1.l = $$0.fJ();
      $$1.aF = $$0.be;
      $$1.m = $$0.am();
      $$1.n = $$0.a(cuv.g);
      $$1.o = $$0.a(cuv.b);
      $$1.p = $$0.a(cuv.e);
      $$1.q = $$0.a(cuv.f);
      $$1.az = $$0.a(cuv.c);
      $$1.aA = $$0.a(cuv.d);
      $$1.aB = $$0.a(cuv.a);
      b($$0, $$1, $$2);
      c($$0, $$1, $$2);
      if ($$1.z < 100.0) {
         fjx $$3 = $$0.gJ();
         fjp $$4 = $$3.a(fjo.c);
         if ($$4 != null) {
            fjt $$5 = $$3.d($$0, $$4);
            xo $$6 = fjt.a($$5, $$4.a(zh.b));
            $$1.aG = xo.i().b($$6).b(xn.w).b($$4.e());
         } else {
            $$1.aG = null;
         }
      } else {
         $$1.aG = null;
      }

      $$1.aH = a($$0, true);
      $$1.aI = a($$0, false);
      $$1.aJ = $$0.ar();
      $$1.aK = $$0.gr().getName();
      $$1.aL.b();
      if ($$1.U) {
         dcv $$7 = $$0.b($$1.P);
         if ($$7.a(dcz.sw)) {
            this.i.a($$1.aL, $$7, dct.f, (cam)$$0);
         }
      }
   }

   private static void b(gwf $$0, hmc $$1, float $$2) {
      $$1.aC = $$0.fR() + $$2;
      fis $$3 = $$0.h($$2);
      fis $$4 = $$0.H($$2);
      if ($$4.j() > 1.0E-5F && $$3.j() > 1.0E-5F) {
         $$1.aD = true;
         double $$5 = $$4.f().d().b($$3.f().d());
         double $$6 = $$4.d * $$3.f - $$4.f * $$3.d;
         $$1.aE = (float)(Math.signum($$6) * Math.acos(Math.min(1.0, Math.abs($$5))));
      } else {
         $$1.aD = false;
         $$1.aE = 0.0F;
      }
   }

   private static void c(gwf $$0, hmc $$1, float $$2) {
      double $$3 = bcb.d((double)$$2, $$0.cu, $$0.cx) - bcb.d((double)$$2, $$0.X, $$0.dC());
      double $$4 = bcb.d((double)$$2, $$0.cv, $$0.cy) - bcb.d((double)$$2, $$0.Y, $$0.dE());
      double $$5 = bcb.d((double)$$2, $$0.cw, $$0.cz) - bcb.d((double)$$2, $$0.Z, $$0.dI());
      float $$6 = bcb.i($$2, $$0.bs, $$0.br);
      double $$7 = bcb.a($$6 * (float) (Math.PI / 180.0));
      double $$8 = -bcb.b($$6 * (float) (Math.PI / 180.0));
      $$1.b = (float)$$4 * 10.0F;
      $$1.b = bcb.a($$1.b, -6.0F, 32.0F);
      $$1.c = (float)($$3 * $$7 + $$5 * $$8) * 100.0F;
      $$1.c = $$1.c * (1.0F - $$1.b());
      $$1.c = bcb.a($$1.c, 0.0F, 150.0F);
      $$1.d = (float)($$3 * $$8 - $$5 * $$7) * 100.0F;
      $$1.d = bcb.a($$1.d, -20.0F, 20.0F);
      float $$9 = bcb.h($$2, $$0.cr, $$0.cs);
      float $$10 = bcb.h($$2, $$0.f, $$0.g);
      $$1.b = $$1.b + bcb.a($$10 * 6.0F) * 32.0F * $$9;
   }

   @Nullable
   private static cmz.b a(gwf $$0, boolean $$1) {
      ui $$2 = $$1 ? $$0.gL() : $$0.gM();
      if ($$2.j()) {
         return null;
      } else {
         bzv<?> $$3 = $$2.<bzv<?>>a("id", bzv.a).orElse(null);
         return $$3 == bzv.aQ ? $$2.<cmz.b>a("Variant", cmz.b.h).orElse(cmz.b.a) : null;
      }
   }

   public void a(fod $$0, gxn $$1, int $$2, ame $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.r, $$4);
   }

   public void b(fod $$0, gxn $$1, int $$2, ame $$3, boolean $$4) {
      this.a($$0, $$1, $$2, $$3, this.h.s, $$4);
   }

   private void a(fod $$0, gxn $$1, int $$2, ame $$3, gqn $$4, boolean $$5) {
      gop $$6 = this.c();
      $$4.c();
      $$4.k = true;
      $$6.a.k = $$5;
      $$6.b.k = $$5;
      $$6.s.g = -0.1F;
      $$6.r.g = 0.1F;
      $$4.a($$0, $$1.getBuffer(gxz.j($$3)), $$2, hri.d);
   }

   protected void a(hmc $$0, fod $$1, float $$2, float $$3) {
      float $$4 = $$0.J;
      float $$5 = $$0.ae;
      if ($$0.R) {
         super.a($$0, $$1, $$2, $$3);
         float $$6 = $$0.b();
         if (!$$0.ao) {
            $$1.a(a.b.rotationDegrees($$6 * (-90.0F - $$5)));
         }

         if ($$0.aD) {
            $$1.a(a.d.rotation($$0.aE));
         }
      } else if ($$4 > 0.0F) {
         super.a($$0, $$1, $$2, $$3);
         float $$7 = $$0.an ? -90.0F - $$5 : -90.0F;
         float $$8 = bcb.h($$4, 0.0F, $$7);
         $$1.a(a.b.rotationDegrees($$8));
         if ($$0.S) {
            $$1.a(0.0F, -1.0F, 0.3F);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }
}
