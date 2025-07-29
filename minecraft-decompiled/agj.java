import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class agj implements zw<acq> {
   public static final zm<wx, agj> a = zw.a(agj::a, agj::new);
   private static final int b = 0;
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 3;
   private static final int f = 4;
   private static final int g = 40;
   private static final int h = 40;
   private final int i;
   private final String j;
   private final Collection<String> k;
   private final Optional<agj.b> l;

   private agj(String $$0, int $$1, Optional<agj.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static agj a(fjs $$0, boolean $$1) {
      return new agj($$0.c(), $$1 ? 0 : 2, Optional.of(new agj.b($$0)), (Collection<String>)($$1 ? $$0.h() : ImmutableList.of()));
   }

   public static agj a(fjs $$0) {
      return new agj($$0.c(), 1, Optional.empty(), ImmutableList.of());
   }

   public static agj a(fjs $$0, String $$1, agj.a $$2) {
      return new agj($$0.c(), $$2 == agj.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private agj(wx $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new agj.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(wg::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wx $$0) {
      $$0.a(this.j);
      $$0.l(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, wg::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public agj.a b() {
      return switch (this.i) {
         case 0, 3 -> agj.a.a;
         default -> null;
         case 4 -> agj.a.b;
      };
   }

   @Nullable
   public agj.a e() {
      return switch (this.i) {
         case 0 -> agj.a.a;
         case 1 -> agj.a.b;
         default -> null;
      };
   }

   @Override
   public zy<agj> a() {
      return ahk.aO;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<agj.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xo a;
      private final xo b;
      private final xo c;
      private final fjz.b d;
      private final fjz.a e;
      private final o f;
      private final int g;

      public b(fjs $$0) {
         this.a = $$0.d();
         this.g = $$0.n();
         this.d = $$0.k();
         this.e = $$0.m();
         this.f = $$0.o();
         this.b = $$0.f();
         this.c = $$0.g();
      }

      public b(wx $$0) {
         this.a = xq.d.decode($$0);
         this.g = $$0.readByte();
         this.d = fjz.b.f.decode($$0);
         this.e = fjz.a.f.decode($$0);
         this.f = $$0.b(o.class);
         this.b = xq.d.decode($$0);
         this.c = xq.d.decode($$0);
      }

      public xo a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public o c() {
         return this.f;
      }

      public fjz.b d() {
         return this.d;
      }

      public fjz.a e() {
         return this.e;
      }

      public xo f() {
         return this.b;
      }

      public xo g() {
         return this.c;
      }

      public void a(wx $$0) {
         xq.d.encode($$0, this.a);
         $$0.l(this.g);
         fjz.b.f.encode($$0, this.d);
         fjz.a.f.encode($$0, this.e);
         $$0.a(this.f);
         xq.d.encode($$0, this.b);
         xq.d.encode($$0, this.c);
      }
   }
}
