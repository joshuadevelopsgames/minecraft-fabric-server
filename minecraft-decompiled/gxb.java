import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class gxb implements fkr.f, AutoCloseable {
   private static final ame g = ame.b("blur");
   public static final int a = 10;
   private static final Logger h = LogUtils.getLogger();
   public static final float b = 0.05F;
   public static final float c = 100.0F;
   private static final float i = 20.0F;
   private static final float j = 7.0F;
   private final fue k;
   private final bck l = bck.a();
   private float m;
   public final gxf d;
   private final gyb n;
   private final gxw o;
   private float p;
   private float q;
   private float r;
   private float s;
   private float t;
   private float u;
   private boolean v = true;
   private long w;
   private boolean x;
   private long y = ag.c();
   private final gxj z;
   private final hri A = new hri();
   private boolean B;
   protected final gww e = new gww(ame.b("textures/gui/title/background/panorama"));
   protected final gxq f = new gxq(this.e);
   private final fnn C = new fnn(3);
   private final hnm D = new hnm();
   private final gcg E;
   private final gcy F;
   @Nullable
   private ame G;
   private boolean H;
   private final ftm I = new ftm();
   private final fnb J = new fnb();
   private final gxc K = new gxc();
   private final gxr L = new gxr("level");
   private final gwu M = new gwu("3d hud", 0.05F, 100.0F);

   public gxb(fue $$0, gxf $$1, gxw $$2) {
      this.k = $$0;
      this.d = $$1;
      this.z = new gxj(this, $$0);
      this.o = $$2;
      this.F = new gcy();
      gxn.a $$3 = $$2.c();
      this.E = new gcg(this.F, $$3, List.of(new gcl($$3, $$0.ar()), new gco($$3), new gck($$3), new gcj($$3), new gcn($$3), new gcm($$3)));
      this.n = new gyb($$0, $$3);
   }

   @Override
   public void close() {
      this.K.close();
      this.z.close();
      this.A.close();
      this.C.close();
      this.E.close();
      this.L.close();
      this.M.close();
      this.J.close();
      this.e.close();
      this.D.close();
   }

   public void a(boolean $$0) {
      this.v = $$0;
   }

   public void b(boolean $$0) {
      this.B = $$0;
   }

   public boolean b() {
      return this.B;
   }

   public void c() {
      this.G = null;
   }

   public void d() {
      this.H = !this.H;
   }

   public void a(@Nullable bzm $$0) {
      this.G = null;
      if ($$0 instanceof crh) {
         this.a(ame.b("creeper"));
      } else if ($$0 instanceof csg) {
         this.a(ame.b("spider"));
      } else if ($$0 instanceof crl) {
         this.a(ame.b("invert"));
      }
   }

   private void a(ame $$0) {
      this.G = $$0;
      this.H = true;
   }

   public void e() {
      gxs $$0 = this.k.ac().a(g, gxi.h);
      if ($$0 != null) {
         $$0.a(this.k.h(), this.C);
      }
   }

   public void a(axr $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      BiFunction<ame, ShaderType, String> $$2 = ($$1x, $$2x) -> {
         ame $$3 = $$2x.idConverter().a($$1x);

         try {
            String var5;
            try (Reader $$4 = $$0.getResourceOrThrow($$3).e()) {
               var5 = IOUtils.toString($$4);
            }

            return var5;
         } catch (IOException var9) {
            h.error("Coudln't preload {} shader {}: {}", new Object[]{$$2x, $$1x, var9});
            return null;
         }
      };
      $$1.precompilePipeline(gxx.ao, $$2);
      $$1.precompilePipeline(gxx.ar, $$2);
      if (TracyClient.isAvailable()) {
         $$1.precompilePipeline(gxx.aB, $$2);
      }
   }

   public void f() {
      this.r();
      this.z.b();
      gwi $$0 = this.k.t;
      if (this.k.ap() == null) {
         this.k.a($$0);
      }

      this.I.c();
      this.d.a();
      float $$1 = $$0.cT;
      float $$2 = $$0.a(bys.i, 1.0F);
      if (!($$1 > 0.0F) && !($$2 > 0.0F)) {
         this.q = 0.0F;
      } else {
         this.q = ($$1 * 20.0F + $$2 * 7.0F) / ($$1 + $$2);
         this.p = this.p + this.q;
      }

      if (this.k.s.v().i()) {
         this.k.f.a(this.I);
         this.u = this.t;
         if (this.k.m.k().c()) {
            this.t += 0.05F;
            if (this.t > 1.0F) {
               this.t = 1.0F;
            }
         } else if (this.t > 0.0F) {
            this.t -= 0.0125F;
         }

         this.n.a();
      }
   }

   @Nullable
   public ame g() {
      return this.G;
   }

   public void a(int $$0, int $$1) {
      this.C.b();
      this.k.f.a($$0, $$1);
   }

   public void a(float $$0) {
      bzm $$1 = this.k.ap();
      if ($$1 != null) {
         if (this.k.s != null && this.k.t != null) {
            bts.a().a("pick");
            double $$2 = this.k.t.gV();
            double $$3 = this.k.t.gW();
            fiq $$4 = this.a($$1, $$2, $$3, $$0);
            this.k.w = $$4;
            this.k.v = $$4 instanceof fip $$5 ? $$5.a() : null;
            bts.a().c();
         }
      }
   }

   private fiq a(bzm $$0, double $$1, double $$2, float $$3) {
      double $$4 = Math.max($$1, $$2);
      double $$5 = bcb.k($$4);
      fis $$6 = $$0.n($$3);
      fiq $$7 = $$0.a($$4, $$3, false);
      double $$8 = $$7.g().g($$6);
      if ($$7.d() != fiq.a.a) {
         $$5 = $$8;
         $$4 = Math.sqrt($$8);
      }

      fis $$9 = $$0.h($$3);
      fis $$10 = $$6.b($$9.d * $$4, $$9.e * $$4, $$9.f * $$4);
      float $$11 = 1.0F;
      fin $$12 = $$0.cV().b($$9.c($$4)).c(1.0, 1.0, 1.0);
      fip $$13 = cvq.a($$0, $$6, $$10, $$12, bzt.h, $$5);
      return $$13 != null && $$13.g().g($$6) < $$8 ? a($$13, $$6, $$2) : a($$7, $$6, $$1);
   }

   private static fiq a(fiq $$0, fis $$1, double $$2) {
      fis $$3 = $$0.g();
      if (!$$3.a((jv)$$1, $$2)) {
         fis $$4 = $$0.g();
         jh $$5 = jh.a($$4.d - $$1.d, $$4.e - $$1.e, $$4.f - $$1.f);
         return fio.a($$4, $$5, jb.a((jv)$$4));
      } else {
         return $$0;
      }
   }

   private void r() {
      float $$4;
      if (this.k.ap() instanceof gwf $$0) {
         fui $$1 = this.k.n;
         boolean $$2 = $$1.aH().a();
         float $$3 = $$1.ao().c().floatValue();
         $$4 = $$0.a($$2, $$3);
      } else {
         $$4 = 1.0F;
      }

      this.s = this.r;
      this.r = this.r + ($$4 - this.r) * 0.5F;
      this.r = bcb.a(this.r, 0.1F, 1.5F);
   }

   private float a(ftm $$0, float $$1, boolean $$2) {
      if (this.B) {
         return 90.0F;
      } else {
         float $$3 = 70.0F;
         if ($$2) {
            $$3 = this.k.n.al().c().intValue();
            $$3 *= bcb.h($$1, this.s, this.r);
         }

         if ($$0.i() instanceof cam $$4 && $$4.eM()) {
            float $$5 = Math.min($$4.bl + $$1, 20.0F);
            $$3 /= (1.0F - 500.0F / ($$5 + 500.0F)) * 2.0F + 1.0F;
         }

         fan $$6 = $$0.m();
         if ($$6 == fan.a || $$6 == fan.b) {
            float $$7 = this.k.n.ao().c().floatValue();
            $$3 *= bcb.h($$7, 1.0F, 0.85714287F);
         }

         return $$3;
      }
   }

   private void a(fod $$0, float $$1) {
      if (this.k.ap() instanceof cam $$2) {
         float $$3 = $$2.bj - $$1;
         if ($$2.eM()) {
            float $$4 = Math.min($$2.bl + $$1, 20.0F);
            $$0.a(a.f.rotationDegrees(40.0F - 8000.0F / ($$4 + 200.0F)));
         }

         if ($$3 < 0.0F) {
            return;
         }

         $$3 /= $$2.bk;
         $$3 = bcb.a($$3 * $$3 * $$3 * $$3 * (float) Math.PI);
         float $$5 = $$2.eR();
         $$0.a(a.d.rotationDegrees(-$$5));
         float $$6 = (float)(-$$3 * 14.0 * this.k.n.as().c());
         $$0.a(a.f.rotationDegrees($$6));
         $$0.a(a.d.rotationDegrees($$5));
      }
   }

   private void b(fod $$0, float $$1) {
      if (this.k.ap() instanceof gwf $$2) {
         float var7 = $$2.g - $$2.f;
         float $$5 = -($$2.g + var7 * $$1);
         float $$6 = bcb.h($$1, $$2.cr, $$2.cs);
         $$0.a(bcb.a($$5 * (float) Math.PI) * $$6 * 0.5F, -Math.abs(bcb.b($$5 * (float) Math.PI) * $$6), 0.0F);
         $$0.a(a.f.rotationDegrees(bcb.a($$5 * (float) Math.PI) * $$6 * 3.0F));
         $$0.a(a.b.rotationDegrees(Math.abs(bcb.b($$5 * (float) Math.PI - 0.2F) * $$6) * 5.0F));
      }
   }

   private void a(float $$0, boolean $$1, Matrix4f $$2) {
      if (!this.B) {
         fod $$3 = new fod();
         $$3.a();
         $$3.a($$2.invert(new Matrix4f()));
         Matrix4fStack $$4 = RenderSystem.getModelViewStack();
         $$4.pushMatrix().mul($$2);
         this.a($$3, $$0);
         if (this.k.n.af().c()) {
            this.b($$3, $$0);
         }

         if (this.k.n.aH().a() && !$$1 && !this.k.n.Y && this.k.r.i() != dmr.d) {
            this.z.d();
            this.d.a($$0, $$3, this.o.c(), this.k.t, this.k.ar().a(this.k.t, $$0));
            this.z.c();
         }

         $$4.popMatrix();
         $$3.b();
      }
   }

   public Matrix4f b(float $$0) {
      Matrix4f $$1 = new Matrix4f();
      return $$1.perspective($$0 * (float) (Math.PI / 180.0), (float)this.k.aP().k() / this.k.aP().l(), 0.05F, this.h());
   }

   public float h() {
      return Math.max(this.m * 4.0F, (float)(this.k.n.k().c() * 16));
   }

   public static float a(cam $$0, float $$1) {
      byq $$2 = $$0.e(bys.p);
      return !$$2.a(200) ? 1.0F : 0.7F + bcb.a(($$2.d() - $$1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void a(ftu $$0, boolean $$1) {
      if (!this.k.aD() && this.k.n.n && (!this.k.n.ad().c() || !this.k.o.d())) {
         if (ag.c() - this.y > 500L) {
            this.k.b(false);
         }
      } else {
         this.y = ag.c();
      }

      if (!this.k.y) {
         this.K.a(this.k.aP().k(), this.k.aP().l(), this.k.n.ar().c(), this.k.s == null ? 0L : this.k.s.ae(), $$0, this.k.n.s());
         btt $$2 = bts.a();
         boolean $$3 = this.k.c();
         int $$4 = (int)this.k.o.a(this.k.aP());
         int $$5 = (int)this.k.o.b(this.k.aP());
         if ($$3 && $$1 && this.k.s != null) {
            $$2.a("world");
            this.a($$0);
            this.s();
            this.k.f.b();
            if (this.G != null && this.H) {
               RenderSystem.resetTextureMatrix();
               gxs $$6 = this.k.ac().a(this.G, gxi.h);
               if ($$6 != null) {
                  $$6.a(this.k.h(), this.C);
               }
            }
         }

         this.D.a();
         fmr $$7 = this.k.h();
         RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$7.e(), 1.0);
         this.k.j.p().a(fnb.a.c);
         this.F.f();
         fxb $$8 = new fxb(this.k, this.F);
         if ($$3 && $$1 && this.k.s != null) {
            $$2.b("gui");
            this.k.m.a($$8, $$0);
            $$2.c();
         }

         if (this.k.aN() != null) {
            try {
               this.k.aN().a($$8, $$4, $$5, $$0.a());
            } catch (Throwable var15) {
               p $$10 = p.a(var15, "Rendering overlay");
               q $$11 = $$10.a("Overlay render details");
               $$11.a("Overlay name", () -> this.k.aN().getClass().getCanonicalName());
               throw new aa($$10);
            }
         } else if ($$3 && this.k.z != null) {
            try {
               this.k.z.c($$8, $$4, $$5, $$0.a());
            } catch (Throwable var14) {
               p $$13 = p.a(var14, "Rendering screen");
               q $$14 = $$13.a("Screen render details");
               $$14.a("Screen name", () -> this.k.z.getClass().getCanonicalName());
               this.k.o.a($$14, this.k.aP());
               throw new aa($$13);
            }

            try {
               if (this.k.z != null) {
                  this.k.z.z();
               }
            } catch (Throwable var13) {
               p $$16 = p.a(var13, "Narrating screen");
               q $$17 = $$16.a("Screen details");
               $$17.a("Screen name", () -> this.k.z.getClass().getCanonicalName());
               throw new aa($$16);
            }
         }

         if ($$3 && $$1 && this.k.s != null) {
            this.k.m.b($$8, $$0);
         }

         if ($$3) {
            try (bty $$18 = $$2.d("toasts")) {
               this.k.aB().a($$8);
            }
         }

         this.E.a(this.D.a(hnm.a.a));
         this.E.a();
         this.C.a();
      }
   }

   private void s() {
      if (!this.x && this.k.U()) {
         long $$0 = ag.c();
         if ($$0 - this.w >= 1000L) {
            this.w = $$0;
            hwf $$1 = this.k.W();
            if ($$1 != null && !$$1.af()) {
               $$1.C().ifPresent($$0x -> {
                  if (Files.isRegularFile($$0x)) {
                     this.x = true;
                  } else {
                     this.a($$0x);
                  }
               });
            }
         }
      }
   }

   private void a(Path $$0) {
      if (this.k.f.i() > 10 && this.k.f.o()) {
         fum.a(this.k.h(), $$1 -> ag.i().execute(() -> {
            int $$2 = $$1.a();
            int $$3 = $$1.b();
            int $$4 = 0;
            int $$5 = 0;
            if ($$2 > $$3) {
               $$4 = ($$2 - $$3) / 2;
               $$2 = $$3;
            } else {
               $$5 = ($$3 - $$2) / 2;
               $$3 = $$2;
            }

            try (fnf $$6 = new fnf(64, 64, false)) {
               $$1.a($$4, $$5, $$2, $$3, $$6);
               $$6.a($$0);
            } catch (IOException var16) {
               h.warn("Couldn't save auto screenshot", var16);
            } finally {
               $$1.close();
            }
         }));
      }
   }

   private boolean t() {
      if (!this.v) {
         return false;
      } else {
         bzm $$0 = this.k.ap();
         boolean $$1 = $$0 instanceof cut && !this.k.n.Y;
         if ($$1 && !((cut)$$0).gt().e) {
            dcv $$2 = ((cam)$$0).fh();
            fiq $$3 = this.k.w;
            if ($$3 != null && $$3.d() == fiq.a.b) {
               jb $$4 = ((fio)$$3).b();
               eeb $$5 = this.k.s.a_($$4);
               if (this.k.r.i() == dmr.d) {
                  $$1 = $$5.b(this.k.s, $$4) != null;
               } else {
                  eef $$6 = new eef(this.k.s, $$4, false);
                  jy<dpz> $$7 = this.k.s.K_().f(mn.i);
                  $$1 = !$$2.f() && ($$2.b($$6) || $$2.a($$6));
               }
            }
         }

         return $$1;
      }
   }

   public void a(ftu $$0) {
      float $$1 = $$0.a(true);
      gwi $$2 = this.k.t;
      this.z.a($$1);
      if (this.k.ap() == null) {
         this.k.a($$2);
      }

      this.a($$1);
      btt $$3 = bts.a();
      $$3.a("center");
      boolean $$4 = this.t();
      $$3.b("camera");
      ftm $$5 = this.I;
      bzm $$6 = (bzm)(this.k.ap() == null ? $$2 : this.k.ap());
      float $$7 = this.k.s.v().a($$6) ? 1.0F : $$1;
      $$5.a(this.k.s, $$6, !this.k.n.aH().a(), this.k.n.aH().b(), $$7);
      this.m = this.k.n.aK() * 16;
      float $$8 = this.a($$5, $$1, true);
      Matrix4f $$9 = this.b($$8);
      fod $$10 = new fod();
      this.a($$10, $$5.r());
      if (this.k.n.af().c()) {
         this.b($$10, $$5.r());
      }

      $$9.mul($$10.c().a());
      float $$11 = this.k.n.an().c().floatValue();
      float $$12 = bcb.h($$1, $$2.cU, $$2.cT);
      float $$13 = $$2.a(bys.i, $$1);
      float $$14 = Math.max($$12, $$13) * ($$11 * $$11);
      if ($$14 > 0.0F) {
         float $$15 = 5.0F / ($$14 * $$14 + 5.0F) - $$14 * 0.04F;
         $$15 *= $$15;
         Vector3f $$16 = new Vector3f(0.0F, bcb.g / 2.0F, bcb.g / 2.0F);
         float $$17 = (this.p + $$1 * this.q) * (float) (Math.PI / 180.0);
         $$9.rotate($$17, $$16);
         $$9.scale(1.0F / $$15, 1.0F, 1.0F);
         $$9.rotate(-$$17, $$16);
      }

      float $$18 = Math.max($$8, (float)this.k.n.al().c().intValue());
      Matrix4f $$19 = this.b($$18);
      RenderSystem.setProjectionMatrix(this.L.a($$9), fle.a);
      Quaternionf $$20 = $$5.h().conjugate(new Quaternionf());
      Matrix4f $$21 = new Matrix4f().rotation($$20);
      this.k.f.a($$5.d(), $$21, $$19);
      $$3.b("fog");
      boolean $$22 = this.k.s.d().a($$5.e().u(), $$5.e().w()) || this.k.m.k().d();
      Vector4f $$23 = this.D.a($$5, this.k.n.aK(), $$22, $$0, this.c($$1), this.k.s);
      GpuBufferSlice $$24 = this.D.a(hnm.a.b);
      $$3.b("level");
      this.k.f.a(this.C, $$0, $$4, $$5, $$21, $$9, $$24, $$23, !$$22);
      $$3.b("hand");
      boolean $$25 = this.k.ap() instanceof cam && ((cam)this.k.ap()).fY();
      RenderSystem.setProjectionMatrix(this.M.a(this.k.aP().k(), this.k.aP().l(), this.a($$5, $$1, false)), fle.a);
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.k.h().e(), 1.0);
      this.a($$1, $$25, $$21);
      $$3.b("screen effects");
      gxn.a $$26 = this.o.c();
      this.n.a($$25, $$1);
      $$26.b();
      $$3.c();
      RenderSystem.setShaderFog(this.D.a(hnm.a.a));
      if (this.k.m.b()) {
         this.k.aR().a($$5);
      }
   }

   public void i() {
      this.n.b();
      this.k.aH().a();
      this.I.q();
      this.x = false;
   }

   public void a(dcv $$0) {
      this.n.a($$0, this.l);
   }

   public fue j() {
      return this.k;
   }

   public float c(float $$0) {
      return bcb.h($$0, this.u, this.t);
   }

   public float k() {
      return this.m;
   }

   public ftm l() {
      return this.I;
   }

   public gxj m() {
      return this.z;
   }

   public hri n() {
      return this.A;
   }

   @Override
   public fis a(fis $$0) {
      Matrix4f $$1 = this.b(this.a(this.I, 0.0F, true));
      Quaternionf $$2 = this.I.h().conjugate(new Quaternionf());
      Matrix4f $$3 = new Matrix4f().rotation($$2);
      Matrix4f $$4 = $$1.mul($$3);
      fis $$5 = this.I.d();
      fis $$6 = $$0.d($$5);
      Vector3f $$7 = $$4.transformProject($$6.l());
      return new fis($$7);
   }

   @Override
   public double a() {
      float $$0 = this.I.f();
      if ($$0 <= -90.0F) {
         return Double.NEGATIVE_INFINITY;
      } else if ($$0 >= 90.0F) {
         return Double.POSITIVE_INFINITY;
      } else {
         float $$1 = this.a(this.I, 0.0F, true);
         return Math.tan($$0 * (float) (Math.PI / 180.0)) / Math.tan($$1 / 2.0F * (float) (Math.PI / 180.0));
      }
   }

   public gxc o() {
      return this.K;
   }

   public fnb p() {
      return this.J;
   }

   public void a(@Nullable grk $$0) {
      if ($$0 != null) {
         this.J.a($$0.d().c());
      }
   }

   public gxq q() {
      return this.f;
   }
}
