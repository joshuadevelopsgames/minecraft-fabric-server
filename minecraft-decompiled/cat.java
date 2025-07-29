import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import javax.annotation.Nullable;

public interface cat {
   @Nullable
   bzs<cam> d();

   dmu ai();

   @Nullable
   default cam U_() {
      return bzs.a(this.d(), this.ai(), cam.class);
   }

   @Nullable
   default cam V_() {
      Set<Object> $$0 = new ObjectArraySet();
      cam $$1 = this.U_();
      $$0.add(this);

      while ($$1 instanceof cat) {
         cat $$2 = (cat)$$1;
         cam $$3 = $$2.U_();
         if ($$0.contains($$3)) {
            return null;
         }

         $$0.add($$1);
         $$1 = $$2.U_();
      }

      return $$1;
   }
}
