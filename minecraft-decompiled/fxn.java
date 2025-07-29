import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fxn {
   private static final int a = 182;
   private static final int b = 5;
   private static final ame[] c = new ame[]{
      ame.b("boss_bar/pink_background"),
      ame.b("boss_bar/blue_background"),
      ame.b("boss_bar/red_background"),
      ame.b("boss_bar/green_background"),
      ame.b("boss_bar/yellow_background"),
      ame.b("boss_bar/purple_background"),
      ame.b("boss_bar/white_background")
   };
   private static final ame[] d = new ame[]{
      ame.b("boss_bar/pink_progress"),
      ame.b("boss_bar/blue_progress"),
      ame.b("boss_bar/red_progress"),
      ame.b("boss_bar/green_progress"),
      ame.b("boss_bar/yellow_progress"),
      ame.b("boss_bar/purple_progress"),
      ame.b("boss_bar/white_progress")
   };
   private static final ame[] e = new ame[]{
      ame.b("boss_bar/notched_6_background"),
      ame.b("boss_bar/notched_10_background"),
      ame.b("boss_bar/notched_12_background"),
      ame.b("boss_bar/notched_20_background")
   };
   private static final ame[] f = new ame[]{
      ame.b("boss_bar/notched_6_progress"), ame.b("boss_bar/notched_10_progress"), ame.b("boss_bar/notched_12_progress"), ame.b("boss_bar/notched_20_progress")
   };
   private final fue g;
   final Map<UUID, fyd> h = Maps.newLinkedHashMap();

   public fxn(fue $$0) {
      this.g = $$0;
   }

   public void a(fxb $$0) {
      if (!this.h.isEmpty()) {
         $$0.c();
         btt $$1 = bts.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fyd $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            xo $$7 = $$4.j();
            int $$8 = this.g.h.a($$7);
            int $$9 = $$2 / 2 - $$8 / 2;
            int $$10 = $$3 - 9;
            $$0.b(this.g.h, $$7, $$9, $$10, -1);
            $$3 += 10 + 9;
            if ($$3 >= $$0.b() / 3) {
               break;
            }
         }

         $$1.c();
      }
   }

   private void a(fxb $$0, int $$1, int $$2, bwz $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = bcb.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fxb $$0, int $$1, int $$2, bwz $$3, int $$4, ame[] $$5, ame[] $$6) {
      $$0.a(gxx.ar, $$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != bwz.b.a) {
         $$0.a(gxx.ar, $$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(acz $$0) {
      $$0.a(new acz.b() {
         @Override
         public void a(UUID $$0, xo $$1, float $$2, bwz.a $$3, bwz.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fxn.this.h.put($$0, new fyd($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fxn.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fxn.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xo $$1) {
            fxn.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bwz.a $$1, bwz.b $$2) {
            fyd $$3 = fxn.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fyd $$4 = fxn.this.h.get($$0);
            $$4.a($$1);
            $$4.b($$2);
            $$4.c($$3);
         }
      });
   }

   public void a() {
      this.h.clear();
   }

   public boolean b() {
      if (!this.h.isEmpty()) {
         for (bwz $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bwz $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bwz $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
