import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cyf {
   public static final cyb a;
   public static final cyb b;
   public static final cyb c;
   public static final cyb d;
   public static final cyc e;
   public static final Codec<cyd> f;
   public static final cyd g;
   public static final cyd h;

   public static String a(cyd $$0, cyd $$1) {
      return a(e, $$0, $$1);
   }

   public static String a(cyc $$0, cyd $$1, cyd $$2) {
      Set<ame> $$3 = $$0.b($$2);
      Set<ame> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(ame::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cyd $$0) {
      return !$$0.a(g);
   }

   static {
      cyc.a $$0 = new cyc.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("trade_rebalance");
      c = $$0.a("redstone_experiments");
      d = $$0.a("minecart_improvements");
      e = $$0.a();
      f = e.b();
      g = cyd.a(a);
      h = g;
   }
}
