public class exg {
   private static final ame[] a = new ame[]{
      ame.b("nether_fossils/fossil_1"),
      ame.b("nether_fossils/fossil_2"),
      ame.b("nether_fossils/fossil_3"),
      ame.b("nether_fossils/fossil_4"),
      ame.b("nether_fossils/fossil_5"),
      ame.b("nether_fossils/fossil_6"),
      ame.b("nether_fossils/fossil_7"),
      ame.b("nether_fossils/fossil_8"),
      ame.b("nether_fossils/fossil_9"),
      ame.b("nether_fossils/fossil_10"),
      ame.b("nether_fossils/fossil_11"),
      ame.b("nether_fossils/fossil_12"),
      ame.b("nether_fossils/fossil_13"),
      ame.b("nether_fossils/fossil_14")
   };

   public static void a(ezb $$0, evd $$1, bck $$2, jb $$3) {
      dwu $$4 = dwu.a($$2);
      $$1.a(new exg.a($$0, ag.a(a, $$2), $$3, $$4));
   }

   public static class a extends evi {
      public a(ezb $$0, ame $$1, jb $$2, dwu $$3) {
         super(evp.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ezb $$0, ui $$1) {
         super(evp.ac, $$1, $$0, $$1x -> a($$1.<dwu>a("Rot", dwu.h).orElseThrow()));
      }

      private static eyw a(dwu $$0) {
         return new eyw().a($$0).a(dvd.a).a(eyb.d);
      }

      @Override
      protected void a(evo $$0, ui $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dwu.h, this.c.d());
      }

      @Override
      protected void a(String $$0, jb $$1, dnl $$2, bck $$3, euq $$4) {
      }

      @Override
      public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, jb $$6) {
         euq $$7 = this.b.b(this.c, this.d);
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.a($$0, $$3, $$7, $$4);
      }

      private void a(dnt $$0, bck $$1, euq $$2, euq $$3) {
         bck $$4 = bck.a($$0.F()).e().a($$2.g());
         if ($$4.i() < 0.5F) {
            int $$5 = $$2.h() + $$4.a($$2.d());
            int $$6 = $$2.i();
            int $$7 = $$2.j() + $$4.a($$2.f());
            jb $$8 = new jb($$5, $$6, $$7);
            if ($$0.a_($$8).l() && $$3.b($$8)) {
               $$0.a($$8, dqb.mN.m().a(dwu.a($$4)), 2);
            }
         }
      }
   }
}
