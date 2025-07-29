import com.mojang.serialization.Codec;
import java.util.List;

public class dep implements cya {
   public static final Codec<jl<dep>> a = mm.h.r();
   public static final zm<wx, jl<dep>> b = zk.b(mn.ah);
   private final String c;
   private final List<byq> d;
   private cyd e = cyf.g;

   public dep(String $$0, byq... $$1) {
      this.c = $$0;
      this.d = List.of($$1);
   }

   public dep a(cyb... $$0) {
      this.e = cyf.e.a($$0);
      return this;
   }

   @Override
   public cyd k() {
      return this.e;
   }

   public List<byq> a() {
      return this.d;
   }

   public String b() {
      return this.c;
   }

   public boolean c() {
      for (byq $$0 : this.d) {
         if ($$0.c().a().a()) {
            return true;
         }
      }

      return false;
   }
}
