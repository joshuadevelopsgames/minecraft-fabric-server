import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class auj implements dnt {
   private static final Logger a = LogUtils.getLogger();
   private final bcx<atr> b;
   private final efy c;
   private final aub d;
   private final long e;
   private final fco f;
   private final bck h;
   private final ehy i;
   private final fkp<dpz> j = new fkp<>($$0x -> this.A($$0x).q());
   private final fkp<fak> k = new fkp<>($$0x -> this.A($$0x).r());
   private final dnz l;
   private final ehc m;
   @Nullable
   private Supplier<String> n;
   private final AtomicLong o = new AtomicLong();
   private static final ame p = ame.b("worldgen_region_random");

   public auj(aub $$0, bcx<atr> $$1, ehc $$2, efy $$3) {
      this.m = $$2;
      this.b = $$1;
      this.c = $$3;
      this.d = $$0;
      this.e = $$0.F();
      this.f = $$0.D_();
      this.h = $$0.n().i().a(p).a(this.c.f().l());
      this.i = $$0.G_();
      this.l = new dnz(this, dnz.a(this.e));
   }

   public boolean a(dlz $$0, int $$1) {
      return this.d.n().a.b($$0, $$1);
   }

   public dlz b() {
      return this.c.f();
   }

   @Override
   public void a(@Nullable Supplier<String> $$0) {
      this.n = $$0;
   }

   @Override
   public efy a(int $$0, int $$1) {
      return this.a($$0, $$1, egz.c);
   }

   @Nullable
   @Override
   public efy a(int $$0, int $$1, egz $$2, boolean $$3) {
      int $$4 = this.c.f().e($$0, $$1);
      egz $$5 = $$4 >= this.m.b().b() ? null : this.m.b().a($$4);
      atr $$6;
      if ($$5 != null) {
         $$6 = this.b.a($$0, $$1);
         if ($$2.c($$5)) {
            efy $$7 = $$6.a($$5);
            if ($$7 != null) {
               return $$7;
            }
         }
      } else {
         $$6 = null;
      }

      p $$9 = p.a(new IllegalStateException("Requested chunk unavailable during world generation"), "Exception generating new chunk");
      q $$10 = $$9.a("Chunk request details");
      $$10.a("Requested chunk", String.format(Locale.ROOT, "%d, %d", $$0, $$1));
      $$10.a("Generating status", () -> this.m.a().f());
      $$10.a("Requested status", $$2::f);
      $$10.a("Actual status", () -> $$6 == null ? "[out of cache bounds]" : $$6.q().f());
      $$10.a("Maximum allowed status", () -> $$5 == null ? "null" : $$5.f());
      $$10.a("Dependencies", this.m.b()::toString);
      $$10.a("Requested distance", $$4);
      $$10.a("Generating chunk", this.c.f()::toString);
      throw new aa($$9);
   }

   @Override
   public boolean b(int $$0, int $$1) {
      int $$2 = this.c.f().e($$0, $$1);
      return $$2 < this.m.b().b();
   }

   @Override
   public eeb a_(jb $$0) {
      return this.a(ke.a($$0.u()), ke.a($$0.w())).a_($$0);
   }

   @Override
   public fal b_(jb $$0) {
      return this.A($$0).b_($$0);
   }

   @Nullable
   @Override
   public cut a(double $$0, double $$1, double $$2, double $$3, Predicate<bzm> $$4) {
      return null;
   }

   @Override
   public int E_() {
      return 0;
   }

   @Override
   public dnz I_() {
      return this.l;
   }

   @Override
   public jl<dnx> a(int $$0, int $$1, int $$2) {
      return this.d.a($$0, $$1, $$2);
   }

   @Override
   public float a(jh $$0, boolean $$1) {
      return 1.0F;
   }

   @Override
   public faa C_() {
      return this.d.C_();
   }

   @Override
   public boolean a(jb $$0, boolean $$1, @Nullable bzm $$2, int $$3) {
      eeb $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         if ($$1) {
            eaz $$5 = $$4.x() ? this.c_($$0) : null;
            dpz.a($$4, (dmu)this.d, $$0, $$5, $$2, dcv.l);
         }

         return this.a($$0, dqb.a.m(), 3, $$3);
      }
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      efy $$1 = this.A($$0);
      eaz $$2 = $$1.c_($$0);
      if ($$2 != null) {
         return $$2;
      } else {
         ui $$3 = $$1.f($$0);
         eeb $$4 = $$1.a_($$0);
         if ($$3 != null) {
            if ("DUMMY".equals($$3.b("id", ""))) {
               if (!$$4.x()) {
                  return null;
               }

               $$2 = ((dsu)$$4.b()).a($$0, $$4);
            } else {
               $$2 = eaz.a($$0, $$4, $$3, this.d.K_());
            }

            if ($$2 != null) {
               $$1.a($$2);
               return $$2;
            }
         }

         if ($$4.x()) {
            a.warn("Tried to access a block entity before it was created. {}", $$0);
         }

         return null;
      }
   }

   @Override
   public boolean f_(jb $$0) {
      int $$1 = ke.a($$0.u());
      int $$2 = ke.a($$0.w());
      dlz $$3 = this.b();
      int $$4 = Math.abs($$3.h - $$1);
      int $$5 = Math.abs($$3.i - $$2);
      if ($$4 <= this.m.d() && $$5 <= this.m.d()) {
         if (this.c.A()) {
            dmw $$6 = this.c.B();
            if ($$6.e($$0.v())) {
               return false;
            }
         }

         return true;
      } else {
         ag.b(
            "Detected setBlock in a far chunk ["
               + $$1
               + ", "
               + $$2
               + "], pos: "
               + $$0
               + ", status: "
               + this.m.a()
               + (this.n == null ? "" : ", currently generating: " + this.n.get())
         );
         return false;
      }
   }

   @Override
   public boolean a(jb $$0, eeb $$1, int $$2, int $$3) {
      if (!this.f_($$0)) {
         return false;
      } else {
         efy $$4 = this.A($$0);
         eeb $$5 = $$4.a($$0, $$1, $$2);
         if ($$5 != null) {
            this.d.a($$0, $$5, $$1);
         }

         if ($$1.x()) {
            if ($$4.n().d() == ehd.b) {
               eaz $$6 = ((dsu)$$1.b()).a($$0, $$1);
               if ($$6 != null) {
                  $$4.a($$6);
               } else {
                  $$4.d($$0);
               }
            } else {
               ui $$7 = new ui();
               $$7.a("x", $$0.u());
               $$7.a("y", $$0.v());
               $$7.a("z", $$0.w());
               $$7.a("id", "DUMMY");
               $$4.a($$7);
            }
         } else if ($$5 != null && $$5.x()) {
            $$4.d($$0);
         }

         if ($$1.l(this, $$0) && ($$2 & 16) == 0) {
            this.f($$0);
         }

         return true;
      }
   }

   private void f(jb $$0) {
      this.A($$0).e($$0);
   }

   @Override
   public boolean b(bzm $$0) {
      int $$1 = ke.a($$0.dB());
      int $$2 = ke.a($$0.dH());
      this.a($$1, $$2).a($$0);
      return true;
   }

   @Override
   public boolean a(jb $$0, boolean $$1) {
      return this.a($$0, dqb.a.m(), 3);
   }

   @Override
   public eft F_() {
      return this.d.F_();
   }

   @Override
   public boolean B_() {
      return false;
   }

   @Deprecated
   @Override
   public aub a() {
      return this.d;
   }

   @Override
   public jz K_() {
      return this.d.K_();
   }

   @Override
   public cyd L() {
      return this.d.L();
   }

   @Override
   public fco D_() {
      return this.f;
   }

   @Override
   public bxh d_(jb $$0) {
      if (!this.b(ke.a($$0.u()), ke.a($$0.w()))) {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      } else {
         return new bxh(this.d.an(), this.d.af(), 0L, this.d.as());
      }
   }

   @Nullable
   @Override
   public MinecraftServer q() {
      return this.d.q();
   }

   @Override
   public egc T() {
      return this.d.n();
   }

   @Override
   public long F() {
      return this.e;
   }

   @Override
   public fkg<dpz> V() {
      return this.j;
   }

   @Override
   public fkg<fak> U() {
      return this.k;
   }

   @Override
   public int Q() {
      return this.d.Q();
   }

   @Override
   public bck H_() {
      return this.h;
   }

   @Override
   public int a(eka.a $$0, int $$1, int $$2) {
      return this.a(ke.a($$1), ke.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
   }

   @Override
   public void a(@Nullable bzm $$0, jb $$1, ayy $$2, aza $$3, float $$4, float $$5) {
   }

   @Override
   public void a(mc $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   @Override
   public void a(@Nullable bzm $$0, int $$1, jb $$2, int $$3) {
   }

   @Override
   public void a(jl<ejb> $$0, fis $$1, ejb.a $$2) {
   }

   @Override
   public ehy G_() {
      return this.i;
   }

   @Override
   public boolean a(jb $$0, Predicate<eeb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jb $$0, Predicate<fal> $$1) {
      return $$1.test(this.b_($$0));
   }

   @Override
   public <T extends bzm> List<T> a(ein<bzm, T> $$0, fin $$1, Predicate<? super T> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<bzm> a(@Nullable bzm $$0, fin $$1, @Nullable Predicate<? super bzm> $$2) {
      return Collections.emptyList();
   }

   @Override
   public List<cut> A() {
      return Collections.emptyList();
   }

   @Override
   public int L_() {
      return this.d.L_();
   }

   @Override
   public int M_() {
      return this.d.M_();
   }

   @Override
   public long J_() {
      return this.o.getAndIncrement();
   }
}
