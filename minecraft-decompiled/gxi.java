import java.util.Set;
import javax.annotation.Nullable;

public class gxi implements gxs.a {
   public static final ame a = gxs.a;
   public static final ame b = ame.b("translucent");
   public static final ame c = ame.b("item_entity");
   public static final ame d = ame.b("particles");
   public static final ame e = ame.b("weather");
   public static final ame f = ame.b("clouds");
   public static final ame g = ame.b("entity_outline");
   public static final Set<ame> h = Set.of(a);
   public static final Set<ame> i = Set.of(a, g);
   public static final Set<ame> j = Set.of(a, b, c, d, e, f);
   public fnr<fmr> k = fnr.a();
   @Nullable
   public fnr<fmr> l;
   @Nullable
   public fnr<fmr> m;
   @Nullable
   public fnr<fmr> n;
   @Nullable
   public fnr<fmr> o;
   @Nullable
   public fnr<fmr> p;
   @Nullable
   public fnr<fmr> q;

   @Override
   public void a(ame $$0, fnr<fmr> $$1) {
      if ($$0.equals(a)) {
         this.k = $$1;
      } else if ($$0.equals(b)) {
         this.l = $$1;
      } else if ($$0.equals(c)) {
         this.m = $$1;
      } else if ($$0.equals(d)) {
         this.n = $$1;
      } else if ($$0.equals(e)) {
         this.o = $$1;
      } else if ($$0.equals(f)) {
         this.p = $$1;
      } else {
         if (!$$0.equals(g)) {
            throw new IllegalArgumentException("No target with id " + $$0);
         }

         this.q = $$1;
      }
   }

   @Nullable
   @Override
   public fnr<fmr> a(ame $$0) {
      if ($$0.equals(a)) {
         return this.k;
      } else if ($$0.equals(b)) {
         return this.l;
      } else if ($$0.equals(c)) {
         return this.m;
      } else if ($$0.equals(d)) {
         return this.n;
      } else if ($$0.equals(e)) {
         return this.o;
      } else if ($$0.equals(f)) {
         return this.p;
      } else {
         return $$0.equals(g) ? this.q : null;
      }
   }

   public void a() {
      this.k = fnr.a();
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
      this.q = null;
   }
}
