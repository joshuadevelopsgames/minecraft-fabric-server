import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class fbo extends fbv {
   public fbo(dwj $$0) {
      super($$0);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable fbt $$3, boolean $$4) {
      int $$5 = this.c($$0, $$1);
      if ($$2.c(dwj.f) != $$5) {
         if ($$0.a_($$1) == $$2) {
            $$0.a($$1, $$2.b(dwj.f, $$5), 2);
         }

         Set<jb> $$6 = Sets.newHashSet();
         $$6.add($$1);

         for (jh $$7 : jh.values()) {
            $$6.add($$1.a($$7));
         }

         for (jb $$8 : $$6) {
            $$0.a($$8, this.a);
         }
      }
   }

   private int c(dmu $$0, jb $$1) {
      int $$2 = this.a($$0, $$1);
      return $$2 == 15 ? $$2 : Math.max($$2, this.b($$0, $$1));
   }
}
