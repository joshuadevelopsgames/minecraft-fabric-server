import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class exn extends euy {
   private static final String[] e = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] f = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};
   private static final float g = 0.05F;
   private static final int h = 15;
   private final List<exn.a> i;
   public static final MapCodec<exn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), bbi.b(exn.a.a.listOf()).fieldOf("setups").forGetter($$0x -> $$0x.i)).apply($$0, exn::new)
   );

   public exn(euy.c $$0, List<exn.a> $$1) {
      super($$0);
      this.i = $$1;
   }

   public exn(euy.c $$0, exn.a $$1) {
      this($$0, List.of($$1));
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      exm.a $$1 = new exm.a();
      ekz $$2 = $$0.f();
      exn.a $$3 = null;
      if (this.i.size() > 1) {
         float $$4 = 0.0F;

         for (exn.a $$5 : this.i) {
            $$4 += $$5.h();
         }

         float $$6 = $$2.i();

         for (exn.a $$7 : this.i) {
            $$6 -= $$7.h() / $$4;
            if ($$6 < 0.0F) {
               $$3 = $$7;
               break;
            }
         }
      } else {
         $$3 = this.i.get(0);
      }

      if ($$3 == null) {
         throw new IllegalStateException();
      } else {
         exn.a $$8 = $$3;
         $$1.d = a($$2, $$8.b());
         $$1.c = $$8.c();
         $$1.e = $$8.d();
         $$1.f = $$8.e();
         $$1.g = $$8.g();
         ame $$9;
         if ($$2.i() < 0.05F) {
            $$9 = ame.b(f[$$2.a(f.length)]);
         } else {
            $$9 = ame.b(e[$$2.a(e.length)]);
         }

         eza $$11 = $$0.e().a($$9);
         dwu $$12 = ag.a(dwu.values(), $$2);
         dvd $$13 = $$2.i() < 0.5F ? dvd.a : dvd.c;
         jb $$14 = new jb($$11.a().u() / 2, 0, $$11.a().w() / 2);
         efz $$15 = $$0.b();
         dmw $$16 = $$0.i();
         eko $$17 = $$0.d();
         jb $$18 = $$0.h().l();
         euq $$19 = $$11.a($$18, $$12, $$14, $$13);
         jb $$20 = $$19.g();
         int $$21 = $$15.a($$20.u(), $$20.w(), exm.a($$8.a()), $$16, $$17) - 1;
         int $$22 = a($$2, $$15, $$8.a(), $$1.d, $$21, $$19.e(), $$19, $$16, $$17);
         jb $$23 = new jb($$18.u(), $$22, $$18.w());
         return Optional.of(new euy.b($$23, (Consumer<evq>)($$11x -> {
            if ($$8.f()) {
               $$1.b = a($$23, $$0.b().d().getNoiseBiome(jw.a($$23.u()), jw.a($$23.v()), jw.a($$23.w()), $$17.b()), $$15.f());
            }

            $$11x.a(new exm($$0.e(), $$23, $$8.a(), $$1, $$9, $$11, $$12, $$13, $$14));
         })));
      }
   }

   private static boolean a(ekz $$0, float $$1) {
      if ($$1 == 0.0F) {
         return false;
      } else {
         return $$1 == 1.0F ? true : $$0.i() < $$1;
      }
   }

   private static boolean a(jb $$0, jl<dnx> $$1, int $$2) {
      return $$1.a().b($$0, $$2);
   }

   private static int a(bck $$0, efz $$1, exm.b $$2, boolean $$3, int $$4, int $$5, euq $$6, dmw $$7, eko $$8) {
      int $$9 = $$7.L_() + 15;
      int $$10;
      if ($$2 == exm.b.f) {
         if ($$3) {
            $$10 = bcb.b($$0, 32, 100);
         } else if ($$0.i() < 0.5F) {
            $$10 = bcb.b($$0, 27, 29);
         } else {
            $$10 = bcb.b($$0, 29, 100);
         }
      } else if ($$2 == exm.b.d) {
         int $$13 = $$4 - $$5;
         $$10 = a($$0, 70, $$13);
      } else if ($$2 == exm.b.e) {
         int $$15 = $$4 - $$5;
         $$10 = a($$0, $$9, $$15);
      } else if ($$2 == exm.b.b) {
         $$10 = $$4 - $$5 + bcb.b($$0, 2, 8);
      } else {
         $$10 = $$4;
      }

      List<jb> $$19 = ImmutableList.of(new jb($$6.h(), 0, $$6.j()), new jb($$6.k(), 0, $$6.j()), new jb($$6.h(), 0, $$6.m()), new jb($$6.k(), 0, $$6.m()));
      List<dng> $$20 = $$19.stream().map($$3x -> $$1.a($$3x.u(), $$3x.w(), $$7, $$8)).collect(Collectors.toList());
      eka.a $$21 = $$2 == exm.b.c ? eka.a.c : eka.a.a;

      int $$22;
      for ($$22 = $$10; $$22 > $$9; $$22--) {
         int $$23 = 0;

         for (dng $$24 : $$20) {
            eeb $$25 = $$24.a($$22);
            if ($$21.e().test($$25)) {
               if (++$$23 == 3) {
                  return $$22;
               }
            }
         }
      }

      return $$22;
   }

   private static int a(bck $$0, int $$1, int $$2) {
      return $$1 < $$2 ? bcb.b($$0, $$1, $$2) : $$2;
   }

   @Override
   public evh<?> e() {
      return evh.l;
   }

   public record a(exm.b b, float c, float d, boolean e, boolean f, boolean g, boolean h, float i) {
      public static final Codec<exn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               exm.b.g.fieldOf("placement").forGetter(exn.a::a),
               Codec.floatRange(0.0F, 1.0F).fieldOf("air_pocket_probability").forGetter(exn.a::b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("mossiness").forGetter(exn.a::c),
               Codec.BOOL.fieldOf("overgrown").forGetter(exn.a::d),
               Codec.BOOL.fieldOf("vines").forGetter(exn.a::e),
               Codec.BOOL.fieldOf("can_be_cold").forGetter(exn.a::f),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(exn.a::g),
               bbi.r.fieldOf("weight").forGetter(exn.a::h)
            )
            .apply($$0, exn.a::new)
      );

      public exm.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public boolean f() {
         return this.g;
      }

      public boolean g() {
         return this.h;
      }

      public float h() {
         return this.i;
      }
   }
}
