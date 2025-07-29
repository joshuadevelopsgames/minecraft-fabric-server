import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class dbo extends ddq {
   private static final float o = 1.25F;
   public static final int a = 8;
   private boolean p = false;
   private boolean q = false;
   private static final float r = 0.2F;
   private static final float s = 0.5F;
   private static final float t = 3.15F;
   private static final float u = 1.6F;
   public static final float b = 1.6F;
   private static final dbo.b v = new dbo.b(Optional.of(ayz.gN), Optional.of(ayz.gM), Optional.of(ayz.gL));

   public dbo(dcr.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<dcv> c() {
      return d;
   }

   @Override
   public Predicate<dcv> a() {
      return c;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      dez $$4 = $$3.a(kq.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bxj.c;
      } else if (!$$1.d($$3).f()) {
         this.p = false;
         this.q = false;
         $$1.c($$2);
         return bxj.c;
      } else {
         return bxj.d;
      }
   }

   private static float a(dez $$0) {
      return $$0.a(dcz.vW) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(dcv $$0, dmu $$1, cam $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      return a($$4, $$0, $$2) >= 1.0F && g($$0);
   }

   private static boolean a(cam $$0, dcv $$1) {
      List<dcv> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kq.P, dez.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(dcv $$0) {
      dez $$1 = $$0.a(kq.P, dez.a);
      return !$$1.b();
   }

   @Override
   protected void a(cam $$0, cvo $$1, int $$2, float $$3, float $$4, float $$5, @Nullable cam $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dC() - $$0.dC();
         double $$8 = $$6.dI() - $$0.dI();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dE() + $$9 * 0.2F;
         $$11 = a($$0, new fis($$7, $$10, $$8), $$5);
      } else {
         fis $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis($$5 * (float) (Math.PI / 180.0), $$12.d, $$12.e, $$12.f);
         fis $$14 = $$0.h(1.0F);
         $$11 = $$14.l().rotate($$13);
      }

      $$1.c($$11.x(), $$11.y(), $$11.z(), $$3, $$4);
      float $$16 = a($$0.ec(), $$2);
      $$0.ai().a(null, $$0.dC(), $$0.dE(), $$0.dI(), ayz.gR, $$0.do(), 1.0F, $$16);
   }

   private static Vector3f a(cam $$0, fis $$1, float $$2) {
      Vector3f $$3 = $$1.l().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ($$4.lengthSquared() <= 1.0E-7) {
         fis $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.l());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cvo a(dmu $$0, cam $$1, dcv $$2, dcv $$3, boolean $$4) {
      if ($$3.a(dcz.vW)) {
         return new cvj($$0, $$3, $$1, $$1.dC(), $$1.dG() - 0.15F, $$1.dI(), true);
      } else {
         cvo $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cvb $$6) {
            $$6.b(ayz.gK);
         }

         return $$5;
      }
   }

   @Override
   protected int h(dcv $$0) {
      return $$0.a(dcz.vW) ? 3 : 1;
   }

   public void a(dmu $$0, cam $$1, bxi $$2, dcv $$3, float $$4, float $$5, @Nullable cam $$6) {
      if ($$0 instanceof aub $$7) {
         dez $$9 = $$3.b(kq.P, dez.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cut, $$6);
            if ($$1 instanceof auc $$10) {
               aq.G.a($$10, $$3);
               $$10.b(azj.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(bck $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, bck $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, int $$3) {
      if (!$$0.C) {
         dbo.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / b($$2, $$1);
         if ($$5 < 0.2F) {
            this.p = false;
            this.q = false;
         }

         if ($$5 >= 0.2F && !this.p) {
            this.p = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (ayy)$$2x.a(), aza.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.q) {
            this.q = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (ayy)$$2x.a(), aza.h, 0.5F, 1.0F));
         }

         if ($$5 >= 1.0F && !g($$2) && a($$1, $$2)) {
            $$4.c().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (ayy)$$2x.a(), $$1.do(), 1.0F, 1.0F / ($$0.H_().i() * 0.5F + 1.0F) + 0.2F));
         }
      }
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      return 72000;
   }

   public static int b(dcv $$0, cam $$1) {
      float $$2 = djk.a($$0, $$1, 1.25F);
      return bcb.d($$2 * 20.0F);
   }

   @Override
   public dcx b(dcv $$0) {
      return dcx.g;
   }

   dbo.b i(dcv $$0) {
      return djk.b($$0, djj.B).orElse(v);
   }

   private static float a(int $$0, dcv $$1, cam $$2) {
      float $$3 = (float)$$0 / b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public boolean e_(dcv $$0) {
      return $$0.a((dcr)this);
   }

   @Override
   public int b() {
      return 8;
   }

   public static enum a implements bda {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<dbo.a> d = bda.a(dbo.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public record b(Optional<jl<ayy>> b, Optional<jl<ayy>> c, Optional<jl<ayy>> d) {
      public static final Codec<dbo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ayy.b.optionalFieldOf("start").forGetter(dbo.b::a),
               ayy.b.optionalFieldOf("mid").forGetter(dbo.b::b),
               ayy.b.optionalFieldOf("end").forGetter(dbo.b::c)
            )
            .apply($$0, dbo.b::new)
      );

      public Optional<jl<ayy>> a() {
         return this.b;
      }

      public Optional<jl<ayy>> b() {
         return this.c;
      }

      public Optional<jl<ayy>> c() {
         return this.d;
      }
   }
}
