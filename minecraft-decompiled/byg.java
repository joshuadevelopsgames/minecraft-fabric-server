import java.util.Optional;
import javax.annotation.Nullable;

public record byg(String i) {
   public static final byg a = new byg("generic");
   public static final byg b = new byg("ladder");
   public static final byg c = new byg("vines");
   public static final byg d = new byg("weeping_vines");
   public static final byg e = new byg("twisting_vines");
   public static final byg f = new byg("scaffolding");
   public static final byg g = new byg("other_climbable");
   public static final byg h = new byg("water");

   public static byg a(eeb $$0) {
      if ($$0.a(dqb.da) || $$0.a(azo.N)) {
         return b;
      } else if ($$0.a(dqb.fx)) {
         return c;
      } else if ($$0.a(dqb.pg) || $$0.a(dqb.ph)) {
         return d;
      } else if ($$0.a(dqb.pi) || $$0.a(dqb.pj)) {
         return e;
      } else {
         return $$0.a(dqb.oz) ? f : g;
      }
   }

   @Nullable
   public static byg a(cam $$0) {
      Optional<jb> $$1 = $$0.eU();
      if ($$1.isPresent()) {
         eeb $$2 = $$0.ai().a_($$1.get());
         return a($$2);
      } else {
         return $$0.bm() ? h : null;
      }
   }

   public String a() {
      return "death.fell.accident." + this.i;
   }

   public String b() {
      return this.i;
   }
}
