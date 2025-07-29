import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Nullable;

public class gab implements gac {
   private static final ame a = ame.b("toast/system");
   private static final int e = 200;
   private static final int f = 12;
   private static final int g = 10;
   private final gab.a h;
   private xo i;
   private List<bbm> j;
   private long k;
   private boolean l;
   private final int m;
   private boolean n;
   private gac.a o = gac.a.b;

   public gab(gab.a $$0, xo $$1, @Nullable xo $$2) {
      this($$0, $$1, a($$2), Math.max(160, 30 + Math.max(fue.R().h.a($$1), $$2 == null ? 0 : fue.R().h.a($$2))));
   }

   public static gab a(fue $$0, gab.a $$1, xo $$2, xo $$3) {
      fwz $$4 = $$0.h;
      List<bbm> $$5 = $$4.c($$3, 200);
      int $$6 = Math.max(200, $$5.stream().mapToInt($$4::a).max().orElse(200));
      return new gab($$1, $$2, $$5, $$6 + 30);
   }

   private gab(gab.a $$0, xo $$1, List<bbm> $$2, int $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.m = $$3;
   }

   private static ImmutableList<bbm> a(@Nullable xo $$0) {
      return $$0 == null ? ImmutableList.of() : ImmutableList.of($$0.g());
   }

   @Override
   public int e() {
      return this.m;
   }

   @Override
   public int f() {
      return 20 + Math.max(this.j.size(), 1) * 12;
   }

   public void c() {
      this.n = true;
   }

   @Override
   public gac.a a() {
      return this.o;
   }

   @Override
   public void a(gad $$0, long $$1) {
      if (this.l) {
         this.k = $$1;
         this.l = false;
      }

      double $$2 = this.h.l * $$0.h();
      long $$3 = $$1 - this.k;
      this.o = !this.n && $$3 < $$2 ? gac.a.a : gac.a.b;
   }

   @Override
   public void a(fxb $$0, fwz $$1, long $$2) {
      $$0.a(gxx.ar, a, 0, 0, this.e(), this.f());
      if (this.j.isEmpty()) {
         $$0.a($$1, this.i, 18, 12, -256, false);
      } else {
         $$0.a($$1, this.i, 18, 7, -256, false);

         for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
            $$0.a($$1, this.j.get($$3), 18, 18 + $$3 * 12, -1, false);
         }
      }
   }

   public void a(xo $$0, @Nullable xo $$1) {
      this.i = $$0;
      this.j = a($$1);
      this.l = true;
   }

   public gab.a g() {
      return this.h;
   }

   public static void a(gad $$0, gab.a $$1, xo $$2, @Nullable xo $$3) {
      $$0.a(new gab($$1, $$2, $$3));
   }

   public static void b(gad $$0, gab.a $$1, xo $$2, @Nullable xo $$3) {
      gab $$4 = $$0.a(gab.class, $$1);
      if ($$4 == null) {
         a($$0, $$1, $$2, $$3);
      } else {
         $$4.a($$2, $$3);
      }
   }

   public static void a(gad $$0, gab.a $$1) {
      gab $$2 = $$0.a(gab.class, $$1);
      if ($$2 != null) {
         $$2.c();
      }
   }

   public static void a(fue $$0, String $$1) {
      a($$0.aB(), gab.a.d, xo.c("selectWorld.access_failure"), xo.b($$1));
   }

   public static void b(fue $$0, String $$1) {
      a($$0.aB(), gab.a.d, xo.c("selectWorld.delete_failure"), xo.b($$1));
   }

   public static void c(fue $$0, String $$1) {
      a($$0.aB(), gab.a.e, xo.c("pack.copyFailure"), xo.b($$1));
   }

   public static void a(fue $$0, int $$1) {
      a($$0.aB(), gab.a.f, xo.c("gui.fileDropFailure.title"), xo.a("gui.fileDropFailure.detail", $$1));
   }

   public static void a(fue $$0) {
      b($$0.aB(), gab.a.h, xo.c("chunk.toast.lowDiskSpace"), xo.c("chunk.toast.lowDiskSpace.description"));
   }

   public static void a(fue $$0, dlz $$1) {
      b($$0.aB(), gab.a.i, xo.a("chunk.toast.loadFailure", xo.a($$1)).a(o.m), xo.c("chunk.toast.checkLog"));
   }

   public static void b(fue $$0, dlz $$1) {
      b($$0.aB(), gab.a.j, xo.a("chunk.toast.saveFailure", xo.a($$1)).a(o.m), xo.c("chunk.toast.checkLog"));
   }

   public static class a {
      public static final gab.a a = new gab.a();
      public static final gab.a b = new gab.a();
      public static final gab.a c = new gab.a();
      public static final gab.a d = new gab.a();
      public static final gab.a e = new gab.a();
      public static final gab.a f = new gab.a();
      public static final gab.a g = new gab.a();
      public static final gab.a h = new gab.a(10000L);
      public static final gab.a i = new gab.a();
      public static final gab.a j = new gab.a();
      public static final gab.a k = new gab.a(10000L);
      final long l;

      public a(long $$0) {
         this.l = $$0;
      }

      public a() {
         this(5000L);
      }
   }
}
