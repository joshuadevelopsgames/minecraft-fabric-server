import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class gxh implements axp, AutoCloseable {
   private static final Logger d = LogUtils.getLogger();
   private static final ame e = ame.b("transparency");
   private static final ame f = ame.b("entity_outline");
   public static final int a = 16;
   public static final int b = 8;
   public static final int c = 32;
   private static final int g = 15;
   private static final Comparator<bzm> h = Comparator.comparing($$0 -> $$0.ap().hashCode());
   private final fue i;
   private final hec j;
   private final hab k;
   private final gxw l;
   private final gyj m = new gyj();
   private final gwv n = new gwv();
   private final gyq o = new gyq();
   private final gyp p = new gyp();
   @Nullable
   private grk q;
   private final gye r = new gye();
   private final ObjectArrayList<hbl.a> s = new ObjectArrayList(10000);
   private final ObjectArrayList<hbl.a> t = new ObjectArrayList(50);
   @Nullable
   private gyn u;
   private int v;
   private final Int2ObjectMap<atb> w = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<atb>> x = new Long2ObjectOpenHashMap();
   @Nullable
   private fmr y;
   private final gxi z = new gxi();
   private int A = Integer.MIN_VALUE;
   private int B = Integer.MIN_VALUE;
   private int C = Integer.MIN_VALUE;
   private double D = Double.MIN_VALUE;
   private double E = Double.MIN_VALUE;
   private double F = Double.MIN_VALUE;
   private double G = Double.MIN_VALUE;
   private double H = Double.MIN_VALUE;
   @Nullable
   private hbl I;
   private int J = -1;
   private final List<bzm> K = new ArrayList<>();
   private int L;
   private hbq M;
   private boolean N;
   @Nullable
   private hbq O;
   @Nullable
   private jb P;
   private int Q;

   public gxh(fue $$0, hec $$1, hab $$2, gxw $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public void a(ftm $$0) {
      this.p.a(this.i.s, $$0, this.v, this.i.n.av().c());
   }

   @Override
   public void close() {
      if (this.y != null) {
         this.y.a();
      }

      this.m.close();
      this.n.close();
   }

   @Override
   public void a(axo $$0) {
      this.a();
   }

   public void a() {
      if (this.y != null) {
         this.y.a();
      }

      this.y = new fms("Entity Outline", this.i.aP().k(), this.i.aP().l(), true);
   }

   @Nullable
   private gxs A() {
      if (!fue.P()) {
         return null;
      } else {
         gxs $$0 = this.i.ac().a(e, gxi.j);
         if ($$0 == null) {
            this.i.n.l().a(ftw.b);
            this.i.n.aC();
         }

         return $$0;
      }
   }

   public void b() {
      if (this.c()) {
         this.y.a(this.i.h().d());
      }
   }

   protected boolean c() {
      return !this.i.j.b() && this.y != null && this.i.t != null;
   }

   public void a(@Nullable grk $$0) {
      this.A = Integer.MIN_VALUE;
      this.B = Integer.MIN_VALUE;
      this.C = Integer.MIN_VALUE;
      this.j.a($$0);
      this.q = $$0;
      if ($$0 != null) {
         this.d();
      } else {
         if (this.u != null) {
            this.u.a();
            this.u = null;
         }

         if (this.I != null) {
            this.I.d();
         }

         this.I = null;
         this.r.a(null);
         this.B();
      }
   }

   private void B() {
      this.s.clear();
      this.t.clear();
   }

   public void d() {
      if (this.q != null) {
         this.q.g();
         if (this.I == null) {
            this.I = new hbl(this.q, this, ag.h(), this.l, this.i.aq(), this.i.as());
         } else {
            this.I.a(this.q);
         }

         this.n.a();
         gxe.a(fue.O());
         this.J = this.i.n.aK();
         if (this.u != null) {
            this.u.a();
         }

         this.I.b();
         this.u = new gyn(this.I, this.q, this.i.n.aK(), this);
         this.r.a(this.u);
         this.B();
         ftm $$0 = this.i.j.l();
         this.u.a(ke.a($$0.d()));
      }
   }

   public void a(int $$0, int $$1) {
      this.p();
      if (this.y != null) {
         this.y.a($$0, $$1);
      }
   }

   public String e() {
      int $$0 = this.u.f.length;
      int $$1 = this.i();
      return String.format(Locale.ROOT, "C: %d/%d %sD: %d, %s", $$1, $$0, this.i.E ? "(s) " : "", this.J, this.I == null ? "null" : this.I.e());
   }

   public hbl f() {
      return this.I;
   }

   public double g() {
      return this.u.f.length;
   }

   public double h() {
      return this.J;
   }

   public int i() {
      int $$0 = 0;
      ObjectListIterator var2 = this.s.iterator();

      while (var2.hasNext()) {
         hbl.a $$1 = (hbl.a)var2.next();
         if ($$1.c().a()) {
            $$0++;
         }
      }

      return $$0;
   }

   public String j() {
      return "E: " + this.L + "/" + this.q.h() + ", SD: " + this.q.n();
   }

   private void a(ftm $$0, hbq $$1, boolean $$2, boolean $$3) {
      fis $$4 = $$0.d();
      if (this.i.n.aK() != this.J) {
         this.d();
      }

      btt $$5 = bts.a();
      $$5.a("camera");
      int $$6 = ke.a($$4.a());
      int $$7 = ke.a($$4.b());
      int $$8 = ke.a($$4.c());
      if (this.A != $$6 || this.B != $$7 || this.C != $$8) {
         this.A = $$6;
         this.B = $$7;
         this.C = $$8;
         this.u.a(ke.a($$4));
         this.o.a();
      }

      this.I.a($$4);
      $$5.b("cull");
      double $$9 = Math.floor($$4.d / 8.0);
      double $$10 = Math.floor($$4.e / 8.0);
      double $$11 = Math.floor($$4.f / 8.0);
      if ($$9 != this.D || $$10 != this.E || $$11 != this.F) {
         this.r.a();
      }

      this.D = $$9;
      this.E = $$10;
      this.F = $$11;
      $$5.b("update");
      if (!$$2) {
         boolean $$12 = this.i.E;
         if ($$3 && this.q.a_($$0.e()).s()) {
            $$12 = false;
         }

         $$5.a("section_occlusion_graph");
         this.r.a($$12, $$0, $$1, this.s, this.q.i().a());
         $$5.c();
         double $$13 = Math.floor($$0.f() / 2.0F);
         double $$14 = Math.floor($$0.g() / 2.0F);
         if (this.r.b() || $$13 != this.G || $$14 != this.H) {
            this.b(a($$1));
            this.G = $$13;
            this.H = $$14;
         }
      }

      $$5.c();
   }

   public static hbq a(hbq $$0) {
      return new hbq($$0).a(8);
   }

   private void b(hbq $$0) {
      if (!fue.R().bx()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         bts.a().a("apply_frustum");
         this.B();
         this.r.a($$0, this.s, this.t);
         bts.a().c();
      }
   }

   public void a(hbl.a $$0) {
      this.r.a($$0);
   }

   public void a(fis $$0, Matrix4f $$1, Matrix4f $$2) {
      this.M = new hbq($$1, $$2);
      this.M.a($$0.a(), $$0.b(), $$0.c());
   }

   public void a(fno $$0, ftu $$1, boolean $$2, ftm $$3, Matrix4f $$4, Matrix4f $$5, GpuBufferSlice $$6, Vector4f $$7, boolean $$8) {
      float $$9 = $$1.a(false);
      this.k.a(this.q, $$3, this.i.w);
      this.j.a(this.q, $$3, this.i.v);
      final btt $$10 = bts.a();
      $$10.a("light_update_queue");
      this.q.c();
      $$10.b("light_updates");
      this.q.i().q().a();
      fis $$11 = $$3.d();
      double $$12 = $$11.a();
      double $$13 = $$11.b();
      double $$14 = $$11.c();
      $$10.b("culling");
      boolean $$15 = this.O != null;
      hbq $$16 = $$15 ? this.O : this.M;
      $$10.b("captureFrustum");
      if (this.N) {
         this.O = $$15 ? new hbq($$4, $$5) : $$16;
         this.O.a($$12, $$13, $$14);
         this.N = false;
      }

      $$10.b("cullEntities");
      boolean $$17 = this.a($$3, $$16, this.K);
      this.L = this.K.size();
      $$10.b("terrain_setup");
      this.a($$3, $$16, $$15, this.i.t.am());
      $$10.b("compile_sections");
      this.c($$3);
      Matrix4fStack $$18 = RenderSystem.getModelViewStack();
      $$18.pushMatrix();
      $$18.mul($$4);
      flv $$19 = new flv();
      this.z.k = $$19.a("main", this.i.h());
      int $$20 = this.i.h().c;
      int $$21 = this.i.h().d;
      fnp $$22 = new fnp($$20, $$21, true, 0);
      gxs $$23 = this.A();
      if ($$23 != null) {
         this.z.l = $$19.a("translucent", $$22);
         this.z.m = $$19.a("item_entity", $$22);
         this.z.n = $$19.a("particles", $$22);
         this.z.o = $$19.a("weather", $$22);
         this.z.p = $$19.a("clouds", $$22);
      }

      if (this.y != null) {
         this.z.q = $$19.a("entity_outline", this.y);
      }

      flw $$24 = $$19.a("clear");
      this.z.k = $$24.b(this.z.k);
      $$24.a(() -> {
         fmr $$1x = this.i.h();
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$1x.c(), baj.a(0.0F, $$7.x, $$7.y, $$7.z), $$1x.e(), 1.0);
      });
      if ($$8) {
         this.b($$19, $$3, $$9, $$6);
      }

      this.a($$19, $$16, $$3, $$4, $$6, $$2, $$17, $$1, $$10);
      gxs $$25 = this.i.ac().a(f, gxi.i);
      if ($$17 && $$25 != null) {
         $$25.a($$19, $$20, $$21, this.z);
      }

      this.a($$19, $$3, $$9, $$6);
      ftq $$26 = this.i.n.aF();
      if ($$26 != ftq.a) {
         Optional<Integer> $$27 = this.q.G_().t();
         if ($$27.isPresent()) {
            float $$28 = this.v + $$9;
            int $$29 = this.q.h($$9);
            this.a($$19, $$26, $$3.d(), $$28, $$29, $$27.get().intValue() + 0.33F);
         }
      }

      this.a($$19, $$3.d(), $$9, $$6);
      if ($$23 != null) {
         $$23.a($$19, $$20, $$21, this.z);
      }

      this.a($$19, $$11, $$6);
      $$10.b("framegraph");
      $$19.a($$0, new flv.c() {
         @Override
         public void c(String $$0) {
            $$10.a($$0);
         }

         @Override
         public void d(String $$0) {
            $$10.c();
         }
      });
      this.K.clear();
      this.z.a();
      $$18.popMatrix();
      $$10.c();
   }

   private void a(flv $$0, hbq $$1, ftm $$2, Matrix4f $$3, GpuBufferSlice $$4, boolean $$5, boolean $$6, ftu $$7, btt $$8) {
      flw $$9 = $$0.a("main");
      this.z.k = $$9.b(this.z.k);
      if (this.z.l != null) {
         this.z.l = $$9.b(this.z.l);
      }

      if (this.z.m != null) {
         this.z.m = $$9.b(this.z.m);
      }

      if (this.z.o != null) {
         this.z.o = $$9.b(this.z.o);
      }

      if ($$6 && this.z.q != null) {
         this.z.q = $$9.b(this.z.q);
      }

      fnr<fmr> $$10 = this.z.k;
      fnr<fmr> $$11 = this.z.l;
      fnr<fmr> $$12 = this.z.m;
      fnr<fmr> $$13 = this.z.q;
      $$9.a(() -> {
         RenderSystem.setShaderFog($$4);
         float $$11x = $$7.a(false);
         fis $$12x = $$2.d();
         double $$13x = $$12x.a();
         double $$14 = $$12x.b();
         double $$15 = $$12x.c();
         $$8.a("terrain");
         hbc $$16 = this.a($$3, $$13x, $$14, $$15);
         $$16.a(hbb.a);
         this.i.j.p().a(fnb.a.a);
         if ($$12 != null) {
            $$12.get().a(this.i.h());
         }

         if (this.c() && $$13 != null) {
            fmr $$17 = $$13.get();
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$17.c(), 0, $$17.e(), 1.0);
         }

         fod $$18 = new fod();
         gxn.a $$19 = this.l.c();
         gxn.a $$20 = this.l.d();
         $$8.b("entities");
         this.K.sort(h);
         this.a($$18, $$19, $$2, $$7, this.K);
         $$19.a();
         this.a($$18);
         $$8.b("blockentities");
         this.a($$18, $$19, $$20, $$2, $$11x);
         $$19.a();
         this.a($$18);
         $$19.a(gxz.d());
         $$19.a(gxz.t());
         $$19.a(gxz.u());
         $$19.a(gyi.h());
         $$19.a(gyi.i());
         $$19.a(gyi.c());
         $$19.a(gyi.d());
         $$19.a(gyi.e());
         $$19.a(gyi.f());
         $$19.a(gyi.g());
         this.l.e().a();
         if ($$5) {
            this.a($$2, $$19, $$18, false);
         }

         $$8.b("debug");
         this.i.l.a($$18, $$1, $$19, $$13x, $$14, $$15);
         $$19.a();
         this.a($$18);
         $$19.a(gyi.j());
         $$19.a(gyi.a());
         $$19.a(gyi.b());
         $$19.a(gxz.j());
         $$19.a(gxz.l());
         $$19.a(gxz.k());
         $$19.a(gxz.m());
         $$8.b("destroyProgress");
         this.a($$18, $$2, $$20);
         $$20.b();
         this.a($$18);
         $$19.a(gxz.i());
         $$19.b();
         if ($$11 != null) {
            $$11.get().a($$10.get());
         }

         $$8.b("translucent");
         $$16.a(hbb.b);
         $$8.b("string");
         $$16.a(hbb.c);
         if ($$5) {
            this.a($$2, $$19, $$18, true);
         }

         $$19.b();
         $$8.c();
      });
   }

   private void a(flv $$0, ftm $$1, float $$2, GpuBufferSlice $$3) {
      flw $$4 = $$0.a("particles");
      if (this.z.n != null) {
         this.z.n = $$4.b(this.z.n);
         $$4.a(this.z.k);
      } else {
         this.z.k = $$4.b(this.z.k);
      }

      fnr<fmr> $$5 = this.z.k;
      fnr<fmr> $$6 = this.z.n;
      $$4.a(() -> {
         RenderSystem.setShaderFog($$3);
         if ($$6 != null) {
            $$6.get().a($$5.get());
         }

         this.i.g.a($$1, $$2, this.l.c());
      });
   }

   private void a(flv $$0, ftq $$1, fis $$2, float $$3, int $$4, float $$5) {
      flw $$6 = $$0.a("clouds");
      if (this.z.p != null) {
         this.z.p = $$6.b(this.z.p);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> this.n.a($$4, $$1, $$5, $$2, $$3));
   }

   private void a(flv $$0, fis $$1, float $$2, GpuBufferSlice $$3) {
      int $$4 = this.i.n.aK() * 16;
      float $$5 = this.i.j.h();
      flw $$6 = $$0.a("weather");
      if (this.z.o != null) {
         this.z.o = $$6.b(this.z.o);
      } else {
         this.z.k = $$6.b(this.z.k);
      }

      $$6.a(() -> {
         RenderSystem.setShaderFog($$3);
         gxn.a $$5x = this.l.c();
         this.p.a(this.i.s, $$5x, this.v, $$2, $$1);
         this.o.a(this.q.F_(), $$1, $$4, $$5);
         $$5x.b();
      });
   }

   private void a(flv $$0, fis $$1, GpuBufferSlice $$2) {
      flw $$3 = $$0.a("late_debug");
      this.z.k = $$3.b(this.z.k);
      if (this.z.m != null) {
         this.z.m = $$3.b(this.z.m);
      }

      fnr<fmr> $$4 = this.z.k;
      $$3.a(() -> {
         RenderSystem.setShaderFog($$2);
         fod $$2x = new fod();
         gxn.a $$3x = this.l.c();
         this.i.l.a($$2x, $$3x, $$1.d, $$1.e, $$1.f);
         $$3x.a();
         this.a($$2x);
      });
   }

   private boolean a(ftm $$0, hbq $$1, List<bzm> $$2) {
      fis $$3 = $$0.d();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      boolean $$7 = false;
      boolean $$8 = this.c();
      bzm.b(bcb.a(this.i.n.aK() / 8.0, 1.0, 2.5) * this.i.n.g().c());

      for (bzm $$9 : this.q.e()) {
         if (this.j.a($$9, $$1, $$4, $$5, $$6) || $$9.B(this.i.t)) {
            jb $$10 = $$9.dx();
            if ((this.q.e($$10.v()) || this.a($$10))
               && ($$9 != $$0.i() || $$0.k() || $$0.i() instanceof cam && ((cam)$$0.i()).fY())
               && (!($$9 instanceof gwi) || $$0.i() == $$9)) {
               $$2.add($$9);
               if ($$8 && this.i.b($$9)) {
                  $$7 = true;
               }
            }
         }
      }

      return $$7;
   }

   private void a(fod $$0, gxn.a $$1, ftm $$2, ftu $$3, List<bzm> $$4) {
      fis $$5 = $$2.d();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      bxt $$9 = this.i.s.v();
      boolean $$10 = this.c();

      for (bzm $$11 : $$4) {
         if ($$11.as == 0) {
            $$11.an = $$11.dC();
            $$11.ao = $$11.dE();
            $$11.ap = $$11.dI();
         }

         gxn $$13;
         if ($$10 && this.i.b($$11)) {
            gxp $$12 = this.l.e();
            $$13 = $$12;
            int $$14 = $$11.m_();
            $$12.a(baj.b($$14), baj.c($$14), baj.d($$14), 255);
         } else {
            $$13 = $$1;
         }

         float $$16 = $$3.a(!$$9.a($$11));
         this.a($$11, $$6, $$7, $$8, $$16, $$0, $$13);
      }
   }

   private void a(fod $$0, gxn.a $$1, gxn.a $$2, ftm $$3, float $$4) {
      fis $$5 = $$3.d();
      double $$6 = $$5.a();
      double $$7 = $$5.b();
      double $$8 = $$5.c();
      ObjectListIterator $$18 = this.s.iterator();

      while ($$18.hasNext()) {
         hbl.a $$9 = (hbl.a)$$18.next();
         List<eaz> $$10 = $$9.c().b();
         if (!$$10.isEmpty()) {
            for (eaz $$11 : $$10) {
               jb $$12 = $$11.aA_();
               gxn $$13 = $$1;
               $$0.a();
               $$0.a($$12.u() - $$6, $$12.v() - $$7, $$12.w() - $$8);
               SortedSet<atb> $$14 = (SortedSet<atb>)this.x.get($$12.a());
               if ($$14 != null && !$$14.isEmpty()) {
                  int $$15 = $$14.last().c();
                  if ($$15 >= 0) {
                     fod.a $$16 = $$0.c();
                     fog $$17 = new foe($$2.getBuffer(hud.l.get($$15)), $$16, 1.0F);
                     $$13 = $$2x -> {
                        fog $$3x = $$1.getBuffer($$2x);
                        return $$2x.J() ? foh.a($$17, $$3x) : $$3x;
                     };
                  }
               }

               this.k.a($$11, $$4, $$0, $$13);
               $$0.b();
            }
         }
      }

      Iterator<eaz> $$18x = this.q.a().iterator();

      while ($$18x.hasNext()) {
         eaz $$19 = $$18x.next();
         if ($$19.n()) {
            $$18x.remove();
         } else {
            jb $$20 = $$19.aA_();
            $$0.a();
            $$0.a($$20.u() - $$6, $$20.v() - $$7, $$20.w() - $$8);
            this.k.a($$19, $$4, $$0, $$1);
            $$0.b();
         }
      }
   }

   private void a(fod $$0, ftm $$1, gxn.a $$2) {
      fis $$3 = $$1.d();
      double $$4 = $$3.a();
      double $$5 = $$3.b();
      double $$6 = $$3.c();
      ObjectIterator var11 = this.x.long2ObjectEntrySet().iterator();

      while (var11.hasNext()) {
         Entry<SortedSet<atb>> $$7 = (Entry<SortedSet<atb>>)var11.next();
         jb $$8 = jb.d($$7.getLongKey());
         if (!($$8.c($$4, $$5, $$6) > 1024.0)) {
            SortedSet<atb> $$9 = (SortedSet<atb>)$$7.getValue();
            if ($$9 != null && !$$9.isEmpty()) {
               int $$10 = $$9.last().c();
               $$0.a();
               $$0.a($$8.u() - $$4, $$8.v() - $$5, $$8.w() - $$6);
               fod.a $$11 = $$0.c();
               fog $$12 = new foe($$2.getBuffer(hud.l.get($$10)), $$11, 1.0F);
               this.i.aq().a(this.q.a_($$8), $$8, this.q, $$0, $$12);
               $$0.b();
            }
         }
      }
   }

   private void a(ftm $$0, gxn.a $$1, fod $$2, boolean $$3) {
      if (this.i.w instanceof fio $$4) {
         if ($$4.d() != fiq.a.a) {
            jb $$6 = $$4.b();
            eeb $$7 = this.q.a_($$6);
            if (!$$7.l() && this.q.F_().a($$6)) {
               boolean $$8 = gxe.a($$7).d();
               if ($$8 != $$3) {
                  return;
               }

               fis $$9 = $$0.d();
               Boolean $$10 = this.i.n.w().c();
               if ($$10) {
                  fog $$11 = $$1.getBuffer(gxz.w());
                  this.a($$2, $$11, $$0.i(), $$9.d, $$9.e, $$9.f, $$6, $$7, -16777216);
               }

               fog $$12 = $$1.getBuffer(gxz.v());
               int $$13 = $$10 ? -11010079 : baj.c(102, -16777216);
               this.a($$2, $$12, $$0.i(), $$9.d, $$9.e, $$9.f, $$6, $$7, $$13);
               $$1.a();
            }
         }
      }
   }

   private void a(fod $$0) {
      if (!$$0.d()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void a(bzm $$0, double $$1, double $$2, double $$3, float $$4, fod $$5, gxn $$6) {
      double $$7 = bcb.d((double)$$4, $$0.an, $$0.dC());
      double $$8 = bcb.d((double)$$4, $$0.ao, $$0.dE());
      double $$9 = bcb.d((double)$$4, $$0.ap, $$0.dI());
      this.j.a($$0, $$7 - $$1, $$8 - $$2, $$9 - $$3, $$4, $$5, $$6, this.j.a($$0, $$4));
   }

   private void a(fis $$0) {
      if (!this.s.isEmpty()) {
         jb $$1 = jb.a((jv)$$0);
         boolean $$2 = !$$1.equals(this.P);
         bts.a().a("translucent_sort");
         hbm $$3 = new hbm();
         ObjectListIterator $$5 = this.t.iterator();

         while ($$5.hasNext()) {
            hbl.a $$4 = (hbl.a)$$5.next();
            this.a($$4, $$3, $$0, $$2, true);
         }

         this.Q = this.Q % this.s.size();
         int $$5x = Math.max(this.s.size() / 8, 15);

         while ($$5x-- > 0) {
            int $$6 = this.Q++ % this.s.size();
            this.a((hbl.a)this.s.get($$6), $$3, $$0, $$2, false);
         }

         this.P = $$1;
         bts.a().c();
      }
   }

   private void a(hbl.a $$0, hbm $$1, fis $$2, boolean $$3, boolean $$4) {
      $$1.b($$2, $$0.f());
      boolean $$5 = $$0.c().b($$1);
      boolean $$6 = $$3 && ($$1.a() || $$4);
      if (($$6 || $$5) && !$$0.k() && $$0.j()) {
         $$0.a(this.I);
      }
   }

   private hbc a(Matrix4fc $$0, double $$1, double $$2, double $$3) {
      ObjectListIterator<hbl.a> $$4 = this.s.listIterator(0);
      EnumMap<hba, List<RenderPass.a<GpuBufferSlice[]>>> $$5 = new EnumMap<>(hba.class);
      int $$6 = 0;

      for (hba $$7 : hba.values()) {
         $$5.put($$7, new ArrayList<>());
      }

      List<gwz.a> $$8 = new ArrayList<>();
      Vector4f $$9 = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
      Matrix4f $$10 = new Matrix4f();

      while ($$4.hasNext()) {
         hbl.a $$11 = (hbl.a)$$4.next();
         hbk $$12 = $$11.c();

         for (hba $$13 : hba.values()) {
            hbh $$14 = $$12.b($$13);
            if ($$14 != null) {
               GpuBuffer $$15;
               VertexFormat.a $$16;
               if ($$14.b() == null) {
                  if ($$14.c() > $$6) {
                     $$6 = $$14.c();
                  }

                  $$15 = null;
                  $$16 = null;
               } else {
                  $$15 = $$14.b();
                  $$16 = $$14.d();
               }

               jb $$19 = $$11.e();
               int $$20 = $$8.size();
               $$8.add(new gwz.a($$0, $$9, new Vector3f((float)($$19.u() - $$1), (float)($$19.v() - $$2), (float)($$19.w() - $$3)), $$10, 1.0F));
               $$5.get($$13).add(new RenderPass.a<>(0, $$14.a(), $$15, $$16, 0, $$14.c(), ($$1x, $$2x) -> $$2x.upload("DynamicTransforms", $$1x[$$20])));
            }
         }
      }

      GpuBufferSlice[] $$21 = RenderSystem.getDynamicUniforms().a($$8.toArray(new gwz.a[0]));
      return new hbc($$5, $$6, $$21);
   }

   public void k() {
      this.n.b();
   }

   public void l() {
      this.N = true;
   }

   public void m() {
      this.O = null;
   }

   public void n() {
      if (this.q.v().i()) {
         this.v++;
      }

      if (this.v % 20 == 0) {
         Iterator<atb> $$0 = this.w.values().iterator();

         while ($$0.hasNext()) {
            atb $$1 = $$0.next();
            int $$2 = $$1.d();
            if (this.v - $$2 > 400) {
               $$0.remove();
               this.a($$1);
            }
         }
      }
   }

   private void a(atb $$0) {
      long $$1 = $$0.b().a();
      Set<atb> $$2 = (Set<atb>)this.x.get($$1);
      $$2.remove($$0);
      if ($$2.isEmpty()) {
         this.x.remove($$1);
      }
   }

   private void b(flv $$0, ftm $$1, float $$2, GpuBufferSlice $$3) {
      fan $$4 = $$1.m();
      if ($$4 != fan.c && $$4 != fan.a && !this.b($$1)) {
         gwx $$5 = this.q.d();
         gwx.d $$6 = $$5.a();
         if ($$6 != gwx.d.a) {
            flw $$7 = $$0.a("sky");
            this.z.k = $$7.b(this.z.k);
            $$7.a(() -> {
               RenderSystem.setShaderFog($$3);
               if ($$6 == gwx.d.c) {
                  this.m.b();
               } else {
                  fod $$4x = new fod();
                  float $$5x = this.q.a($$2);
                  float $$6x = this.q.f($$2);
                  float $$7x = 1.0F - this.q.d($$2);
                  float $$8 = this.q.i($$2) * $$7x;
                  int $$9 = $$5.b($$6x);
                  int $$10 = this.q.at();
                  int $$11 = this.q.a(this.i.j.l().d(), $$2);
                  float $$12 = baj.j($$11);
                  float $$13 = baj.k($$11);
                  float $$14 = baj.l($$11);
                  this.m.a($$12, $$13, $$14);
                  gxn.a $$15 = this.l.c();
                  if ($$5.a($$6x)) {
                     this.m.a($$4x, $$15, $$5x, $$9);
                  }

                  this.m.a($$4x, $$15, $$6x, $$10, $$7x, $$8);
                  $$15.b();
                  if (this.a($$2)) {
                     this.m.a();
                  }
               }
            });
         }
      }
   }

   private boolean a(float $$0) {
      return this.i.t.n($$0).e - this.q.l().a(this.q) < 0.0;
   }

   private boolean b(ftm $$0) {
      return !($$0.i() instanceof cam $$1) ? false : $$1.d(bys.o) || $$1.d(bys.G);
   }

   private void c(ftm $$0) {
      btt $$1 = bts.a();
      $$1.a("populate_sections_to_compile");
      hbf $$2 = new hbf();
      jb $$3 = $$0.e();
      List<hbl.a> $$4 = Lists.newArrayList();
      ObjectListIterator var6 = this.s.iterator();

      while (var6.hasNext()) {
         hbl.a $$5 = (hbl.a)var6.next();
         if ($$5.h() && ($$5.c() != hbe.a || $$5.a())) {
            boolean $$6 = false;
            if (this.i.n.n().c() == fuk.c) {
               jb $$7 = ke.a($$5.f()).k();
               $$6 = $$7.j($$3) < 768.0 || $$5.i();
            } else if (this.i.n.n().c() == fuk.b) {
               $$6 = $$5.i();
            }

            if ($$6) {
               $$1.a("build_near_sync");
               this.I.a($$5, $$2);
               $$5.g();
               $$1.c();
            } else {
               $$4.add($$5);
            }
         }
      }

      $$1.b("upload");
      this.I.a();
      $$1.b("schedule_async_compile");

      for (hbl.a $$8 : $$4) {
         $$8.b($$2);
         $$8.g();
      }

      $$1.c();
      this.a($$0.d());
   }

   private void a(fod $$0, fog $$1, bzm $$2, double $$3, double $$4, double $$5, jb $$6, eeb $$7, int $$8) {
      gyh.a($$0, $$1, $$7.a(this.q, $$6, fix.a($$2)), $$6.u() - $$3, $$6.v() - $$4, $$6.w() - $$5, $$8);
   }

   public void a(dly $$0, jb $$1, eeb $$2, eeb $$3, int $$4) {
      this.a($$1, ($$4 & 8) != 0);
   }

   private void a(jb $$0, boolean $$1) {
      for (int $$2 = $$0.w() - 1; $$2 <= $$0.w() + 1; $$2++) {
         for (int $$3 = $$0.u() - 1; $$3 <= $$0.u() + 1; $$3++) {
            for (int $$4 = $$0.v() - 1; $$4 <= $$0.v() + 1; $$4++) {
               this.a(ke.a($$3), ke.a($$4), ke.a($$2), $$1);
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2 - 1; $$6 <= $$5 + 1; $$6++) {
         for (int $$7 = $$0 - 1; $$7 <= $$3 + 1; $$7++) {
            for (int $$8 = $$1 - 1; $$8 <= $$4 + 1; $$8++) {
               this.b(ke.a($$7), ke.a($$8), ke.a($$6));
            }
         }
      }
   }

   public void a(jb $$0, eeb $$1, eeb $$2) {
      if (this.i.aF().a($$1, $$2)) {
         this.a($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b($$0 - 1, $$1 - 1, $$2 - 1, $$0 + 1, $$1 + 1, $$2 + 1);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$2; $$6 <= $$5; $$6++) {
         for (int $$7 = $$0; $$7 <= $$3; $$7++) {
            for (int $$8 = $$1; $$8 <= $$4; $$8++) {
               this.b($$7, $$8, $$6);
            }
         }
      }
   }

   public void b(int $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, false);
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.u.a($$0, $$1, $$2, $$3);
   }

   public void a(long $$0) {
      hbl.a $$1 = this.u.a($$0);
      if ($$1 != null) {
         this.r.a($$1);
      }
   }

   public void a(mc $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.a($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(mc $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      try {
         this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      } catch (Throwable var19) {
         p $$10 = p.a(var19, "Exception while adding particle");
         q $$11 = $$10.a("Particle being added");
         $$11.a("ID", mm.i.b($$0.a()));
         $$11.a("Parameters", () -> me.bk.encodeStart(this.q.K_().a(uw.a), $$0).toString());
         $$11.a("Position", () -> q.a(this.q, $$3, $$4, $$5));
         throw new aa($$10);
      }
   }

   public <T extends mc> void a(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Nullable
   gut b(mc $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return this.b($$0, $$1, false, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   private gut b(mc $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      ftm $$9 = this.i.j.l();
      att $$10 = this.a($$2);
      if ($$1) {
         return this.i.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      } else if ($$9.d().c($$3, $$4, $$5) > 1024.0) {
         return null;
      } else {
         return $$10 == att.c ? null : this.i.g.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
      }
   }

   private att a(boolean $$0) {
      att $$1 = this.i.n.av().c();
      if ($$0 && $$1 == att.c && this.q.A.a(10) == 0) {
         $$1 = att.b;
      }

      if ($$1 == att.b && this.q.A.a(3) == 0) {
         $$1 = att.c;
      }

      return $$1;
   }

   public void a(int $$0, jb $$1, int $$2) {
      if ($$2 >= 0 && $$2 < 10) {
         atb $$4 = (atb)this.w.get($$0);
         if ($$4 != null) {
            this.a($$4);
         }

         if ($$4 == null || $$4.b().u() != $$1.u() || $$4.b().v() != $$1.v() || $$4.b().w() != $$1.w()) {
            $$4 = new atb($$0, $$1);
            this.w.put($$0, $$4);
         }

         $$4.a($$2);
         $$4.b(this.v);
         ((SortedSet)this.x.computeIfAbsent($$4.b().a(), $$0x -> Sets.newTreeSet())).add($$4);
      } else {
         atb $$3 = (atb)this.w.remove($$0);
         if ($$3 != null) {
            this.a($$3);
         }
      }
   }

   public boolean o() {
      return this.I.c();
   }

   public void a(dlz $$0) {
      this.r.a($$0);
   }

   public void p() {
      this.r.a();
      this.n.a();
   }

   public static int a(dlv $$0, jb $$1) {
      return a(gxh.a.a, $$0, $$0.a_($$1), $$1);
   }

   public static int a(gxh.a $$0, dlv $$1, eeb $$2, jb $$3) {
      if ($$2.b($$1, $$3)) {
         return 15728880;
      } else {
         int $$4 = $$0.packedBrightness($$1, $$3);
         int $$5 = gxj.a($$4);
         int $$6 = $$2.k();
         if ($$5 < $$6) {
            int $$7 = gxj.b($$4);
            return gxj.a($$6, $$7);
         } else {
            return $$4;
         }
      }
   }

   public boolean a(jb $$0) {
      hbl.a $$1 = this.u.a($$0);
      return $$1 != null && $$1.c.get() != hbe.a;
   }

   @Nullable
   public fmr q() {
      return this.z.q != null ? this.z.q.get() : null;
   }

   @Nullable
   public fmr r() {
      return this.z.l != null ? this.z.l.get() : null;
   }

   @Nullable
   public fmr s() {
      return this.z.m != null ? this.z.m.get() : null;
   }

   @Nullable
   public fmr t() {
      return this.z.n != null ? this.z.n.get() : null;
   }

   @Nullable
   public fmr u() {
      return this.z.o != null ? this.z.o.get() : null;
   }

   @Nullable
   public fmr v() {
      return this.z.p != null ? this.z.p.get() : null;
   }

   @bdl
   public ObjectArrayList<hbl.a> w() {
      return this.s;
   }

   @bdl
   public gye x() {
      return this.r;
   }

   @Nullable
   public hbq y() {
      return this.O;
   }

   public gwv z() {
      return this.n;
   }

   @FunctionalInterface
   public interface a {
      gxh.a a = ($$0, $$1) -> {
         int $$2 = $$0.a(dnd.a, $$1);
         int $$3 = $$0.a(dnd.b, $$1);
         return bap.a($$3, $$2);
      };

      int packedBrightness(dlv var1, jb var2);
   }
}
