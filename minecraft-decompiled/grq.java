import java.util.EnumMap;

public class grq {
   public static final int a = 5000;
   private final grl b;
   private final fxw c;
   private final EnumMap<brv, Long> d;

   public grq(grl $$0, fxw $$1) {
      this.c = $$1;
      this.b = $$0;
      this.d = new EnumMap<>(brv.class);
   }

   public void a() {
      if (this.c.g()) {
         this.a(brv.a);
      }
   }

   private void a(brv $$0) {
      long $$1 = ag.c();
      if ($$1 > this.d.getOrDefault($$0, 0L) + 5000L) {
         this.b.b(new aig($$0));
         this.d.put($$0, $$1);
      }
   }
}
