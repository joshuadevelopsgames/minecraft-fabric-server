import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dmu implements dmv, eit<bzm>, AutoCloseable {
   public static final Codec<amd<dmu>> h = amd.a(mn.bu);
   public static final amd<dmu> i = amd.a(mn.bu, ame.b("overworld"));
   public static final amd<dmu> j = amd.a(mn.bu, ame.b("the_nether"));
   public static final amd<dmu> k = amd.a(mn.bu, ame.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<ecx> s = Lists.newArrayList();
   protected final fbs t;
   private final List<ecx> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = bck.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final bck A = bck.a();
   @Deprecated
   private final bck f = bck.b();
   private final jl<ehy> E;
   protected final fde B;
   public final boolean C;
   private final eft F;
   private final dnz G;
   private final amd<dmu> H;
   private final jz I;
   private final byc J;
   private long K;

   protected dmu(fde $$0, amd<dmu> $$1, jz $$2, jl<ehy> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final ehy $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new eft() {
            @Override
            public double a() {
               return super.a() / $$8.k();
            }

            @Override
            public double b() {
               return super.b() / $$8.k();
            }
         };
      } else {
         this.F = new eft();
      }

      this.c = Thread.currentThread();
      this.G = new dnz(this, $$6);
      this.d = $$5;
      this.t = new fbn(this, $$7);
      this.I = $$2;
      this.J = new byc($$2);
   }

   @Override
   public boolean B_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer q() {
      return null;
   }

   public boolean k(jb $$0) {
      return !this.u($$0) && g($$0);
   }

   public static boolean l(jb $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jb $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public egi m(jb $$0) {
      return this.d(ke.a($$0.u()), ke.a($$0.w()));
   }

   public egi d(int $$0, int $$1) {
      return (egi)this.a($$0, $$1, egz.n);
   }

   @Nullable
   @Override
   public efy a(int $$0, int $$1, egz $$2, boolean $$3) {
      efy $$4 = this.T().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jb $$0, eeb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jb $$0, eeb $$1, int $$2, int $$3) {
      if (this.u($$0)) {
         return false;
      } else if (!this.C && this.ak()) {
         return false;
      } else {
         egi $$4 = this.m($$0);
         dpz $$5 = $$1.b();
         eeb $$6 = $$4.a($$0, $$1, $$2);
         if ($$6 == null) {
            return false;
         } else {
            eeb $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.G() != null && $$4.G().a(atp.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.a($$0, $$6.b());
                  if (!this.C && $$1.q()) {
                     this.b($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((dmv)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jb $$0, eeb $$1, eeb $$2) {
   }

   @Override
   public boolean a(jb $$0, boolean $$1) {
      fal $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jb $$0, boolean $$1, @Nullable bzm $$2, int $$3) {
      eeb $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         fal $$5 = this.b_($$0);
         if (!($$4.b() instanceof dpm)) {
            this.c(2001, $$0, dpz.j($$4));
         }

         if ($$1) {
            eaz $$6 = $$4.x() ? this.c_($$0) : null;
            dpz.a($$4, this, $$0, $$6, $$2, dcv.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(ejb.f, $$0, ejb.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void b(jb $$0, eeb $$1) {
   }

   public boolean c(jb $$0, eeb $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jb var1, eeb var2, eeb var3, int var4);

   public void b(jb $$0, eeb $$1, eeb $$2) {
   }

   public void a(jb $$0, dpz $$1, @Nullable fbt $$2) {
   }

   public void a(jb $$0, dpz $$1, jh $$2, @Nullable fbt $$3) {
   }

   public void b(jb $$0, dpz $$1, @Nullable fbt $$2) {
   }

   public void a(eeb $$0, jb $$1, dpz $$2, @Nullable fbt $$3, boolean $$4) {
   }

   @Override
   public void a(jh $$0, jb $$1, jb $$2, eeb $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(eka.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(ke.a($$1), ke.a($$2))) {
            $$4 = this.d(ke.a($$1), ke.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.L_();
         }
      } else {
         $$4 = this.Q() + 1;
      }

      return $$4;
   }

   @Override
   public faa C_() {
      return this.T().q();
   }

   @Override
   public eeb a_(jb $$0) {
      if (this.u($$0)) {
         return dqb.nI.m();
      } else {
         egi $$1 = this.d(ke.a($$0.u()), ke.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public fal b_(jb $$0) {
      if (this.u($$0)) {
         return fam.a.g();
      } else {
         egi $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean W() {
      return !this.G_().a() && this.e < 4;
   }

   public boolean X() {
      return !this.G_().a() && !this.W();
   }

   public boolean Y() {
      if (!this.G_().j()) {
         return false;
      } else {
         int $$0 = (int)(this.af() % 24000L);
         return $$0 >= 12600 && $$0 <= 23400;
      }
   }

   @Override
   public void a(@Nullable bzm $$0, jb $$1, ayy $$2, aza $$3, float $$4, float $$5) {
      this.a($$0, $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable bzm var1, double var2, double var4, double var6, jl<ayy> var8, aza var9, float var10, float var11, long var12);

   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, ayy $$4, aza $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mm.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable bzm var1, bzm var2, jl<ayy> var3, aza var4, float var5, float var6, long var7);

   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, ayy $$4, aza $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, ayy $$4, aza $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, jl<ayy> $$4, aza $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bzm $$0, bzm $$1, ayy $$2, aza $$3, float $$4, float $$5) {
      this.a($$0, $$1, mm.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jb $$0, ayy $$1, aza $$2, float $$3, float $$4, boolean $$5) {
      this.a($$0.u() + 0.5, $$0.v() + 0.5, $$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bzm $$0, ayy $$1, aza $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, ayy $$3, aza $$4, float $$5, float $$6, boolean $$7) {
   }

   public void a(ayy $$0, aza $$1, float $$2, float $$3) {
   }

   @Override
   public void a(mc $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(mc $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(mc $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(mc $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(ecx $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void Z() {
      btt $$0 = bts.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<ecx> $$1 = this.s.iterator();
      boolean $$2 = this.v().i();

      while ($$1.hasNext()) {
         ecx $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bzm> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         p $$3 = p.a(var6, "Ticking entity");
         q $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new aa($$3);
      }
   }

   public boolean h(bzm $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jb $$0) {
      return this.a(dlz.a($$0));
   }

   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, float $$4, dmu.a $$5) {
      this.a($$0, dmn.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, me.w, me.v, ayz.kR);
   }

   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dmu.a $$6) {
      this.a($$0, dmn.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, me.w, me.v, ayz.kR);
   }

   public void a(@Nullable bzm $$0, @Nullable byb $$1, @Nullable dmo $$2, fis $$3, float $$4, boolean $$5, dmu.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, me.w, me.v, ayz.kR);
   }

   public void a(@Nullable bzm $$0, @Nullable byb $$1, @Nullable dmo $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dmu.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, me.w, me.v, ayz.kR);
   }

   public abstract void a(
      @Nullable bzm var1,
      @Nullable byb var2,
      @Nullable dmo var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dmu.a var12,
      mc var13,
      mc var14,
      jl<ayy> var15
   );

   public abstract String K();

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      if (this.u($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, egi.b.a);
      }
   }

   public void a(eaz $$0) {
      jb $$1 = $$0.aA_();
      if (!this.u($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jb $$0) {
      if (!this.u($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jb $$0) {
      return this.u($$0) ? false : this.T().b(ke.a($$0.u()), ke.a($$0.w()));
   }

   public boolean a(jb $$0, bzm $$1, jh $$2) {
      if (this.u($$0)) {
         return false;
      } else {
         efy $$3 = this.a(ke.a($$0.u()), ke.a($$0.w()), egz.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jb $$0, bzm $$1) {
      return this.a($$0, $$1, jh.b);
   }

   public void aa() {
      double $$0 = 1.0 - this.d(1.0F) * 5.0F / 16.0;
      double $$1 = 1.0 - this.b(1.0F) * 5.0F / 16.0;
      double $$2 = 0.5 + 2.0 * bcb.a((double)bcb.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.T().b($$0);
   }

   public jb ab() {
      jb $$0 = this.B.a();
      if (!this.F_().a($$0)) {
         $$0 = this.a(eka.a.e, jb.a(this.F_().a(), 0.0, this.F_().b()));
      }

      return $$0;
   }

   public float ac() {
      return this.B.b();
   }

   protected void ad() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.T().close();
   }

   @Nullable
   @Override
   public dly c(int $$0, int $$1) {
      return this.a($$0, $$1, egz.n, false);
   }

   @Override
   public List<bzm> a(@Nullable bzm $$0, fin $$1, Predicate<? super bzm> $$2) {
      bts.a().f("getEntities");
      List<bzm> $$3 = Lists.newArrayList();
      this.I().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cpp $$4 : this.t()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cV())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bzm> List<T> a(ein<bzm, T> $$0, fin $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bzm> void a(ein<bzm, T> $$0, fin $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bzm> void a(ein<bzm, T> $$0, fin $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bts.a().f("getEntities");
      this.I().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return bak.a.b;
            }
         }

         if ($$4x instanceof cps $$5) {
            for (cpp $$6 : $$5.t()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return bak.a.b;
                  }
               }
            }
         }

         return bak.a.a;
      });
   }

   public List<bzm> i(bzm $$0, fin $$1) {
      return this.a($$0, $$1, bzt.a($$0));
   }

   @Nullable
   public abstract bzm a(int var1);

   @Nullable
   public bzm b(UUID $$0) {
      return this.I().a($$0);
   }

   public abstract Collection<cpp> t();

   public void q(jb $$0) {
      if (this.D($$0)) {
         this.m($$0).i();
      }
   }

   public void b(eaz $$0) {
   }

   public long ae() {
      return this.B.c();
   }

   public long af() {
      return this.B.d();
   }

   public boolean a(bzm $$0, jb $$1) {
      return true;
   }

   public void a(bzm $$0, byte $$1) {
   }

   public void a(bzm $$0, byb $$1) {
   }

   public void a(jb $$0, dpz $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public fco D_() {
      return this.B;
   }

   public abstract bxt v();

   public float b(float $$0) {
      return bcb.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = bcb.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return bcb.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = bcb.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.G_().g() && !this.G_().h();
   }

   public boolean ag() {
      return this.a() && this.b(1.0F) > 0.9;
   }

   public boolean ah() {
      return this.a() && this.d(1.0F) > 0.2;
   }

   public boolean r(jb $$0) {
      return this.s($$0) == dnx.c.b;
   }

   public dnx.c s(jb $$0) {
      if (!this.ah()) {
         return dnx.c.a;
      } else if (!this.h($$0)) {
         return dnx.c.a;
      } else if (this.a(eka.a.e, $$0).v() > $$0.v()) {
         return dnx.c.a;
      } else {
         dnx $$1 = this.v($$0).a();
         return $$1.a($$0, this.Q());
      }
   }

   @Nullable
   public abstract fcg a(fce var1);

   public void b(int $$0, jb $$1, int $$2) {
   }

   public q a(p $$0) {
      q $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> {
         List<? extends cut> $$0x = this.A();
         return $$0x.size() + " total; " + $$0x.stream().map(cut::hb).collect(Collectors.joining(", "));
      });
      $$1.a("Chunk stats", this.T()::e);
      $$1.a("Level dimension", () -> this.aj().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, jb var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dfj> $$6) {
   }

   public abstract fjx S();

   public void b(jb $$0, dpz $$1) {
      for (jh $$2 : jh.c.a) {
         jb $$3 = $$0.a($$2);
         if (this.D($$3)) {
            eeb $$4 = this.a_($$3);
            if ($$4.a(dqb.hz)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dqb.hz)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bxh d_(jb $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.D($$0)) {
         $$2 = this.as();
         $$1 = this.m($$0).w();
      }

      return new bxh(this.an(), this.af(), $$1, $$2);
   }

   @Override
   public int E_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public eft F_() {
      return this.F;
   }

   public void a(zw<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public ehy G_() {
      return this.E.a();
   }

   public jl<ehy> ai() {
      return this.E;
   }

   public amd<dmu> aj() {
      return this.H;
   }

   @Override
   public bck H_() {
      return this.A;
   }

   @Override
   public boolean a(jb $$0, Predicate<eeb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jb $$0, Predicate<fal> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dhn R();

   public jb a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jb($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean w() {
      return false;
   }

   @Override
   public dnz I_() {
      return this.G;
   }

   public final boolean ak() {
      return this.d;
   }

   protected abstract eip<bzm> I();

   @Override
   public long J_() {
      return this.K++;
   }

   @Override
   public jz K_() {
      return this.I;
   }

   public byc al() {
      return this.J;
   }

   public abstract deq M();

   public abstract eby N();

   public int t(jb $$0) {
      return 0;
   }

   public static enum a implements bda {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dmu.a> f = bda.a(dmu.a::values);
      private final String g;

      private a(final String $$0) {
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
