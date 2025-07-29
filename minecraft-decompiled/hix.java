import java.util.function.Function;

public class hix<S extends hlq, RM extends gnh<? super S>, EM extends gnh<? super S>> extends hit<S, RM> {
   private final hie a;
   private final htz.d b;
   private final Function<S, dcv> c;
   private final EM d;
   private final EM e;

   public hix(hgc<S, RM> $$0, hie $$1, htz.d $$2, Function<S, dcv> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hix(hgc<S, RM> $$0, hie $$1, EM $$2, htz.d $$3, Function<S, dcv> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      dcv $$6 = this.c.apply($$3);
      dle $$7 = $$6.a(kq.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.am ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
