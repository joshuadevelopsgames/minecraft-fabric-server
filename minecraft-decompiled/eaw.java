import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eaw extends eaz {
   static final Logger c = LogUtils.getLogger();
   private static final String d = "flower_pos";
   private static final String e = "bees";
   static final List<String> f = Arrays.asList(
      "Air",
      "drop_chances",
      "equipment",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "fall_distance",
      "FallFlying",
      "Fire",
      "HurtByTimestamp",
      "HurtTime",
      "LeftHanded",
      "Motion",
      "NoGravity",
      "OnGround",
      "PortalCooldown",
      "Pos",
      "Rotation",
      "sleeping_pos",
      "CannotEnterHiveTicks",
      "TicksSincePollination",
      "CropsGrownSincePollination",
      "hive_pos",
      "Passengers",
      "leash",
      "UUID"
   );
   public static final int a = 3;
   private static final int g = 400;
   private static final int h = 2400;
   public static final int b = 600;
   private final List<eaw.a> i = Lists.newArrayList();
   @Nullable
   private jb j;

   public eaw(jb $$0, eeb $$1) {
      super(ebb.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.aA_()), eaw.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (jb $$0 : jb.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dtc) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean c() {
      return this.i.isEmpty();
   }

   public boolean d() {
      return this.i.size() == 3;
   }

   public void a(@Nullable cut $$0, eeb $$1, eaw.b $$2) {
      List<bzm> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bzm $$4 : $$3) {
            if ($$4 instanceof cme $$5 && $$0.dv().g($$4.dv()) <= 16.0) {
               if (!this.j()) {
                  $$5.g($$0);
               } else {
                  $$5.s(400);
               }
            }
         }
      }
   }

   private List<bzm> a(eeb $$0, eaw.b $$1) {
      List<bzm> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bdl
   public int f() {
      return this.i.size();
   }

   public static int a(eeb $$0) {
      return $$0.c(dpt.c);
   }

   @bdl
   public boolean j() {
      return dqp.a(this.n, this.aA_());
   }

   public void a(cme $$0) {
      if (this.i.size() < 3) {
         $$0.bS();
         $$0.bR();
         $$0.S_();
         this.a(eaw.c.a($$0));
         if (this.n != null) {
            if ($$0.n() && (!this.k() || this.n.A.h())) {
               this.j = $$0.m();
            }

            jb $$1 = this.aA_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), ayz.bV, aza.e, 1.0F, 1.0F);
            this.n.a(ejb.c, $$1, ejb.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(eaw.c $$0) {
      this.i.add(new eaw.a($$0));
   }

   private static boolean a(dmu $$0, jb $$1, eeb $$2, eaw.c $$3, @Nullable List<bzm> $$4, eaw.b $$5, @Nullable jb $$6) {
      if (cme.c($$0) && $$5 != eaw.b.c) {
         return false;
      } else {
         jh $$7 = $$2.c(dpt.b);
         jb $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != eaw.b.c) {
            return false;
         } else {
            bzm $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cme $$11) {
                  if ($$6 != null && !$$11.n() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == eaw.b.a) {
                     $$11.gX();
                     if ($$2.a(azo.aM, $$0x -> $$0x.b(dpt.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.c($$1, $$2.b(dpt.c, $$12 + $$13));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.ds();
                  double $$15 = $$9 ? 0.0 : 0.55 + $$14 / 2.0F;
                  double $$16 = $$1.u() + 0.5 + $$15 * $$7.j();
                  double $$17 = $$1.v() + 0.5 - $$10.dt() / 2.0F;
                  double $$18 = $$1.w() + 0.5 + $$15 * $$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dP(), $$10.dR());
               }

               $$0.a(null, $$1, ayz.bW, aza.e, 1.0F, 1.0F);
               $$0.a(ejb.c, $$1, ejb.a.a($$10, $$0.a_($$1)));
               return $$0.b($$10);
            } else {
               return false;
            }
         }
      }
   }

   private boolean k() {
      return this.j != null;
   }

   private static void a(dmu $$0, jb $$1, eeb $$2, List<eaw.a> $$3, @Nullable jb $$4) {
      boolean $$5 = false;
      Iterator<eaw.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         eaw.a $$7 = $$6.next();
         if ($$7.a()) {
            eaw.b $$8 = $$7.c() ? eaw.b.a : eaw.b.b;
            if (a($$0, $$1, $$2, $$7.b(), null, $$8, $$4)) {
               $$5 = true;
               $$6.remove();
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, eaw $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.H_().j() < 0.005) {
         double $$4 = $$1.u() + 0.5;
         double $$5 = $$1.v();
         double $$6 = $$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, ayz.bY, aza.e, 1.0F, 1.0F);
      }

      ahj.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.i.clear();
      $$0.<List>a("bees", eaw.c.b).orElse(List.of()).forEach(this::a);
      this.j = $$0.<jb>a("flower_pos", jb.a).orElse(null);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("bees", eaw.c.b, this.u());
      $$0.b("flower_pos", jb.a, this.j);
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.i.clear();
      List<eaw.c> $$1 = $$0.a(kq.ar, deu.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.ar, new deu(this.u()));
   }

   @Override
   public void b(fdc $$0) {
      super.b($$0);
      $$0.c("bees");
   }

   private List<eaw.c> u() {
      return this.i.stream().map(eaw.a::b).toList();
   }

   static class a {
      private final eaw.c a;
      private int b;

      a(eaw.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public eaw.c b() {
         return new eaw.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.e().b("HasNectar", false);
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public record c(dfd d, int e, int f) {
      public static final Codec<eaw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               dfd.b.optionalFieldOf("entity_data", dfd.a).forGetter(eaw.c::a),
               Codec.INT.fieldOf("ticks_in_hive").forGetter(eaw.c::b),
               Codec.INT.fieldOf("min_ticks_in_hive").forGetter(eaw.c::c)
            )
            .apply($$0, eaw.c::new)
      );
      public static final Codec<List<eaw.c>> b = a.listOf();
      public static final zm<ByteBuf, eaw.c> c = zm.a(dfd.d, eaw.c::a, zk.h, eaw.c::b, zk.h, eaw.c::c, eaw.c::new);

      public static eaw.c a(bzm $$0) {
         eaw.c var5;
         try (bci.j $$1 = new bci.j($$0.ef(), eaw.c)) {
            fcz $$2 = fcz.a($$1, $$0.eb());
            $$0.c($$2);
            eaw.f.forEach($$2::c);
            ui $$3 = $$2.b();
            boolean $$4 = $$3.b("HasNectar", false);
            var5 = new eaw.c(dfd.a($$3), 0, $$4 ? 2400 : 600);
         }

         return var5;
      }

      public static eaw.c a(int $$0) {
         ui $$1 = new ui();
         $$1.a("id", mm.f.b(bzv.m).toString());
         return new eaw.c(dfd.a($$1), $$0, 600);
      }

      @Nullable
      public bzm a(dmu $$0, jb $$1) {
         ui $$2 = this.d.d();
         eaw.f.forEach($$2::r);
         bzm $$3 = bzv.a($$2, $$0, bzu.r, $$0x -> $$0x);
         if ($$3 != null && $$3.ap().a(azs.e)) {
            $$3.g(true);
            if ($$3 instanceof cme $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cme $$1) {
         int $$2 = $$1.Z_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gP() - $$0));
      }

      public dfd a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.f;
      }
   }
}
