import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfv {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<MapCodec<? extends asq>, gfu<?>> b = new HashMap<>();

   private static <T extends asq> void a(MapCodec<T> $$0, gfu<? super T> $$1) {
      b.put($$0, $$1);
   }

   @Nullable
   private static <T extends asq> gfu<T> a(T $$0) {
      return (gfu<T>)b.get($$0.a());
   }

   public static <T extends asq> void a(T $$0, get $$1, gfu.a $$2) {
      gfu<T> $$3 = a($$0);
      if ($$3 == null) {
         a.warn("Unrecognized input control {}", $$0);
      } else {
         $$3.addControl($$0, $$1, $$2);
      }
   }

   public static void a() {
      a(asu.a, new gfv.d());
      a(ast.a, new gfv.c());
      a(asp.a, new gfv.a());
      a(ass.a, new gfv.b());
   }

   static class a implements gfu<asp> {
      public void a(final asp $$0, get $$1, gfu.a $$2) {
         fwz $$3 = $$1.B();
         final fxq $$4 = fxq.a($$0.b(), $$3).a($$0.c()).a();
         $$2.accept($$4, new asd.a() {
            @Override
            public String a() {
               return $$4.a() ? $$0.d() : $$0.e();
            }

            @Override
            public vi b() {
               return ug.a($$4.a());
            }
         });
      }
   }

   static class b implements gfu<ass> {
      public void a(ass $$0, get $$1, gfu.a $$2) {
         float $$3 = $$0.e().a();
         final gfv.b.a $$4 = new gfv.b.a($$0, $$3);
         $$2.accept($$4, new asd.a() {
            @Override
            public String a() {
               return $$4.c();
            }

            @Override
            public vi b() {
               return ul.a($$4.e());
            }
         });
      }

      static class a extends fxj {
         private final ass a;

         a(ass $$0, double $$1) {
            super(0, 0, $$0.b(), 20, c($$0, $$1), $$1);
            this.a = $$0;
         }

         @Override
         protected void b() {
            this.b(c(this.a, this.d));
         }

         @Override
         protected void a() {
         }

         public String c() {
            return b(this.a, this.d);
         }

         public float e() {
            return a(this.a, this.d);
         }

         private static float a(ass $$0, double $$1) {
            return $$0.e().a((float)$$1);
         }

         private static String b(ass $$0, double $$1) {
            return b(a($$0, $$1));
         }

         private static xo c(ass $$0, double $$1) {
            return $$0.a(b($$0, $$1));
         }

         private static String b(float $$0) {
            int $$1 = (int)$$0;
            return $$1 == $$0 ? Integer.toString($$1) : Float.toString($$0);
         }
      }
   }

   static class c implements gfu<ast> {
      public void a(ast $$0, get $$1, gfu.a $$2) {
         fxv.a<ast.a> $$3 = fxv.<ast.a>a(ast.a::a).a($$0.d()).a(!$$0.f());
         Optional<ast.a> $$4 = $$0.b();
         if ($$4.isPresent()) {
            $$3 = $$3.a($$4.get());
         }

         fxv<ast.a> $$5 = $$3.a(0, 0, $$0.c(), 20, $$0.e());
         $$2.accept($$5, asd.a.a(() -> $$5.a().b()));
      }
   }

   static class d implements gfu<asu> {
      public void a(asu $$0, get $$1, gfu.a $$2) {
         fwz $$3 = $$1.B();
         gbm $$7;
         final Supplier<String> $$8;
         if ($$0.g().isPresent()) {
            asu.a $$4 = $$0.g().get();
            int $$5 = $$4.b().orElseGet(() -> {
               int $$2x = $$4.a().orElse(4);
               return Math.min(9 * $$2x + 8, 512);
            });
            fyh $$6 = fyh.r().a($$3, $$0.b(), $$5, xn.a);
            $$6.a($$0.f());
            $$4.a().ifPresent($$6::b);
            $$6.a($$0.e());
            $$7 = $$6;
            $$8 = $$6::q;
         } else {
            fxx $$9 = new fxx($$3, $$0.b(), 20, $$0.c());
            $$9.f($$0.f());
            $$9.a($$0.e());
            $$7 = $$9;
            $$8 = $$9::a;
         }

         gbm $$12 = (gbm)($$0.d() ? gbg.a($$3, $$7, $$0.c()) : $$7);
         $$2.accept($$12, new asd.a() {
            @Override
            public String a() {
               return vg.c($$8.get());
            }

            @Override
            public vi b() {
               return vg.a($$8.get());
            }
         });
      }
   }
}
