import java.util.UUID;

public class acz implements zw<acq> {
   public static final zm<wx, acz> a = zw.a(acz::a, acz::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private final UUID e;
   private final acz.c f;
   static final acz.c g = new acz.c() {
      @Override
      public acz.d a() {
         return acz.d.b;
      }

      @Override
      public void a(UUID $$0, acz.b $$1) {
         $$1.a($$0);
      }

      @Override
      public void a(wx $$0) {
      }
   };

   private acz(UUID $$0, acz.c $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private acz(wx $$0) {
      this.e = $$0.n();
      acz.d $$1 = $$0.b(acz.d.class);
      this.f = $$1.g.decode($$0);
   }

   public static acz a(bwz $$0) {
      return new acz($$0.i(), new acz.a($$0));
   }

   public static acz a(UUID $$0) {
      return new acz($$0, g);
   }

   public static acz b(bwz $$0) {
      return new acz($$0.i(), new acz.f($$0.k()));
   }

   public static acz c(bwz $$0) {
      return new acz($$0.i(), new acz.e($$0.j()));
   }

   public static acz d(bwz $$0) {
      return new acz($$0.i(), new acz.h($$0.l(), $$0.m()));
   }

   public static acz e(bwz $$0) {
      return new acz($$0.i(), new acz.g($$0.n(), $$0.o(), $$0.p()));
   }

   private void a(wx $$0) {
      $$0.a(this.e);
      $$0.a(this.f.a());
      this.f.a($$0);
   }

   static int a(boolean $$0, boolean $$1, boolean $$2) {
      int $$3 = 0;
      if ($$0) {
         $$3 |= 1;
      }

      if ($$1) {
         $$3 |= 2;
      }

      if ($$2) {
         $$3 |= 4;
      }

      return $$3;
   }

   @Override
   public zy<acz> a() {
      return ahk.k;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public void a(acz.b $$0) {
      this.f.a(this.e, $$0);
   }

   static class a implements acz.c {
      private final xo a;
      private final float b;
      private final bwz.a c;
      private final bwz.b d;
      private final boolean e;
      private final boolean f;
      private final boolean g;

      a(bwz $$0) {
         this.a = $$0.j();
         this.b = $$0.k();
         this.c = $$0.l();
         this.d = $$0.m();
         this.e = $$0.n();
         this.f = $$0.o();
         this.g = $$0.p();
      }

      private a(wx $$0) {
         this.a = xq.d.decode($$0);
         this.b = $$0.readFloat();
         this.c = $$0.b(bwz.a.class);
         this.d = $$0.b(bwz.b.class);
         int $$1 = $$0.readUnsignedByte();
         this.e = ($$1 & 1) > 0;
         this.f = ($$1 & 2) > 0;
         this.g = ($$1 & 4) > 0;
      }

      @Override
      public acz.d a() {
         return acz.d.a;
      }

      @Override
      public void a(UUID $$0, acz.b $$1) {
         $$1.a($$0, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
      }

      @Override
      public void a(wx $$0) {
         xq.d.encode($$0, this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.l(acz.a(this.e, this.f, this.g));
      }
   }

   public interface b {
      default void a(UUID $$0, xo $$1, float $$2, bwz.a $$3, bwz.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      }

      default void a(UUID $$0) {
      }

      default void a(UUID $$0, float $$1) {
      }

      default void a(UUID $$0, xo $$1) {
      }

      default void a(UUID $$0, bwz.a $$1, bwz.b $$2) {
      }

      default void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
      }
   }

   interface c {
      acz.d a();

      void a(UUID var1, acz.b var2);

      void a(wx var1);
   }

   static enum d {
      a(acz.a::new),
      b($$0 -> acz.g),
      c(acz.f::new),
      d(acz.e::new),
      e(acz.h::new),
      f(acz.g::new);

      final zn<wx, acz.c> g;

      private d(final zn<wx, acz.c> $$0) {
         this.g = $$0;
      }
   }

   record e(xo a) implements acz.c {
      private e(wx $$0) {
         this(xq.d.decode($$0));
      }

      @Override
      public acz.d a() {
         return acz.d.d;
      }

      @Override
      public void a(UUID $$0, acz.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wx $$0) {
         xq.d.encode($$0, this.a);
      }

      public xo b() {
         return this.a;
      }
   }

   record f(float a) implements acz.c {
      private f(wx $$0) {
         this($$0.readFloat());
      }

      @Override
      public acz.d a() {
         return acz.d.c;
      }

      @Override
      public void a(UUID $$0, acz.b $$1) {
         $$1.a($$0, this.a);
      }

      @Override
      public void a(wx $$0) {
         $$0.a(this.a);
      }

      public float b() {
         return this.a;
      }
   }

   static class g implements acz.c {
      private final boolean a;
      private final boolean b;
      private final boolean c;

      g(boolean $$0, boolean $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private g(wx $$0) {
         int $$1 = $$0.readUnsignedByte();
         this.a = ($$1 & 1) > 0;
         this.b = ($$1 & 2) > 0;
         this.c = ($$1 & 4) > 0;
      }

      @Override
      public acz.d a() {
         return acz.d.f;
      }

      @Override
      public void a(UUID $$0, acz.b $$1) {
         $$1.a($$0, this.a, this.b, this.c);
      }

      @Override
      public void a(wx $$0) {
         $$0.l(acz.a(this.a, this.b, this.c));
      }
   }

   static class h implements acz.c {
      private final bwz.a a;
      private final bwz.b b;

      h(bwz.a $$0, bwz.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private h(wx $$0) {
         this.a = $$0.b(bwz.a.class);
         this.b = $$0.b(bwz.b.class);
      }

      @Override
      public acz.d a() {
         return acz.d.e;
      }

      @Override
      public void a(UUID $$0, acz.b $$1) {
         $$1.a($$0, this.a, this.b);
      }

      @Override
      public void a(wx $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }
   }
}
