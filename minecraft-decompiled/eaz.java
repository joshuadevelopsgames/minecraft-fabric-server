import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eaz {
   private static final Codec<ebb<?>> d = mm.j.q();
   private static final Logger e = LogUtils.getLogger();
   private final ebb<?> f;
   @Nullable
   protected dmu n;
   protected final jb o;
   protected boolean p;
   private eeb g;
   private kn h = kn.a;

   public eaz(ebb<?> $$0, jb $$1, eeb $$2) {
      this.f = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.g = $$2;
   }

   private void a(eeb $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.p() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(eeb $$0) {
      return this.f.a($$0);
   }

   public static jb a(dlz $$0, ui $$1) {
      int $$2 = $$1.b("x", 0);
      int $$3 = $$1.b("y", 0);
      int $$4 = $$1.b("z", 0);
      int $$5 = ke.a($$2);
      int $$6 = ke.a($$4);
      if ($$5 != $$0.h || $$6 != $$0.i) {
         e.warn("Block entity {} found in a wrong chunk, expected position from chunk {}", $$1, $$0);
         $$2 = $$0.a(ke.b($$2));
         $$4 = $$0.b(ke.b($$4));
      }

      return new jb($$2, $$3, $$4);
   }

   @Nullable
   public dmu i() {
      return this.n;
   }

   public void a(dmu $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(fda $$0) {
   }

   public final void b(fda $$0) {
      this.a($$0);
      this.h = $$0.<kn>a("components", kn.b).orElse(kn.a);
   }

   public final void c(fda $$0) {
      this.a($$0);
   }

   protected void a(fdc $$0) {
   }

   public final ui b(jn.a $$0) {
      ui var4;
      try (bci.j $$1 = new bci.j(this.t(), e)) {
         fcz $$2 = fcz.a($$1, $$0);
         this.c($$2);
         var4 = $$2.b();
      }

      return var4;
   }

   public void c(fdc $$0) {
      this.e($$0);
      this.h($$0);
   }

   public void d(fdc $$0) {
      this.e($$0);
      this.g($$0);
   }

   public final ui c(jn.a $$0) {
      ui var4;
      try (bci.j $$1 = new bci.j(this.t(), e)) {
         fcz $$2 = fcz.a($$1, $$0);
         this.e($$2);
         var4 = $$2.b();
      }

      return var4;
   }

   public void e(fdc $$0) {
      this.a($$0);
      $$0.a("components", kn.b, this.h);
   }

   public final ui d(jn.a $$0) {
      ui var4;
      try (bci.j $$1 = new bci.j(this.t(), e)) {
         fcz $$2 = fcz.a($$1, $$0);
         this.f($$2);
         var4 = $$2.b();
      }

      return var4;
   }

   public void f(fdc $$0) {
      this.a($$0);
   }

   private void g(fdc $$0) {
      a($$0, this.q());
   }

   public static void a(fdc $$0, ebb<?> $$1) {
      $$0.a("id", d, $$1);
   }

   private void h(fdc $$0) {
      this.g($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static eaz a(jb $$0, eeb $$1, ui $$2, jn.a $$3) {
      ebb<?> $$4 = $$2.<ebb<?>>a("id", d).orElse(null);
      if ($$4 == null) {
         e.error("Skipping block entity with invalid type: {}", $$2.a("id"));
         return null;
      } else {
         eaz $$5;
         try {
            $$5 = $$4.a($$0, $$1);
         } catch (Throwable var12) {
            e.error("Failed to create block entity {} for block {} at position {} ", new Object[]{$$4, $$0, $$1, var12});
            return null;
         }

         try {
            eaz var7;
            try (bci.j $$8 = new bci.j($$5.t(), e)) {
               $$5.b(fcy.a($$8, $$3, $$2));
               var7 = $$5;
            }

            return var7;
         } catch (Throwable var11) {
            e.error("Failed to load data for block entity {} for block {} at position {}", new Object[]{$$4, $$0, $$1, var11});
            return null;
         }
      }
   }

   public void e() {
      if (this.n != null) {
         a(this.n, this.o, this.g);
      }
   }

   protected static void a(dmu $$0, jb $$1, eeb $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.b($$1, $$2.b());
      }
   }

   public jb aA_() {
      return this.o;
   }

   public eeb m() {
      return this.g;
   }

   @Nullable
   public zw<acq> ax_() {
      return null;
   }

   public ui a(jn.a $$0) {
      return new ui();
   }

   public boolean n() {
      return this.p;
   }

   public void av_() {
      this.p = true;
   }

   public void o() {
      this.p = false;
   }

   public void a(jb $$0, eeb $$1) {
      if (this instanceof bxc $$2 && this.n != null) {
         bxf.a(this.n, $$0, $$2);
      }
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Name", this::p);
      $$0.a("Cached block", this.m()::toString);
      if (this.n == null) {
         $$0.a("Block location", () -> this.o + " (world missing)");
      } else {
         $$0.a("Actual block", this.n.a_(this.o)::toString);
         q.a($$0, this.n, this.o);
      }
   }

   public String p() {
      return mm.j.b(this.q()) + " // " + this.getClass().getCanonicalName();
   }

   public ebb<?> q() {
      return this.f;
   }

   @Deprecated
   public void c(eeb $$0) {
      this.a($$0);
      this.g = $$0;
   }

   protected void a(kl $$0) {
   }

   public final void a(dcv $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kn $$0, ko $$1) {
      final Set<kp<?>> $$2 = new HashSet<>();
      $$2.add(kq.aa);
      $$2.add(kq.aq);
      final kn $$3 = kr.a($$0, $$1);
      this.a(new kl() {
         @Nullable
         @Override
         public <T> T a(kp<? extends T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kp<? extends T> $$0, T $$1x) {
            $$2.add($$0);
            return $$3.a($$0, $$1x);
         }
      });
      ko $$4 = $$1.a($$2::contains);
      this.h = $$4.e().a();
   }

   protected void a(kn.a $$0) {
   }

   @Deprecated
   public void b(fdc $$0) {
   }

   public final kn r() {
      kn.a $$0 = kn.a();
      $$0.a(this.h);
      this.a($$0);
      return $$0.a();
   }

   public kn s() {
      return this.h;
   }

   public void a(kn $$0) {
      this.h = $$0;
   }

   @Nullable
   public static xo a(fda $$0, String $$1) {
      return $$0.<xo>a($$1, xq.a).orElse(null);
   }

   public bci.f t() {
      return new eaz.a(this);
   }

   record a(eaz a) implements bci.f {
      @Override
      public String get() {
         return this.a.p() + "@" + this.a.aA_();
      }
   }
}
