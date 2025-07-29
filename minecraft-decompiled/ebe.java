import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebe extends eaz {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "LootTable";
   private static final String c = "LootTableSeed";
   private static final String d = "hit_direction";
   private static final String e = "item";
   private static final int f = 10;
   private static final int g = 40;
   private static final int h = 10;
   private int i;
   private long j;
   private long k;
   private dcv l;
   @Nullable
   private jh m;
   @Nullable
   private amd<fdo> q;
   private long r;

   public ebe(jb $$0, eeb $$1) {
      super(ebb.O, $$0, $$1);
      this.l = dcv.l;
   }

   public boolean a(long $$0, aub $$1, cam $$2, jh $$3, dcv $$4) {
      if (this.m == null) {
         this.m = $$3;
      }

      this.j = $$0 + 40L;
      if ($$0 < this.k) {
         return false;
      } else {
         this.k = $$0 + 10L;
         this.a($$1, $$2, $$4);
         int $$5 = this.f();
         if (++this.i >= 10) {
            this.b($$1, $$2, $$4);
            return true;
         } else {
            $$1.a(this.aA_(), this.m().b(), 2);
            int $$6 = this.f();
            if ($$5 != $$6) {
               eeb $$7 = this.m();
               eeb $$8 = $$7.b(eer.bz, $$6);
               $$1.a(this.aA_(), $$8, 3);
            }

            return false;
         }
      }
   }

   private void a(aub $$0, cam $$1, dcv $$2) {
      if (this.q != null) {
         fdo $$3 = $$0.q().bc().a(this.q);
         if ($$1 instanceof auc $$4) {
            aq.Q.a($$4, this.q);
         }

         fdm $$5 = new fdm.a($$0).a(fgd.f, fis.b(this.o)).a($$1.em()).a(fgd.a, $$1).a(fgd.i, $$2).a(fgc.i);
         ObjectArrayList<dcv> $$6 = $$3.a($$5, this.r);

         this.l = switch ($$6.size()) {
            case 0 -> dcv.l;
            case 1 -> (dcv)$$6.getFirst();
            default -> {
               a.warn("Expected max 1 loot from loot table {}, but got {}", this.q.a(), $$6.size());
               yield (dcv)$$6.getFirst();
            }
         };
         this.q = null;
         this.e();
      }
   }

   private void b(aub $$0, cam $$1, dcv $$2) {
      this.c($$0, $$1, $$2);
      eeb $$3 = this.m();
      $$0.c(3008, this.aA_(), dpz.j($$3));
      dpz $$6;
      if (this.m().b() instanceof dqf $$5) {
         $$6 = $$5.b();
      } else {
         $$6 = dqb.a;
      }

      $$0.a(this.o, $$6.m(), 3);
   }

   private void c(aub $$0, cam $$1, dcv $$2) {
      this.a($$0, $$1, $$2);
      if (!this.l.f()) {
         double $$3 = bzv.as.l();
         double $$4 = 1.0 - $$3;
         double $$5 = $$3 / 2.0;
         jh $$6 = Objects.requireNonNullElse(this.m, jh.b);
         jb $$7 = this.o.a($$6, 1);
         double $$8 = $$7.u() + 0.5 * $$4 + $$5;
         double $$9 = $$7.v() + 0.5 + bzv.as.m() / 2.0F;
         double $$10 = $$7.w() + 0.5 * $$4 + $$5;
         cqz $$11 = new cqz($$0, $$8, $$9, $$10, this.l.a($$0.A.a(21) + 10));
         $$11.i(fis.c);
         $$0.b($$11);
         this.l = dcv.l;
      }
   }

   public void a(aub $$0) {
      if (this.i != 0 && $$0.ae() >= this.j) {
         int $$1 = this.f();
         this.i = Math.max(0, this.i - 2);
         int $$2 = this.f();
         if ($$1 != $$2) {
            $$0.a(this.aA_(), this.m().b(eer.bz, $$2), 3);
         }

         int $$3 = 4;
         this.j = $$0.ae() + 4L;
      }

      if (this.i == 0) {
         this.m = null;
         this.j = 0L;
         this.k = 0L;
      } else {
         $$0.a(this.aA_(), this.m().b(), 2);
      }
   }

   private boolean d(fda $$0) {
      this.q = $$0.<amd<fdo>>a("LootTable", fdo.a).orElse(null);
      this.r = $$0.a("LootTableSeed", 0L);
      return this.q != null;
   }

   private boolean g(fdc $$0) {
      if (this.q == null) {
         return false;
      } else {
         $$0.a("LootTable", fdo.a, this.q);
         if (this.r != 0L) {
            $$0.a("LootTableSeed", this.r);
         }

         return true;
      }
   }

   @Override
   public ui a(jn.a $$0) {
      ui $$1 = super.a($$0);
      $$1.b("hit_direction", jh.k, this.m);
      if (!this.l.f()) {
         amc<vi> $$2 = $$0.a(uw.a);
         $$1.a("item", dcv.b, $$2, this.l);
      }

      return $$1;
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      if (!this.d($$0)) {
         this.l = $$0.<dcv>a("item", dcv.b).orElse(dcv.l);
      } else {
         this.l = dcv.l;
      }

      this.m = $$0.<jh>a("hit_direction", jh.k).orElse(null);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.g($$0) && !this.l.f()) {
         $$0.a("item", dcv.b, this.l);
      }
   }

   public void a(amd<fdo> $$0, long $$1) {
      this.q = $$0;
      this.r = $$1;
   }

   private int f() {
      if (this.i == 0) {
         return 0;
      } else if (this.i < 3) {
         return 1;
      } else {
         return this.i < 6 ? 2 : 3;
      }
   }

   @Nullable
   public jh c() {
      return this.m;
   }

   public dcv d() {
      return this.l;
   }
}
