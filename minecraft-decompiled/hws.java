import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class hws {
   private static final int a = 100;
   private final bck b = bck.a();
   private final fue c;
   @Nullable
   private hvr d;
   private hws.a e;
   private float f = 1.0F;
   private int g = 100;
   private boolean h = false;

   public hws(fue $$0) {
      this.c = $$0;
      this.e = $$0.n.az().c();
   }

   public void a() {
      hwr $$0 = this.c.am();
      float $$1 = $$0.b();
      if (this.d != null && this.f != $$1) {
         boolean $$2 = this.a($$1);
         if (!$$2) {
            return;
         }
      }

      ayw $$3 = $$0.a();
      if ($$3 == null) {
         this.g = Math.max(this.g, 100);
      } else {
         if (this.d != null) {
            if ($$0.a(this.d)) {
               this.c.al().b(this.d);
               this.g = bcb.a(this.b, 0, $$3.b() / 2);
            }

            if (!this.c.al().c(this.d)) {
               this.d = null;
               this.g = Math.min(this.g, this.e.a($$3, this.b));
            }
         }

         this.g = Math.min(this.g, this.e.a($$3, this.b));
         if (this.d == null && this.g-- <= 0) {
            this.a($$0);
         }
      }
   }

   public void a(hwr $$0) {
      ayy $$1 = $$0.a().a().a();
      this.d = hvm.b($$1, $$0.b());
      switch (this.c.al().a(this.d)) {
         case a:
            this.c.aB().c();
            this.h = true;
            break;
         case b:
            this.h = false;
      }

      this.g = Integer.MAX_VALUE;
      this.f = $$0.b();
   }

   public void b() {
      if (!this.h) {
         this.c.aB().c();
         this.h = true;
      }
   }

   public void a(ayw $$0) {
      if (this.b($$0)) {
         this.c();
      }
   }

   public void c() {
      if (this.d != null) {
         this.c.al().b(this.d);
         this.d = null;
         this.c.aB().d();
      }

      this.g += 100;
   }

   private boolean a(float $$0) {
      if (this.d == null) {
         return false;
      } else if (this.f == $$0) {
         return true;
      } else {
         if (this.f < $$0) {
            this.f = this.f + bcb.a(this.f, 5.0E-4F, 0.005F);
            if (this.f > $$0) {
               this.f = $$0;
            }
         } else {
            this.f = 0.03F * $$0 + 0.97F * this.f;
            if (Math.abs(this.f - $$0) < 1.0E-4F || this.f < $$0) {
               this.f = $$0;
            }
         }

         this.f = bcb.a(this.f, 0.0F, 1.0F);
         if (this.f <= 1.0E-4F) {
            this.c();
            return false;
         } else {
            this.c.al().a(this.d, this.f);
            return true;
         }
      }
   }

   public boolean b(ayw $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }

   @Nullable
   public String d() {
      if (this.d != null) {
         hvo $$0 = this.d.b();
         if ($$0 != null) {
            return $$0.a().e();
         }
      }

      return null;
   }

   public void a(hws.a $$0) {
      this.e = $$0;
      this.g = this.e.a(this.c.am().a(), this.b);
   }

   public static enum a implements bce, bda {
      a(20),
      b(10),
      c(0);

      public static final Codec<hws.a> d = bda.a(hws.a::values);
      private static final String e = "options.music_frequency.";
      private final int f;
      private final int g;
      private final String h;

      private a(final int $$0) {
         this.f = $$0;
         this.g = $$0 * 1200;
         this.h = "options.music_frequency." + this.name().toLowerCase();
      }

      int a(@Nullable ayw $$0, bck $$1) {
         if ($$0 == null) {
            return this.g;
         } else if (this == c) {
            return 100;
         } else {
            int $$2 = Math.min($$0.b(), this.g);
            int $$3 = Math.min($$0.c(), this.g);
            return bcb.a($$1, $$2, $$3);
         }
      }

      @Override
      public int b() {
         return this.f;
      }

      @Override
      public String a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.name();
      }
   }
}
