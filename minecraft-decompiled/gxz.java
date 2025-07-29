import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.joml.Vector4f;

public abstract class gxz extends gxy {
   private static final int D = 1048576;
   public static final int x = 4194304;
   public static final int y = 786432;
   public static final int z = 1536;
   private static final gxz E = a("solid", 1536, true, false, gxx.b, gxz.b.a().a(j).a(c).a(true));
   private static final gxz F = a("cutout_mipped", 1536, true, false, gxx.d, gxz.b.a().a(j).a(c).a(true));
   private static final gxz G = a("cutout", 1536, true, false, gxx.e, gxz.b.a().a(j).a(d).a(true));
   private static final gxz H = a("translucent_moving_block", 786432, false, true, gxx.h, gxz.b.a().a(j).a(c).a(v).a(true));
   private static final Function<ame, gxz> I = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(o).a(true);
      return a("armor_cutout_no_cull", 1536, true, false, gxx.i, $$1);
   });
   private static final Function<ame, gxz> J = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(o).a(true);
      return a("armor_translucent", 1536, true, true, gxx.k, $$1);
   });
   private static final Function<ame, gxz> K = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(true);
      return a("entity_solid", 1536, true, false, gxx.l, $$1);
   });
   private static final Function<ame, gxz> L = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(p).a(true);
      return a("entity_solid_z_offset_forward", 1536, true, false, gxx.m, $$1);
   });
   private static final Function<ame, gxz> M = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(true);
      return a("entity_cutout", 1536, true, false, gxx.n, $$1);
   });
   private static final BiFunction<ame, Boolean, gxz> N = ag.a(($$0, $$1) -> {
      gxz.b $$2 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a($$1);
      return a("entity_cutout_no_cull", 1536, true, false, gxx.o, $$2);
   });
   private static final BiFunction<ame, Boolean, gxz> O = ag.a(($$0, $$1) -> {
      gxz.b $$2 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(o).a($$1);
      return a("entity_cutout_no_cull_z_offset", 1536, true, false, gxx.p, $$2);
   });
   private static final Function<ame, gxz> P = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(v).a(j).a(l).a(true);
      return a("item_entity_translucent_cull", 1536, true, true, gxx.z, $$1);
   });
   private static final BiFunction<ame, Boolean, gxz> Q = ag.a(($$0, $$1) -> {
      gxz.b $$2 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a($$1);
      return a("entity_translucent", 1536, true, true, gxx.q, $$2);
   });
   private static final BiFunction<ame, Boolean, gxz> R = ag.a(($$0, $$1) -> {
      gxz.b $$2 = gxz.b.a().a(new gxy.j($$0, false)).a(l).a($$1);
      return a("entity_translucent_emissive", 1536, true, true, gxx.r, $$2);
   });
   private static final Function<ame, gxz> S = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(true);
      return a("entity_smooth_cutout", 1536, gxx.s, $$1);
   });
   private static final BiFunction<ame, Boolean, gxz> T = ag.a(($$0, $$1) -> {
      gxz.b $$2 = gxz.b.a().a(new gxy.j($$0, false)).a(false);
      return a("beacon_beam", 1536, false, true, $$1 ? gxx.B : gxx.A, $$2);
   });
   private static final Function<ame, gxz> U = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(false);
      return a("entity_decal", 1536, gxx.x, $$1);
   });
   private static final Function<ame, gxz> V = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(false);
      return a("entity_no_outline", 1536, false, true, gxx.t, $$1);
   });
   private static final Function<ame, gxz> W = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(o).a(false);
      return a("entity_shadow", 1536, false, false, gxx.y, $$1);
   });
   private static final Function<ame, gxz> X = ag.b($$0 -> {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(true);
      return a("entity_alpha", 1536, gxx.C, $$1);
   });
   private static final Function<ame, gxz> Y = ag.b($$0 -> {
      gxy.j $$1 = new gxy.j($$0, false);
      return a("eyes", 1536, false, true, gxx.w, gxz.b.a().a($$1).a(false));
   });
   private static final gxz Z = a("leash", 1536, gxx.D, gxz.b.a().a(e).a(j).a(false));
   private static final gxz aa = a("water_mask", 1536, gxx.E, gxz.b.a().a(e).a(false));
   private static final gxz ab = a("armor_entity_glint", 1536, gxx.F, gxz.b.a().a(new gxy.j(hfd.a, false)).a(i).a(o).a(false));
   private static final gxz ac = a("glint_translucent", 1536, gxx.F, gxz.b.a().a(new gxy.j(hfd.b, false)).a(g).a(v).a(false));
   private static final gxz ad = a("glint", 1536, gxx.F, gxz.b.a().a(new gxy.j(hfd.b, false)).a(g).a(false));
   private static final gxz ae = a("entity_glint", 1536, gxx.F, gxz.b.a().a(new gxy.j(hfd.b, false)).a(h).a(false));
   private static final Function<ame, gxz> af = ag.b($$0 -> {
      gxy.j $$1 = new gxy.j($$0, false);
      return a("crumbling", 1536, false, true, gxx.G, gxz.b.a().a($$1).a(false));
   });
   private static final Function<ame, gxz> ag = ag.b($$0 -> a("text", 786432, false, false, gxx.H, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false)));
   private static final gxz ah = a("text_background", 1536, false, true, gxx.I, gxz.b.a().a(e).a(j).a(false));
   private static final Function<ame, gxz> ai = ag.b($$0 -> a("text_intensity", 786432, false, false, gxx.J, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false)));
   private static final Function<ame, gxz> aj = ag.b(
      $$0 -> a("text_polygon_offset", 1536, false, true, gxx.K, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false))
   );
   private static final Function<ame, gxz> ak = ag.b(
      $$0 -> a("text_intensity_polygon_offset", 1536, false, true, gxx.J, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false))
   );
   private static final Function<ame, gxz> al = ag.b($$0 -> a("text_see_through", 1536, false, false, gxx.L, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false)));
   private static final gxz am = a("text_background_see_through", 1536, false, true, gxx.M, gxz.b.a().a(e).a(j).a(false));
   private static final Function<ame, gxz> an = ag.b(
      $$0 -> a("text_intensity_see_through", 1536, false, true, gxx.N, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false))
   );
   private static final gxz ao = a("lightning", 1536, false, true, gxx.O, gxz.b.a().a(u).a(false));
   private static final gxz ap = a("dragon_rays", 1536, false, false, gxx.P, gxz.b.a().a(false));
   private static final gxz aq = a("dragon_rays_depth", 1536, false, false, gxx.Q, gxz.b.a().a(false));
   private static final gxz ar = a("tripwire", 1536, true, true, gxx.g, gxz.b.a().a(j).a(c).a(u).a(true));
   private static final gxz as = a("end_portal", 1536, false, false, gxx.R, gxz.b.a().a(gxy.f.e().a(haw.a, false).a(haw.b, false).a()).a(false));
   private static final gxz at = a("end_gateway", 1536, false, false, gxx.S, gxz.b.a().a(gxy.f.e().a(haw.a, false).a(haw.b, false).a()).a(false));
   public static final gxz.a A = a("lines", 1536, gxx.V, gxz.b.a().a(new gxy.e(OptionalDouble.empty())).a(o).a(v).a(false));
   public static final gxz.a B = a("secondary_block_outline", 1536, gxx.W, gxz.b.a().a(new gxy.e(OptionalDouble.of(7.0))).a(o).a(v).a(false));
   public static final gxz.a C = a("line_strip", 1536, gxx.X, gxz.b.a().a(new gxy.e(OptionalDouble.empty())).a(o).a(v).a(false));
   private static final Function<Double, gxz.a> au = ag.b($$0 -> a("debug_line_strip", 1536, gxx.Y, gxz.b.a().a(new gxy.e(OptionalDouble.of($$0))).a(false)));
   private static final gxz.a av = a("debug_filled_box", 1536, false, true, gxx.Z, gxz.b.a().a(o).a(false));
   private static final gxz.a aw = a("debug_quads", 1536, false, true, gxx.aa, gxz.b.a().a(false));
   private static final gxz.a ax = a("debug_triangle_fan", 1536, false, true, gxx.ab, gxz.b.a().a(false));
   private static final gxz.a ay = a("debug_structure_quads", 1536, false, true, gxx.ac, gxz.b.a().a(false));
   private static final gxz.a az = a("debug_section_quads", 1536, false, true, gxx.ad, gxz.b.a().a(o).a(false));
   private static final Function<ame, gxz> aA = ag.b($$0 -> a("opaque_particle", 1536, false, false, gxx.af, gxz.b.a().a(new gxy.j($$0, false)).a(j).a(false)));
   private static final Function<ame, gxz> aB = ag.b(
      $$0 -> a("translucent_particle", 1536, false, false, gxx.ag, gxz.b.a().a(new gxy.j($$0, false)).a(t).a(j).a(false))
   );
   private static final Function<ame, gxz> aC = a(gxx.ah);
   private static final Function<ame, gxz> aD = a(gxx.ai);
   private static final gxz aE = a("sunrise_sunset", 1536, false, false, gxx.al, gxz.b.a().a(false));
   private static final Function<ame, gxz> aF = ag.b($$0 -> a("celestial", 1536, false, false, gxx.an, gxz.b.a().a(new gxy.j($$0, false)).a(false)));
   private static final Function<ame, gxz> aG = ag.b($$0 -> a("block_screen_effect", 1536, false, false, gxx.at, gxz.b.a().a(new gxy.j($$0, false)).a(false)));
   private static final Function<ame, gxz> aH = ag.b($$0 -> a("fire_screen_effect", 1536, false, false, gxx.au, gxz.b.a().a(new gxy.j($$0, false)).a(false)));
   private final int aI;
   private final boolean aJ;
   private final boolean aK;

   public static gxz d() {
      return E;
   }

   public static gxz e() {
      return F;
   }

   public static gxz f() {
      return G;
   }

   public static gxz g() {
      return H;
   }

   public static gxz a(ame $$0) {
      return I.apply($$0);
   }

   public static gxz b(ame $$0) {
      gxz.b $$1 = gxz.b.a().a(new gxy.j($$0, false)).a(j).a(l).a(o).a(true);
      return a("armor_decal_cutout_no_cull", 1536, true, false, gxx.j, $$1);
   }

   public static gxz c(ame $$0) {
      return J.apply($$0);
   }

   public static gxz d(ame $$0) {
      return K.apply($$0);
   }

   public static gxz e(ame $$0) {
      return L.apply($$0);
   }

   public static gxz f(ame $$0) {
      return M.apply($$0);
   }

   public static gxz a(ame $$0, boolean $$1) {
      return N.apply($$0, $$1);
   }

   public static gxz g(ame $$0) {
      return a($$0, true);
   }

   public static gxz b(ame $$0, boolean $$1) {
      return O.apply($$0, $$1);
   }

   public static gxz h(ame $$0) {
      return b($$0, true);
   }

   public static gxz i(ame $$0) {
      return P.apply($$0);
   }

   public static gxz c(ame $$0, boolean $$1) {
      return Q.apply($$0, $$1);
   }

   public static gxz j(ame $$0) {
      return c($$0, true);
   }

   public static gxz d(ame $$0, boolean $$1) {
      return R.apply($$0, $$1);
   }

   public static gxz k(ame $$0) {
      return d($$0, true);
   }

   public static gxz l(ame $$0) {
      return S.apply($$0);
   }

   public static gxz e(ame $$0, boolean $$1) {
      return T.apply($$0, $$1);
   }

   public static gxz m(ame $$0) {
      return U.apply($$0);
   }

   public static gxz n(ame $$0) {
      return V.apply($$0);
   }

   public static gxz o(ame $$0) {
      return W.apply($$0);
   }

   public static gxz p(ame $$0) {
      return X.apply($$0);
   }

   public static gxz q(ame $$0) {
      return Y.apply($$0);
   }

   public static gxz r(ame $$0) {
      return R.apply($$0, false);
   }

   public static gxz a(ame $$0, float $$1, float $$2) {
      return a("breeze_wind", 1536, false, true, gxx.u, gxz.b.a().a(new gxy.j($$0, false)).a(new gxy.g($$1, $$2)).a(j).a(m).a(false));
   }

   public static gxz b(ame $$0, float $$1, float $$2) {
      return a("energy_swirl", 1536, false, true, gxx.v, gxz.b.a().a(new gxy.j($$0, false)).a(new gxy.g($$1, $$2)).a(j).a(l).a(false));
   }

   public static gxz h() {
      return Z;
   }

   public static gxz i() {
      return aa;
   }

   public static gxz s(ame $$0) {
      return gxz.a.D.apply($$0, false);
   }

   public static gxz j() {
      return ab;
   }

   public static gxz k() {
      return ac;
   }

   public static gxz l() {
      return ad;
   }

   public static gxz m() {
      return ae;
   }

   public static gxz t(ame $$0) {
      return af.apply($$0);
   }

   public static gxz u(ame $$0) {
      return ag.apply($$0);
   }

   public static gxz n() {
      return ah;
   }

   public static gxz v(ame $$0) {
      return ai.apply($$0);
   }

   public static gxz w(ame $$0) {
      return aj.apply($$0);
   }

   public static gxz x(ame $$0) {
      return ak.apply($$0);
   }

   public static gxz y(ame $$0) {
      return al.apply($$0);
   }

   public static gxz o() {
      return am;
   }

   public static gxz z(ame $$0) {
      return an.apply($$0);
   }

   public static gxz p() {
      return ao;
   }

   public static gxz q() {
      return ap;
   }

   public static gxz r() {
      return aq;
   }

   public static gxz s() {
      return ar;
   }

   public static gxz t() {
      return as;
   }

   public static gxz u() {
      return at;
   }

   public static gxz v() {
      return A;
   }

   public static gxz w() {
      return B;
   }

   public static gxz x() {
      return C;
   }

   public static gxz a(double $$0) {
      return au.apply($$0);
   }

   public static gxz y() {
      return av;
   }

   public static gxz z() {
      return aw;
   }

   public static gxz A() {
      return ax;
   }

   public static gxz B() {
      return ay;
   }

   public static gxz C() {
      return az;
   }

   public static gxz A(ame $$0) {
      return aA.apply($$0);
   }

   public static gxz B(ame $$0) {
      return aB.apply($$0);
   }

   private static Function<ame, gxz> a(RenderPipeline $$0) {
      return ag.b($$1 -> a("weather", 1536, false, false, $$0, gxz.b.a().a(new gxy.j($$1, false)).a(u).a(j).a(false)));
   }

   public static gxz f(ame $$0, boolean $$1) {
      return ($$1 ? aC : aD).apply($$0);
   }

   public static gxz D() {
      return aE;
   }

   public static gxz C(ame $$0) {
      return aF.apply($$0);
   }

   public static gxz D(ame $$0) {
      return aG.apply($$0);
   }

   public static gxz E(ame $$0) {
      return aH.apply($$0);
   }

   public gxz(String $$0, int $$1, boolean $$2, boolean $$3, Runnable $$4, Runnable $$5) {
      super($$0, $$4, $$5);
      this.aI = $$1;
      this.aJ = $$2;
      this.aK = $$3;
   }

   static gxz.a a(String $$0, int $$1, RenderPipeline $$2, gxz.b $$3) {
      return a($$0, $$1, false, false, $$2, $$3);
   }

   private static gxz.a a(String $$0, int $$1, boolean $$2, boolean $$3, RenderPipeline $$4, gxz.b $$5) {
      return new gxz.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public abstract void a(foc var1);

   public int E() {
      return this.aI;
   }

   public abstract VertexFormat F();

   public abstract VertexFormat.b G();

   public Optional<gxz> H() {
      return Optional.empty();
   }

   public boolean I() {
      return false;
   }

   public boolean J() {
      return this.aJ;
   }

   public boolean K() {
      return !this.G().k;
   }

   public boolean L() {
      return this.aK;
   }

   static final class a extends gxz {
      static final BiFunction<ame, Boolean, gxz> D = ag.a(
         ($$0, $$1) -> gxz.a("outline", 1536, $$1 ? gxx.aD : gxx.aE, gxz.b.a().a(new gxy.j($$0, false)).a(r).a(gxz.c.b))
      );
      private final gxz.b E;
      private final RenderPipeline F;
      private final Optional<gxz> G;
      private final boolean H;

      a(String $$0, int $$1, boolean $$2, boolean $$3, RenderPipeline $$4, gxz.b $$5) {
         super($$0, $$1, $$2, $$3, () -> $$5.d.forEach(gxy::a), () -> $$5.d.forEach(gxy::b));
         this.E = $$5;
         this.F = $$4;
         this.G = $$5.c == gxz.c.c ? $$5.a.d().map($$1x -> D.apply($$1x, $$4.isCull())) : Optional.empty();
         this.H = $$5.c == gxz.c.b;
      }

      @Override
      public Optional<gxz> H() {
         return this.G;
      }

      @Override
      public boolean I() {
         return this.H;
      }

      @Override
      public VertexFormat F() {
         return this.F.getVertexFormat();
      }

      @Override
      public VertexFormat.b G() {
         return this.F.getVertexFormatMode();
      }

      @Override
      public void a(foc $$0) {
         this.a();
         GpuBufferSlice $$1 = RenderSystem.getDynamicUniforms()
            .a(
               RenderSystem.getModelViewMatrix(),
               new Vector4f(1.0F, 1.0F, 1.0F, 1.0F),
               RenderSystem.getModelOffset(),
               RenderSystem.getTextureMatrix(),
               RenderSystem.getShaderLineWidth()
            );
         foc var3 = $$0;

         try {
            GpuBuffer $$2 = this.F.getVertexFormat().uploadImmediateVertexBuffer($$0.a());
            GpuBuffer $$4;
            VertexFormat.a $$5;
            if ($$0.b() == null) {
               RenderSystem.a $$3 = RenderSystem.getSequentialBuffer($$0.c().d());
               $$4 = $$3.b($$0.c().c());
               $$5 = $$3.a();
            } else {
               $$4 = this.F.getVertexFormat().uploadImmediateIndexBuffer($$0.b());
               $$5 = $$0.c().e();
            }

            fmr $$8 = this.E.b.d();
            GpuTextureView $$9 = RenderSystem.outputColorTextureOverride != null ? RenderSystem.outputColorTextureOverride : $$8.d();
            GpuTextureView $$10 = $$8.h ? (RenderSystem.outputDepthTextureOverride != null ? RenderSystem.outputDepthTextureOverride : $$8.f()) : null;

            try (RenderPass $$11 = RenderSystem.getDevice()
                  .createCommandEncoder()
                  .createRenderPass(() -> "Immediate draw for " + this.c(), $$9, OptionalInt.empty(), $$10, OptionalDouble.empty())) {
               $$11.setPipeline(this.F);
               fnv $$12 = RenderSystem.getScissorStateForRenderTypeDraws();
               if ($$12.b()) {
                  $$11.enableScissor($$12.c(), $$12.d(), $$12.e(), $$12.f());
               }

               RenderSystem.bindDefaultUniforms($$11);
               $$11.setUniform("DynamicTransforms", $$1);
               $$11.setVertexBuffer(0, $$2);

               for (int $$13 = 0; $$13 < 12; $$13++) {
                  GpuTextureView $$14 = RenderSystem.getShaderTexture($$13);
                  if ($$14 != null) {
                     $$11.bindSampler("Sampler" + $$13, $$14);
                  }
               }

               $$11.setIndexBuffer($$4, $$5);
               $$11.drawIndexed(0, 0, $$0.c().c(), 1);
            }
         } catch (Throwable var17) {
            if ($$0 != null) {
               try {
                  var3.close();
               } catch (Throwable var14) {
                  var17.addSuppressed(var14);
               }
            }

            throw var17;
         }

         if ($$0 != null) {
            $$0.close();
         }

         this.b();
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.E + "]";
      }
   }

   protected static final class b {
      final gxy.b a;
      final gxy.h b;
      final gxz.c c;
      final ImmutableList<gxy> d;

      b(gxy.b $$0, gxy.d $$1, gxy.i $$2, gxy.c $$3, gxy.h $$4, gxy.k $$5, gxy.e $$6, gxz.c $$7) {
         this.a = $$0;
         this.b = $$4;
         this.c = $$7;
         this.d = ImmutableList.of($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.d + ", outlineProperty=" + this.c + "]";
      }

      public static gxz.b.a a() {
         return new gxz.b.a();
      }

      public static class a {
         private gxy.b a = gxy.e;
         private gxy.d b = gxy.k;
         private gxy.i c = gxy.m;
         private gxy.c d = gxy.n;
         private gxy.h e = gxy.q;
         private gxy.k f;
         private gxy.e g;

         a() {
            this.f = gxy.f;
            this.g = gxy.w;
         }

         protected gxz.b.a a(gxy.b $$0) {
            this.a = $$0;
            return this;
         }

         protected gxz.b.a a(gxy.d $$0) {
            this.b = $$0;
            return this;
         }

         protected gxz.b.a a(gxy.i $$0) {
            this.c = $$0;
            return this;
         }

         protected gxz.b.a a(gxy.c $$0) {
            this.d = $$0;
            return this;
         }

         protected gxz.b.a a(gxy.h $$0) {
            this.e = $$0;
            return this;
         }

         protected gxz.b.a a(gxy.k $$0) {
            this.f = $$0;
            return this;
         }

         protected gxz.b.a a(gxy.e $$0) {
            this.g = $$0;
            return this;
         }

         protected gxz.b a(boolean $$0) {
            return this.a($$0 ? gxz.c.c : gxz.c.a);
         }

         protected gxz.b a(gxz.c $$0) {
            return new gxz.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, $$0);
         }
      }
   }

   protected static enum c {
      a("none"),
      b("is_outline"),
      c("affects_outline");

      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String toString() {
         return this.d;
      }
   }
}
