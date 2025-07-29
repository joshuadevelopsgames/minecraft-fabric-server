import com.mojang.serialization.MapCodec;

public abstract class doq extends dpl {
   private final dbt a;

   protected doq(dbt $$0, eea.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends doq> a();

   @Override
   public boolean a(eeb $$0) {
      return true;
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ean($$0, $$1, this.a);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return $$0.c_($$1) instanceof ean $$4 ? $$4.c() : super.a($$0, $$1, $$2, $$3);
   }

   public dbt b() {
      return this.a;
   }
}
