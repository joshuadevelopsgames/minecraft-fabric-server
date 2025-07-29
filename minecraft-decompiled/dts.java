import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dts extends dtr implements dqc {
   protected dts(eea.d $$0, jh $$1, fjm $$2, boolean $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected abstract MapCodec<? extends dts> a();

   protected eeb a(eeb $$0, eeb $$1) {
      return $$1;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      dtt $$8 = this.c();
      if ($$4 == this.a && !$$6.a(this) && !$$6.a($$8)) {
         return this.a($$0, $$8.b($$7));
      } else {
         if (this.b) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(this.c());
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      Optional<jb> $$3 = this.a($$0, $$1, $$2.b());
      return $$3.isPresent() && this.c().h($$0.a_($$3.get().a(this.a)));
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      Optional<jb> $$4 = this.a($$0, $$2, $$3.b());
      if ($$4.isPresent()) {
         eeb $$5 = $$0.a_($$4.get());
         ((dtt)$$5.b()).a($$0, $$1, $$4.get(), $$5);
      }
   }

   private Optional<jb> a(dly $$0, jb $$1, dpz $$2) {
      return m.a($$0, $$1, $$2, this.a, this.c());
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      boolean $$2 = super.a($$0, $$1);
      return $$2 && $$1.n().a(this.c().h()) ? false : $$2;
   }

   @Override
   protected dpz b() {
      return this;
   }
}
