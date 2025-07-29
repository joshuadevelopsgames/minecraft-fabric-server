import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gek {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<czv<?>, gek.a<?, ?>> b = Maps.newHashMap();

   public static <T extends cym> void a(czv<T> $$0, fue $$1, int $$2, xo $$3) {
      gek.a<T, ?> $$4 = a($$0);
      if ($$4 == null) {
         a.warn("Failed to create screen for menu type: {}", mm.p.b($$0));
      } else {
         $$4.a($$3, $$0, $$1, $$2);
      }
   }

   @Nullable
   private static <T extends cym> gek.a<T, ?> a(czv<T> $$0) {
      return (gek.a<T, ?>)b.get($$0);
   }

   private static <M extends cym, U extends get & ghg<M>> void a(czv<? extends M> $$0, gek.a<M, U> $$1) {
      gek.a<?, ?> $$2 = b.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Duplicate registration for " + mm.p.b($$0));
      }
   }

   public static boolean a() {
      boolean $$0 = false;

      for (czv<?> $$1 : mm.p) {
         if (!b.containsKey($$1)) {
            a.debug("Menu {} has no matching screen", mm.p.b($$1));
            $$0 = true;
         }
      }

      return $$0;
   }

   static {
      a(czv.a, ggm::new);
      a(czv.b, ggm::new);
      a(czv.c, ggm::new);
      a(czv.d, ggm::new);
      a(czv.e, ggm::new);
      a(czv.f, ggm::new);
      a(czv.g, ggs::new);
      a(czv.h, ggn::new);
      a(czv.i, ggd::new);
      a(czv.j, gge::new);
      a(czv.k, ggf::new);
      a(czv.l, ggj::new);
      a(czv.m, ggo::new);
      a(czv.n, ggv::new);
      a(czv.o, ggw::new);
      a(czv.p, ggx::new);
      a(czv.q, ggz::new);
      a(czv.r, ghe::new);
      a(czv.s, ghf::new);
      a(czv.t, ghh::new);
      a(czv.u, ghk::new);
      a(czv.v, ghm::new);
      a(czv.w, ghn::new);
      a(czv.x, ggk::new);
      a(czv.y, gho::new);
   }

   interface a<T extends cym, U extends get & ghg<T>> {
      default void a(xo $$0, czv<T> $$1, fue $$2, int $$3) {
         U $$4 = this.create($$1.a($$3, $$2.t.gs()), $$2.t.gs(), $$0);
         $$2.t.cn = $$4.n();
         $$2.a($$4);
      }

      U create(T var1, cus var2, xo var3);
   }
}
