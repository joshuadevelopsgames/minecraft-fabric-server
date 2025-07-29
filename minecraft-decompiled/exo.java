import java.util.Map;

public class exo {
   private static final int a = 32;
   static final jb b = new jb(4, 0, 15);
   private static final ame[] c = new ame[]{
      ame.b("shipwreck/with_mast"),
      ame.b("shipwreck/sideways_full"),
      ame.b("shipwreck/sideways_fronthalf"),
      ame.b("shipwreck/sideways_backhalf"),
      ame.b("shipwreck/rightsideup_full"),
      ame.b("shipwreck/rightsideup_fronthalf"),
      ame.b("shipwreck/rightsideup_backhalf"),
      ame.b("shipwreck/with_mast_degraded"),
      ame.b("shipwreck/rightsideup_full_degraded"),
      ame.b("shipwreck/rightsideup_fronthalf_degraded"),
      ame.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ame[] d = new ame[]{
      ame.b("shipwreck/with_mast"),
      ame.b("shipwreck/upsidedown_full"),
      ame.b("shipwreck/upsidedown_fronthalf"),
      ame.b("shipwreck/upsidedown_backhalf"),
      ame.b("shipwreck/sideways_full"),
      ame.b("shipwreck/sideways_fronthalf"),
      ame.b("shipwreck/sideways_backhalf"),
      ame.b("shipwreck/rightsideup_full"),
      ame.b("shipwreck/rightsideup_fronthalf"),
      ame.b("shipwreck/rightsideup_backhalf"),
      ame.b("shipwreck/with_mast_degraded"),
      ame.b("shipwreck/upsidedown_full_degraded"),
      ame.b("shipwreck/upsidedown_fronthalf_degraded"),
      ame.b("shipwreck/upsidedown_backhalf_degraded"),
      ame.b("shipwreck/sideways_full_degraded"),
      ame.b("shipwreck/sideways_fronthalf_degraded"),
      ame.b("shipwreck/sideways_backhalf_degraded"),
      ame.b("shipwreck/rightsideup_full_degraded"),
      ame.b("shipwreck/rightsideup_fronthalf_degraded"),
      ame.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, amd<fdo>> e = Map.of("map_chest", fdf.G, "treasure_chest", fdf.I, "supply_chest", fdf.H);

   public static exo.a a(ezb $$0, jb $$1, dwu $$2, evd $$3, bck $$4, boolean $$5) {
      ame $$6 = ag.a($$5 ? c : d, $$4);
      exo.a $$7 = new exo.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends evi {
      private final boolean h;

      public a(ezb $$0, ame $$1, jb $$2, dwu $$3, boolean $$4) {
         super(evp.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ezb $$0, ui $$1) {
         super(evp.ab, $$1, $$0, $$1x -> a($$1.<dwu>a("Rot", dwu.h).orElseThrow()));
         this.h = $$1.b("isBeached", false);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", dwu.h, this.c.d());
      }

      private static eyw a(dwu $$0) {
         return new eyw().a($$0).a(dvd.a).a(exo.b).a(eyb.d);
      }

      @Override
      protected void a(String $$0, jb $$1, dnl $$2, bck $$3, euq $$4) {
         amd<fdo> $$5 = exo.e.get($$0);
         if ($$5 != null) {
            bxq.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            kg $$9 = this.b.a();
            eka.a $$10 = this.h ? eka.a.a : eka.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jb $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jb $$13 : jb.c(this.d, $$12)) {
                  int $$14 = $$0.a($$10, $$13.u(), $$13.w());
                  $$8 += $$14;
                  $$7 = Math.min($$7, $$14);
               }

               $$8 /= $$11;
            }

            this.c(this.h ? this.a($$7, $$3) : $$8);
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         }
      }

      public boolean l() {
         kg $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, bck $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jb(this.d.u(), $$0, this.d.w());
      }
   }
}
