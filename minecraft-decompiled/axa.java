import java.util.function.UnaryOperator;

public interface axa {
   UnaryOperator<xo> a = UnaryOperator.identity();
   axa b = a(a, true);
   axa c = a(a("pack.source.builtin"), true);
   axa d = a(a("pack.source.feature"), false);
   axa e = a(a("pack.source.world"), true);
   axa f = a(a("pack.source.server"), true);

   xo a(xo var1);

   boolean a();

   static axa a(final UnaryOperator<xo> $$0, final boolean $$1) {
      return new axa() {
         @Override
         public xo a(xo $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xo> a(String $$0) {
      xo $$1 = xo.c($$0);
      return $$1x -> xo.a("pack.nameAndSource", $$1x, $$1).a(o.h);
   }
}
