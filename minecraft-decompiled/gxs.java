import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class gxs implements AutoCloseable {
   public static final ame a = ame.b("main");
   private final List<gxu> b;
   private final Map<ame, gxt.b> c;
   private final Set<ame> d;
   private final Map<ame, fmr> e = new HashMap<>();
   private final gwt f;

   private gxs(List<gxu> $$0, Map<ame, gxt.b> $$1, Set<ame> $$2, gwt $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.f = $$3;
   }

   public static gxs a(gxt $$0, hru $$1, Set<ame> $$2, ame $$3, gwt $$4) throws gyg.b {
      Stream<ame> $$5 = $$0.b().stream().flatMap(gxt.c::a);
      Set<ame> $$6 = $$5.filter($$1x -> !$$0.a().containsKey($$1x)).collect(Collectors.toSet());
      Set<ame> $$7 = Sets.difference($$6, $$2);
      if (!$$7.isEmpty()) {
         throw new gyg.b("Referenced external targets are not available in this context: " + $$7);
      } else {
         Builder<gxu> $$8 = ImmutableList.builder();

         for (int $$9 = 0; $$9 < $$0.b().size(); $$9++) {
            gxt.c $$10 = $$0.b().get($$9);
            $$8.add(a($$1, $$10, $$3.g("/" + $$9)));
         }

         return new gxs($$8.build(), $$0.a(), $$6, $$4);
      }
   }

   private static gxu a(hru $$0, gxt.c $$1, ame $$2) throws gyg.b {
      RenderPipeline.Builder $$3 = RenderPipeline.builder(gxx.a).withFragmentShader($$1.c()).withVertexShader($$1.b()).withLocation($$2);

      for (gxt.a $$4 : $$1.d()) {
         $$3.withSampler($$4.a() + "Sampler");
      }

      $$3.withUniform("SamplerInfo", fnt.a);

      for (String $$5 : $$1.f().keySet()) {
         $$3.withUniform($$5, fnt.a);
      }

      RenderPipeline $$6 = $$3.build();
      List<gxu.a> $$7 = new ArrayList<>();

      for (gxt.a $$8 : $$1.d()) {
         switch ($$8) {
            case gxt.e var10:
               gxt.e var51 = var10;

               try {
                  var52 = var51.a();
               } catch (Throwable var30) {
                  throw new MatchException(var30.toString(), var30);
               }

               String var35 = var52;
               var51 = var10;

               try {
                  var54 = var51.c();
               } catch (Throwable var29) {
                  throw new MatchException(var29.toString(), var29);
               }

               ame var36 = var54;
               var51 = var10;

               try {
                  var56 = var51.d();
               } catch (Throwable var28) {
                  throw new MatchException(var28.toString(), var28);
               }

               int var37 = var56;
               var51 = var10;

               try {
                  var58 = var51.e();
               } catch (Throwable var27) {
                  throw new MatchException(var27.toString(), var27);
               }

               int var38 = var58;
               var51 = var10;

               try {
                  var60 = var51.f();
               } catch (Throwable var26) {
                  throw new MatchException(var26.toString(), var26);
               }

               boolean var39 = var60;
               hrc $$14x = $$0.b(var36.a((UnaryOperator<String>)($$0x -> "textures/effect/" + $$0x + ".png")));
               $$14x.a(var39, false);
               $$7.add(new gxu.c(var35, $$14x, var37, var38));
               break;
            case gxt.d $$14:
               gxt.d var10000 = $$14;

               try {
                  var44 = var10000.a();
               } catch (Throwable var25) {
                  throw new MatchException(var25.toString(), var25);
               }

               String var21 = var44;
               var10000 = $$14;

               try {
                  var46 = var10000.c();
               } catch (Throwable var24) {
                  throw new MatchException(var24.toString(), var24);
               }

               ame var41 = var46;
               var10000 = $$14;

               try {
                  var48 = var10000.d();
               } catch (Throwable var23) {
                  throw new MatchException(var23.toString(), var23);
               }

               boolean var42 = var48;
               var10000 = $$14;

               try {
                  var50 = var10000.e();
               } catch (Throwable var22) {
                  throw new MatchException(var22.toString(), var22);
               }

               boolean var43 = var50;
               $$7.add(new gxu.b(var21, var41, var42, var43));
               break;
            default:
               throw new MatchException(null, null);
         }
      }

      return new gxu($$6, $$1.e(), $$1.f(), $$7);
   }

   public void a(flv $$0, int $$1, int $$2, gxs.a $$3) {
      GpuBufferSlice $$4 = this.f.a($$1, $$2);
      Map<ame, fnr<fmr>> $$5 = new HashMap<>(this.c.size() + this.d.size());

      for (ame $$6 : this.d) {
         $$5.put($$6, $$3.b($$6));
      }

      for (Entry<ame, gxt.b> $$7 : this.c.entrySet()) {
         ame $$8 = $$7.getKey();
         gxt.b $$9 = $$7.getValue();
         fnp $$10 = new fnp($$9.a().orElse($$1), $$9.b().orElse($$2), true, $$9.d());
         if ($$9.c()) {
            fmr $$11 = this.a($$8, $$10);
            $$5.put($$8, $$0.a($$8.toString(), $$11));
         } else {
            $$5.put($$8, $$0.a($$8.toString(), $$10));
         }
      }

      for (gxu $$12 : this.b) {
         $$12.a($$0, $$5, $$4);
      }

      for (ame $$13 : this.d) {
         $$3.a($$13, $$5.get($$13));
      }
   }

   @Deprecated
   public void a(fmr $$0, fno $$1) {
      flv $$2 = new flv();
      gxs.a $$3 = gxs.a.b(a, $$2.a("main", $$0));
      this.a($$2, $$0.c, $$0.d, $$3);
      $$2.a($$1);
   }

   private fmr a(ame $$0, fnp $$1) {
      fmr $$2 = this.e.get($$0);
      if ($$2 == null || $$2.c != $$1.b() || $$2.d != $$1.c()) {
         if ($$2 != null) {
            $$2.a();
         }

         $$2 = $$1.a();
         $$1.a($$2);
         this.e.put($$0, $$2);
      }

      return $$2;
   }

   @Override
   public void close() {
      this.e.values().forEach(fmr::a);
      this.e.clear();

      for (gxu $$0 : this.b) {
         $$0.close();
      }
   }

   public interface a {
      static gxs.a b(final ame $$0, final fnr<fmr> $$1) {
         return new gxs.a() {
            private fnr<fmr> c = $$1;

            @Override
            public void a(ame $$0x, fnr<fmr> $$1x) {
               if ($$0.equals($$0)) {
                  this.c = $$1;
               } else {
                  throw new IllegalArgumentException("No target with id " + $$0);
               }
            }

            @Nullable
            @Override
            public fnr<fmr> a(ame $$0x) {
               return $$0.equals($$0) ? this.c : null;
            }
         };
      }

      void a(ame var1, fnr<fmr> var2);

      @Nullable
      fnr<fmr> a(ame var1);

      default fnr<fmr> b(ame $$0) {
         fnr<fmr> $$1 = this.a($$0);
         if ($$1 == null) {
            throw new IllegalArgumentException("Missing target with id " + $$0);
         } else {
            return $$1;
         }
      }
   }
}
