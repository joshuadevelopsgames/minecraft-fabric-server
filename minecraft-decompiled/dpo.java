import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpo extends dpz implements dxl {
   public static final ees a = eer.I;
   private static final fjm b = dpz.b(16.0, 0.0, 2.0);
   private static final fjm c = dpz.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(dmu $$0, jb $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(eeb $$0) {
      return $$0.a(azo.K) && $$0.b() instanceof dpo;
   }

   protected dpo(boolean $$0, eea.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dpo> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected eeb a(eeb $$0, dmu $$1, jb $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         eff $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jb $$0, dmu $$1, eff $$2) {
      if (!c($$1, $$0.e())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.i());
            case d:
               return !c($$1, $$0.h());
            case e:
               return !c($$1, $$0.f());
            case f:
               return !c($$1, $$0.g());
            default:
               return false;
         }
      }
   }

   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3) {
   }

   protected eeb a(dmu $$0, jb $$1, eeb $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         eff $$4 = $$2.c(this.c());
         return new dwh($$0, $$1, $$2).a($$0.E($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.d(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.e(), this);
         }
      }
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == fam.c;
      eeb $$3 = super.m();
      jh $$4 = $$0.g();
      boolean $$5 = $$4 == jh.f || $$4 == jh.e;
      return $$3.b(this.c(), $$5 ? eff.b : eff.a).b(a, $$2);
   }

   public abstract efe<eff> c();

   protected eff a(eff $$0, dwu $$1) {
      return switch ($$1) {
         case c -> {
            switch ($$0) {
               case c:
                  yield eff.d;
               case d:
                  yield eff.c;
               case e:
                  yield eff.f;
               case f:
                  yield eff.e;
               case a:
                  yield eff.a;
               case b:
                  yield eff.b;
               case g:
                  yield eff.i;
               case h:
                  yield eff.j;
               case i:
                  yield eff.g;
               case j:
                  yield eff.h;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch ($$0) {
               case c:
                  yield eff.e;
               case d:
                  yield eff.f;
               case e:
                  yield eff.d;
               case f:
                  yield eff.c;
               case a:
                  yield eff.b;
               case b:
                  yield eff.a;
               case g:
                  yield eff.j;
               case h:
                  yield eff.g;
               case i:
                  yield eff.h;
               case j:
                  yield eff.i;
               default:
                  throw new MatchException(null, null);
            }
         }
         case b -> {
            switch ($$0) {
               case c:
                  yield eff.f;
               case d:
                  yield eff.e;
               case e:
                  yield eff.c;
               case f:
                  yield eff.d;
               case a:
                  yield eff.b;
               case b:
                  yield eff.a;
               case g:
                  yield eff.h;
               case h:
                  yield eff.i;
               case i:
                  yield eff.j;
               case j:
                  yield eff.g;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> $$0;
      };
   }

   protected eff a(eff $$0, dvd $$1) {
      return switch ($$1) {
         case b -> {
            switch ($$0) {
               case e:
                  yield eff.f;
               case f:
                  yield eff.e;
               case a:
               case b:
               default:
                  yield $$0;
               case g:
                  yield eff.j;
               case h:
                  yield eff.i;
               case i:
                  yield eff.h;
               case j:
                  yield eff.g;
            }
         }
         case c -> {
            switch ($$0) {
               case c:
                  yield eff.d;
               case d:
                  yield eff.c;
               case e:
               case f:
               case a:
               case b:
               default:
                  yield $$0;
               case g:
                  yield eff.h;
               case h:
                  yield eff.g;
               case i:
                  yield eff.j;
               case j:
                  yield eff.i;
            }
         }
         default -> $$0;
      };
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(a) ? fam.c.a(false) : super.b_($$0);
   }
}
