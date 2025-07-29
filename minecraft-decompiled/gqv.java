import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gqv {
   private final gqx a;

   public gqv() {
      this(new gqx(ImmutableList.of(), gqp.a));
   }

   private gqv(gqx $$0) {
      this.a = $$0;
   }

   public gqx a() {
      return this.a;
   }

   public gqv a(UnaryOperator<gqp> $$0) {
      return new gqv(this.a.a($$0));
   }

   public gqv a(gqw $$0) {
      return $$0.apply(this);
   }
}
