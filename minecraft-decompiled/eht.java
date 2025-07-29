import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record eht(
   jy<dnx> h,
   dlz i,
   int j,
   long k,
   long l,
   egz m,
   @Nullable eld.d n,
   @Nullable ejo o,
   egv p,
   @Nullable long[] q,
   Map<eka.a, long[]> r,
   efy.b s,
   ShortList[] t,
   boolean u,
   List<eht.b> v,
   List<ui> w,
   List<ui> x,
   ui y
) {
   private static final Codec<egq<eeb>> z = egq.a(dpz.k, eeb.a, egq.d.d, dqb.a.m());
   private static final Codec<List<fkj<dpz>>> A = fkj.a(mm.e.q()).listOf();
   private static final Codec<List<fkj<fak>>> B = fkj.a(mm.c.q()).listOf();
   private static final Logger C = LogUtils.getLogger();
   private static final String D = "UpgradeData";
   private static final String E = "block_ticks";
   private static final String F = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static eht a(dmw $$0, jz $$1, ui $$2) {
      if ($$2.i("Status").isEmpty()) {
         return null;
      } else {
         dlz $$3 = new dlz($$2.b("xPos", 0), $$2.b("zPos", 0));
         long $$4 = $$2.b("LastUpdate", 0L);
         long $$5 = $$2.b("InhabitedTime", 0L);
         egz $$6 = $$2.<egz>a("Status", egz.o).orElse(egz.c);
         egv $$7 = $$2.m("UpgradeData").map($$1x -> new egv($$1x, $$0)).orElse(egv.a);
         boolean $$8 = $$2.b("isLightOn", false);
         eld.d $$9 = $$2.<eld.d>a("blending_data", eld.d.a).orElse(null);
         ejo $$10 = $$2.<ejo>a("below_zero_retrogen", ejo.a).orElse(null);
         long[] $$11 = $$2.l("carving_mask").orElse(null);
         Map<eka.a, long[]> $$12 = new EnumMap<>(eka.a.class);
         $$2.m("Heightmaps").ifPresent($$2x -> {
            for (eka.a $$3x : $$6.e()) {
               $$2x.l($$3x.a()).ifPresent($$2xx -> $$12.put($$3x, $$2xx));
            }
         });
         List<fkj<dpz>> $$13 = fkj.a($$2.<List<fkj<dpz>>>a("block_ticks", A).orElse(List.of()), $$3);
         List<fkj<fak>> $$14 = fkj.a($$2.<List<fkj<fak>>>a("fluid_ticks", B).orElse(List.of()), $$3);
         efy.b $$15 = new efy.b($$13, $$14);
         uo $$16 = $$2.p("PostProcessing");
         ShortList[] $$17 = new ShortList[$$16.size()];

         for (int $$18 = 0; $$18 < $$16.size(); $$18++) {
            uo $$19 = $$16.f($$18);
            ShortList $$20 = new ShortArrayList($$19.size());

            for (int $$21 = 0; $$21 < $$19.size(); $$21++) {
               $$20.add($$19.a($$21, (short)0));
            }

            $$17[$$18] = $$20;
         }

         List<ui> $$22 = $$2.o("entities").stream().flatMap(uo::j).toList();
         List<ui> $$23 = $$2.o("block_entities").stream().flatMap(uo::j).toList();
         ui $$24 = $$2.n("structures");
         uo $$25 = $$2.p("sections");
         List<eht.b> $$26 = new ArrayList<>($$25.size());
         jy<dnx> $$27 = $$1.f(mn.aK);
         Codec<egr<jl<dnx>>> $$28 = a($$27);

         for (int $$29 = 0; $$29 < $$25.size(); $$29++) {
            Optional<ui> $$30 = $$25.a($$29);
            if (!$$30.isEmpty()) {
               ui $$31 = $$30.get();
               int $$32 = $$31.b("Y", (byte)0);
               egj $$35;
               if ($$32 >= $$0.aq() && $$32 <= $$0.ar()) {
                  egq<eeb> $$33 = $$31.m("block_states")
                     .map($$2x -> (egq<eeb>)z.parse(uw.a, $$2x).promotePartial($$2xx -> a($$3, $$32, $$2xx)).getOrThrow(eht.a::new))
                     .orElseGet(() -> new egq<>(dpz.k, dqb.a.m(), egq.d.d));
                  egr<jl<dnx>> $$34 = $$31.m("biomes")
                     .map($$3x -> (egr<jl<dnx>>)$$28.parse(uw.a, $$3x).promotePartial($$2xx -> a($$3, $$32, $$2xx)).getOrThrow(eht.a::new))
                     .orElseGet(() -> new egq<>($$27.t(), $$27.b(doe.b), egq.d.e));
                  $$35 = new egj($$33, $$34);
               } else {
                  $$35 = null;
               }

               egd $$37 = $$31.j("BlockLight").map(egd::new).orElse(null);
               egd $$38 = $$31.j("SkyLight").map(egd::new).orElse(null);
               $$26.add(new eht.b($$32, $$35, $$37, $$38));
            }
         }

         return new eht($$27, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$12, $$15, $$17, $$8, $$26, $$22, $$23, $$24);
      }
   }

   public egs a(aub $$0, clp $$1, ehr $$2, dlz $$3) {
      if (!Objects.equals($$3, this.i)) {
         C.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.q().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      egj[] $$5 = new egj[$$4];
      boolean $$6 = $$0.G_().g();
      egc $$7 = $$0.n();
      faa $$8 = $$7.q();
      jy<dnx> $$9 = $$0.K_().f(mn.aK);
      boolean $$10 = false;

      for (eht.b $$11 : this.v) {
         ke $$12 = ke.a($$3, $$11.a);
         if ($$11.b != null) {
            $$5[$$0.g($$11.a)] = $$11.b;
            $$1.a($$12, $$11.b);
         }

         boolean $$13 = $$11.c != null;
         boolean $$14 = $$6 && $$11.d != null;
         if ($$13 || $$14) {
            if (!$$10) {
               $$8.b($$3, true);
               $$10 = true;
            }

            if ($$13) {
               $$8.a(dnd.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dnd.a, $$12, $$11.d);
            }
         }
      }

      ehd $$15 = this.m.d();
      efy $$18;
      if ($$15 == ehd.b) {
         fkf<dpz> $$16 = new fkf<>(this.s.a());
         fkf<fak> $$17 = new fkf<>(this.s.b());
         $$18 = new egi($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eld.a(this.n));
      } else {
         fki<dpz> $$19 = fki.a(this.s.a());
         fki<fak> $$20 = fki.a(this.s.b());
         egs $$21 = new egs($$3, this.p, $$5, $$19, $$20, $$0, $$9, eld.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(egz.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<eka.a> $$23 = EnumSet.noneOf(eka.a.class);

      for (eka.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      eka.a($$18, $$23);
      $$18.a(a(evo.a($$0), this.y, $$0.F()));
      $$18.b(a($$0.K_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == ehd.b) {
         return new egh((egi)$$18, false);
      } else {
         egs $$27 = (egs)$$18;

         for (ui $$28 : this.w) {
            $$27.b($$28);
         }

         for (ui $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new efx(this.q, $$18.L_()));
         }

         return $$27;
      }
   }

   private static void a(dlz $$0, int $$1, String $$2) {
      C.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<egr<jl<dnx>>> a(jy<dnx> $$0) {
      return egq.b($$0.t(), $$0.r(), egq.d.e, $$0.b(doe.b));
   }

   public static eht a(aub $$0, efy $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dlz $$2 = $$1.f();
         List<eht.b> $$3 = new ArrayList<>();
         egj[] $$4 = $$1.d();
         faa $$5 = $$0.n().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            egd $$9 = $$5.a(dnd.b).a(ke.a($$2, $$6));
            egd $$10 = $$5.a(dnd.a).a(ke.a($$2, $$6));
            egd $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            egd $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               egj $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new eht.b($$6, $$13, $$11, $$12));
            }
         }

         List<ui> $$14 = new ArrayList<>($$1.c().size());

         for (jb $$15 : $$1.c()) {
            ui $$16 = $$1.a($$15, $$0.K_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<ui> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == ehd.a) {
            egs $$19 = (egs)$$1;
            $$17.addAll($$19.J());
            efx $$20 = $$19.F();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<eka.a, long[]> $$21 = new EnumMap<>(eka.a.class);

         for (Entry<eka.a, eka> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         efy.b $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         ui $$26 = a(evo.a($$0), $$2, $$1.g(), $$1.h());
         return new eht(
            $$0.K_().f(mn.aK),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            y.a($$1.v(), eld::a),
            $$1.z(),
            $$1.t().c(),
            $$18,
            $$21,
            $$24,
            $$25,
            $$1.x(),
            $$3,
            $$17,
            $$14,
            $$26
         );
      }
   }

   public ui a() {
      ui $$0 = ux.e(new ui());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mm.l.b(this.m).toString());
      $$0.b("blending_data", eld.d.a, this.n);
      $$0.b("below_zero_retrogen", ejo.a, this.o);
      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uo $$1 = new uo();
      Codec<egr<jl<dnx>>> $$2 = a(this.h);

      for (eht.b $$3 : this.v) {
         ui $$4 = new ui();
         egj $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", z, $$5.h());
            $$4.a("biomes", $$2, $$5.i());
         }

         if ($$3.c != null) {
            $$4.a("BlockLight", $$3.c.a());
         }

         if ($$3.d != null) {
            $$4.a("SkyLight", $$3.d.a());
         }

         if (!$$4.j()) {
            $$4.a("Y", (byte)$$3.a);
            $$1.add($$4);
         }
      }

      $$0.a("sections", $$1);
      if (this.u) {
         $$0.a("isLightOn", true);
      }

      uo $$6 = new uo();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == ehd.a) {
         uo $$7 = new uo();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      ui $$8 = new ui();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new up($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(ui $$0, efy.b $$1) {
      $$0.a("block_ticks", A, $$1.a());
      $$0.a("fluid_ticks", B, $$1.b());
   }

   public static egz a(@Nullable ui $$0) {
      return $$0 != null ? $$0.<egz>a("Status", egz.o).orElse(egz.c) : egz.c;
   }

   @Nullable
   private static egi.c a(aub $$0, List<ui> $$1, List<ui> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            try (bci.j $$4 = new bci.j($$3.E(), C)) {
               $$0.a(bzv.a(fcy.a($$4, $$0.K_(), $$1), $$0, bzu.r));
            }
         }

         for (ui $$5 : $$2) {
            boolean $$6 = $$5.b("keepPacked", false);
            if ($$6) {
               $$3.a($$5);
            } else {
               jb $$7 = eaz.a($$3.f(), $$5);
               eaz $$8 = eaz.a($$7, $$3.a_($$7), $$5, $$0.K_());
               if ($$8 != null) {
                  $$3.a($$8);
               }
            }
         }
      };
   }

   private static ui a(evo $$0, dlz $$1, Map<euy, evg> $$2, Map<euy, LongSet> $$3) {
      ui $$4 = new ui();
      ui $$5 = new ui();
      jy<euy> $$6 = $$0.b().f(mn.bj);

      for (Entry<euy, evg> $$7 : $$2.entrySet()) {
         ame $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ui $$9 = new ui();

      for (Entry<euy, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ame $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), $$10.getValue().toLongArray());
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<euy, evg> a(evo $$0, ui $$1, long $$2) {
      Map<euy, evg> $$3 = Maps.newHashMap();
      jy<euy> $$4 = $$0.b().f(mn.bj);
      ui $$5 = $$1.n("starts");

      for (String $$6 : $$5.e()) {
         ame $$7 = ame.c($$6);
         euy $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.error("Unknown structure start: {}", $$7);
         } else {
            evg $$9 = evg.a($$0, $$5.n($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<euy, LongSet> a(jz $$0, dlz $$1, ui $$2) {
      Map<euy, LongSet> $$3 = Maps.newHashMap();
      jy<euy> $$4 = $$0.f(mn.bj);
      ui $$5 = $$2.n("References");
      $$5.a((BiConsumer<String, vi>)(($$3x, $$4x) -> {
         ame $$5x = ame.c($$3x);
         euy $$6 = $$4.a($$5x);
         if ($$6 == null) {
            C.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$5x, $$1);
         } else {
            Optional<long[]> $$7 = $$4x.r_();
            if (!$$7.isEmpty()) {
               $$3.put($$6, new LongOpenHashSet(Arrays.stream($$7.get()).filter($$2xx -> {
                  dlz $$3xx = new dlz($$2xx);
                  if ($$3xx.a($$1) > 8) {
                     C.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$5x, $$3xx, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }));
      return $$3;
   }

   private static uo a(ShortList[] $$0) {
      uo $$1 = new uo();

      for (ShortList $$2 : $$0) {
         uo $$3 = new uo();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(vb.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public jy<dnx> b() {
      return this.h;
   }

   public dlz c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public long e() {
      return this.k;
   }

   public long f() {
      return this.l;
   }

   public egz g() {
      return this.m;
   }

   @Nullable
   public eld.d h() {
      return this.n;
   }

   @Nullable
   public ejo i() {
      return this.o;
   }

   public egv j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<eka.a, long[]> l() {
      return this.r;
   }

   public efy.b m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<eht.b> p() {
      return this.v;
   }

   public List<ui> q() {
      return this.w;
   }

   public List<ui> r() {
      return this.x;
   }

   public ui s() {
      return this.y;
   }

   public static class a extends ut {
      public a(String $$0) {
         super($$0);
      }
   }

   public record b(int a, @Nullable egj b, @Nullable egd c, @Nullable egd d) {
   }
}
