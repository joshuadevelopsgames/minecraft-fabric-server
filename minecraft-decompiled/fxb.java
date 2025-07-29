import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Quaternionf;
import org.joml.Vector2ic;
import org.joml.Vector3f;

public class fxb {
   private static final int a = 2;
   private final fue b;
   private final Matrix3x2fStack c;
   private final fxb.a d = new fxb.a();
   private final fxc e;
   private final gcy f;
   @Nullable
   private Runnable g;

   private fxb(fue $$0, Matrix3x2fStack $$1, gcy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.e = $$0.aJ();
      this.f = $$2;
   }

   public fxb(fue $$0, gcy $$1) {
      this($$0, new Matrix3x2fStack(16), $$1);
   }

   public int a() {
      return this.b.aP().o();
   }

   public int b() {
      return this.b.aP().p();
   }

   public void c() {
      this.f.a();
   }

   public void d() {
      this.f.b();
   }

   public Matrix3x2fStack e() {
      return this.c;
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      if ($$1 < $$0) {
         int $$4 = $$0;
         $$0 = $$1;
         $$1 = $$4;
      }

      this.a($$0, $$2, $$1 + 1, $$2 + 1, $$3);
   }

   public void b(int $$0, int $$1, int $$2, int $$3) {
      if ($$2 < $$1) {
         int $$4 = $$1;
         $$1 = $$2;
         $$2 = $$4;
      }

      this.a($$0, $$1 + 1, $$0 + 1, $$2, $$3);
   }

   public void c(int $$0, int $$1, int $$2, int $$3) {
      gcd $$4 = new gcd($$0, $$1, $$2 - $$0, $$3 - $$1).a(this.c);
      this.d.a($$4);
   }

   public void f() {
      this.d.a();
   }

   public boolean a(int $$0, int $$1) {
      return this.d.a($$0, $$1);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a(gxx.ao, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(RenderPipeline $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      if ($$1 < $$3) {
         int $$6 = $$1;
         $$1 = $$3;
         $$3 = $$6;
      }

      if ($$2 < $$4) {
         int $$7 = $$2;
         $$2 = $$4;
         $$4 = $$7;
      }

      this.a($$0, gch.a(), $$1, $$2, $$3, $$4, $$5, null);
   }

   public void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a(gxx.ao, gch.a(), $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(RenderPipeline $$0, gch $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1, null);
   }

   private void a(RenderPipeline $$0, gch $$1, int $$2, int $$3, int $$4, int $$5, int $$6, @Nullable Integer $$7) {
      this.f.a(new gct($$0, $$1, new Matrix3x2f(this.c), $$2, $$3, $$4, $$5, $$6, $$7 != null ? $$7 : $$6, this.d.b()));
   }

   public void d(int $$0, int $$1, int $$2, int $$3) {
      this.a(gxx.ap, $$0, $$1, $$2, $$3, -1);
      this.a(gxx.aq, $$0, $$1, $$2, $$3, -16776961);
   }

   public void a(fwz $$0, String $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.b($$1) / 2, $$3, $$4);
   }

   public void a(fwz $$0, xo $$1, int $$2, int $$3, int $$4) {
      bbm $$5 = $$1.g();
      this.b($$0, $$5, $$2 - $$0.a($$5) / 2, $$3, $$4);
   }

   public void a(fwz $$0, bbm $$1, int $$2, int $$3, int $$4) {
      this.b($$0, $$1, $$2 - $$0.a($$1) / 2, $$3, $$4);
   }

   public void b(fwz $$0, @Nullable String $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public void a(fwz $$0, @Nullable String $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if ($$1 != null) {
         this.a($$0, ud.a().a(xt.e($$1)), $$2, $$3, $$4, $$5);
      }
   }

   public void b(fwz $$0, bbm $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public void a(fwz $$0, bbm $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if (baj.a($$4) != 0) {
         this.f.a(new gcz($$0, $$1, new Matrix3x2f(this.c), $$2, $$3, $$4, 0, $$5, this.d.b()));
      }
   }

   public void b(fwz $$0, xo $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, true);
   }

   public void a(fwz $$0, xo $$1, int $$2, int $$3, int $$4, boolean $$5) {
      this.a($$0, $$1.g(), $$2, $$3, $$4, $$5);
   }

   public void a(fwz $$0, xt $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, true);
   }

   public void a(fwz $$0, xt $$1, int $$2, int $$3, int $$4, int $$5, boolean $$6) {
      for (bbm $$7 : $$0.c($$1, $$4)) {
         this.a($$0, $$7, $$2, $$3, $$5, $$6);
         $$3 += 9;
      }
   }

   public void a(fwz $$0, xo $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = this.b.n.b(0.0F);
      if ($$6 != 0) {
         int $$7 = 2;
         this.a($$2 - 2, $$3 - 2, $$2 + $$4 + 2, $$3 + 9 + 2, baj.a($$6, $$5));
      }

      this.a($$0, $$1, $$2, $$3, $$5, true);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$0 + $$2, $$1 + 1, $$4);
      this.a($$0, $$1 + $$3 - 1, $$0 + $$2, $$1 + $$3, $$4);
      this.a($$0, $$1 + 1, $$0 + 1, $$1 + $$3 - 1, $$4);
      this.a($$0 + $$2 - 1, $$1 + 1, $$0 + $$2, $$1 + $$3 - 1, $$4);
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, int $$4, int $$5, float $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, baj.a($$6, -1));
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      hrs $$7 = this.e.a($$1);
      htl $$8 = this.e.a($$7);
      if ($$8 instanceof htl.b) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, $$6);
      } else if ($$8 instanceof htl.c $$9) {
         this.a($$0, $$7, $$2, $$3, $$4, $$5, 0, 0, $$9.b(), $$9.c(), $$9.b(), $$9.c(), $$6);
      } else if ($$8 instanceof htl.a $$10) {
         this.a($$0, $$7, $$10, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, -1);
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      hrs $$11 = this.e.a($$1);
      htl $$12 = this.e.a($$11);
      if ($$12 instanceof htl.b) {
         this.a($$0, $$11, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      } else {
         this.c($$6, $$7, $$6 + $$8, $$7 + $$9);
         this.a($$0, $$1, $$6 - $$4, $$7 - $$5, $$2, $$3, $$10);
         this.f();
      }
   }

   public void a(RenderPipeline $$0, hrs $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, -1);
   }

   public void a(RenderPipeline $$0, hrs $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if ($$4 != 0 && $$5 != 0) {
         this.a($$0, $$1.j(), $$2, $$2 + $$4, $$3, $$3 + $$5, $$1.c(), $$1.d(), $$1.h(), $$1.i(), $$6);
      }
   }

   private void a(RenderPipeline $$0, hrs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      if ($$8 != 0 && $$9 != 0) {
         this.a(
            $$0,
            $$1.j(),
            $$6,
            $$6 + $$8,
            $$7,
            $$7 + $$9,
            $$1.a((float)$$4 / $$2),
            $$1.a((float)($$4 + $$8) / $$2),
            $$1.c((float)$$5 / $$3),
            $$1.c((float)($$5 + $$9) / $$3),
            $$10
         );
      }
   }

   private void a(RenderPipeline $$0, hrs $$1, htl.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      htl.a.a $$8 = $$2.d();
      int $$9 = Math.min($$8.a(), $$5 / 2);
      int $$10 = Math.min($$8.c(), $$5 / 2);
      int $$11 = Math.min($$8.b(), $$6 / 2);
      int $$12 = Math.min($$8.d(), $$6 / 2);
      if ($$5 == $$2.b() && $$6 == $$2.c()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$6, $$7);
      } else if ($$6 == $$2.c()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$6, $$7);
         this.a($$0, $$2, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$6, $$9, 0, $$2.b() - $$10 - $$9, $$2.c(), $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$6, $$7);
      } else if ($$5 == $$2.b()) {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$5, $$11, $$7);
         this.a($$0, $$2, $$1, $$3, $$4 + $$11, $$5, $$6 - $$12 - $$11, 0, $$11, $$2.b(), $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$5, $$12, $$7);
      } else {
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, 0, $$3, $$4, $$9, $$11, $$7);
         this.a($$0, $$2, $$1, $$3 + $$9, $$4, $$5 - $$10 - $$9, $$11, $$9, 0, $$2.b() - $$10 - $$9, $$11, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, 0, $$3 + $$5 - $$10, $$4, $$10, $$11, $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), 0, $$2.c() - $$12, $$3, $$4 + $$6 - $$12, $$9, $$12, $$7);
         this.a($$0, $$2, $$1, $$3 + $$9, $$4 + $$6 - $$12, $$5 - $$10 - $$9, $$12, $$9, $$2.c() - $$12, $$2.b() - $$10 - $$9, $$12, $$2.b(), $$2.c(), $$7);
         this.a($$0, $$1, $$2.b(), $$2.c(), $$2.b() - $$10, $$2.c() - $$12, $$3 + $$5 - $$10, $$4 + $$6 - $$12, $$10, $$12, $$7);
         this.a($$0, $$2, $$1, $$3, $$4 + $$11, $$9, $$6 - $$12 - $$11, 0, $$11, $$9, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
         this.a(
            $$0,
            $$2,
            $$1,
            $$3 + $$9,
            $$4 + $$11,
            $$5 - $$10 - $$9,
            $$6 - $$12 - $$11,
            $$9,
            $$11,
            $$2.b() - $$10 - $$9,
            $$2.c() - $$12 - $$11,
            $$2.b(),
            $$2.c(),
            $$7
         );
         this.a($$0, $$2, $$1, $$3 + $$5 - $$10, $$4 + $$11, $$10, $$6 - $$12 - $$11, $$2.b() - $$10, $$11, $$10, $$2.c() - $$12 - $$11, $$2.b(), $$2.c(), $$7);
      }
   }

   private void a(RenderPipeline $$0, htl.a $$1, hrs $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12, int $$13) {
      if ($$5 > 0 && $$6 > 0) {
         if ($$1.e()) {
            this.a(
               $$0,
               $$2.j(),
               $$3,
               $$3 + $$5,
               $$4,
               $$4 + $$6,
               $$2.a((float)$$7 / $$11),
               $$2.a((float)($$7 + $$9) / $$11),
               $$2.c((float)$$8 / $$12),
               $$2.c((float)($$8 + $$10) / $$12),
               $$13
            );
         } else {
            this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13);
         }
      }
   }

   private void a(RenderPipeline $$0, hrs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
      if ($$4 > 0 && $$5 > 0) {
         if ($$8 > 0 && $$9 > 0) {
            for (int $$13 = 0; $$13 < $$4; $$13 += $$8) {
               int $$14 = Math.min($$8, $$4 - $$13);

               for (int $$15 = 0; $$15 < $$5; $$15 += $$9) {
                  int $$16 = Math.min($$9, $$5 - $$15);
                  this.a($$0, $$1, $$10, $$11, $$6, $$7, $$2 + $$13, $$3 + $$15, $$14, $$16, $$12);
               }
            }
         } else {
            throw new IllegalArgumentException("Tiled sprite texture size must be positive, got " + $$8 + "x" + $$9);
         }
      }
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9, $$10);
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$6, $$7, $$8, $$9);
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, -1);
   }

   public void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9, int $$10, int $$11, int $$12) {
      this.a($$0, $$1, $$2, $$2 + $$6, $$3, $$3 + $$7, ($$4 + 0.0F) / $$10, ($$4 + $$8) / $$10, ($$5 + 0.0F) / $$11, ($$5 + $$9) / $$11, $$12);
   }

   public void a(ame $$0, int $$1, int $$2, int $$3, int $$4, float $$5, float $$6, float $$7, float $$8) {
      this.a(gxx.ar, $$0, $$1, $$3, $$2, $$4, $$5, $$6, $$7, $$8, -1);
   }

   private void a(RenderPipeline $$0, ame $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      GpuTextureView $$11 = this.b.ab().b($$1).b();
      this.a($$0, $$11, $$2, $$4, $$3, $$5, $$6, $$7, $$8, $$9, $$10);
   }

   private void a(RenderPipeline $$0, GpuTextureView $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, float $$9, int $$10) {
      this.f.a((gcw)(new gcs($$0, gch.a($$1), new Matrix3x2f(this.c), $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, this.d.b())));
   }

   public void a(dcv $$0, int $$1, int $$2) {
      this.a(this.b.t, this.b.s, $$0, $$1, $$2, 0);
   }

   public void a(dcv $$0, int $$1, int $$2, int $$3) {
      this.a(this.b.t, this.b.s, $$0, $$1, $$2, $$3);
   }

   public void b(dcv $$0, int $$1, int $$2) {
      this.b($$0, $$1, $$2, 0);
   }

   public void b(dcv $$0, int $$1, int $$2, int $$3) {
      this.a(null, this.b.s, $$0, $$1, $$2, $$3);
   }

   public void a(cam $$0, dcv $$1, int $$2, int $$3, int $$4) {
      this.a($$0, $$0.ai(), $$1, $$2, $$3, $$4);
   }

   private void a(@Nullable cam $$0, @Nullable dmu $$1, dcv $$2, int $$3, int $$4, int $$5) {
      if (!$$2.f()) {
         hon $$6 = new hon();
         this.b.bg().a($$6, $$2, dct.g, $$1, $$0, $$5);

         try {
            this.f.a(new gcx($$2.h().l().toString(), new Matrix3x2f(this.c), $$6, $$3, $$4, this.d.b()));
         } catch (Throwable var11) {
            p $$8 = p.a(var11, "Rendering item");
            q $$9 = $$8.a("Item being rendered");
            $$9.a("Item Type", () -> String.valueOf($$2.h()));
            $$9.a("Item Components", () -> String.valueOf($$2.a()));
            $$9.a("Item Foil", () -> String.valueOf($$2.C()));
            throw new aa($$8);
         }
      }
   }

   public void a(fwz $$0, dcv $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fwz $$0, dcv $$1, int $$2, int $$3, @Nullable String $$4) {
      if (!$$1.f()) {
         this.c.pushMatrix();
         this.c($$1, $$2, $$3);
         this.d($$1, $$2, $$3);
         this.b($$0, $$1, $$2, $$3, $$4);
         this.c.popMatrix();
      }
   }

   public void a(xo $$0, int $$1, int $$2) {
      this.a(List.of($$0.g()), $$1, $$2);
   }

   public void a(List<bbm> $$0, int $$1, int $$2) {
      this.a(this.b.h, $$0, ghz.a, $$1, $$2, false);
   }

   public void b(fwz $$0, dcv $$1, int $$2, int $$3) {
      this.a($$0, get.a(this.b, $$1), $$1.b(), $$2, $$3, $$1.a(kq.G));
   }

   public void a(fwz $$0, List<xo> $$1, Optional<dau> $$2, int $$3, int $$4) {
      this.a($$0, $$1, $$2, $$3, $$4, null);
   }

   public void a(fwz $$0, List<xo> $$1, Optional<dau> $$2, int $$3, int $$4, @Nullable ame $$5) {
      List<ghx> $$6 = $$1.stream().map(xo::g).map(ghx::a).collect(ag.b());
      $$2.ifPresent($$1x -> $$6.add($$6.isEmpty() ? 0 : 1, ghx.a($$1x)));
      this.a($$0, $$6, $$3, $$4, ghz.a, $$5, false);
   }

   public void a(fwz $$0, xo $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fwz $$0, xo $$1, int $$2, int $$3, @Nullable ame $$4) {
      this.b($$0, List.of($$1.g()), $$2, $$3, $$4);
   }

   public void a(fwz $$0, List<xo> $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, null);
   }

   public void a(fwz $$0, List<xo> $$1, int $$2, int $$3, @Nullable ame $$4) {
      this.a($$0, $$1.stream().map(xo::g).map(ghx::a).toList(), $$2, $$3, ghz.a, $$4, false);
   }

   public void b(fwz $$0, List<? extends bbm> $$1, int $$2, int $$3) {
      this.b($$0, $$1, $$2, $$3, null);
   }

   public void b(fwz $$0, List<? extends bbm> $$1, int $$2, int $$3, @Nullable ame $$4) {
      this.a($$0, $$1.stream().map(ghx::a).collect(Collectors.toList()), $$2, $$3, ghz.a, $$4, false);
   }

   public void a(fwz $$0, List<bbm> $$1, ghy $$2, int $$3, int $$4, boolean $$5) {
      this.a($$0, $$1.stream().map(ghx::a).collect(Collectors.toList()), $$3, $$4, $$2, null, $$5);
   }

   private void a(fwz $$0, List<ghx> $$1, int $$2, int $$3, ghy $$4, @Nullable ame $$5, boolean $$6) {
      if (!$$1.isEmpty()) {
         if (this.g == null || $$6) {
            this.g = () -> this.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }
   }

   public void a(fwz $$0, List<ghx> $$1, int $$2, int $$3, ghy $$4, @Nullable ame $$5) {
      int $$6 = 0;
      int $$7 = $$1.size() == 1 ? -2 : 0;

      for (ghx $$8 : $$1) {
         int $$9 = $$8.b($$0);
         if ($$9 > $$6) {
            $$6 = $$9;
         }

         $$7 += $$8.a($$0);
      }

      int $$10 = $$6;
      int $$11 = $$7;
      Vector2ic $$12 = $$4.a(this.a(), this.b(), $$2, $$3, $$6, $$7);
      int $$13 = $$12.x();
      int $$14 = $$12.y();
      this.c.pushMatrix();
      gib.a(this, $$13, $$14, $$6, $$7, $$5);
      int $$15 = $$14;

      for (int $$16 = 0; $$16 < $$1.size(); $$16++) {
         ghx $$17 = $$1.get($$16);
         $$17.a(this, $$0, $$13, $$15);
         $$15 += $$17.a($$0) + ($$16 == 0 ? 2 : 0);
      }

      $$15 = $$14;

      for (int $$18 = 0; $$18 < $$1.size(); $$18++) {
         ghx $$19 = $$1.get($$18);
         $$19.a($$0, $$13, $$15, $$10, $$11, this);
         $$15 += $$19.a($$0) + ($$18 == 0 ? 2 : 0);
      }

      this.c.popMatrix();
   }

   public void g() {
      if (this.g != null) {
         this.c();
         this.g.run();
         this.g = null;
      }
   }

   private void c(dcv $$0, int $$1, int $$2) {
      if ($$0.s()) {
         int $$3 = $$1 + 2;
         int $$4 = $$2 + 13;
         this.a(gxx.ao, $$3, $$4, $$3 + 13, $$4 + 2, -16777216);
         this.a(gxx.ao, $$3, $$4, $$3 + $$0.t(), $$4 + 1, baj.f($$0.u()));
      }
   }

   private void b(fwz $$0, dcv $$1, int $$2, int $$3, @Nullable String $$4) {
      if ($$1.M() != 1 || $$4 != null) {
         String $$5 = $$4 == null ? String.valueOf($$1.M()) : $$4;
         this.a($$0, $$5, $$2 + 19 - 2 - $$0.b($$5), $$3 + 6 + 3, -1, true);
      }
   }

   private void d(dcv $$0, int $$1, int $$2) {
      gwi $$3 = this.b.t;
      float $$4 = $$3 == null ? 0.0F : $$3.gP().a($$0, this.b.aw().a(true));
      if ($$4 > 0.0F) {
         int $$5 = $$2 + bcb.d(16.0F * (1.0F - $$4));
         int $$6 = $$5 + bcb.f(16.0F * $$4);
         this.a(gxx.ao, $$1, $$5, $$1 + 16, $$6, Integer.MAX_VALUE);
      }
   }

   public void a(fwz $$0, @Nullable yl $$1, int $$2, int $$3) {
      if ($$1 != null && $$1.j() != null) {
         switch ($$1.j()) {
            case xu.d var7:
               xu.d var23 = var7;

               try {
                  var24 = var23.b();
               } catch (Throwable var16) {
                  throw new MatchException(var16.toString(), var16);
               }

               dcv var17 = var24;
               this.b($$0, var17, $$2, $$3);
               break;
            case xu.c var9:
               xu.c var21 = var9;

               try {
                  var22 = var21.b();
               } catch (Throwable var15) {
                  throw new MatchException(var15.toString(), var15);
               }

               xu.b var18 = var22;
               if (this.b.n.m) {
                  this.a($$0, var18.a(), $$2, $$3);
               }
               break;
            case xu.e var11:
               xu.e var19 = var11;

               try {
                  var20 = var19.b();
               } catch (Throwable var14) {
                  throw new MatchException(var14.toString(), var14);
               }

               xo var13 = var20;
               this.b($$0, $$0.c(var13, Math.max(this.a() / 2, 200)), $$2, $$3);
               return;
            default:
         }
      }
   }

   public void a(hra $$0) {
      fue $$1 = fue.R();
      hru $$2 = $$1.ab();
      GpuTextureView $$3 = $$2.b($$0.a).b();
      this.a(gxx.ar, $$3, 0, 0, 128, 128, 0.0F, 1.0F, 0.0F, 1.0F, -1);

      for (hra.a $$4 : $$0.b) {
         if ($$4.e) {
            this.c.pushMatrix();
            this.c.translate($$4.b / 2.0F + 64.0F, $$4.c / 2.0F + 64.0F);
            this.c.rotate((float) (Math.PI / 180.0) * $$4.d * 360.0F / 16.0F);
            this.c.scale(4.0F, 4.0F);
            this.c.translate(-0.125F, 0.125F);
            hrs $$5 = $$4.a;
            if ($$5 != null) {
               GpuTextureView $$6 = $$2.b($$5.j()).b();
               this.a(gxx.ar, $$6, -1, -1, 1, 1, $$5.c(), $$5.d(), $$5.i(), $$5.h(), -1);
            }

            this.c.popMatrix();
            if ($$4.f != null) {
               fwz $$7 = $$1.h;
               float $$8 = $$7.a($$4.f);
               float $$9 = bcb.a(25.0F / $$8, 0.0F, 6.0F / 9.0F);
               this.c.pushMatrix();
               this.c.translate($$4.b / 2.0F + 64.0F - $$8 * $$9 / 2.0F, $$4.c / 2.0F + 64.0F + 4.0F);
               this.c.scale($$9, $$9);
               this.f.a(new gcz($$7, $$4.f.g(), new Matrix3x2f(this.c), 0, 0, -1, Integer.MIN_VALUE, false, this.d.b()));
               this.c.popMatrix();
            }
         }
      }
   }

   public void a(hkn $$0, float $$1, Vector3f $$2, Quaternionf $$3, @Nullable Quaternionf $$4, int $$5, int $$6, int $$7, int $$8) {
      this.f.a(new gde($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$1, this.d.b()));
   }

   public void a(gop $$0, ame $$1, float $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8, int $$9) {
      this.f.a(new gdh($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$2, this.d.b()));
   }

   public void a(gmm $$0, ame $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8) {
      this.f.a(new gdd($$0, $$1, $$3, $$4, $$5, $$6, $$7, $$8, $$2, this.d.b()));
   }

   public void a(gqn $$0, dbt $$1, eap $$2, int $$3, int $$4, int $$5, int $$6) {
      this.f.a(new gdc($$0, $$1, $$2, $$3, $$4, $$5, $$6, this.d.b()));
   }

   public void a(gof $$0, float $$1, efp $$2, int $$3, int $$4, int $$5, int $$6) {
      this.f.a(new gdg($$0, $$2, $$3, $$4, $$5, $$6, $$1, this.d.b()));
   }

   public void a(List<btv> $$0, int $$1, int $$2, int $$3, int $$4) {
      this.f.a(new gdf($$0, $$1, $$2, $$3, $$4, this.d.b()));
   }

   static class a {
      private final Deque<gcd> a = new ArrayDeque<>();

      public gcd a(gcd $$0) {
         gcd $$1 = this.a.peekLast();
         if ($$1 != null) {
            gcd $$2 = Objects.requireNonNullElse($$0.b($$1), gcd.a());
            this.a.addLast($$2);
            return $$2;
         } else {
            this.a.addLast($$0);
            return $$0;
         }
      }

      @Nullable
      public gcd a() {
         if (this.a.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
         } else {
            this.a.removeLast();
            return this.a.peekLast();
         }
      }

      @Nullable
      public gcd b() {
         return this.a.peekLast();
      }

      public boolean a(int $$0, int $$1) {
         return this.a.isEmpty() ? true : this.a.peek().a($$0, $$1);
      }
   }
}
