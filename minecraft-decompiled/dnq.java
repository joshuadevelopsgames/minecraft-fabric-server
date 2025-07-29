import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnq {
   private final dmv a;
   private final eky b;
   private final euz c;

   public dnq(dmv $$0, eky $$1, euz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dnq a(auj $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dnq($$0, this.b, this.c);
      }
   }

   public List<evg> a(dlz $$0, Predicate<euy> $$1) {
      Map<euy, LongSet> $$2 = this.a.a($$0.h, $$0.i, egz.e).h();
      Builder<evg> $$3 = ImmutableList.builder();

      for (Entry<euy, LongSet> $$4 : $$2.entrySet()) {
         euy $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<evg> a(ke $$0, euy $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), egz.e).b($$1);
      Builder<evg> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(euy $$0, LongSet $$1, Consumer<evg> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         ke $$4 = ke.a(new dlz($$3), this.a.aq());
         evg $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), egz.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public evg a(ke $$0, euy $$1, egu $$2) {
      return $$2.a($$1);
   }

   public void a(ke $$0, euy $$1, evg $$2, egu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(ke $$0, euy $$1, long $$2, egu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public evg a(jb $$0, euy $$1) {
      for (evg $$2 : this.a(ke.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return evg.b;
   }

   public evg a(jb $$0, bae<euy> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public evg a(jb $$0, jp<euy> $$1) {
      return this.a($$0, $$1::a);
   }

   public evg a(jb $$0, Predicate<jl<euy>> $$1) {
      jy<euy> $$2 = this.b().f(mn.bj);

      for (evg $$3 : this.a(new dlz($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return evg.b;
   }

   public evg b(jb $$0, euy $$1) {
      for (evg $$2 : this.a(ke.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return evg.b;
   }

   public boolean a(jb $$0, evg $$1) {
      for (evc $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jb $$0) {
      ke $$1 = ke.a($$0);
      return this.a.a($$1.a(), $$1.c(), egz.e).y();
   }

   public Map<euy, LongSet> b(jb $$0) {
      ke $$1 = ke.a($$0);
      return this.a.a($$1.a(), $$1.c(), egz.e).h();
   }

   public eva a(dlz $$0, euy $$1, evv $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(evg $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jz b() {
      return this.a.K_();
   }
}
