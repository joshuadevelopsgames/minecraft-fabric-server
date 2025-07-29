import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cbr {
   private final Map<jl<cbn>, cbo> a;

   cbr(Map<jl<cbn>, cbo> $$0) {
      this.a = $$0;
   }

   private cbo d(jl<cbn> $$0) {
      cbo $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("Can't find attribute " + $$0.g());
      } else {
         return $$1;
      }
   }

   public double a(jl<cbn> $$0) {
      return this.d($$0).g();
   }

   public double b(jl<cbn> $$0) {
      return this.d($$0).b();
   }

   public double a(jl<cbn> $$0, ame $$1) {
      cbq $$2 = this.d($$0).a($$1);
      if ($$2 == null) {
         throw new IllegalArgumentException("Can't find modifier " + $$1 + " on attribute " + $$0.g());
      } else {
         return $$2.b();
      }
   }

   @Nullable
   public cbo a(Consumer<cbo> $$0, jl<cbn> $$1) {
      cbo $$2 = this.a.get($$1);
      if ($$2 == null) {
         return null;
      } else {
         cbo $$3 = new cbo($$1, $$0);
         $$3.a($$2);
         return $$3;
      }
   }

   public static cbr.a a() {
      return new cbr.a();
   }

   public boolean c(jl<cbn> $$0) {
      return this.a.containsKey($$0);
   }

   public boolean b(jl<cbn> $$0, ame $$1) {
      cbo $$2 = this.a.get($$0);
      return $$2 != null && $$2.a($$1) != null;
   }

   public static class a {
      private final Builder<jl<cbn>, cbo> a = ImmutableMap.builder();
      private boolean b;

      private cbo b(jl<cbn> $$0) {
         cbo $$1 = new cbo($$0, $$1x -> {
            if (this.b) {
               throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + $$0.g());
            }
         });
         this.a.put($$0, $$1);
         return $$1;
      }

      public cbr.a a(jl<cbn> $$0) {
         this.b($$0);
         return this;
      }

      public cbr.a a(jl<cbn> $$0, double $$1) {
         cbo $$2 = this.b($$0);
         $$2.a($$1);
         return this;
      }

      public cbr a() {
         this.b = true;
         return new cbr(this.a.buildKeepingLast());
      }
   }
}
