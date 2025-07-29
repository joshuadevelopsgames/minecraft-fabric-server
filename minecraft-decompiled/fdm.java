import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdm {
   private final aub a;
   private final bdp b;
   private final Map<ame, fdm.b> c;
   private final float d;

   public fdm(aub $$0, bdp $$1, Map<ame, fdm.b> $$2, float $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public aub a() {
      return this.a;
   }

   public bdp b() {
      return this.b;
   }

   public void a(ame $$0, Consumer<dcv> $$1) {
      fdm.b $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.add($$1);
      }
   }

   public float c() {
      return this.d;
   }

   public static class a {
      private final aub a;
      private final bdp.a b = new bdp.a();
      private final Map<ame, fdm.b> c = Maps.newHashMap();
      private float d;

      public a(aub $$0) {
         this.a = $$0;
      }

      public aub a() {
         return this.a;
      }

      public <T> fdm.a a(bdn<T> $$0, T $$1) {
         this.b.a($$0, $$1);
         return this;
      }

      public <T> fdm.a b(bdn<T> $$0, @Nullable T $$1) {
         this.b.b($$0, $$1);
         return this;
      }

      public <T> T a(bdn<T> $$0) {
         return this.b.a($$0);
      }

      @Nullable
      public <T> T b(bdn<T> $$0) {
         return this.b.b($$0);
      }

      public fdm.a a(ame $$0, fdm.b $$1) {
         fdm.b $$2 = this.c.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
         } else {
            return this;
         }
      }

      public fdm.a a(float $$0) {
         this.d = $$0;
         return this;
      }

      public fdm a(bdo $$0) {
         bdp $$1 = this.b.a($$0);
         return new fdm(this.a, $$1, this.c, this.d);
      }
   }

   @FunctionalInterface
   public interface b {
      void add(Consumer<dcv> var1);
   }
}
