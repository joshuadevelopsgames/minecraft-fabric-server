import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqv extends dub {
   public static final MapCodec<dqv> a = b(dqv::new);
   public static final eez<jh> b = dub.f;
   @Nullable
   private eeg c;
   @Nullable
   private eeg d;
   @Nullable
   private eeg e;
   @Nullable
   private eeg g;
   private static final Predicate<eeb> h = $$0 -> $$0 != null && ($$0.a(dqb.ev) || $$0.a(dqb.ew));

   @Override
   public MapCodec<? extends dqv> a() {
      return a;
   }

   protected dqv(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dmx $$0, jb $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dmu $$0, jb $$1) {
      eeg.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cni $$3 = bzv.bn.a($$0, bzu.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         eeg.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cmv $$5 = bzv.ar.a($$0, bzu.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dmu $$0, eeg.b $$1, bzm $$2, jb $$3) {
      a($$0, $$1);
      $$2.b($$3.u() + 0.5, $$3.v() + 0.05, $$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (auc $$4 : $$0.a(auc.class, $$2.cV().g(5.0))) {
         aq.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dmu $$0, eeg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eef $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dqb.a.m(), 2);
            $$0.c(2001, $$4.d(), dpz.j($$4.a()));
         }
      }
   }

   public static void b(dmu $$0, eeg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eef $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dqb.a);
         }
      }
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   private eeg b() {
      if (this.c == null) {
         this.c = eeh.a().a(" ", "#", "#").a('#', eef.a(eek.a(dqb.ef))).b();
      }

      return this.c;
   }

   private eeg q() {
      if (this.d == null) {
         this.d = eeh.a().a("^", "#", "#").a('^', eef.a(h)).a('#', eef.a(eek.a(dqb.ef))).b();
      }

      return this.d;
   }

   private eeg r() {
      if (this.e == null) {
         this.e = eeh.a().a("~ ~", "###", "~#~").a('#', eef.a(eek.a(dqb.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private eeg y() {
      if (this.g == null) {
         this.g = eeh.a().a("~^~", "###", "~#~").a('^', eef.a(h)).a('#', eef.a(eek.a(dqb.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
