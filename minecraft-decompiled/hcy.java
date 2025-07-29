@Deprecated
public abstract class hcy<T extends cao, S extends hlq, M extends gnh<? super S>> extends hfl<T, S, M> {
   private final M a;
   private final M k;

   public hcy(hee.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$3);
      this.a = $$1;
      this.k = $$2;
   }

   @Override
   public void a(S $$0, fod $$1, gxn $$2, int $$3) {
      this.h = $$0.am ? this.k : this.a;
      super.a($$0, $$1, $$2, $$3);
   }
}
