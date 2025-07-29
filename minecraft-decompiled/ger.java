import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class ger extends get {
   private static final xo a = xo.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final ger.a e;
   @Nullable
   private hrs f;

   public ger(BooleanSupplier $$0, ger.a $$1) {
      super(ftv.a);
      this.d = $$0;
      this.e = $$1;
      this.c = ag.c();
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, a, this.o / 2, this.p / 2 - 50, -1);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      switch (this.e) {
         case a:
            $$0.a(gxx.av, this.l(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            hru $$4 = fue.R().ab();
            gch $$5 = gch.a($$4.b(haw.a).b(), $$4.b(haw.b).b());
            $$0.a(gxx.R, $$5, 0, 0, this.o, this.p);
            break;
         case c:
            this.a($$0, $$3);
            this.b($$0);
            this.a($$0);
      }
   }

   private hrs l() {
      if (this.f != null) {
         return this.f;
      } else {
         this.f = this.n.aq().a().a(dqb.eu.m());
         return this.f;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || ag.c() > this.c + 30000L) {
         this.aP_();
      }
   }

   @Override
   public void aP_() {
      this.n.aZ().d(xo.c("narrator.ready_to_play"));
      super.aP_();
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
