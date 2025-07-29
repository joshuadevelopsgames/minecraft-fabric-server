import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dbm {
   static final ame a = a("items");
   private final xo b;
   ame c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final dbm.f g;
   private final int h;
   private final dbm.h i;
   @Nullable
   private dcv j;
   private Collection<dcv> k = dcw.a();
   private Set<dcv> l = dcw.a();
   private final Supplier<dcv> m;
   private final dbm.b n;

   dbm(dbm.f $$0, int $$1, dbm.h $$2, xo $$3, Supplier<dcv> $$4, dbm.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static ame a(String $$0) {
      return ame.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static dbm.a a(dbm.f $$0, int $$1) {
      return new dbm.a($$0, $$1);
   }

   public xo a() {
      return this.b;
   }

   public dcv b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public ame c() {
      return this.c;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.d;
   }

   public int f() {
      return this.h;
   }

   public dbm.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != dbm.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public dbm.h k() {
      return this.i;
   }

   public void a(dbm.d $$0) {
      dbm.c $$1 = new dbm.c(this, $$0.a);
      amd<dbm> $$2 = mm.aj.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<dcv> l() {
      return this.k;
   }

   public Collection<dcv> m() {
      return this.l;
   }

   public boolean a(dcv $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final dbm.b a = ($$0, $$1) -> {};
      private final dbm.f b;
      private final int c;
      private xo d = xo.i();
      private Supplier<dcv> e = () -> dcv.l;
      private dbm.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private dbm.h j = dbm.h.a;
      private ame k = dbm.a;

      public a(dbm.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public dbm.a a(xo $$0) {
         this.d = $$0;
         return this;
      }

      public dbm.a a(Supplier<dcv> $$0) {
         this.e = $$0;
         return this;
      }

      public dbm.a a(dbm.b $$0) {
         this.f = $$0;
         return this;
      }

      public dbm.a a() {
         this.i = true;
         return this;
      }

      public dbm.a b() {
         this.h = false;
         return this;
      }

      public dbm.a c() {
         this.g = false;
         return this;
      }

      protected dbm.a a(dbm.h $$0) {
         this.j = $$0;
         return this;
      }

      public dbm.a a(ame $$0) {
         this.k = $$0;
         return this;
      }

      public dbm d() {
         if ((this.j == dbm.h.c || this.j == dbm.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            dbm $$0 = new dbm(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.f = this.i;
            $$0.e = this.h;
            $$0.d = this.g;
            $$0.c = this.k;
            return $$0;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(dbm.d var1, dbm.e var2);
   }

   static class c implements dbm.e {
      public final Collection<dcv> a = dcw.a();
      public final Set<dcv> b = dcw.a();
      private final dbm c;
      private final cyd d;

      public c(dbm $$0, cyd $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(dcv $$0, dbm.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != dbm.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.K().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.h().a(this.d)) {
                  switch ($$1) {
                     case a:
                        this.a.add($$0);
                        this.b.add($$0);
                        break;
                     case b:
                        this.a.add($$0);
                        break;
                     case c:
                        this.b.add($$0);
                  }
               }
            }
         }
      }
   }

   public record d(cyd a, boolean b, jn.a c) {

      public boolean a(cyd $$0, boolean $$1, jn.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(dcv var1, dbm.g var2);

      default void a(dcv $$0) {
         this.a($$0, dbm.g.a);
      }

      default void a(dmt $$0, dbm.g $$1) {
         this.a(new dcv($$0), $$1);
      }

      default void a(dmt $$0) {
         this.a(new dcv($$0), dbm.g.a);
      }

      default void a(Collection<dcv> $$0, dbm.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<dcv> $$0) {
         this.a($$0, dbm.g.a);
      }
   }

   public static enum f {
      a,
      b;
   }

   protected static enum g {
      a,
      b,
      c;
   }

   public static enum h {
      a,
      b,
      c,
      d;
   }
}
