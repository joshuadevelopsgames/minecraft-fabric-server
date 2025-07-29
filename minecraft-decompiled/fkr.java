import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import org.apache.commons.lang3.function.TriFunction;
import org.slf4j.Logger;

public abstract class fkr implements fkt {
   static final Logger c = LogUtils.getLogger();
   public static zm<ByteBuf, fkr> a = zm.a(fkr::a, fkr::c);
   protected final Either<UUID, String> b;
   private final fkt.a d;
   private final fkr.g e;

   fkr(Either<UUID, String> $$0, fkt.a $$1, fkr.g $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public Either<UUID, String> a() {
      return this.b;
   }

   public abstract void a(fkr var1);

   public void a(ByteBuf $$0) {
      wg $$1 = new wg($$0);
      $$1.a(this.b, kf.g, wg::a);
      fkt.a.b.encode($$1, this.d);
      $$1.a(this.e);
      this.b($$0);
   }

   public abstract void b(ByteBuf var1);

   private static fkr c(ByteBuf $$0) {
      wg $$1 = new wg($$0);
      Either<UUID, String> $$2 = $$1.b(kf.g, wg::p);
      fkt.a $$3 = fkt.a.b.decode($$1);
      fkr.g $$4 = $$1.b(fkr.g.class);
      return (fkr)$$4.e.apply($$2, $$3, $$1);
   }

   public static fkr a(UUID $$0, fkt.a $$1, kg $$2) {
      return new fkr.h($$0, $$1, $$2);
   }

   public static fkr a(UUID $$0, fkt.a $$1, dlz $$2) {
      return new fkr.c($$0, $$1, $$2);
   }

   public static fkr a(UUID $$0, fkt.a $$1, float $$2) {
      return new fkr.a($$0, $$1, $$2);
   }

   public static fkr a(UUID $$0) {
      return new fkr.d($$0);
   }

   public abstract double a(dmu var1, fkr.b var2);

   public abstract fkr.e a(dmu var1, fkr.f var2);

   public abstract double a(bzm var1);

   public fkt.a b() {
      return this.d;
   }

   static class a extends fkr {
      private float c;

      public a(UUID $$0, fkt.a $$1, float $$2) {
         super(Either.left($$0), $$1, fkr.g.d);
         this.c = $$2;
      }

      public a(Either<UUID, String> $$0, fkt.a $$1, wg $$2) {
         super($$0, $$1, fkr.g.d);
         this.c = $$2.readFloat();
      }

      @Override
      public void a(fkr $$0) {
         if ($$0 instanceof fkr.a $$1) {
            this.c = $$1.c;
         } else {
            fkr.c.warn("Unsupported Waypoint update operation: {}", $$0.getClass());
         }
      }

      @Override
      public void b(ByteBuf $$0) {
         $$0.writeFloat(this.c);
      }

      @Override
      public double a(dmu $$0, fkr.b $$1) {
         return bcb.c($$1.a(), this.c * (180.0F / (float)Math.PI));
      }

      @Override
      public fkr.e a(dmu $$0, fkr.f $$1) {
         double $$2 = $$1.a();
         if ($$2 < -1.0) {
            return fkr.e.c;
         } else {
            return $$2 > 1.0 ? fkr.e.b : fkr.e.a;
         }
      }

      @Override
      public double a(bzm $$0) {
         return Double.POSITIVE_INFINITY;
      }
   }

   public interface b {
      float a();

      fis b();
   }

   static class c extends fkr {
      private dlz c;

      public c(UUID $$0, fkt.a $$1, dlz $$2) {
         super(Either.left($$0), $$1, fkr.g.c);
         this.c = $$2;
      }

      public c(Either<UUID, String> $$0, fkt.a $$1, wg $$2) {
         super($$0, $$1, fkr.g.c);
         this.c = new dlz($$2.l(), $$2.l());
      }

      @Override
      public void a(fkr $$0) {
         if ($$0 instanceof fkr.c $$1) {
            this.c = $$1.c;
         } else {
            fkr.c.warn("Unsupported Waypoint update operation: {}", $$0.getClass());
         }
      }

      @Override
      public void b(ByteBuf $$0) {
         xf.a($$0, this.c.h);
         xf.a($$0, this.c.i);
      }

      private fis a(double $$0) {
         return fis.b(this.c.c((int)$$0));
      }

      @Override
      public double a(dmu $$0, fkr.b $$1) {
         fis $$2 = $$1.b();
         fis $$3 = $$2.d(this.a($$2.b())).k();
         float $$4 = (float)bcb.d($$3.c(), $$3.a()) * (180.0F / (float)Math.PI);
         return bcb.c($$1.a(), $$4);
      }

      @Override
      public fkr.e a(dmu $$0, fkr.f $$1) {
         double $$2 = $$1.a();
         if ($$2 < -1.0) {
            return fkr.e.c;
         } else {
            return $$2 > 1.0 ? fkr.e.b : fkr.e.a;
         }
      }

      @Override
      public double a(bzm $$0) {
         return $$0.g(fis.b(this.c.c($$0.dD())));
      }
   }

   static class d extends fkr {
      private d(Either<UUID, String> $$0, fkt.a $$1, wg $$2) {
         super($$0, $$1, fkr.g.a);
      }

      d(UUID $$0) {
         super(Either.left($$0), fkt.a.c, fkr.g.a);
      }

      @Override
      public void a(fkr $$0) {
      }

      @Override
      public void b(ByteBuf $$0) {
      }

      @Override
      public double a(dmu $$0, fkr.b $$1) {
         return Double.NaN;
      }

      @Override
      public fkr.e a(dmu $$0, fkr.f $$1) {
         return fkr.e.a;
      }

      @Override
      public double a(bzm $$0) {
         return Double.POSITIVE_INFINITY;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public interface f {
      fis a(fis var1);

      double a();
   }

   static enum g {
      a(fkr.d::new),
      b(fkr.h::new),
      c(fkr.c::new),
      d(fkr.a::new);

      final TriFunction<Either<UUID, String>, fkt.a, wg, fkr> e;

      private g(final TriFunction<Either<UUID, String>, fkt.a, wg, fkr> $$0) {
         this.e = $$0;
      }
   }

   static class h extends fkr {
      private kg c;

      public h(UUID $$0, fkt.a $$1, kg $$2) {
         super(Either.left($$0), $$1, fkr.g.b);
         this.c = $$2;
      }

      public h(Either<UUID, String> $$0, fkt.a $$1, wg $$2) {
         super($$0, $$1, fkr.g.b);
         this.c = new kg($$2.l(), $$2.l(), $$2.l());
      }

      @Override
      public void a(fkr $$0) {
         if ($$0 instanceof fkr.h $$1) {
            this.c = $$1.c;
         } else {
            fkr.c.warn("Unsupported Waypoint update operation: {}", $$0.getClass());
         }
      }

      @Override
      public void b(ByteBuf $$0) {
         xf.a($$0, this.c.u());
         xf.a($$0, this.c.v());
         xf.a($$0, this.c.w());
      }

      private fis a(dmu $$0) {
         return this.b.left().map($$0::b).map($$0x -> $$0x.dx().k(this.c) > 3 ? null : $$0x.bI()).orElseGet(() -> fis.b(this.c));
      }

      @Override
      public double a(dmu $$0, fkr.b $$1) {
         fis $$2 = $$1.b().d(this.a($$0)).k();
         float $$3 = (float)bcb.d($$2.c(), $$2.a()) * (180.0F / (float)Math.PI);
         return bcb.c($$1.a(), $$3);
      }

      @Override
      public fkr.e a(dmu $$0, fkr.f $$1) {
         fis $$2 = $$1.a(this.a($$0));
         boolean $$3 = $$2.f > 1.0;
         double $$4 = $$3 ? -$$2.e : $$2.e;
         if ($$4 < -1.0) {
            return fkr.e.c;
         } else if ($$4 > 1.0) {
            return fkr.e.b;
         } else {
            if ($$3) {
               if ($$2.e > 0.0) {
                  return fkr.e.b;
               }

               if ($$2.e < 0.0) {
                  return fkr.e.c;
               }
            }

            return fkr.e.a;
         }
      }

      @Override
      public double a(bzm $$0) {
         return $$0.g(fis.b(this.c));
      }
   }
}
