import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class daw {
   private static final Logger e = LogUtils.getLogger();
   public static final Codec<daw> a = bbi.c(az.a, bbi.b(az.a.listOf())).xmap(daw::new, $$0 -> $$0.g);
   public static final zm<wx, daw> b = zm.a(az.b.a(zk.a()), $$0 -> $$0.g, daw::new);
   public static final xo c = xo.c("item.canBreak").a(o.h);
   public static final xo d = xo.c("item.canPlace").a(o.h);
   private static final xo f = xo.c("item.canUse.unknown").a(o.h);
   private final List<az> g;
   @Nullable
   private List<xo> h;
   @Nullable
   private eef i;
   private boolean j;
   private boolean k;

   public daw(List<az> $$0) {
      this.g = $$0;
   }

   private static boolean a(eef $$0, @Nullable eef $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         boolean var7;
         try (bci.j $$3 = new bci.j(e)) {
            jz $$4 = $$0.c().K_();
            ui $$5 = a($$0.b(), $$4, $$3);
            ui $$6 = a($$1.b(), $$4, $$3);
            var7 = Objects.equals($$5, $$6);
         }

         return var7;
      } else {
         return false;
      }
   }

   private static ui a(eaz $$0, jz $$1, bci $$2) {
      fcz $$3 = fcz.a($$2.a($$0.t()), $$1);
      $$0.d($$3);
      return $$3.b();
   }

   public boolean a(eef $$0) {
      if (a($$0, this.i, this.k)) {
         return this.j;
      } else {
         this.i = $$0;
         this.k = false;

         for (az $$1 : this.g) {
            if ($$1.a($$0)) {
               this.k = this.k | $$1.a();
               this.j = true;
               return true;
            }
         }

         this.j = false;
         return false;
      }
   }

   private List<xo> a() {
      if (this.h == null) {
         this.h = a(this.g);
      }

      return this.h;
   }

   public void a(Consumer<xo> $$0) {
      this.a().forEach($$0);
   }

   private static List<xo> a(List<az> $$0) {
      for (az $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(f);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dpz)$$0x.a()).f().a(o.i)).toList();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof daw $$1 ? this.g.equals($$1.g) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.g.hashCode();
   }

   @Override
   public String toString() {
      return "AdventureModePredicate{predicates=" + this.g + "}";
   }
}
