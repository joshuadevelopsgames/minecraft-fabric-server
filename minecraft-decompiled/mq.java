import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class mq {
   private final dpz a;
   final Map<mq.b, dpz> b = Maps.newHashMap();
   boolean c = true;
   boolean d = true;
   @Nullable
   String e;
   @Nullable
   String f;

   mq(dpz $$0) {
      this.a = $$0;
   }

   public dpz a() {
      return this.a;
   }

   public Map<mq.b, dpz> b() {
      return this.b;
   }

   public dpz a(mq.b $$0) {
      return this.b.get($$0);
   }

   public boolean c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   public Optional<String> e() {
      return bdb.h(this.e) ? Optional.empty() : Optional.of(this.e);
   }

   public Optional<String> f() {
      return bdb.h(this.f) ? Optional.empty() : Optional.of(this.f);
   }

   public static class a {
      private final mq a;

      public a(dpz $$0) {
         this.a = new mq($$0);
      }

      public mq a() {
         return this.a;
      }

      public mq.a a(dpz $$0) {
         this.a.b.put(mq.b.a, $$0);
         return this;
      }

      public mq.a b(dpz $$0) {
         this.a.b.put(mq.b.b, $$0);
         return this;
      }

      public mq.a c(dpz $$0) {
         this.a.b.put(mq.b.j, $$0);
         return this;
      }

      public mq.a d(dpz $$0) {
         this.a.b.put(mq.b.c, $$0);
         return this;
      }

      public mq.a e(dpz $$0) {
         this.a.b.put(mq.b.d, $$0);
         return this;
      }

      public mq.a f(dpz $$0) {
         this.a.b.put(mq.b.e, $$0);
         return this;
      }

      public mq.a g(dpz $$0) {
         this.a.b.put(mq.b.f, $$0);
         return this;
      }

      public mq.a h(dpz $$0) {
         this.a.b.put(mq.b.g, $$0);
         return this;
      }

      public mq.a i(dpz $$0) {
         this.a.b.put(mq.b.h, $$0);
         return this;
      }

      public mq.a j(dpz $$0) {
         this.a.b.put(mq.b.i, $$0);
         return this;
      }

      public mq.a a(dpz $$0, dpz $$1) {
         this.a.b.put(mq.b.k, $$0);
         this.a.b.put(mq.b.r, $$1);
         return this;
      }

      public mq.a k(dpz $$0) {
         this.a.b.put(mq.b.l, $$0);
         return this;
      }

      public mq.a l(dpz $$0) {
         this.a.b.put(mq.b.m, $$0);
         return this;
      }

      public mq.a m(dpz $$0) {
         this.a.b.put(mq.b.n, $$0);
         return this;
      }

      public mq.a n(dpz $$0) {
         this.a.b.put(mq.b.o, $$0);
         return this;
      }

      public mq.a o(dpz $$0) {
         this.a.b.put(mq.b.p, $$0);
         return this;
      }

      public mq.a p(dpz $$0) {
         this.a.b.put(mq.b.q, $$0);
         return this;
      }

      public mq.a b() {
         this.a.c = false;
         return this;
      }

      public mq.a c() {
         this.a.d = false;
         return this;
      }

      public mq.a a(String $$0) {
         this.a.e = $$0;
         return this;
      }

      public mq.a b(String $$0) {
         this.a.f = $$0;
         return this;
      }
   }

   public static enum b {
      a("button"),
      b("chiseled"),
      c("cracked"),
      d("cut"),
      e("door"),
      f("fence"),
      g("fence"),
      h("fence_gate"),
      i("fence_gate"),
      j("mosaic"),
      k("sign"),
      l("slab"),
      m("stairs"),
      n("pressure_plate"),
      o("polished"),
      p("trapdoor"),
      q("wall"),
      r("wall_sign");

      private final String s;

      private b(final String $$0) {
         this.s = $$0;
      }

      public String a() {
         return this.s;
      }
   }
}
