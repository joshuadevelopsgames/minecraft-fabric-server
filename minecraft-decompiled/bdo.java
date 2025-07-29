import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Set;

public class bdo {
   private final Set<bdn<?>> a;
   private final Set<bdn<?>> b;

   bdo(Set<bdn<?>> $$0, Set<bdn<?>> $$1) {
      this.a = Set.copyOf($$0);
      this.b = Set.copyOf(Sets.union($$0, $$1));
   }

   public Set<bdn<?>> a() {
      return this.a;
   }

   public Set<bdn<?>> b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "[" + Joiner.on(", ").join(this.b.stream().map($$0 -> (this.a.contains($$0) ? "!" : "") + $$0.a()).iterator()) + "]";
   }

   public static class a {
      private final Set<bdn<?>> a = Sets.newIdentityHashSet();
      private final Set<bdn<?>> b = Sets.newIdentityHashSet();

      public bdo.a a(bdn<?> $$0) {
         if (this.b.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already optional");
         } else {
            this.a.add($$0);
            return this;
         }
      }

      public bdo.a b(bdn<?> $$0) {
         if (this.a.contains($$0)) {
            throw new IllegalArgumentException("Parameter " + $$0.a() + " is already required");
         } else {
            this.b.add($$0);
            return this;
         }
      }

      public bdo a() {
         return new bdo(this.a, this.b);
      }
   }
}
