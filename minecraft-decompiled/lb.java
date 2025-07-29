import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class lb implements dm<djo> {
   private final List<bu> a;

   protected lb(List<bu> $$0) {
      this.a = $$0;
   }

   public static <T extends lb> Codec<T> a(Function<List<bu>, T> $$0) {
      return bu.a.listOf().xmap($$0, lb::b);
   }

   protected List<bu> b() {
      return this.a;
   }

   public boolean a(djo $$0) {
      for (bu $$1 : this.a) {
         if (!$$1.a($$0)) {
            return false;
         }
      }

      return true;
   }

   public static lb.a a(List<bu> $$0) {
      return new lb.a($$0);
   }

   public static lb.b b(List<bu> $$0) {
      return new lb.b($$0);
   }

   public static class a extends lb {
      public static final Codec<lb.a> a = a(lb.a::new);

      protected a(List<bu> $$0) {
         super($$0);
      }

      @Override
      public kp<djo> a() {
         return kq.l;
      }
   }

   public static class b extends lb {
      public static final Codec<lb.b> a = a(lb.b::new);

      protected b(List<bu> $$0) {
         super($$0);
      }

      @Override
      public kp<djo> a() {
         return kq.J;
      }
   }
}
