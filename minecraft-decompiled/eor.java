import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class eor extends enh<eqg> {
   public static final int a = 10;
   private static final int b = 42;
   private static final LoadingCache<Long, List<eor.a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new eor.b());

   public eor(Codec<eqg> $$0) {
      super($$0);
   }

   public static List<eor.a> a(dnt $$0) {
      bck $$1 = bck.a($$0.F());
      long $$2 = $$1.g() & 65535L;
      return (List<eor.a>)c.getUnchecked($$2);
   }

   @Override
   public boolean a(enj<eqg> $$0) {
      eqg $$1 = $$0.f();
      dnt $$2 = $$0.b();
      bck $$3 = $$0.d();
      jb $$4 = $$0.e();
      List<eor.a> $$5 = $$1.b();
      if ($$5.isEmpty()) {
         $$5 = a($$2);
      }

      for (eor.a $$6 : $$5) {
         if ($$6.a($$4)) {
            this.a($$2, $$3, $$1, $$6);
         }
      }

      return true;
   }

   private void a(dnl $$0, bck $$1, eqg $$2, eor.a $$3) {
      int $$4 = $$3.c();

      for (jb $$5 : jb.c(new jb($$3.a() - $$4, $$0.L_(), $$3.b() - $$4), new jb($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
         if ($$5.d($$3.a(), $$5.v(), $$3.b()) <= $$4 * $$4 + 1 && $$5.v() < $$3.d()) {
            this.a($$0, $$5, dqb.cy.m());
         } else if ($$5.v() > 65) {
            this.a($$0, $$5, dqb.a.m());
         }
      }

      if ($$3.e()) {
         int $$6 = -2;
         int $$7 = 2;
         int $$8 = 3;
         jb.a $$9 = new jb.a();

         for (int $$10 = -2; $$10 <= 2; $$10++) {
            for (int $$11 = -2; $$11 <= 2; $$11++) {
               for (int $$12 = 0; $$12 <= 3; $$12++) {
                  boolean $$13 = bcb.a($$10) == 2;
                  boolean $$14 = bcb.a($$11) == 2;
                  boolean $$15 = $$12 == 3;
                  if ($$13 || $$14 || $$15) {
                     boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                     boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                     eeb $$18 = dqb.fo.m().b(dug.a, $$16 && $$11 != -2).b(dug.c, $$16 && $$11 != 2).b(dug.d, $$17 && $$10 != -2).b(dug.b, $$17 && $$10 != 2);
                     this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                  }
               }
            }
         }
      }

      cpr $$19 = bzv.S.a($$0.a(), bzu.d);
      if ($$19 != null) {
         $$19.a($$2.c());
         $$19.n($$2.a());
         $$19.b($$3.a() + 0.5, $$3.d() + 1, $$3.b() + 0.5, $$1.i() * 360.0F, 0.0F);
         $$0.b($$19);
         jb $$20 = $$19.dx();
         this.a($$0, $$20.e(), dqb.I.m());
         this.a($$0, $$20, dtc.a($$0, $$20));
      }
   }

   public static class a {
      public static final Codec<eor.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.INT.fieldOf("centerX").orElse(0).forGetter($$0x -> $$0x.b),
               Codec.INT.fieldOf("centerZ").orElse(0).forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("radius").orElse(0).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("height").orElse(0).forGetter($$0x -> $$0x.e),
               Codec.BOOL.fieldOf("guarded").orElse(false).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eor.a::new)
      );
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final boolean f;
      private final fin g;

      public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = new fin($$0 - $$2, ehy.e, $$1 - $$2, $$0 + $$2, ehy.d, $$1 + $$2);
      }

      public boolean a(jb $$0) {
         return ke.a($$0.u()) == ke.a(this.b) && ke.a($$0.w()) == ke.a(this.c);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public fin f() {
         return this.g;
      }
   }

   static class b extends CacheLoader<Long, List<eor.a>> {
      public List<eor.a> a(Long $$0) {
         IntArrayList $$1 = ag.a(IntStream.range(0, 10), bck.a($$0));
         List<eor.a> $$2 = Lists.newArrayList();

         for (int $$3 = 0; $$3 < 10; $$3++) {
            int $$4 = bcb.a(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * $$3)));
            int $$5 = bcb.a(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * $$3)));
            int $$6 = $$1.get($$3);
            int $$7 = 2 + $$6 / 3;
            int $$8 = 76 + $$6 * 3;
            boolean $$9 = $$6 == 1 || $$6 == 2;
            $$2.add(new eor.a($$4, $$5, $$7, $$8, $$9));
         }

         return $$2;
      }
   }
}
