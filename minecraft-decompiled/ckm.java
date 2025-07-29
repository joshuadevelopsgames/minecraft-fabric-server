import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ckm extends ckv<cao> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public ckm() {
      super(20);
   }

   @Override
   public Set<cjo<?>> a() {
      return ImmutableSet.of(cjo.x);
   }

   protected void a(aub $$0, cao $$1) {
      if ($$1.g_()) {
         this.e = 0;
         this.f = $$0.ae() + $$0.H_().a(20);
         clp $$2 = $$0.B();
         Predicate<jb> $$3 = $$0x -> {
            long $$1x = $$0x.a();
            if (this.d.containsKey($$1x)) {
               return false;
            } else if (++this.e >= 5) {
               return false;
            } else {
               this.d.put($$1x, this.f + 40L);
               return true;
            }
         };
         Set<Pair<jl<cls>, jb>> $$4 = $$2.b($$0x -> $$0x.a(clt.n), $$3, $$1.dx(), 48, clp.b.c).collect(Collectors.toSet());
         faz $$5 = cbw.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            jb $$6 = $$5.l();
            Optional<jl<cls>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.eh().a(cjo.x, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
