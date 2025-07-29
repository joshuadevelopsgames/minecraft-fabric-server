import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dtr extends dpz {
   protected final jh a;
   protected final boolean b;
   protected final fjm d;

   protected dtr(eea.d $$0, jh $$1, fjm $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.d = $$2;
      this.b = $$3;
   }

   @Override
   protected abstract MapCodec<? extends dtr> a();

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.b($$0.q().A) : this.b().m();
   }

   public eeb b(bck $$0) {
      return this.m();
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.a(this.a.g());
      eeb $$4 = $$1.a_($$3);
      return !this.o($$4) ? false : $$4.a(this.c()) || $$4.a(this.b()) || $$4.c($$1, $$3, this.a);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   protected boolean o(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.d;
   }

   protected abstract dtt c();

   protected abstract dpz b();
}
