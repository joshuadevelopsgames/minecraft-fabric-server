import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public record dfi(int d) implements dga {
   public static final Codec<dfi> a = bbi.l.xmap(dfi::new, dfi::a);
   public static final zm<ByteBuf, dfi> b = zm.a(zk.g, dfi::a, dfi::new);
   public static final int c = -6265536;

   public static int a(dcv $$0, int $$1) {
      dfi $$2 = $$0.a(kq.K);
      return $$2 != null ? baj.f($$2.a()) : $$1;
   }

   public static dcv a(dcv $$0, List<dbu> $$1) {
      if (!$$0.a(azx.bT)) {
         return dcv.l;
      } else {
         dcv $$2 = $$0.c(1);
         int $$3 = 0;
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         dfi $$8 = $$2.a(kq.K);
         if ($$8 != null) {
            int $$9 = baj.b($$8.a());
            int $$10 = baj.c($$8.a());
            int $$11 = baj.d($$8.a());
            $$6 += Math.max($$9, Math.max($$10, $$11));
            $$3 += $$9;
            $$4 += $$10;
            $$5 += $$11;
            $$7++;
         }

         for (dbu $$12 : $$1) {
            int $$13 = $$12.a().d();
            int $$14 = baj.b($$13);
            int $$15 = baj.c($$13);
            int $$16 = baj.d($$13);
            $$6 += Math.max($$14, Math.max($$15, $$16));
            $$3 += $$14;
            $$4 += $$15;
            $$5 += $$16;
            $$7++;
         }

         int $$17 = $$3 / $$7;
         int $$18 = $$4 / $$7;
         int $$19 = $$5 / $$7;
         float $$20 = (float)$$6 / $$7;
         float $$21 = Math.max($$17, Math.max($$18, $$19));
         $$17 = (int)($$17 * $$20 / $$21);
         $$18 = (int)($$18 * $$20 / $$21);
         $$19 = (int)($$19 * $$20 / $$21);
         int $$22 = baj.a(0, $$17, $$18, $$19);
         $$2.b(kq.K, new dfi($$22));
         return $$2;
      }
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      if ($$2.a()) {
         $$1.accept(xo.a("item.color", String.format(Locale.ROOT, "#%06X", this.d)).a(o.h));
      } else {
         $$1.accept(xo.c("item.dyed").a(o.h, o.u));
      }
   }

   public int a() {
      return this.d;
   }
}
