import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class duw extends dpz implements dqh {
   private static final Codec<faj> f = mm.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof faj $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<duw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, duw::new));
   public static final efb b = eer.aS;
   protected final faj c;
   private final List<fal> g;
   public static final fjm d = dpz.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jh> e = ImmutableList.of(jh.a, jh.d, jh.c, jh.f, jh.e);

   @Override
   public MapCodec<duw> a() {
      return a;
   }

   protected duw(faj $$0, eea.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.C.b().b(b, 0));
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fjj.a();
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return false;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return !this.c.a(azu.b);
   }

   @Override
   protected fal b_(eeb $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(eeb $$0, eeb $$1, jh $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }

   @Override
   protected List<dcv> a(eeb $$0, fdm.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.a();
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dmu $$0, jb $$1, eeb $$2) {
      if (this.c.a(azu.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dqb.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jh $$4 = (jh)var5.next();
            jb $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(azu.a)) {
               dpz $$6 = $$0.b_($$1).b() ? dqb.cy : dqb.m;
               $$0.c($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dqb.nD)) {
               $$0.c($$1, dqb.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dmv $$0, jb $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   public dcv a(@Nullable cam $$0, dmv $$1, jb $$2, eeb $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dqb.a.m(), 11);
         return new dcv(this.c.a());
      } else {
         return dcv.l;
      }
   }

   @Override
   public Optional<ayy> as_() {
      return this.c.j();
   }
}
