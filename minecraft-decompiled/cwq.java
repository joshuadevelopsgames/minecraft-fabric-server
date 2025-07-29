import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class cwq {
   private final cwp a;
   private final List<cwq.a> b = Lists.newArrayList();

   public cwq(cwp $$0) {
      this.a = $$0;
   }

   public cwq a(int $$0, cwn $$1) {
      this.b.add(new cwq.a($$0, $$1));
      return this;
   }

   public cwp a() {
      this.b.stream().map(cwq.a::b).collect(Collectors.toSet()).forEach(this.a::a);
      this.b.forEach($$0 -> {
         cwn $$1 = $$0.b();
         this.a.c($$1).forEach($$1x -> $$1x.a($$0.a(), 0.0F));
         this.a.b($$1).a($$0.a(), 1.0F);
      });
      return this.a;
   }

   static class a {
      private final int a;
      private final cwn b;

      public a(int $$0, cwn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public int a() {
         return this.a;
      }

      public cwn b() {
         return this.b;
      }
   }
}
